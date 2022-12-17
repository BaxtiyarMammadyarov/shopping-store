package az.mycompany.shopping_store.service;

import az.mycompany.shopping_store.dto.LoginRequest;
import org.springframework.ui.Model;

public interface UserService {

    void getAllUser();

    void getByUsername(Model model, String username);

    void login(Model model,LoginRequest request);
}
