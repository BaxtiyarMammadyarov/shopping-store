package az.mycompany.shopping_store.repository;

import az.mycompany.shopping_store.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity,Long> {
}
