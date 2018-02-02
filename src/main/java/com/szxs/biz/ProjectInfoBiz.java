package com.szxs.biz;

import com.szxs.entity.Pager;
import com.szxs.entity.ProjectInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectInfoBiz {
    List<ProjectInfo> queryProjectInfo(int status);
    Pager<ProjectInfo> queryProjectInfoPager(int status,
                                              int pageNo,
                                             int pageSize,
                                             int nextPageEnd,
                                            int nextPageStart);
    int updateProject(ProjectInfo projectInfo);
    ProjectInfo queryProjectOne(int id);
}
