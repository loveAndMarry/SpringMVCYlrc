package com.ylrc.dao;

import java.util.List;

import com.ylrc.model.User;

public interface UserDAO {
	
	/**
	 * Create a new user profile in the system, the userId will be created or get from loginDAO
	 * @param user
	 * @return new User id
	 */
	boolean insertNewUserProfile(String userId, User user);
	/**
	 * delete a user from the system
	 * @param userId
	 * @return
	 */
	boolean deleteUser(String userId);
	/**
	 * return the user
	 * @param userId
	 * @return
	 */
	User getUser(String userId);
	
	List<String> getTotalUserId();
	
	/**
	 * When some user was reported, which means this user will be block by this system,
	 * so this function will get all the users who have been in the unavailable state, he can do nothing.
	 * @return
	 */
	List<String> getUnavailableUser();
	
	boolean insertUserToUnavailableList(String userId);
	
	boolean deleteUserFromUnavailableList(String userId);
	
	int getTotalUserNumber();
	/**
	 * user profile related
	 */
	String getUserRealName(String userId);
	boolean updateUserName(String userId, String userRealName);
	
	String getUserNickName(String userId);
	boolean updateUserNickName(String userId, String userNickName);

	String getUserPhoneNumber(String userId);
	boolean updateUserPhoneNumber(String userId, String phoneNumber);

	String getUserEmail(String userId);
	boolean updateUserEmail(String userId, String email);

	String getUserPsd(String userId);
	boolean updateUserPsd(String userId, String userPsd);
	
	String getUserAge(String userId);
	boolean updateUserAge(String userId, String age);
	
	double getUserWeight(String userId);
	boolean updateUserWeight(String userId, double weight);
	
	double getUserHeight(String userId);
	boolean updateUserHeight(String userId, double height);
	
	boolean getUserGender(String userId);
	boolean updateUserGender(String userId, boolean gender);
	
	String getUserImg(String userId);
	boolean updateUserImg(String userId, String userimg);
	
	int getUserAptitude(String userId);
	boolean updateUserAptitude(String userId, int aptitude);
	
	List<String> getUserLabel(String userId);
	boolean updateUserLabel(String userId, List<String> label);
	
	List<String> getUserExpctation(String userId);
	boolean updateUserExpctation(String userId, List<String> expctation);
	
	String getUserHobby(String userId);
	boolean updateUserHobby(String userId, String hobby);
	
	String getUserAddress(String userId);
	boolean updateUserAddress(String userId, String address);
	
	String getUserWage(String userId);
	boolean updateUserWage(String userId, String wage);
	
	String getUserIDCardNum(String userId);
	boolean updateUserIDCardNum(String userId, String idcardnum);
	
	String getUserIntroduction(String userId);
	boolean updateUserIntroduction(String userId, String introduction);

	String getUserEducation(String userId);
	boolean updateUserEducation(String userId, String education);

	String getBirthday(String userId);
	String updateBirthday(String userId, String birthday);

	boolean insertDN(String userId, String dnId);
	boolean deleteDN(String userId, String dnId);
	List<String> getDN(String userId);
	int getDNNumber(String userId);
	
	
	boolean insertFollower(String userId, String followerId);
	boolean deleteFollower(String userId, String followerId);
	List<String> getFollowers(String userId); 
	int getFollowerNumber(String userId);

	boolean insertLikeDN(String DNId, String likerId);
	boolean deleteLikeDN(String DNId, String likerId);
	List<String> getLikeDN(String DNId);  

	boolean insertCommentOnDN(String commentId, String DNId);
	boolean deleteCommentOnWeibo(String commentId, String DNId);
	List<String> getCommentOnWeibo(String DNId);  

	/*
	 * User msg comment me related
	 */
	List<String> getDNCommentMeMessage(String DNId);
	boolean insertDNCommentMe(String DNId, String commentId);
	boolean deleteDNCommentMe(String userId, String weiboId);

	List<String> getDNLikeMeMessage(String DNId);
	boolean insertDNLikeMe(String DNId, String likerId);
	boolean deleteDNLikeMe(String DNId, String likerId);
}
