package com.javaman.meuprimeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaman.meuprimeiroprojeto.entities.Product;
/*
@Component
public class ProductRepository {
private Map<Long,Product> map = new HashMap<>();//coleção muito importante	

	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findById(Long id) {
	 return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values()); 
	}
}
*/
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{
	

}

