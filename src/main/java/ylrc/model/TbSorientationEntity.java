package ylrc.model;

import javax.persistence.*;

/**
 * Created by xxxxx on 2017/4/19.
 */
@Entity
@Table(name = "tb_sorientation", schema = "ylrc", catalog = "")
public class TbSorientationEntity {
    private int oid;
    private String sOrientation;

    @Id
    @Column(name = "oid", nullable = false)
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Basic
    @Column(name = "SOrientation", nullable = false, length = 10)
    public String getsOrientation() {
        return sOrientation;
    }

    public void setsOrientation(String sOrientation) {
        this.sOrientation = sOrientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSorientationEntity that = (TbSorientationEntity) o;

        if (oid != that.oid) return false;
        if (sOrientation != null ? !sOrientation.equals(that.sOrientation) : that.sOrientation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oid;
        result = 31 * result + (sOrientation != null ? sOrientation.hashCode() : 0);
        return result;
    }
}
