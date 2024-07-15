package edu.jsu.mapper;

import edu.jsu.pojo.domain.PromotionSpace;

/**
* @author yiwan
* @description 针对表【promotion_space】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.PromotionSpace
*/
public interface PromotionSpaceMapper {

    int deleteByPrimaryKey(Long id);

    int insert(PromotionSpace record);

    int insertSelective(PromotionSpace record);

    PromotionSpace selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionSpace record);

    int updateByPrimaryKey(PromotionSpace record);

}
