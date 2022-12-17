package az.mycompany.shopping_store.service;

import az.mycompany.shopping_store.dto.ProductDto;
import org.springframework.ui.Model;

public interface ProductService {

    void getAllProduct(Model model);

    void addToCart(ProductDto productDto);
}
