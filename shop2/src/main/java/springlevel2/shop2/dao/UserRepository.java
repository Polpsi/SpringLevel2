package springlevel2.shop2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springlevel2.shop2.domain.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findFirstByName(String name);
}
