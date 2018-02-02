package com.szxs.dao;

import com.szxs.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksDao {
    List<Books> queryBooksPager(@Param("bookName") String bookName,
                                            @Param("bookAuthor")String bookAuthor,
                                            @Param("bookPublish")String bookPublish,
                                            @Param("pageNo") int pageNo,
                                            @Param("pageSize") int pageSize,
                                            @Param("nextPageEnd") int nextPageEnd,
                                            @Param("nextPageStart") int nextPageStart);
    int addBooks(Books books);
    int queryRows(@Param("bookName") String bookName,
                  @Param("bookAuthor")String bookAuthor,
                  @Param("bookPublish")String bookPublish);
}
