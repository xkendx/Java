package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
//	List<Product> getByCategory_CategorytIdIn(List<Integer> categories);
//	
	List<Product> getByProductNameContains(String productName);
//	
//	List<Product> getByProductNameStartsWith(String productName);
//	
//	// JPQL
	@Query("From Product where productName=:productName and category=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);
}
