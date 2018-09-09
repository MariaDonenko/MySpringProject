package com.myspringproject.myspringproject.repositories;

import com.myspringproject.myspringproject.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
