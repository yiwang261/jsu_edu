package edu.jsu.mapper;

import edu.jsu.pojo.domain.Roles;

/**
* @author yiwan
* @description 针对表【roles(角色表)】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.Roles
*/
public interface RolesMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);

}
