package io.yadnyesh.springbootcookbook;

import io.yadnyesh.springbootcookbook.entity.Book;
import io.yadnyesh.springbootcookbook.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping
	public Iterable<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	@GetMapping("/{isbn}")
	public Book getBookByIsbn(@PathVariable final String isbn){
		return bookRepository.findBookByIsbn(isbn);
	}
}
