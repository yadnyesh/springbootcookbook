package io.yadnyesh.springbootcookbook.repository;

import io.yadnyesh.springbootcookbook.entity.Reviewer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ReviewerRepository extends PagingAndSortingRepository<Reviewer, Long> {

}
