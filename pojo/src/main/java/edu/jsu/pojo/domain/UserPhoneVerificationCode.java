package edu.jsu.pojo.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName user_phone_verification_code
 */
@Data
public class UserPhoneVerificationCode implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 验证码
     */
    private String verificationCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 验证码是否校验过
     */
    private Boolean ischeck;

    /**
     * 校验次数
     */
    private Integer checkTimes;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserPhoneVerificationCode other = (UserPhoneVerificationCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getVerificationCode() == null ? other.getVerificationCode() == null : this.getVerificationCode().equals(other.getVerificationCode()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getIscheck() == null ? other.getIscheck() == null : this.getIscheck().equals(other.getIscheck()))
            && (this.getCheckTimes() == null ? other.getCheckTimes() == null : this.getCheckTimes().equals(other.getCheckTimes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getVerificationCode() == null) ? 0 : getVerificationCode().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getIscheck() == null) ? 0 : getIscheck().hashCode());
        result = prime * result + ((getCheckTimes() == null) ? 0 : getCheckTimes().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phone=").append(phone);
        sb.append(", verificationCode=").append(verificationCode);
        sb.append(", createTime=").append(createTime);
        sb.append(", ischeck=").append(ischeck);
        sb.append(", checkTimes=").append(checkTimes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}