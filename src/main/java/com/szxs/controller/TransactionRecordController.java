package com.szxs.controller;

import com.szxs.biz.TransactionRecordBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TransactionRecordController {
    @Resource
    private TransactionRecordBiz transactionRecordBiz;
    @RequestMapping("queryTraRecordPager")
    public String queryTraRecordPager(Model m, String pageIndex, String pageSize ){
        if (pageIndex == null) {
            pageIndex = "1";
        }
        if (pageSize==null){
            pageSize="1";
        }
        m.addAttribute("traRecordPager",transactionRecordBiz.queryTransPager(Integer.parseInt(pageIndex),Integer.parseInt(pageSize),Integer.parseInt(pageSize)*Integer.parseInt(pageIndex) ,(Integer.parseInt(pageIndex)-1)*Integer.parseInt(pageSize)+1));
        return  "tradingRecord";

    }
}
