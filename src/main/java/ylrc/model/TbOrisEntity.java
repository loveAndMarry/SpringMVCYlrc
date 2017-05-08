package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_oris", schema = "new_ylrc", catalog = "")
public class TbOrisEntity {
    private int oriId;
    private String orilName;

    @Id
    @Column(name = "OriId", nullable = false)
    public int getOriId() {
        return oriId;
    }

    public void setOriId(int oriId) {
        this.oriId = oriId;
    }

    @Basic
    @Column(name = "OrilName", nullable = false, length = 20)
    public String getOrilName() {
        return orilName;
    }

    public void setOrilName(String orilName) {
        this.orilName = orilName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbOrisEntity that = (TbOrisEntity) o;

        if (oriId != that.oriId) return false;
        if (orilName != null ? !orilName.equals(that.orilName) : that.orilName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oriId;
        result = 31 * result + (orilName != null ? orilName.hashCode() : 0);
        return result;
    }
}
