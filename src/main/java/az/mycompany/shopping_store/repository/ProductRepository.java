package az.mycompany.shopping_store.repository;

import az.mycompany.shopping_store.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
