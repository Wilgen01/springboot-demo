package com.example.demo.repository;

import com.example.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wilgen
 */
public interface authorRepository extends CrudRepository<Author, Long> {
    
}
