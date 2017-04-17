package com.ylrc.model;

import java.util.*;

/**
 * @author zl
 */
public class LiveRoom {

    /**
     * Default constructor
     */
    public LiveRoom() {
    }

    /**
     * 
     */
    private String ownerID;

    /**
     * 
     */
    private String roomID;

    /**
     * 
     */
    private boolean roomState;

    /**
     * 
     */
    private List<String> roomWatcherID;

    /**
     * 
     */
    private List<String> roomFollwerID;

	public String getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	public String getRoomID() {
		return roomID;
	}

	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}

	public boolean isRoomState() {
		return roomState;
	}

	public void setRoomState(boolean roomState) {
		this.roomState = roomState;
	}

	public List<String> getRoomWatcherID() {
		return roomWatcherID;
	}

	public void setRoomWatcherID(List<String> roomWatcherID) {
		this.roomWatcherID = roomWatcherID;
	}

	public List<String> getRoomFollwerID() {
		return roomFollwerID;
	}

	public void setRoomFollwerID(List<String> roomFollwerID) {
		this.roomFollwerID = roomFollwerID;
	}

    
}