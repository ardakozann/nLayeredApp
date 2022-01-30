package nLayereddApp.business.abstracts;

import nLayereddApp.entities.concretes.Category;

public interface CategoryService {
	void add(Category category);
	void update(Category category);
	void delete(Category category);
	void getAll();
}
