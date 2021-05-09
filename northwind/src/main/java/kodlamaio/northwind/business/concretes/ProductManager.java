package kodlamaio.northwind.business.concretes;

import java.util.List;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		
		return null;
	}

}
