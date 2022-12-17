package az.mycompany.shopping_store.service.impl;

import az.mycompany.shopping_store.client.ProductClient;
import az.mycompany.shopping_store.dto.ProductDto;
import az.mycompany.shopping_store.repository.CartRepository;
import az.mycompany.shopping_store.repository.ProductRepository;
import az.mycompany.shopping_store.repository.UserRepository;
import az.mycompany.shopping_store.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductClient client;
    private final ProductRepository  productRepository;
    private final CartRepository cartRepository;
    private final UserRepository userRepository;

    @Override
    public void getAllProduct(Model model) {
        List<ProductDto> products=client.get();

        List<List<ProductDto>>list=new ArrayList<>();
        List<ProductDto>productDtos=new ArrayList<>();
        for (ProductDto dto:products){
            productDtos.add(dto);
            if(productDtos.size()==4){
                list.add(productDtos);
                productDtos=new ArrayList<>();
            }
        }
        if(productDtos!=null){
            list.add(productDtos);
        }

        model.addAttribute("list",list);
    }

    @Override
    public void addToCart(ProductDto productDto) {
        List<ProductDto>productDtoList;
    }
}
