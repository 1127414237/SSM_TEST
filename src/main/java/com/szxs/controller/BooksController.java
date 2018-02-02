package com.szxs.controller;

import com.szxs.biz.BooksBiz;
import com.szxs.entity.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;

@Controller
public class BooksController {
    @Resource
    private BooksBiz booksBiz;
    @RequestMapping("/showBooksPagerList")
    public String showBooksPagerList(Model model,String bookName,String bookAuthor,String bookPublish,String pageIndex,String pageSize){
        if (pageIndex == null) {
            pageIndex = "1";
        }
        if (pageSize==null){
            pageSize="1";
        }

        model.addAttribute("booksList",booksBiz.queryBooksPager(bookName,bookAuthor,bookPublish,Integer.parseInt(pageIndex),Integer.parseInt(pageSize),Integer.parseInt(pageSize)*Integer.parseInt(pageIndex) ,(Integer.parseInt(pageIndex)-1)*Integer.parseInt(pageSize)+1));
        return "booklist";
    }
    @RequestMapping("addBook")
    public String addBook(Books books,Model model){
        books.setCreateDate(new Date());
        int i = booksBiz.addBooks(books);
        if(i>0){
            return showBooksPagerList( model,null,null,null,null,null);
        }else{
            return null;
        }
    }
}
