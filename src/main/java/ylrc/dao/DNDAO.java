package ylrc.dao;
import java.util.List;

import ylrc.model.DynamicNews;

public interface DNDAO {
	
	 int getTotalDNNumber();
	 List<String> getTotalDNId();
	
	 String insertNewDN(DynamicNews DN);
	 boolean deleteDN(String DNId);
	 DynamicNews getDN(String DNId);
	 String getOwner(String DNId);

	 boolean insertLikerIDList(String DNId,String likerId);
	 boolean deleteLikerList(String weiboId,String likerId);
	 List<String> getLikerList(String DNId);
	 int getLikeNumber(String DNId);
	
	 boolean insertCommentList(String DNId,String commentId);
	 boolean deleteCommentList(String DNId,String commentId);
	 List<String> getCommentList(String DNId);
	 int getCommentNumber(String DNId);
	
	 }
