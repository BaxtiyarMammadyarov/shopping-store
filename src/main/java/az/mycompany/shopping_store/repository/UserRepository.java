package az.mycompany.shopping_store.repository;

import az.mycompany.shopping_store.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
