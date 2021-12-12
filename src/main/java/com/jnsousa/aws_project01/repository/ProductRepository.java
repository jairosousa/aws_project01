package com.jnsousa.aws_project01.repository;

import com.jnsousa.aws_project01.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 12/12/2021 - 17:23
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    Optional<Product> findByCode(String code);
}
