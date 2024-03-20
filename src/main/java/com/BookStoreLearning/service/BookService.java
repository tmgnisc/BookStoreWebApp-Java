package com.BookStoreLearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStoreLearning.entity.Book;
import com.BookStoreLearning.repository.BookRepository;

@Service
public class BookService {

	
	@Autowired
	private BookRepository bRepo;
	
	public void save(Book b) {
		bRepo.save(b);
		
	}
}
