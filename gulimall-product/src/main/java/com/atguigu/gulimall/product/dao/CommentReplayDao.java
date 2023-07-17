package com.atguigu.gulimall.product.dao..dao;

import com.atguigu.gulimall..entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author lzw
 * @email lzw@gmail.com
 * @date 2023-07-22 10:59:24
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
