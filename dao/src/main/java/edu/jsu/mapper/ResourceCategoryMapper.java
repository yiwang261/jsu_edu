package edu.jsu.mapper;

import edu.jsu.pojo.domain.ResourceCategory;

/**
* @author yiwan
* @description 针对表【resource_category(资源分类表)】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.ResourceCategory
*/
public interface ResourceCategoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ResourceCategory record);

    int insertSelective(ResourceCategory record);

    ResourceCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ResourceCategory record);

    int updateByPrimaryKey(ResourceCategory record);

}
