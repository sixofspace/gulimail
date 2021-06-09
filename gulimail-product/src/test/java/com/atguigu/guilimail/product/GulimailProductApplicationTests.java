package com.atguigu.guilimail.product;

import com.atguigu.gulimail.product.GulimailProductApplication;
import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GulimailProductApplication.class)
@ContextConfiguration(locations = {"application.yaml"})
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;



    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功....");
    }

}
