package com.javaman.meuprimeiroprojeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaman.meuprimeiroprojeto.entities.Product;
import com.javaman.meuprimeiroprojeto.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	@Autowired
	private ProductRepository productRepository;//injeção de dependencia do spring boot,nao precisa dar um new no objeto, nao e boa pratica dar um new e sim injetar dependencia

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		//List<Product> list = new ArrayList<>();
		//list.add(new Product(1L,"Eletronicos"));
		//list.add(new Product(2L,"Livros"));
		//list.add(new Product(3L,"Bebidas"));
		List<Product> list =productRepository.findAll(); 
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		//Product cat = new Product(1L,"Eletronicos");
		Product cat = productRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}

