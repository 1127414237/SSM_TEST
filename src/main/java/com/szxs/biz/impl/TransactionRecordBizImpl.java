package com.szxs.biz.impl;

import com.szxs.biz.TransactionRecordBiz;
import com.szxs.dao.TransactionRecordDao;
import com.szxs.entity.Pager;
import com.szxs.entity.TransactionRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TransactionRecordBizImpl implements TransactionRecordBiz {
    @Resource(name = "transactionRecordDao")
    private TransactionRecordDao transactionRecordDao;
    public Pager<TransactionRecord> queryTransPager(int pageNo, int pageSize, int nextPageEnd, int nextPageStart) {
        Pager<TransactionRecord> recordPager=new Pager<TransactionRecord>();
        recordPager.setPageNo(pageNo);
        recordPager.setPageSize(pageSize);
        recordPager.setTotalRows(transactionRecordDao.queryRows());
        recordPager.setTotalPage( (recordPager.getTotalRows() + pageSize-1)/ pageSize);
        int begin = (pageNo-1)*pageSize;
        recordPager.setDatas(transactionRecordDao.queryTransPager(begin,pageSize,nextPageEnd,nextPageStart));
        return recordPager;
    }
}
