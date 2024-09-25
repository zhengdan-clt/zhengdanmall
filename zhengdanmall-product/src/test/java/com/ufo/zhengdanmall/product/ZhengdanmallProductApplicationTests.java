package com.ufo.zhengdanmall.product;



import com.ufo.zhengdanmall.product.entity.BrandEntity;
import com.ufo.zhengdanmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhengdanmallProductApplicationTests {

    @Autowired
    BrandService brandService;



    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
    }






}
