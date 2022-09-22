package org.hrb.showroom.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hrb.showroom.model.BrandEntity;

// in this DAO layer will use of HQL 

public class BrandsDAO {

	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(BrandEntity.class)
			.buildSessionFactory();
	
	
	public List<BrandEntity> getBrands() {
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		List<BrandEntity> list=session.createQuery("from brands").getResultList();
		return list;
	}

	public BrandEntity getBrand(int brandId) {
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		BrandEntity brand;
		brand=session.get(BrandEntity.class, brandId);
		return brand;
	}
	
	public void setBrands(BrandEntity brand) {
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		session.save(brand);
		session.getTransaction().commit();
		
	}

	public void updateBrands(BrandEntity updatedBrand) {
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		int id=updatedBrand.getBrandId();
		BrandEntity brand=session.get(BrandEntity.class,id);
		brand.setBrandName(updatedBrand.getBrandName());
		session.getTransaction().commit();
	}

	public void deleteBrand(int brandId) {
		Session session= factory.getCurrentSession();
		session.beginTransaction();
		BrandEntity brand=session.get(BrandEntity.class,brandId);
		session.delete(brand);
		session.getTransaction().commit();
	}

	

}
