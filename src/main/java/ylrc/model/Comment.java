package ylrc.model;

/**
 * @author zl
 */
public class Comment {

    /**
     * Default constructor
     */
    public Comment() {
    }

    /**
     * 
     */
    private String commentID;

    /**
     * 
     */
    private String commentContentText;

    /**
     * 
     */
	 private String commentContentImg;

    /**
     * 
     */
    private String commentOwnerID;
	
	 /**
     * 
     */
    private String commentDate;
	
	public String getCommentID() {
		return commentID;
	}

	public void setCommentID(String commentID) {
		this.commentID = commentID;
	}

	public String getCommentContentText() {
		return commentContentText;
	}

	public void setCommentContentText(String commentContentText) {
		this.commentContentText = commentContentText;
	}
	
	public String getCommentContentImg() {
		return commentContentImg;
	}

	public void setCommentContentImg(String commentContentImg) {
		this.commentContentImg = commentContentImg;
	}

	public String getCommentOwnerID() {
		return commentOwnerID;
	}

	public void setCommentOwnerID(String commentOwnerID) {
		this.commentOwnerID = commentOwnerID;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}
    
}