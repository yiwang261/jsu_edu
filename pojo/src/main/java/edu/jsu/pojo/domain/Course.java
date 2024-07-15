package edu.jsu.pojo.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName course
 */
@Data
public class Course implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 课程一句话简介
     */
    private String brief;

    /**
     * 原价
     */
    private Double price;

    /**
     * 原价标签
     */
    private String priceTag;

    /**
     * 优惠价
     */
    private Double discounts;

    /**
     * 优惠标签
     */
    private String discountsTag;

    /**
     * 描述markdown
     */
    private String courseDescriptionMarkDown;

    /**
     * 课程描述
     */
    private String courseDescription;

    /**
     * 课程分享图片url
     */
    private String courseImgUrl;

    /**
     * 是否新品
     */
    private Integer isNew;

    /**
     * 广告语
     */
    private String isNewDes;

    /**
     * 最后操作者
     */
    private Integer lastOperatorId;

    /**
     * 自动上架时间
     */
    private Date autoOnlineTime;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Integer isDel;

    /**
     * 总时长(分钟)
     */
    private Integer totalDuration;

    /**
     * 课程列表展示图片
     */
    private String courseListImg;

    /**
     * 课程状态，0-草稿，1-上架
     */
    private Integer status;

    /**
     * 课程排序，用于后台保存草稿时用到
     */
    private Integer sortNum;

    /**
     * 课程预览第一个字段
     */
    private String previewFirstField;

    /**
     * 课程预览第二个字段
     */
    private String previewSecondField;

    /**
     * 销量
     */
    private Integer sales;

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
        Course other = (Course) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getPriceTag() == null ? other.getPriceTag() == null : this.getPriceTag().equals(other.getPriceTag()))
            && (this.getDiscounts() == null ? other.getDiscounts() == null : this.getDiscounts().equals(other.getDiscounts()))
            && (this.getDiscountsTag() == null ? other.getDiscountsTag() == null : this.getDiscountsTag().equals(other.getDiscountsTag()))
            && (this.getCourseDescriptionMarkDown() == null ? other.getCourseDescriptionMarkDown() == null : this.getCourseDescriptionMarkDown().equals(other.getCourseDescriptionMarkDown()))
            && (this.getCourseDescription() == null ? other.getCourseDescription() == null : this.getCourseDescription().equals(other.getCourseDescription()))
            && (this.getCourseImgUrl() == null ? other.getCourseImgUrl() == null : this.getCourseImgUrl().equals(other.getCourseImgUrl()))
            && (this.getIsNew() == null ? other.getIsNew() == null : this.getIsNew().equals(other.getIsNew()))
            && (this.getIsNewDes() == null ? other.getIsNewDes() == null : this.getIsNewDes().equals(other.getIsNewDes()))
            && (this.getLastOperatorId() == null ? other.getLastOperatorId() == null : this.getLastOperatorId().equals(other.getLastOperatorId()))
            && (this.getAutoOnlineTime() == null ? other.getAutoOnlineTime() == null : this.getAutoOnlineTime().equals(other.getAutoOnlineTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getTotalDuration() == null ? other.getTotalDuration() == null : this.getTotalDuration().equals(other.getTotalDuration()))
            && (this.getCourseListImg() == null ? other.getCourseListImg() == null : this.getCourseListImg().equals(other.getCourseListImg()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSortNum() == null ? other.getSortNum() == null : this.getSortNum().equals(other.getSortNum()))
            && (this.getPreviewFirstField() == null ? other.getPreviewFirstField() == null : this.getPreviewFirstField().equals(other.getPreviewFirstField()))
            && (this.getPreviewSecondField() == null ? other.getPreviewSecondField() == null : this.getPreviewSecondField().equals(other.getPreviewSecondField()))
            && (this.getSales() == null ? other.getSales() == null : this.getSales().equals(other.getSales()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getPriceTag() == null) ? 0 : getPriceTag().hashCode());
        result = prime * result + ((getDiscounts() == null) ? 0 : getDiscounts().hashCode());
        result = prime * result + ((getDiscountsTag() == null) ? 0 : getDiscountsTag().hashCode());
        result = prime * result + ((getCourseDescriptionMarkDown() == null) ? 0 : getCourseDescriptionMarkDown().hashCode());
        result = prime * result + ((getCourseDescription() == null) ? 0 : getCourseDescription().hashCode());
        result = prime * result + ((getCourseImgUrl() == null) ? 0 : getCourseImgUrl().hashCode());
        result = prime * result + ((getIsNew() == null) ? 0 : getIsNew().hashCode());
        result = prime * result + ((getIsNewDes() == null) ? 0 : getIsNewDes().hashCode());
        result = prime * result + ((getLastOperatorId() == null) ? 0 : getLastOperatorId().hashCode());
        result = prime * result + ((getAutoOnlineTime() == null) ? 0 : getAutoOnlineTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getTotalDuration() == null) ? 0 : getTotalDuration().hashCode());
        result = prime * result + ((getCourseListImg() == null) ? 0 : getCourseListImg().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSortNum() == null) ? 0 : getSortNum().hashCode());
        result = prime * result + ((getPreviewFirstField() == null) ? 0 : getPreviewFirstField().hashCode());
        result = prime * result + ((getPreviewSecondField() == null) ? 0 : getPreviewSecondField().hashCode());
        result = prime * result + ((getSales() == null) ? 0 : getSales().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseName=").append(courseName);
        sb.append(", brief=").append(brief);
        sb.append(", price=").append(price);
        sb.append(", priceTag=").append(priceTag);
        sb.append(", discounts=").append(discounts);
        sb.append(", discountsTag=").append(discountsTag);
        sb.append(", courseDescriptionMarkDown=").append(courseDescriptionMarkDown);
        sb.append(", courseDescription=").append(courseDescription);
        sb.append(", courseImgUrl=").append(courseImgUrl);
        sb.append(", isNew=").append(isNew);
        sb.append(", isNewDes=").append(isNewDes);
        sb.append(", lastOperatorId=").append(lastOperatorId);
        sb.append(", autoOnlineTime=").append(autoOnlineTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", totalDuration=").append(totalDuration);
        sb.append(", courseListImg=").append(courseListImg);
        sb.append(", status=").append(status);
        sb.append(", sortNum=").append(sortNum);
        sb.append(", previewFirstField=").append(previewFirstField);
        sb.append(", previewSecondField=").append(previewSecondField);
        sb.append(", sales=").append(sales);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}