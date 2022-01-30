package nLayereddApp.dataAccess.concretes.jdbcimpls;

import java.util.ArrayList;

import nLayereddApp.core.utilities.MyArrayList;
import nLayereddApp.dataAccess.abstracts.CategoryDao;
import nLayereddApp.entities.concretes.Category;
import nLayereddApp.entities.concretes.Product;

public class CategoryJdbcDao implements CategoryDao {

private MyArrayList<Category> myArrayList = new MyArrayList<Category>();

	public CategoryJdbcDao() {
	super();
	}

	public CategoryJdbcDao(MyArrayList<Category> myArrayList) {
		super();
		this.myArrayList = myArrayList;
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		this.myArrayList.add(category);
		System.out.println("JDBC ile eklendi.");
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		myArrayList.update(category.getId(), category);
		System.out.println("JDBC ile güncellendi.");
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		myArrayList.delete(category.getId());
		System.out.println("JDBC ile silindi.");
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for(Object category : this.myArrayList.getAll()) {
			if((Category) category != null) {	
				System.out.println("Id: " + ((Category) category).getId() + ", Name: " + ((Category) category).getName());
				System.out.println("Kategorideki ürünler:");
				if(((Category) category).getProducts() != null) {
					for(Product productA : ((Category) category).getProducts()) {
						System.out.println("Id: " + productA.getId() + " Name: " + productA.getName() + " Price: " + productA.getUnitPrice());
					}
				}
			}
		}
	}

}
