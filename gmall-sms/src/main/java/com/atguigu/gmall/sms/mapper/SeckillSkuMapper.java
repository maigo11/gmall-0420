package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.SeckillSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author sqq
 * @email fengge@atguigu.com
 * @date 2020-09-21 19:19:20
 */
@Mapper
public interface SeckillSkuMapper extends BaseMapper<SeckillSkuEntity> {
	
}
