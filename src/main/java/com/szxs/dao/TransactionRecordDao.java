package com.szxs.dao;

import com.szxs.entity.TransactionRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransactionRecordDao {
    List<TransactionRecord> queryTransPager( @Param("pageNo") int pageNo,
                                             @Param("pageSize") int pageSize,
                                             @Param("nextPageEnd") int nextPageEnd,
                                             @Param("nextPageStart") int nextPageStart);

    int queryRows();
}
