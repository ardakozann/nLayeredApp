package nLayereddApp.dataAccess.concretes.jdbcimpls;

import java.util.ArrayList;

import nLayereddApp.core.utilities.MyArrayList;
import nLayereddApp.dataAccess.abstracts.ProductDao;
import nLayereddApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao{
	private MyArrayList<Product> myArrayList = new MyArrayList<Product>();
	

	public ProductJdbcDao() {
		super();
	}

	public ProductJdbcDao(MyArrayList<Product> myArrayList) {
		super();
		this.myArrayList = myArrayList;
	}

	@Override
	public void add(Product product) {
		//JDBC kodlar yazýlýr buraya
		this.myArrayList.add(product);
		System.out.println("JDBC ile eklendi.");
	}

	@Override
	public void update(Product product) {
		this.myArrayList.update(product.getId(), product);
		System.out.println("JDBC ile güncellendi.");
		
	}

	@Override
	public void delete(Product product) {
		this.myArrayList.delete(product.getId());
		System.out.println("JDBC ile silindi.");
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for(Object product : this.myArrayList.getAll()) {
			if((Product) product != null) {
				System.out.println("Id: " + ((Product) product).getId() + ", Name: " + ((Product) product).getName());
				System.out.println("Kategorisi:" + ((Product) product).getCategory());
			}
		}
	}

}
