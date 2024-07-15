package edu.jsu.pojo.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName course_media
 */
@Data
public class CourseMedia implements Serializable {
    /**
     * 课程媒体主键ID
     */
    private Integer id;

    /**
     * 课程Id
     */
    private Integer courseId;

    /**
     * 章ID
     */
    private Integer sectionId;

    /**
     * 课时ID
     */
    private Integer lessonId;

    /**
     * 封面图URL
     */
    private String coverImageUrl;

    /**
     * 时长（06:02）
     */
    private String duration;

    /**
     * 媒体资源文件对应的EDK
     */
    private String fileEdk;

    /**
     * 文件大小MB
     */
    private Double fileSize;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 媒体资源文件对应的DK
     */
    private String fileDk;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除，0未删除，1删除
     */
    private Integer isDel;

    /**
     * 时长，秒数（主要用于音频在H5控件中使用）
     */
    private Integer durationNum;

    /**
     * 媒体资源文件ID
     */
    private String fileId;

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
        CourseMedia other = (CourseMedia) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getSectionId() == null ? other.getSectionId() == null : this.getSectionId().equals(other.getSectionId()))
            && (this.getLessonId() == null ? other.getLessonId() == null : this.getLessonId().equals(other.getLessonId()))
            && (this.getCoverImageUrl() == null ? other.getCoverImageUrl() == null : this.getCoverImageUrl().equals(other.getCoverImageUrl()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getFileEdk() == null ? other.getFileEdk() == null : this.getFileEdk().equals(other.getFileEdk()))
            && (this.getFileSize() == null ? other.getFileSize() == null : this.getFileSize().equals(other.getFileSize()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getFileDk() == null ? other.getFileDk() == null : this.getFileDk().equals(other.getFileDk()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDel() == null ? other.getIsDel() == null : this.getIsDel().equals(other.getIsDel()))
            && (this.getDurationNum() == null ? other.getDurationNum() == null : this.getDurationNum().equals(other.getDurationNum()))
            && (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getSectionId() == null) ? 0 : getSectionId().hashCode());
        result = prime * result + ((getLessonId() == null) ? 0 : getLessonId().hashCode());
        result = prime * result + ((getCoverImageUrl() == null) ? 0 : getCoverImageUrl().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getFileEdk() == null) ? 0 : getFileEdk().hashCode());
        result = prime * result + ((getFileSize() == null) ? 0 : getFileSize().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getFileDk() == null) ? 0 : getFileDk().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDel() == null) ? 0 : getIsDel().hashCode());
        result = prime * result + ((getDurationNum() == null) ? 0 : getDurationNum().hashCode());
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", sectionId=").append(sectionId);
        sb.append(", lessonId=").append(lessonId);
        sb.append(", coverImageUrl=").append(coverImageUrl);
        sb.append(", duration=").append(duration);
        sb.append(", fileEdk=").append(fileEdk);
        sb.append(", fileSize=").append(fileSize);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileDk=").append(fileDk);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDel=").append(isDel);
        sb.append(", durationNum=").append(durationNum);
        sb.append(", fileId=").append(fileId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}