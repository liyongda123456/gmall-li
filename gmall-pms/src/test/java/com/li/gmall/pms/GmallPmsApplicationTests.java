package com.li.gmall.pms;

import com.li.gmall.pms.entity.Brand;
import com.li.gmall.pms.entity.Product;
import com.li.gmall.pms.service.BrandService;
import com.li.gmall.pms.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {
	@Autowired
	ProductService productService;

	@Autowired
	BrandService brandService;

	@Test
	public void contextLoads() {
//		Product byId = productService.getById(1);
//		System.out.println(byId.getName());
//		Brand brand = new Brand();
//		brand.setName("哈哈啊哈");
//		brandService.save(brand);
//		System.out.println("保存成功");
		Brand byId = brandService.getById(53);
		System.out.println("保存成功..."+byId.getName());
	}

}
