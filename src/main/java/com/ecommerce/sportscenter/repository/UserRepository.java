package com.ecommerce.sportscenter.repository;

import com.ecommerce.sportscenter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // Метод для поиска пользователя по имени
    User findByUsername(String username);
}