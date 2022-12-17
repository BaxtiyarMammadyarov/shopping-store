package az.mycompany.shopping_store.client;

import az.mycompany.shopping_store.dto.LoginRequest;
import az.mycompany.shopping_store.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "users", url = "http://localhost:8083/users")
public interface UserClient {

    @GetMapping
    List<UserDto> get();

    @GetMapping("/{username}")
    UserDto getByUsername(@PathVariable(name = "username") String username);

    @GetMapping("/{email}")
   UserDto getByEmail(@PathVariable("email") String email );
}
