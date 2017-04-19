package ylrc.model;

import javax.persistence.*;

/**
 * Created by xxxxx on 2017/4/19.
 */
@Entity
@Table(name = "tb_useraccount", schema = "ylrc", catalog = "")
public class TbUseraccountEntity {
    private int uid;
    private int uPhoneNum;
    private String uEmail;
    private String uPassWord;

    @Id
    @Column(name = "uid", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "uPhoneNum", nullable = false)
    public int getuPhoneNum() {
        return uPhoneNum;
    }

    public void setuPhoneNum(int uPhoneNum) {
        this.uPhoneNum = uPhoneNum;
    }

    @Basic
    @Column(name = "uEmail", nullable = false, length = 20)
    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    @Basic
    @Column(name = "uPassWord", nullable = false, length = 20)
    public String getuPassWord() {
        return uPassWord;
    }

    public void setuPassWord(String uPassWord) {
        this.uPassWord = uPassWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUseraccountEntity that = (TbUseraccountEntity) o;

        if (uid != that.uid) return false;
        if (uPhoneNum != that.uPhoneNum) return false;
        if (uEmail != null ? !uEmail.equals(that.uEmail) : that.uEmail != null) return false;
        if (uPassWord != null ? !uPassWord.equals(that.uPassWord) : that.uPassWord != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + uPhoneNum;
        result = 31 * result + (uEmail != null ? uEmail.hashCode() : 0);
        result = 31 * result + (uPassWord != null ? uPassWord.hashCode() : 0);
        return result;
    }
}
