package com.kca.dao;

import com.kca.domain.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {

    /**
     * 增加一本书
     * @param book
     */
    int addBook(Books book);

    /**
     * 删
     */
    int deleteBookById(@Param("bookId") Integer id);

    /**
     * 改
     * @param book
     */
    int updateBook(Books book);

    /**
     * 查询
     * @return
     */
    Books queryBookById(@Param("bookID") Integer id);

    /**
     * 查询全部书
     * @return
     */
    List<Books> queryAllBooks();

    /**
     * 按名字查询书籍
     */
    List<Books> queryBooksByName(String bookName);

    ;
}
