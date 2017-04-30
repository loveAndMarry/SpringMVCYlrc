package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_comments", schema = "my_ylrc", catalog = "")
public class TbCommentsEntity {
    private int commetnId;
    private int commentOwnerId;
    private String commentContentText;
    private String commentContentPic;

    @Id
    @Column(name = "CommetnId", nullable = false)
    public int getCommetnId() {
        return commetnId;
    }

    public void setCommetnId(int commetnId) {
        this.commetnId = commetnId;
    }

    @Basic
    @Column(name = "CommentOwnerId", nullable = false)
    public int getCommentOwnerId() {
        return commentOwnerId;
    }

    public void setCommentOwnerId(int commentOwnerId) {
        this.commentOwnerId = commentOwnerId;
    }

    @Basic
    @Column(name = "CommentContentText", nullable = false, length = 100)
    public String getCommentContentText() {
        return commentContentText;
    }

    public void setCommentContentText(String commentContentText) {
        this.commentContentText = commentContentText;
    }

    @Basic
    @Column(name = "CommentContentPic", nullable = true, length = 200)
    public String getCommentContentPic() {
        return commentContentPic;
    }

    public void setCommentContentPic(String commentContentPic) {
        this.commentContentPic = commentContentPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCommentsEntity that = (TbCommentsEntity) o;

        if (commetnId != that.commetnId) return false;
        if (commentOwnerId != that.commentOwnerId) return false;
        if (commentContentText != null ? !commentContentText.equals(that.commentContentText) : that.commentContentText != null)
            return false;
        if (commentContentPic != null ? !commentContentPic.equals(that.commentContentPic) : that.commentContentPic != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commetnId;
        result = 31 * result + commentOwnerId;
        result = 31 * result + (commentContentText != null ? commentContentText.hashCode() : 0);
        result = 31 * result + (commentContentPic != null ? commentContentPic.hashCode() : 0);
        return result;
    }
}
