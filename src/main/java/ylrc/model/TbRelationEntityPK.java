package ylrc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by 18401606107 on 2017/4/29.
 */
public class TbRelationEntityPK implements Serializable {
    private int userAId;
    private int userBId;

    @Column(name = "userAId", nullable = false)
    @Id
    public int getUserAId() {
        return userAId;
    }

    public void setUserAId(int userAId) {
        this.userAId = userAId;
    }

    @Column(name = "userBId", nullable = false)
    @Id
    public int getUserBId() {
        return userBId;
    }

    public void setUserBId(int userBId) {
        this.userBId = userBId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbRelationEntityPK that = (TbRelationEntityPK) o;

        if (userAId != that.userAId) return false;
        if (userBId != that.userBId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userAId;
        result = 31 * result + userBId;
        return result;
    }
}
