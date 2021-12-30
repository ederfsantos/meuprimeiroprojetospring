package com.javaman.meuprimeiroprojeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaman.meuprimeiroprojeto.entities.Category;
import com.javaman.meuprimeiroprojeto.repositories.CategoryRepository;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	@Autowired
	private CategoryRepository categoryRepository;//injeção de dependencia do spring boot,nao precisa dar um new no objeto, nao e boa pratica dar um new e sim injetar dependencia

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		//List<Category> list = new ArrayList<>();
		//list.add(new Category(1L,"Eletronicos"));
		//list.add(new Category(2L,"Livros"));
		//list.add(new Category(3L,"Bebidas"));
		List<Category> list =categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		//Category cat = new Category(1L,"Eleronicos");
		Category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}

