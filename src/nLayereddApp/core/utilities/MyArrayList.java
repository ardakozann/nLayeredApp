package nLayereddApp.core.utilities;

import nLayereddApp.core.entities.Entity;

public class MyArrayList<T extends Entity> {
	private Entity[] objects = new Entity[1];
	private Entity[] temp1;
	
	
	
	public void add(T entity) {
		// TODO Auto-generated method stub
		if(objects[0] != null) {
			temp1 = objects;
			objects = new Entity[temp1.length + 1];
			System.out.println("Kontrol..");
			for(int i = 0 ; i < temp1.length ; i++) {//objects dizisinin boyutunu 1 arttýrýp tekrar tempi objects'e aktardým.
				objects[i] = temp1[i];
			}
			objects[objects.length - 1] = entity;//yollanan parametreyi dizinin sonuna ekledim.
		}
		else {
			objects[0] = entity;//eðer dizi boþ ise parametre olarak gönderilen
		}
	}
	
	//@Override
	public void update(int id, T updateEntity) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<objects.length ; i++) {
			if(objects[i].getId() == id) {
				objects[i] = updateEntity;
				return;
			}
		}
	}

	//@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		temp1 = new Entity[objects.length - 1];
		int j=0;
		for (int i = 0 ; i < objects.length ; i++) {
			if(objects[i].getId() != id) {
				temp1[j] = objects[i];
				j++;
			}
			
		}
		objects = temp1;
		
	}

	//@Override
	public Object[] getAll() {
		// TODO Auto-generated method stub
		
		return objects;
	}
}
