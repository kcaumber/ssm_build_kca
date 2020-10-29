package com.kca.service;

import com.kca.domain.Books;

import java.util.List;

public interface BookService {

    /**
     * 增加一本书
     */
    int addBook(Books books);

    /**
     * 删
     * @return
     */
    int deleteBookById(Integer id);

    /**
     * 改
     * @return
     */
    int updateBook(Books books);

    /**
     * 查询
     */
    Books queryBookById(Integer id);

    /**
     * 查询全部书
     * @return
     */
    List<Books> queryAllBooks();

    /**
     * 按名字查询书籍
     */
    List<Books> queryBooksByName(String bookName);

}
