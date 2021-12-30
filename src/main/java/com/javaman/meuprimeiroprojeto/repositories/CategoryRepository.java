package com.javaman.meuprimeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaman.meuprimeiroprojeto.entities.Category;

/*
@Component
public class CategoryRepository {
			
private Map<Long,Category> map = new HashMap<>();//coleção muito importante	

	public void save(Category obj) {
		//map.put(obj.getId(), obj);
	}

	public Category findById(Long id) {
	 //return map.get(id);
	}
	
	public List<Category> findAll() {
		// new ArrayList<Category>(map.values()); 
	}
}*/
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>	{
	
	
	
	
}
