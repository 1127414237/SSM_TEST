package com.szxs.controller;

import com.szxs.biz.AccountBiz;
import com.szxs.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class AccountController {
    @Resource
    private AccountBiz accountBiz;
    @RequestMapping("/accountLogin")
    public String accountLogin(Model m, Account account, HttpSession session){
        Account login = accountBiz.login(account);
        if(login!=null){
            //登录成功
            session.setAttribute("AccountSession",login);
            return "welcomeAccount";
        }
        else{
            System.out.println("<script>alter('账号不存在！')</script>");
            return "OnlineBankLogin";
        }
    }
}
