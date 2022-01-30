package nLayereddApp;

import nLayereddApp.business.abstracts.CategoryService;
import nLayereddApp.business.abstracts.ProductService;
import nLayereddApp.business.concretes.CategoryManager;
import nLayereddApp.business.concretes.ProductManager;
import nLayereddApp.dataAccess.concretes.hibernateimpls.CategoryHibernateDao;
import nLayereddApp.dataAccess.concretes.hibernateimpls.ProductHibernateDao;
import nLayereddApp.entities.concretes.Category;
import nLayereddApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService productService = new ProductManager(new ProductHibernateDao());
		CategoryService categoryService = new CategoryManager(new CategoryHibernateDao());
		Category category1 = new Category(1,"Meyve");
		Category category2 = new Category(2,"Ýçecek");
		Category category3 = new Category(3,"Atýþtýrmalýk");
		Category category4 = new Category(4,"Sebze");
		
		Product product1 = new Product(1,"Elma",15);
		Product product2 = new Product(2,"Armut",20);
		Product product3 = new Product(3,"Üzüm",23);
		Product product4 = new Product(4,"Limon",35);
		
		productService.add(product1);
		productService.add(product2);
		productService.add(product3);
		productService.add(product4);
		
		productService.update(new Product(2,"Cips",20));
		productService.delete(product3);
		productService.getAll();
		
		categoryService.add(category1);
		categoryService.add(category2);
		categoryService.add(category3);
		categoryService.add(category4);
		
		categoryService.update(new Category(2,"Temizlik"));
		categoryService.delete(category1);
		categoryService.getAll();
		
	}

}
