package nLayereddApp.core.dataAccess;


import nLayereddApp.core.entities.Entity;


//Bu desene Repository Pattern denir.
public interface CrudRepository <T extends Entity> {//fonksiyonlardaki parametreleri burada veriyoruz.
	//T type dan geliyor. Buna GENERIC yapý deniyor.
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	void getAll();
}
