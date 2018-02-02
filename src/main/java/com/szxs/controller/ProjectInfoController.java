package com.szxs.controller;

import com.szxs.biz.ProjectInfoBiz;
import com.szxs.entity.ProjectInfo;
import org.springframework.cglib.reflect.MethodDelegate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ProjectInfoController {
@Resource
    private ProjectInfoBiz projectInfoBiz;
@RequestMapping("showList")
public String showList(Model model,String status, String pageIndex, String pageSize ){
    if (pageIndex == null) {
        pageIndex = "1";
    }
    if (pageSize==null){
        pageSize="1";
    }
    if (status==null) {
        status="-1";
    }
    model.addAttribute("projectList",projectInfoBiz.queryProjectInfoPager(Integer.parseInt(status),Integer.parseInt(pageIndex),Integer.parseInt(pageSize),Integer.parseInt(pageSize)*Integer.parseInt(pageIndex) ,(Integer.parseInt(pageIndex)-1)*Integer.parseInt(pageSize)+1));
    return  "showlist";
}
@RequestMapping("updateProject")
public String updateProject(ProjectInfo projectInfo, Model model,String status, String pageIndex, String pageSize ){
    int i=projectInfoBiz.updateProject(projectInfo);
    status="-1";
    if(i>0){
        return  showList(model, status, pageIndex, pageSize );
    }else{
        return "/selectProjectOne";
    }

}

@RequestMapping("selectProjectOne")
    public String selectProjectOne(int id,Model model){
    model.addAttribute("project",projectInfoBiz.queryProjectOne(id));
    return  "projectView";
}
}
