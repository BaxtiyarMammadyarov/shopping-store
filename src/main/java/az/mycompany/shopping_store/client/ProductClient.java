package az.mycompany.shopping_store.client;

import az.mycompany.shopping_store.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "product",url = "http://localhost:8082/product")
public interface ProductClient {

  @GetMapping
    List<ProductDto> get();
}
