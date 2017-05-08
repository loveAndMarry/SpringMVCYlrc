package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_hobbys", schema = "new_ylrc", catalog = "")
public class TbHobbysEntity {
    private int hobbyId;
    private String hobbyName;

    @Id
    @Column(name = "HobbyId", nullable = false)
    public int getHobbyId() {
        return hobbyId;
    }

    public void setHobbyId(int hobbyId) {
        this.hobbyId = hobbyId;
    }

    @Basic
    @Column(name = "HobbyName", nullable = false, length = 20)
    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbHobbysEntity that = (TbHobbysEntity) o;

        if (hobbyId != that.hobbyId) return false;
        if (hobbyName != null ? !hobbyName.equals(that.hobbyName) : that.hobbyName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hobbyId;
        result = 31 * result + (hobbyName != null ? hobbyName.hashCode() : 0);
        return result;
    }
}
