package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.*;

import java.util.List;

import com.example.demo.entity.*;


@RestController
public class BookController {

    @Autowired BookRepository repo;

    @GetMapping("/book")
	public @ResponseBody List<Book> getAll() {
		return repo.findAll();
	}

    @PostMapping("/book")
    public @ResponseBody Book create(@RequestBody Book book){
        System.out.println("RequestBody "+book);
        Book created = (Book)repo.save(book);
        System.out.println("Created ID "+created.getId());
        return created;
    }
    
}
