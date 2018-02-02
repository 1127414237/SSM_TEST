package com.szxs.dao;

import com.szxs.entity.ProjectInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectInfoDao {
    List<ProjectInfo> queryProjectInfoPager(@Param("status") int status,
     @Param("pageNo") int pageNo,
    @Param("pageSize") int pageSize,
    @Param("nextPageEnd") int nextPageEnd,
    @Param("nextPageStart") int nextPageStart);

    List<ProjectInfo>  queryProjectInfo(@Param("status") int status);

    int queryRows(@Param("status") int status);
    int updateProject(ProjectInfo projectInfo);
    ProjectInfo queryProjectOne(int id);
}
