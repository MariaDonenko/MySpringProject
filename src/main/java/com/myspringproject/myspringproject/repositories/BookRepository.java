package com.myspringproject.myspringproject.repositories;

import com.myspringproject.myspringproject.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
