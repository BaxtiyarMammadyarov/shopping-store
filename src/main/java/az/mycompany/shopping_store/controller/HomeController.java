package az.mycompany.shopping_store.controller;

import az.mycompany.shopping_store.dto.LoginRequest;
import az.mycompany.shopping_store.dto.ProductDto;
import az.mycompany.shopping_store.service.ProductService;
import az.mycompany.shopping_store.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ProductService productService;
    private final UserService userService;
    private List<ProductDto> productDtos;

    @GetMapping("/")
    public String home(Model model) {
        productService.getAllProduct(model);
        return "index";
    }

    @GetMapping("/profile/{username}")
    public String profile(Model model, @PathVariable String username) {

        userService.getByUsername(model, username);

        return "profile";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/auth")
    public String auth(Model model,@RequestBody LoginRequest request) {
        userService.login(model,request);
        return "redirect:/";
    }

    public void addToCart(ProductDto productDto){
        if(productDtos ==null){
            productDtos =new ArrayList<>();
            productDtos.add(productDto);
        }else {
            productDtos.add(productDto);
        }

        productService.addToCart(productDto);

    }
    public String getCart(Model model){
        model.addAttribute("list", productDtos);
        return "cart";
    }



}
