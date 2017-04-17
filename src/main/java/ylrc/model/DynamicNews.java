package ylrc.model;

import java.util.*;

/**
 * @author zl
 */
public class DynamicNews {

    /**
     * Default constructor
     */
    public DynamicNews() {
    }

    /**
     * 
     */
    private String dnID;

    /**
     * 
     */
    private String ownerID;

    /**
     * 
     */
    private String contentText;

    /**
     * 
     */
    private List<String> contentImgs;

    /**
     * 
     */
    private String contentUrl;

    /**
     * 
     */
    private String contetnVideo;

    /**
     * 
     */
    private List<String> likerID;

    /**
     * 
     */
    private List<String> commentID;
	
	/**
     * 
     */
	private String DNDate;
	
	/**
     * 
     */
	private boolean DNState;

	public String getDnID() {
		return dnID;
	}

	public void setDnID(String dnID) {
		this.dnID = dnID;
	}

	public String getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	public String getContentText() {
		return contentText;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	public List<String> getContentImgs() {
		return contentImgs;
	}

	public void setContentImgs(List<String> contentImgs) {
		this.contentImgs = contentImgs;
	}

	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public String getContetnVideo() {
		return contetnVideo;
	}

	public void setContetnVideo(String contetnVideo) {
		this.contetnVideo = contetnVideo;
	}

	public List<String> getLikerID() {
		return likerID;
	}

	public void setLikerID(List<String> likerID) {
		this.likerID = likerID;
	}

	public List<String> getCommentID() {
		return commentID;
	}

	public void setCommentID(List<String> commentID) {
		this.commentID = commentID;
	}
	
	public String getDNDate() {
		return DNDate;
	}

	public void setDNDate(String DNDate) {
		this.DNDate = DNDate;
	}

    public boolean getDNState() {
		return DNState;
	}

	public void setDNState(boolean DNState) {
		this.DNState = DNState;
	}
}