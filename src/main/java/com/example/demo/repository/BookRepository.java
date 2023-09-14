package com.example.demo.repository;

import com.example.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Wilgen
 */
public interface BookRepository extends CrudRepository<Book, Long>{
    
}
