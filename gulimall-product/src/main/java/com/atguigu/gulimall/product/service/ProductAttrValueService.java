package com.atguigu.gulimall.product.service..service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall..entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author lzw
 * @email lzw@gmail.com
 * @date 2023-07-22 10:59:24
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

