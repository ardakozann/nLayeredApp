package nLayereddApp.dataAccess.concretes.hibernateimpls;

import nLayereddApp.core.utilities.MyArrayList;
import nLayereddApp.dataAccess.abstracts.ProductDao;

import nLayereddApp.entities.concretes.Product;


public class ProductHibernateDao implements ProductDao {
	private MyArrayList<Product> myArrayList = new MyArrayList<Product>();
	
	
	public ProductHibernateDao() {
		super();
	}

	public ProductHibernateDao(MyArrayList<Product> products) {
		super();
		this.myArrayList = myArrayList;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		this.myArrayList.add(product);
		System.out.println("Hibernate ile eklendi.");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		this.myArrayList.update(product.getId(), product);
		System.out.println("Hibernate ile güncellendi.");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		this.myArrayList.delete(product.getId());
		System.out.println("Hibernate ile silindi.");
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
