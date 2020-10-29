package com.kca.controller;

import com.kca.domain.Books;
import com.kca.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书籍，并返回书籍展示页面

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);

        return "allBook";
    }

//  跳转到新增书籍页面
    @RequestMapping("/toAddPaper")
    public String toAllPaper(){

        return "addBook";
    }

//    添加书籍请求
    @RequestMapping("/AddPaper")
    public String addBook(Books books){
        System.out.println("addBook=>" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
//  跳转到修改书籍页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBooks",books);
        return "updateBook";
    }

//    修改书籍内容
    @RequestMapping("/UpdatePaper")
    public String updatePaper(Books book){
        System.out.println("addBook=>" + book);
        bookService.updateBook(book);
        return "redirect:/book/allBook";
    }

//    删除书籍
    @RequestMapping("/toDelete")
    public String deletePaper(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

//    查询一本书
    @RequestMapping("/queryBook")
    public String queryPaper(String queryBook, Model model){
        List<Books> books = bookService.queryBooksByName(queryBook);

        model.addAttribute("list",books);
        return "allBook";

    }

}
