package az.mycompany.shopping_store.service.impl;

import az.mycompany.shopping_store.client.UserClient;
import az.mycompany.shopping_store.dto.LoginRequest;
import az.mycompany.shopping_store.dto.UserDto;
import az.mycompany.shopping_store.exception.InCorrectPasswordException;
import az.mycompany.shopping_store.exception.UserNotFoundException;
import az.mycompany.shopping_store.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserClient client;

    @Override
    public void getAllUser() {
        List<UserDto> users=client.get();
        users.stream().forEach(System.out::println);

    }

    @Override
    public void getByUsername(Model model, String username) {
       UserDto userDto= client.getByUsername(username);
    }

    @Override
    public void login(Model model,LoginRequest request) {

      UserDto user=  client.getByEmail(request.getEmail());
      if(user==null){
          throw new UserNotFoundException("User not found");
      }else if(!user.getPassword().equals(request.getPassword())){
          throw new InCorrectPasswordException("Incorrect password ");
      }else{
          model.addAttribute("user",user);
      }
    }
}
