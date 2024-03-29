package az.mycompany.shopping_store.dto;

import az.mycompany.shopping_store.dto.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {

    Long id;
    @NotBlank
    String name;
    @NotBlank
    String surname;
    @NotBlank
    String email;
    @NotBlank
    String username;
    @NotBlank
    String password;
    Boolean enable;
    Status status;
}
