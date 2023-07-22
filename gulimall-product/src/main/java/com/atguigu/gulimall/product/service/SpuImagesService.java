package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.entity.SpuImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;

import java.util.Map;

/**
 * spu图片
 *
 * @author lzw
 * @email lzw@gmail.com
 * @date 2023-07-22 10:59:24
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

