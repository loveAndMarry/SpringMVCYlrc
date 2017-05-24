package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_ori", schema = "new_ylrc", catalog = "")
public class TbOriEntity {
    private int oriId;
    private String ori;

    @Id
    @Column(name = "oriId", nullable = false)
    public int getOriId() {
        return oriId;
    }

    public void setOriId(int oriId) {
        this.oriId = oriId;
    }

    @Basic
    @Column(name = "ori", nullable = true, length = 30)
    public String getOri() {
        return ori;
    }

    public void setOri(String ori) {
        this.ori = ori;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbOriEntity that = (TbOriEntity) o;

        if (oriId != that.oriId) return false;
        if (ori != null ? !ori.equals(that.ori) : that.ori != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oriId;
        result = 31 * result + (ori != null ? ori.hashCode() : 0);
        return result;
    }
}
