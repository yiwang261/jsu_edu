package edu.jsu.mapper;

import edu.jsu.pojo.domain.UserRoleRelation;

/**
* @author yiwan
* @description 针对表【user_role_relation(用户和角色关系表)】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.UserRoleRelation
*/
public interface UserRoleRelationMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleRelation record);

    int insertSelective(UserRoleRelation record);

    UserRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRoleRelation record);

    int updateByPrimaryKey(UserRoleRelation record);

}
