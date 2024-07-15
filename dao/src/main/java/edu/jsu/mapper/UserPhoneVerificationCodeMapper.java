package edu.jsu.mapper;

import edu.jsu.pojo.domain.UserPhoneVerificationCode;

/**
* @author yiwan
* @description 针对表【user_phone_verification_code】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.UserPhoneVerificationCode
*/
public interface UserPhoneVerificationCodeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserPhoneVerificationCode record);

    int insertSelective(UserPhoneVerificationCode record);

    UserPhoneVerificationCode selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserPhoneVerificationCode record);

    int updateByPrimaryKey(UserPhoneVerificationCode record);

}
