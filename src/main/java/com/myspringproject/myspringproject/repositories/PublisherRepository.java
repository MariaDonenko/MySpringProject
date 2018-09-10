package com.myspringproject.myspringproject.repositories;

import com.myspringproject.myspringproject.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
