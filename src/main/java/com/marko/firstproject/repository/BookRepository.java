package com.marko.firstproject.repository;

import com.marko.firstproject.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
