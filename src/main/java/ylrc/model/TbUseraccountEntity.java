package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/1.
 */
@Entity
@Table(name = "tb_useraccount", schema = "new_ylrc", catalog = "")
public class TbUseraccountEntity {
    private int userId;
    private String userPhone;
    private String userEmail;
    private String userPsd;
    private int userAuthenticationState;
    private int userState;

    @Id
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userPhone", nullable = true, length = 30)
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "userEmail", nullable = false, length = 30)
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "userPsd", nullable = false, length = 30)
    public String getUserPsd() {
        return userPsd;
    }

    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }

    @Basic
    @Column(name = "userAuthenticationState", nullable = false)
    public int getUserAuthenticationState() {
        return userAuthenticationState;
    }

    public void setUserAuthenticationState(int userAuthenticationState) {
        this.userAuthenticationState = userAuthenticationState;
    }

    @Basic
    @Column(name = "userState", nullable = false)
    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUseraccountEntity that = (TbUseraccountEntity) o;

        if (userId != that.userId) return false;
        if (userAuthenticationState != that.userAuthenticationState) return false;
        if (userState != that.userState) return false;
        if (userPhone != null ? !userPhone.equals(that.userPhone) : that.userPhone != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userPsd != null ? !userPsd.equals(that.userPsd) : that.userPsd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userPhone != null ? userPhone.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userPsd != null ? userPsd.hashCode() : 0);
        result = 31 * result + userAuthenticationState;
        result = 31 * result + userState;
        return result;
    }
}
