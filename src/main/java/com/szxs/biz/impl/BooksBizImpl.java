package com.szxs.biz.impl;

import com.szxs.biz.BooksBiz;
import com.szxs.dao.BooksDao;
import com.szxs.entity.Books;
import com.szxs.entity.Pager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BooksBizImpl implements BooksBiz {
    @Resource(name = "booksDao")
    private BooksDao booksDao;
    public Pager<Books> queryBooksPager(String bookName, String bookAuthor, String bookPublish, int pageNo, int pageSize, int nextPageEnd, int nextPageStart) {
        Pager<Books> booksPager=new Pager<Books>();
        booksPager.setPageNo(pageNo);
        booksPager.setPageSize(pageSize);
        booksPager.setTotalRows(booksDao.queryRows(bookName,bookAuthor,bookPublish));
        booksPager.setTotalPage((booksPager.getTotalRows() + pageSize-1)/ pageSize);
        int begin=(pageNo-1)*pageSize;
        booksPager.setDatas(booksDao.queryBooksPager(bookName,bookAuthor,bookPublish,begin,pageSize,nextPageEnd,nextPageStart));

        return booksPager;
    }

    public int addBooks(Books books) {
        return booksDao.addBooks(books);
    }
}
