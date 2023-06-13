package com.projectcda.backendshop.repository;

import com.projectcda.backendshop.model.Cart;
import com.projectcda.backendshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}