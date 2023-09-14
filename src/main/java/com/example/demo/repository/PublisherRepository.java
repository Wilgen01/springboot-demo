package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.domain.Publisher;

/**
 *
 * @author Wilgen
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
