package com.atguigu.gmall.pms.service.impl;

import com.atguigu.gmall.common.bean.ResponseVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.function.Consumer;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;

import com.atguigu.gmall.pms.mapper.SpuMapper;
import com.atguigu.gmall.pms.entity.SpuEntity;
import com.atguigu.gmall.pms.service.SpuService;


@Service("spuService")
public class SpuServiceImpl extends ServiceImpl<SpuMapper, SpuEntity> implements SpuService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SpuEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SpuEntity>()
        );

        return new PageResultVo(page);
    }

    @Override
    public ResponseVo<PageResultVo> querySpuBypage(Long categoryId, PageParamVo pageParamVo) {
        QueryWrapper<SpuEntity> wrapper = new QueryWrapper<>();
        //如果categoryId不为0则说明是在本类中查找
        if(categoryId!=0){
            wrapper.eq("category_id",categoryId);
        }
        //如果为0则说明实在全部商品中找
        //判断用户是否输入了查询的关键字
        String key = pageParamVo.getKey();
        if(!StringUtils.isBlank(key)){
            //(t)->t.like("name",key).or().like("id",key)
            wrapper.and(new Consumer<QueryWrapper<SpuEntity>>() {
                @Override
                public void accept(QueryWrapper<SpuEntity> spuEntityQueryWrapper) {
                    spuEntityQueryWrapper.like("name",key).or().like("id",key);
                }
            });
        }
        //这里的page是
        PageResultVo pageResultVo = new PageResultVo(this.page(pageParamVo.getPage(), wrapper));

        return ResponseVo.ok(pageResultVo) ;
    }

}