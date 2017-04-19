package ylrc.model;

import javax.persistence.*;

/**
 * Created by xxxxx on 2017/4/19.
 */
@Entity
@Table(name = "tb_salary", schema = "ylrc", catalog = "")
public class TbSalaryEntity {
    private int sid;
    private int slevel;

    @Id
    @Column(name = "sid", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "slevel", nullable = false)
    public int getSlevel() {
        return slevel;
    }

    public void setSlevel(int slevel) {
        this.slevel = slevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSalaryEntity that = (TbSalaryEntity) o;

        if (sid != that.sid) return false;
        if (slevel != that.slevel) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + slevel;
        return result;
    }
}
