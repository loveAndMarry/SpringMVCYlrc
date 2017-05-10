package ylrc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_dynamic", schema = "new_ylrc", catalog = "")
public class TbDynamicEntity {
    private int dynamicId;
    private int dynamicOwerid;
    private String dynamicContentText;
    private String dynamicContentImg;
    private String dynamicContentVideo;
    private String dynamicContentUrl;
    private String dynamicLikeid;
    private String dynamicCommentId;
    private Timestamp dynamicTime;
    private Integer dynamicState;

    @Id
    @Column(name = "DynamicId", nullable = false)
    public int getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(int dynamicId) {
        this.dynamicId = dynamicId;
    }

    @Basic
    @Column(name = "DynamicOwerid", nullable = false)
    public int getDynamicOwerid() {
        return dynamicOwerid;
    }

    public void setDynamicOwerid(int dynamicOwerid) {
        this.dynamicOwerid = dynamicOwerid;
    }

    @Basic
    @Column(name = "DynamicContentText", nullable = false, length = 300)
    public String getDynamicContentText() {
        return dynamicContentText;
    }

    public void setDynamicContentText(String dynamicContentText) {
        this.dynamicContentText = dynamicContentText;
    }

    @Basic
    @Column(name = "DynamicContentImg", nullable = true, length = 50)
    public String getDynamicContentImg() {
        return dynamicContentImg;
    }

    public void setDynamicContentImg(String dynamicContentImg) {
        this.dynamicContentImg = dynamicContentImg;
    }

    @Basic
    @Column(name = "DynamicContentVideo", nullable = true, length = 50)
    public String getDynamicContentVideo() {
        return dynamicContentVideo;
    }

    public void setDynamicContentVideo(String dynamicContentVideo) {
        this.dynamicContentVideo = dynamicContentVideo;
    }

    @Basic
    @Column(name = "DynamicContentUrl", nullable = true, length = 50)
    public String getDynamicContentUrl() {
        return dynamicContentUrl;
    }

    public void setDynamicContentUrl(String dynamicContentUrl) {
        this.dynamicContentUrl = dynamicContentUrl;
    }

    @Basic
    @Column(name = "DynamicLikeid", nullable = true, length = 100)
    public String getDynamicLikeid() {
        return dynamicLikeid;
    }

    public void setDynamicLikeid(String dynamicLikeid) {
        this.dynamicLikeid = dynamicLikeid;
    }

    @Basic
    @Column(name = "DynamicCommentId", nullable = true, length = 100)
    public String getDynamicCommentId() {
        return dynamicCommentId;
    }

    public void setDynamicCommentId(String dynamicCommentId) {
        this.dynamicCommentId = dynamicCommentId;
    }

    @Basic
    @Column(name = "DynamicTime", nullable = true)
    public Timestamp getDynamicTime() {
        return dynamicTime;
    }

    public void setDynamicTime(Timestamp dynamicTime) {
        this.dynamicTime = dynamicTime;
    }

    @Basic
    @Column(name = "DynamicState", nullable = true)
    public Integer getDynamicState() {
        return dynamicState;
    }

    public void setDynamicState(Integer dynamicState) {
        this.dynamicState = dynamicState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbDynamicEntity that = (TbDynamicEntity) o;

        if (dynamicId != that.dynamicId) return false;
        if (dynamicOwerid != that.dynamicOwerid) return false;
        if (dynamicContentText != null ? !dynamicContentText.equals(that.dynamicContentText) : that.dynamicContentText != null)
            return false;
        if (dynamicContentImg != null ? !dynamicContentImg.equals(that.dynamicContentImg) : that.dynamicContentImg != null)
            return false;
        if (dynamicContentVideo != null ? !dynamicContentVideo.equals(that.dynamicContentVideo) : that.dynamicContentVideo != null)
            return false;
        if (dynamicContentUrl != null ? !dynamicContentUrl.equals(that.dynamicContentUrl) : that.dynamicContentUrl != null)
            return false;
        if (dynamicLikeid != null ? !dynamicLikeid.equals(that.dynamicLikeid) : that.dynamicLikeid != null)
            return false;
        if (dynamicCommentId != null ? !dynamicCommentId.equals(that.dynamicCommentId) : that.dynamicCommentId != null)
            return false;
        if (dynamicTime != null ? !dynamicTime.equals(that.dynamicTime) : that.dynamicTime != null) return false;
        if (dynamicState != null ? !dynamicState.equals(that.dynamicState) : that.dynamicState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dynamicId;
        result = 31 * result + dynamicOwerid;
        result = 31 * result + (dynamicContentText != null ? dynamicContentText.hashCode() : 0);
        result = 31 * result + (dynamicContentImg != null ? dynamicContentImg.hashCode() : 0);
        result = 31 * result + (dynamicContentVideo != null ? dynamicContentVideo.hashCode() : 0);
        result = 31 * result + (dynamicContentUrl != null ? dynamicContentUrl.hashCode() : 0);
        result = 31 * result + (dynamicLikeid != null ? dynamicLikeid.hashCode() : 0);
        result = 31 * result + (dynamicCommentId != null ? dynamicCommentId.hashCode() : 0);
        result = 31 * result + (dynamicTime != null ? dynamicTime.hashCode() : 0);
        result = 31 * result + (dynamicState != null ? dynamicState.hashCode() : 0);
        return result;
    }
}
