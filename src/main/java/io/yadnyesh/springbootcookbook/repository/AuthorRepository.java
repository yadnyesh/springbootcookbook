package io.yadnyesh.springbootcookbook.repository;

import io.yadnyesh.springbootcookbook.entity.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

}
