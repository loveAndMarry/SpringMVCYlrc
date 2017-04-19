package ylrc.model;

import javax.persistence.*;

/**
 * Created by xxxxx on 2017/4/19.
 */
@Entity
@Table(name = "tb_hobby", schema = "ylrc", catalog = "")
public class TbHobbyEntity {
    private int hid;
    private String hobby;

    @Id
    @Column(name = "hid", nullable = false)
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Basic
    @Column(name = "hobby", nullable = false, length = 10)
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbHobbyEntity that = (TbHobbyEntity) o;

        if (hid != that.hid) return false;
        if (hobby != null ? !hobby.equals(that.hobby) : that.hobby != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hid;
        result = 31 * result + (hobby != null ? hobby.hashCode() : 0);
        return result;
    }
}
