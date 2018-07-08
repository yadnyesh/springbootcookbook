package io.yadnyesh.springbootcookbook.repository;

import io.yadnyesh.springbootcookbook.entity.Publisher;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface PublisherRepository extends PagingAndSortingRepository<Publisher, Long> {

}

