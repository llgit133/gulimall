package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductApplication.class)
public class ProductApplicationTest {

   @Autowired
   BrandService brandService;

   @Test
   public void test1(){
      BrandEntity brand = new BrandEntity();
      brand.setName("xiaomi");
      brand.setBrandId(123L);
      brandService.save(brand);
      System.out.println("保存成功");
   }
}
