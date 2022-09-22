package org.hrb.showroom.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hrb.showroom.model.BrandEntity;
import org.hrb.showroom.model.ProductEntity;

// in this DAO we are also working with ProductEntity and BrandEntity class so adding both Annotated classes
public class ProductsDAO {
	
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(ProductEntity.class)
			.addAnnotatedClass(BrandEntity.class)
			.buildSessionFactory();

	
	public List<ProductEntity> getProductsByBrands(int brandId) {
		
		System.out.println("inside getProductsByBrands DAO");
		
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		String HQL="from products where brandId='"+brandId+"'";
		productList=session.createQuery(HQL).getResultList();
		
		System.out.println("productList :"+productList);
		return productList;
	}


	public List<ProductEntity> getProductsByBrandsAndCategory(int brandId, String category) {
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> productList;
		String HQL="from products where brandId='"+brandId+"' and category='"+category+"'";
		productList=session.createQuery(HQL).getResultList();
		
		return productList;
	}
	

}
