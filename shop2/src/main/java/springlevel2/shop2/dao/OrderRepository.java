package springlevel2.shop2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springlevel2.shop2.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
