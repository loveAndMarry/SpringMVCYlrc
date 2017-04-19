package ylrc.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by xxxxx on 2017/4/19.
 */
@Entity
@Table(name = "tb_comment", schema = "ylrc", catalog = "")
public class TbCommentEntity {
    private int cid;
    private String commentText;
    private byte[] commentImg;
    private Integer conmentOwnerId;
    private Date commentDate;

    @Id
    @Column(name = "Cid", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "commentText", nullable = true, length = 100)
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Basic
    @Column(name = "commentImg", nullable = true)
    public byte[] getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(byte[] commentImg) {
        this.commentImg = commentImg;
    }

    @Basic
    @Column(name = "conmentOwnerId", nullable = true)
    public Integer getConmentOwnerId() {
        return conmentOwnerId;
    }

    public void setConmentOwnerId(Integer conmentOwnerId) {
        this.conmentOwnerId = conmentOwnerId;
    }

    @Basic
    @Column(name = "commentDate", nullable = true)
    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCommentEntity that = (TbCommentEntity) o;

        if (cid != that.cid) return false;
        if (commentText != null ? !commentText.equals(that.commentText) : that.commentText != null) return false;
        if (!Arrays.equals(commentImg, that.commentImg)) return false;
        if (conmentOwnerId != null ? !conmentOwnerId.equals(that.conmentOwnerId) : that.conmentOwnerId != null)
            return false;
        if (commentDate != null ? !commentDate.equals(that.commentDate) : that.commentDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (commentText != null ? commentText.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(commentImg);
        result = 31 * result + (conmentOwnerId != null ? conmentOwnerId.hashCode() : 0);
        result = 31 * result + (commentDate != null ? commentDate.hashCode() : 0);
        return result;
    }
}
