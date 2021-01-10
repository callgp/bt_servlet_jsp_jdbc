package com.gp.spring.springorm.product.dao.impl;

import java.io.Serializable;
import java.util.List;

//import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.gp.spring.springorm.product.dao.ProductDao;
import com.gp.spring.springorm.product.entity.Product;

//@Entity
@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;	
	@Override
	@Transactional
	public int create(Product product) {
	Integer result = (Integer) hibernateTemplate.save(product);
	return result;
	}
	@Override
	@Transactional
	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}
	@Override
	public Product find(int id) {
		// TODO Auto-generated method stub
		Product product = hibernateTemplate.get(Product.class, id);
		return product;
	}
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		//return null;
		List<Product> products = hibernateTemplate.loadAll(Product.class);
		return products;
		
	}
	
	

}
