package ylrc.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_dnview", schema = "new_ylrc", catalog = "")
public class TbDnviewEntity {
    private int dnId;
    private Integer commentId;
    private String conteneText;
    private byte[] contentImg;
    private String contentUrl;
    private String contentVideo;
    private Date dnVdate;
    private Integer dnVstate;
    private Integer dnvPriority;
    private String likerId;
    private int uId;

    @Id
    @Column(name = "dnId", nullable = false)
    public int getDnId() {
        return dnId;
    }

    public void setDnId(int dnId) {
        this.dnId = dnId;
    }

    @Basic
    @Column(name = "commentId", nullable = true)
    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "conteneText", nullable = true, length = 200)
    public String getConteneText() {
        return conteneText;
    }

    public void setConteneText(String conteneText) {
        this.conteneText = conteneText;
    }

    @Basic
    @Column(name = "contentImg", nullable = true)
    public byte[] getContentImg() {
        return contentImg;
    }

    public void setContentImg(byte[] contentImg) {
        this.contentImg = contentImg;
    }

    @Basic
    @Column(name = "contentUrl", nullable = true, length = 50)
    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    @Basic
    @Column(name = "contentVideo", nullable = true, length = 50)
    public String getContentVideo() {
        return contentVideo;
    }

    public void setContentVideo(String contentVideo) {
        this.contentVideo = contentVideo;
    }

    @Basic
    @Column(name = "DNVdate", nullable = true)
    public Date getDnVdate() {
        return dnVdate;
    }

    public void setDnVdate(Date dnVdate) {
        this.dnVdate = dnVdate;
    }

    @Basic
    @Column(name = "DNVstate", nullable = true)
    public Integer getDnVstate() {
        return dnVstate;
    }

    public void setDnVstate(Integer dnVstate) {
        this.dnVstate = dnVstate;
    }

    @Basic
    @Column(name = "DNVPriority", nullable = true)
    public Integer getDnvPriority() {
        return dnvPriority;
    }

    public void setDnvPriority(Integer dnvPriority) {
        this.dnvPriority = dnvPriority;
    }

    @Basic
    @Column(name = "likerId", nullable = true, length = 100)
    public String getLikerId() {
        return likerId;
    }

    public void setLikerId(String likerId) {
        this.likerId = likerId;
    }

    @Basic
    @Column(name = "uId", nullable = false)
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbDnviewEntity that = (TbDnviewEntity) o;

        if (dnId != that.dnId) return false;
        if (uId != that.uId) return false;
        if (commentId != null ? !commentId.equals(that.commentId) : that.commentId != null) return false;
        if (conteneText != null ? !conteneText.equals(that.conteneText) : that.conteneText != null) return false;
        if (!Arrays.equals(contentImg, that.contentImg)) return false;
        if (contentUrl != null ? !contentUrl.equals(that.contentUrl) : that.contentUrl != null) return false;
        if (contentVideo != null ? !contentVideo.equals(that.contentVideo) : that.contentVideo != null) return false;
        if (dnVdate != null ? !dnVdate.equals(that.dnVdate) : that.dnVdate != null) return false;
        if (dnVstate != null ? !dnVstate.equals(that.dnVstate) : that.dnVstate != null) return false;
        if (dnvPriority != null ? !dnvPriority.equals(that.dnvPriority) : that.dnvPriority != null) return false;
        if (likerId != null ? !likerId.equals(that.likerId) : that.likerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dnId;
        result = 31 * result + (commentId != null ? commentId.hashCode() : 0);
        result = 31 * result + (conteneText != null ? conteneText.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(contentImg);
        result = 31 * result + (contentUrl != null ? contentUrl.hashCode() : 0);
        result = 31 * result + (contentVideo != null ? contentVideo.hashCode() : 0);
        result = 31 * result + (dnVdate != null ? dnVdate.hashCode() : 0);
        result = 31 * result + (dnVstate != null ? dnVstate.hashCode() : 0);
        result = 31 * result + (dnvPriority != null ? dnvPriority.hashCode() : 0);
        result = 31 * result + (likerId != null ? likerId.hashCode() : 0);
        result = 31 * result + uId;
        return result;
    }
}
