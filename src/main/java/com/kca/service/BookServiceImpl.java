package com.kca.service;

import com.kca.dao.BookMapper;
import com.kca.domain.Books;

import java.util.List;


public class BookServiceImpl implements BookService{

    //业务层调Dao层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }


    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }


    public Books queryBookById(Integer id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public List<Books> queryBooksByName(String bookName) {
        return bookMapper.queryBooksByName(bookName);
    }
}
