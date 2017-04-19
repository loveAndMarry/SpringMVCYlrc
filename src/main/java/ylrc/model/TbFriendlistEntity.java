package ylrc.model;

import javax.persistence.*;

/**
 * Created by xxxxx on 2017/4/19.
 */
@Entity
@Table(name = "tb_friendlist", schema = "ylrc", catalog = "")
public class TbFriendlistEntity {
    private int fid;
    private Integer uid1;
    private Integer uid2;

    @Id
    @Column(name = "fid", nullable = false)
    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "uid1", nullable = true)
    public Integer getUid1() {
        return uid1;
    }

    public void setUid1(Integer uid1) {
        this.uid1 = uid1;
    }

    @Basic
    @Column(name = "uid2", nullable = true)
    public Integer getUid2() {
        return uid2;
    }

    public void setUid2(Integer uid2) {
        this.uid2 = uid2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbFriendlistEntity that = (TbFriendlistEntity) o;

        if (fid != that.fid) return false;
        if (uid1 != null ? !uid1.equals(that.uid1) : that.uid1 != null) return false;
        if (uid2 != null ? !uid2.equals(that.uid2) : that.uid2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid;
        result = 31 * result + (uid1 != null ? uid1.hashCode() : 0);
        result = 31 * result + (uid2 != null ? uid2.hashCode() : 0);
        return result;
    }
}
