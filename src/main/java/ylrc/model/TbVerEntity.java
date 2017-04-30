package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_ver", schema = "my_ylrc", catalog = "")
public class TbVerEntity {
    private int userEmail;
    private String verCode;

    @Id
    @Column(name = "userEmail", nullable = false)
    public int getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(int userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "verCode", nullable = false, length = 20)
    public String getVerCode() {
        return verCode;
    }

    public void setVerCode(String verCode) {
        this.verCode = verCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbVerEntity that = (TbVerEntity) o;

        if (userEmail != that.userEmail) return false;
        if (verCode != null ? !verCode.equals(that.verCode) : that.verCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userEmail;
        result = 31 * result + (verCode != null ? verCode.hashCode() : 0);
        return result;
    }
}
