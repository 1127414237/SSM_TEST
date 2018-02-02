package com.szxs.biz;

import com.szxs.entity.Pager;
import com.szxs.entity.TransactionRecord;


public interface TransactionRecordBiz {
    Pager<TransactionRecord> queryTransPager(int pageNo,
                                             int pageSize,
                                             int nextPageEnd,
                                             int nextPageStart);
}
