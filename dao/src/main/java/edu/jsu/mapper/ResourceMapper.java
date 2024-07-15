package edu.jsu.mapper;

import edu.jsu.pojo.domain.Resource;

/**
* @author yiwan
* @description 针对表【resource(资源表)】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.Resource
*/
public interface ResourceMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);

}
