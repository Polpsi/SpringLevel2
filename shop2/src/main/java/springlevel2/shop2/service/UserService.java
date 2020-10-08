package springlevel2.shop2.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import springlevel2.shop2.dto.UserDto;

public interface UserService extends UserDetailsService {
    boolean save(UserDto userDto);
}
