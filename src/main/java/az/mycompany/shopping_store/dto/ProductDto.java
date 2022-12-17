package az.mycompany.shopping_store.dto;

import az.mycompany.shopping_store.dto.enums.ProductType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDto {

    ProductType type;
    String title;
    String subtitle;
    String isbn13;
    String price;
    String image;
    String url;
    Boolean status;
    int count;
}
