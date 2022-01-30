package nLayereddApp.business.concretes;



import nLayereddApp.business.abstracts.ProductService;
import nLayereddApp.dataAccess.abstracts.ProductDao;
import nLayereddApp.entities.concretes.Product;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        //Business rules
        if(product.getUnitPrice()>0) {
            this.productDao.add(product);
        }
    }

    @Override
    public void update(Product product) {
        System.out.println("Product updated " + product.getName());
        this.productDao.update(product);
    }

    @Override
    public void delete(Product product) {
        System.out.println("Product deleted " + product.getName());
        this.productDao.delete(product);
    }

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		this.productDao.getAll();
	}
    


}
