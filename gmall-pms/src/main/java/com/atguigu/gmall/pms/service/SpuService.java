package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.common.bean.ResponseVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.pms.entity.SpuEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author sqq
 * @email fengge@atguigu.com
 * @date 2020-09-21 19:07:29
 */
public interface SpuService extends IService<SpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);

    ResponseVo<PageResultVo> querySpuBypage(Long categoryId, PageParamVo pageParamVo);
}

