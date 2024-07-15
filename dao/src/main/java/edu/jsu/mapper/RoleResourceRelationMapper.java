package edu.jsu.mapper;

import edu.jsu.pojo.domain.RoleResourceRelation;

/**
* @author yiwan
* @description 针对表【role_resource_relation(角色和资源关系表)】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.RoleResourceRelation
*/
public interface RoleResourceRelationMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RoleResourceRelation record);

    int insertSelective(RoleResourceRelation record);

    RoleResourceRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleResourceRelation record);

    int updateByPrimaryKey(RoleResourceRelation record);

}
