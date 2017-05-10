package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_hobby", schema = "new_ylrc", catalog = "")
public class TbHobbyEntity {
    private int hobbyId;
    private String hobby;

    @Id
    @Column(name = "hobbyId", nullable = false)
    public int getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(int hobbyId) {
        this.hobbyId = hobbyId;
    }

    @Basic
    @Column(name = "hobby", nullable = false, length = 30)
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

        if (hobbyId != that.hobbyId) return false;
        if (hobby != null ? !hobby.equals(that.hobby) : that.hobby != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hobbyId;
        result = 31 * result + (hobby != null ? hobby.hashCode() : 0);
        return result;
    }
}
