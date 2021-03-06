package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_constellation", schema = "new_ylrc", catalog = "")
public class TbConstellationEntity {
    private int constellationId;
    private String constellationName;

    @Id
    @Column(name = "constellationId", nullable = false)
    public int getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(int constellationId) {
        this.constellationId = constellationId;
    }

    @Basic
    @Column(name = "constellationName", nullable = true, length = 30)
    public String getConstellationName() {
        return constellationName;
    }

    public void setConstellationName(String constellationName) {
        this.constellationName = constellationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbConstellationEntity that = (TbConstellationEntity) o;

        if (constellationId != that.constellationId) return false;
        if (constellationName != null ? !constellationName.equals(that.constellationName) : that.constellationName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = constellationId;
        result = 31 * result + (constellationName != null ? constellationName.hashCode() : 0);
        return result;
    }
}
