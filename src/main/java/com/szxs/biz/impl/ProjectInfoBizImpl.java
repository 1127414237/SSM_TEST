package com.szxs.biz.impl;

import com.szxs.biz.ProjectInfoBiz;
import com.szxs.dao.ProjectInfoDao;
import com.szxs.entity.Pager;
import com.szxs.entity.ProjectInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ProjectInfoBizImpl implements ProjectInfoBiz {
    @Resource(name = "projectInfoDao")
    private ProjectInfoDao projectInfoDao;
    public List<ProjectInfo> queryProjectInfo(int status) {
        return projectInfoDao.queryProjectInfo(status);
    }

    public Pager<ProjectInfo> queryProjectInfoPager(int status, int pageNo, int pageSize, int nextPageEnd, int nextPageStart) {
        Pager<ProjectInfo> pager = new Pager<ProjectInfo>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        pager.setTotalRows(projectInfoDao.queryRows(status));
        pager.setTotalPage( (pager.getTotalRows() + pageSize-1)/ pageSize);
        int begin = (pageNo-1)*pageSize;
        pager.setDatas(projectInfoDao.queryProjectInfoPager(status,begin,pageSize,nextPageEnd,nextPageStart));
        return pager;
    }

    public int updateProject(ProjectInfo projectInfo) {
        return  projectInfoDao.updateProject(projectInfo);
    }

    public ProjectInfo queryProjectOne(int id) {
        return projectInfoDao.queryProjectOne(id);
    }
}
