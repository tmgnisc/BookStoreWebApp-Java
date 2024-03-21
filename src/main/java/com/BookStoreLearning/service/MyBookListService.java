package com.BookStoreLearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStoreLearning.entity.MyBookList;
import com.BookStoreLearning.repository.MyBookRepository;

@Service
public class MyBookListService {

	@Autowired
	private MyBookRepository mybook;
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);
	}
}
