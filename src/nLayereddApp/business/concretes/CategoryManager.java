package nLayereddApp.business.concretes;

import nLayereddApp.business.abstracts.CategoryService;
import nLayereddApp.dataAccess.abstracts.CategoryDao;
import nLayereddApp.entities.concretes.Category;

public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;
	

	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		this.categoryDao.add(category);
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		this.categoryDao.update(category);
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		this.categoryDao.delete(category);
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		this.categoryDao.getAll();
	}

}
