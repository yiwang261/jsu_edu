package edu.jsu.mapper;

import edu.jsu.pojo.domain.UserWeixin;

/**
* @author yiwan
* @description 针对表【user_weixin】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.UserWeixin
*/
public interface UserWeixinMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserWeixin record);

    int insertSelective(UserWeixin record);

    UserWeixin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserWeixin record);

    int updateByPrimaryKey(UserWeixin record);

}
