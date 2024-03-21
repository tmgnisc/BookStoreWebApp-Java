package com.BookStoreLearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookStoreLearning.entity.MyBookList;


@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,  Integer>{

}
