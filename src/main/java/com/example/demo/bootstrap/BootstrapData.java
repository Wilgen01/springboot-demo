package com.example.demo.bootstrap;

import com.example.demo.domain.Author;
import com.example.demo.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import java.util.HashSet;

/**
 *
 * @author Wilgen
 */
@Component
public class BootstrapData implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BootstrapData(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author();
        Book ddd = new Book();

        eric.setFirstName("Eric");
        eric.setLastName("Evans");
        eric.setBooks(new HashSet<Book>());
        
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123123");
        ddd.setAuthors(new HashSet<Author>());

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        
        System.out.println(bookRepository.count());
    }

}
