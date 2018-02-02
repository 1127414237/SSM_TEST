package com.szxs.biz;

import com.szxs.entity.Books;
import com.szxs.entity.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksBiz {
    Pager<Books> queryBooksPager(String bookName,
                                      String bookAuthor,
                                      String bookPublish,
                                      int pageNo,
                                      int pageSize,
                                      int nextPageEnd,
                                     int nextPageStart);
    int addBooks(Books books);
}
