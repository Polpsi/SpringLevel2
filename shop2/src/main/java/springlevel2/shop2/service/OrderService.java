package springlevel2.shop2.service;

import springlevel2.shop2.domain.Order;

public interface OrderService {
    void saveOrder(Order order);
    Order getOrder(Long id);
}
