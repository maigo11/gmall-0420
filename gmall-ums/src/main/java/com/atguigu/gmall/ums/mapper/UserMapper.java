package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author sqq
 * @email fengge@atguigu.com
 * @date 2020-09-21 19:27:42
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
