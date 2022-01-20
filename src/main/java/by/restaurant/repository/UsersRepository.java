package by.restaurant.repository;

import by.restaurant.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <User, Long> {
    User findByUsername(String username); //метод чтобы users можно искать по username
}
