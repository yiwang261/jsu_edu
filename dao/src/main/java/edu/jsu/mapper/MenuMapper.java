package edu.jsu.mapper;

import edu.jsu.pojo.domain.Menu;

/**
* @author yiwan
* @description 针对表【menu(菜单表)】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.Menu
*/
public interface MenuMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

}
