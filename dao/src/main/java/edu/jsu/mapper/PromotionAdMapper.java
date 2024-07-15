package edu.jsu.mapper;

import edu.jsu.pojo.domain.PromotionAd;

/**
* @author yiwan
* @description 针对表【promotion_ad】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.PromotionAd
*/
public interface PromotionAdMapper {

    int deleteByPrimaryKey(Long id);

    int insert(PromotionAd record);

    int insertSelective(PromotionAd record);

    PromotionAd selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PromotionAd record);

    int updateByPrimaryKey(PromotionAd record);

}
