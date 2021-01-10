package com.gp.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gp.spring.springorm.product.dao.ProductDao;
import com.gp.spring.springorm.product.entity.Product;

public class TestFileInsert {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gp/spring/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		//Product product=new Product;
		Product product = new Product();
		product.setId(5);
		product.setName("iphone5");
		product.setDesc("nice5");
		product.setPrice(1234.123);
		productDao.create(product);
	}
}
