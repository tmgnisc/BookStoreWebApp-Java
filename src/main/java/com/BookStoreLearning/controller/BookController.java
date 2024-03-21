package com.BookStoreLearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.BookStoreLearning.entity.Book;
import com.BookStoreLearning.entity.MyBookList;
import com.BookStoreLearning.service.BookService;
import com.BookStoreLearning.service.MyBookListService;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@Autowired
	private MyBookListService mybookService;
	
	
	@GetMapping("/book_register")
	public String bookRegister() {
		return "bookRegister";
	}

	
	@GetMapping("/available_books")
	public ModelAndView getAllBook() {
		List<Book>list=service.getAllBook();
//		ModelAndView m = new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject(m)
		return new ModelAndView("bookList", "book", list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		//TODO: process POST request
		service.save(b);
		return "redirect:/available_books";
	}
	
	@GetMapping("/my_books")
	public String getMyBooks() {
		return "myBooks";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id")int id) {
		Book b=service.getBookById(id);
		MyBookList mb= new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
		mybookService.saveMyBooks(mb);
		return "redirect:/my_books";
	}

}


