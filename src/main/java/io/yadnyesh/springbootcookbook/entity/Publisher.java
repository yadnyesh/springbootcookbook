package io.yadnyesh.springbootcookbook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Publisher {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "publisher")
	private List<Book> bookList;
	
	public Publisher() {
	}
	
	public Publisher(String name, List<Book> bookList) {
		this.name = name;
		this.bookList = bookList;
	}
}
