package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/1.
 */
@Entity
@Table(name = "tb_bloodtype", schema = "new_ylrc", catalog = "")
public class TbBloodtypeEntity {
    private int bloodtypeId;
    private String bloodtype;

    @Id
    @Column(name = "bloodtypeId", nullable = false)
    public int getBloodtypeId() {
        return bloodtypeId;
    }

    public void setBloodtypeId(int bloodtypeId) {
        this.bloodtypeId = bloodtypeId;
    }

    @Basic
    @Column(name = "bloodtype", nullable = false, length = 30)
    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbBloodtypeEntity that = (TbBloodtypeEntity) o;

        if (bloodtypeId != that.bloodtypeId) return false;
        if (bloodtype != null ? !bloodtype.equals(that.bloodtype) : that.bloodtype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bloodtypeId;
        result = 31 * result + (bloodtype != null ? bloodtype.hashCode() : 0);
        return result;
    }
}
