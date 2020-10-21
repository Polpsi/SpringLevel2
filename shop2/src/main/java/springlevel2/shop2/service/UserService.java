package springlevel2.shop2.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import springlevel2.shop2.domain.User;
import springlevel2.shop2.dto.UserDto;

import java.util.List;

public interface UserService extends UserDetailsService {
    boolean save(UserDto userDto);

    List<UserDto> getAll();

    User findByName(String name);

    void updateProfile(UserDto dto);

    void save(User user);
}
