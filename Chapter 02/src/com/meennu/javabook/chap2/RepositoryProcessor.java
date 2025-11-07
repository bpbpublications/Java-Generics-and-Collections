package com.meennu.javabook.chap2;

import java.util.List;

public class RepositoryProcessor {
	public static void main(String args[]) {
		SearchableRepository<Product> productRepository = new SearchableProductRepository();
		List<Product> products = productRepository.search("Laptop");
		System.out.println(products);
	}

}

interface Repository<T> {
	T findById(Long id);

	List<T> findAll();

	void save(T entity);

	void delete(Long id);
}

class ProductRepository implements Repository<Product> {

	@Override
	public Product findById(Long id) {
		return null;
	}

	@Override
	public List<Product> findAll() {
		return null;
	}

	@Override
	public void save(Product entity) {

	}

	@Override
	public void delete(Long id) {

	}
	// ... implementation for Product entities
}

// Bounded type parameter for more specialized repository operations
interface SearchableRepository<T extends Searchable> extends Repository<T> {
	List<T> search(String keyword);
}

interface Searchable {
	boolean matches(String keyword);
}

class SearchableProductRepository extends ProductRepository implements SearchableRepository<Product> {
	@Override
	public Product findById(Long id) {
		return null;
	}

	@Override
	public List<Product> findAll() {
		return null;
	}

	@Override
	public void save(Product entity) {

	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public List<Product> search(String keyword) {
		return null;
	}
	// ... implementation for Product entities, including search
}
