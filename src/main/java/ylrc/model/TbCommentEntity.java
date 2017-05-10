package ylrc.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_comment", schema = "new_ylrc", catalog = "")
public class TbCommentEntity {
    private int commentId;
    private Timestamp commentTime;
    private byte[] commentImg;
    private String commentText;
    private Integer commentOwnerid;

    @Id
    @Column(name = "commentId", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "commentTime", nullable = true)
    public Timestamp getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Timestamp commentTime) {
        this.commentTime = commentTime;
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
    @Column(name = "commentText", nullable = true, length = 100)
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Basic
    @Column(name = "commentOwnerid", nullable = true)
    public Integer getCommentOwnerid() {
        return commentOwnerid;
    }

    public void setCommentOwnerid(Integer commentOwnerid) {
        this.commentOwnerid = commentOwnerid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCommentEntity that = (TbCommentEntity) o;

        if (commentId != that.commentId) return false;
        if (commentTime != null ? !commentTime.equals(that.commentTime) : that.commentTime != null) return false;
        if (!Arrays.equals(commentImg, that.commentImg)) return false;
        if (commentText != null ? !commentText.equals(that.commentText) : that.commentText != null) return false;
        if (commentOwnerid != null ? !commentOwnerid.equals(that.commentOwnerid) : that.commentOwnerid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + (commentTime != null ? commentTime.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(commentImg);
        result = 31 * result + (commentText != null ? commentText.hashCode() : 0);
        result = 31 * result + (commentOwnerid != null ? commentOwnerid.hashCode() : 0);
        return result;
    }
}
