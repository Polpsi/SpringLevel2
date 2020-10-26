package springlevel2.statisticmodule.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springlevel2.statisticmodule.domain.Sell;

public interface SellRepo extends JpaRepository<Sell, Long> {
}