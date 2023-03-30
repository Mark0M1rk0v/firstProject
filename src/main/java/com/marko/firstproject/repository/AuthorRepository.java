package com.marko.firstproject.repository;

import com.marko.firstproject.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
