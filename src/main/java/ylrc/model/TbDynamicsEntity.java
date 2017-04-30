package ylrc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_dynamics", schema = "my_ylrc", catalog = "")
public class TbDynamicsEntity {
    private int dynamicId;
    private int dynamicOwnerId;
    private String dynamicContentText;
    private String dynamicContentImgs;
    private String dynamciContentVideo;
    private String dynamicContentUrl;
    private String dynamicLikerId;
    private String dynamicCommentsId;
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
    @Column(name = "DynamicOwnerId", nullable = false)
    public int getDynamicOwnerId() {
        return dynamicOwnerId;
    }

    public void setDynamicOwnerId(int dynamicOwnerId) {
        this.dynamicOwnerId = dynamicOwnerId;
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
    @Column(name = "DynamicContentImgs", nullable = true, length = 30)
    public String getDynamicContentImgs() {
        return dynamicContentImgs;
    }

    public void setDynamicContentImgs(String dynamicContentImgs) {
        this.dynamicContentImgs = dynamicContentImgs;
    }

    @Basic
    @Column(name = "DynamciContentVideo", nullable = true, length = 30)
    public String getDynamciContentVideo() {
        return dynamciContentVideo;
    }

    public void setDynamciContentVideo(String dynamciContentVideo) {
        this.dynamciContentVideo = dynamciContentVideo;
    }

    @Basic
    @Column(name = "DynamicContentUrl", nullable = true, length = 30)
    public String getDynamicContentUrl() {
        return dynamicContentUrl;
    }

    public void setDynamicContentUrl(String dynamicContentUrl) {
        this.dynamicContentUrl = dynamicContentUrl;
    }

    @Basic
    @Column(name = "DynamicLikerId", nullable = true, length = 100)
    public String getDynamicLikerId() {
        return dynamicLikerId;
    }

    public void setDynamicLikerId(String dynamicLikerId) {
        this.dynamicLikerId = dynamicLikerId;
    }

    @Basic
    @Column(name = "DynamicCommentsId", nullable = true, length = 100)
    public String getDynamicCommentsId() {
        return dynamicCommentsId;
    }

    public void setDynamicCommentsId(String dynamicCommentsId) {
        this.dynamicCommentsId = dynamicCommentsId;
    }

    @Basic
    @Column(name = "DynamicTime", nullable = false)
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

        TbDynamicsEntity that = (TbDynamicsEntity) o;

        if (dynamicId != that.dynamicId) return false;
        if (dynamicOwnerId != that.dynamicOwnerId) return false;
        if (dynamicContentText != null ? !dynamicContentText.equals(that.dynamicContentText) : that.dynamicContentText != null)
            return false;
        if (dynamicContentImgs != null ? !dynamicContentImgs.equals(that.dynamicContentImgs) : that.dynamicContentImgs != null)
            return false;
        if (dynamciContentVideo != null ? !dynamciContentVideo.equals(that.dynamciContentVideo) : that.dynamciContentVideo != null)
            return false;
        if (dynamicContentUrl != null ? !dynamicContentUrl.equals(that.dynamicContentUrl) : that.dynamicContentUrl != null)
            return false;
        if (dynamicLikerId != null ? !dynamicLikerId.equals(that.dynamicLikerId) : that.dynamicLikerId != null)
            return false;
        if (dynamicCommentsId != null ? !dynamicCommentsId.equals(that.dynamicCommentsId) : that.dynamicCommentsId != null)
            return false;
        if (dynamicTime != null ? !dynamicTime.equals(that.dynamicTime) : that.dynamicTime != null) return false;
        if (dynamicState != null ? !dynamicState.equals(that.dynamicState) : that.dynamicState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dynamicId;
        result = 31 * result + dynamicOwnerId;
        result = 31 * result + (dynamicContentText != null ? dynamicContentText.hashCode() : 0);
        result = 31 * result + (dynamicContentImgs != null ? dynamicContentImgs.hashCode() : 0);
        result = 31 * result + (dynamciContentVideo != null ? dynamciContentVideo.hashCode() : 0);
        result = 31 * result + (dynamicContentUrl != null ? dynamicContentUrl.hashCode() : 0);
        result = 31 * result + (dynamicLikerId != null ? dynamicLikerId.hashCode() : 0);
        result = 31 * result + (dynamicCommentsId != null ? dynamicCommentsId.hashCode() : 0);
        result = 31 * result + (dynamicTime != null ? dynamicTime.hashCode() : 0);
        result = 31 * result + (dynamicState != null ? dynamicState.hashCode() : 0);
        return result;
    }
}
