package springlevel2.shop2.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private String username;
    private String password;
    private String matchingPassword;
    private String email;
}
