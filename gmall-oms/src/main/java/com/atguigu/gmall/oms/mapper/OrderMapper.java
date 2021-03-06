package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sqq
 * @email fengge@atguigu.com
 * @date 2020-09-21 18:27:08
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
