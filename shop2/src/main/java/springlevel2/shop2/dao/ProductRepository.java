package springlevel2.shop2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springlevel2.shop2.domain.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
