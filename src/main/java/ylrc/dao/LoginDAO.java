package ylrc.dao;
public interface LoginDAO {
	/*
	 * register
	 */
	boolean insert(String userEmail,String password);
	boolean updatePassword(String userEmali, String oldPassword, String newPassword);
	String getUserId(String userEmail, String password);

	/*
	*login
	*/
	boolean loginEmail(String userEmail,String password);
	boolean loginPhone(String phone,String password);
}
