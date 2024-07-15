package edu.jsu.mapper;

import edu.jsu.pojo.domain.RoleMenuRelation;

/**
* @author yiwan
* @description 针对表【role_menu_relation(角色和菜单关系表)】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.RoleMenuRelation
*/
public interface RoleMenuRelationMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RoleMenuRelation record);

    int insertSelective(RoleMenuRelation record);

    RoleMenuRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleMenuRelation record);

    int updateByPrimaryKey(RoleMenuRelation record);

}
