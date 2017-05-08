package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_relation", schema = "new_ylrc", catalog = "")
@IdClass(TbRelationEntityPK.class)
public class TbRelationEntity {
    private int userBId;
    private int userAId;

    @Id
    @Column(name = "userBId", nullable = false)
    public int getUserBId() {
        return userBId;
    }

    public void setUserBId(int userBId) {
        this.userBId = userBId;
    }

    @Id
    @Column(name = "userAId", nullable = false)
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

        TbRelationEntity that = (TbRelationEntity) o;

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
