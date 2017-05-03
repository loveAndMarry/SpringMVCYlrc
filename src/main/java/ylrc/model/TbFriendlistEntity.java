package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/1.
 */
@Entity
@Table(name = "tb_friendlist", schema = "new_ylrc", catalog = "")
public class TbFriendlistEntity {
    private int flId;
    private int userIdA;
    private int userIdB;

    @Id
    @Column(name = "flId", nullable = false)
    public int getFlId() {
        return flId;
    }

    public void setFlId(int flId) {
        this.flId = flId;
    }

    @Basic
    @Column(name = "userIdA", nullable = false)
    public int getUserIdA() {
        return userIdA;
    }

    public void setUserIdA(int userIdA) {
        this.userIdA = userIdA;
    }

    @Basic
    @Column(name = "userIdB", nullable = false)
    public int getUserIdB() {
        return userIdB;
    }

    public void setUserIdB(int userIdB) {
        this.userIdB = userIdB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbFriendlistEntity that = (TbFriendlistEntity) o;

        if (flId != that.flId) return false;
        if (userIdA != that.userIdA) return false;
        if (userIdB != that.userIdB) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = flId;
        result = 31 * result + userIdA;
        result = 31 * result + userIdB;
        return result;
    }
}
