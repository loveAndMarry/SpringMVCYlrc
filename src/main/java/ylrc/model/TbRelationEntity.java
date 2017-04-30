package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_relation", schema = "my_ylrc", catalog = "")
@IdClass(TbRelationEntityPK.class)
public class TbRelationEntity {
    private int userAId;
    private int userBId;

    @Id
    @Column(name = "userAId", nullable = false)
    public int getUserAId() {
        return userAId;
    }

    public void setUserAId(int userAId) {
        this.userAId = userAId;
    }

    @Id
    @Column(name = "userBId", nullable = false)
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

        TbRelationEntity that = (TbRelationEntity) o;

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
