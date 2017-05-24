package ylrc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by 18401606107 on 2017/5/5.
 */
public class TbRelationEntityPK implements Serializable {
    private int userBId;
    private int userAId;

    @Column(name = "userBId", nullable = false)
    @Id
    public int getUserBId() {
        return userBId;
    }

    public void setUserBId(int userBId) {
        this.userBId = userBId;
    }

    @Column(name = "userAId", nullable = false)
    @Id
    public int getUserAId() {
        return userAId;
    }

    public void setUserAId(int userAId) {
        this.userAId = userAId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbRelationEntityPK that = (TbRelationEntityPK) o;

        if (userBId != that.userBId) return false;
        if (userAId != that.userAId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userBId;
        result = 31 * result + userAId;
        return result;
    }
}
