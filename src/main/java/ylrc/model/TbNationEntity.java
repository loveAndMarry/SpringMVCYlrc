package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_nation", schema = "new_ylrc", catalog = "")
public class TbNationEntity {
    private int nationId;
    private String nation;

    @Id
    @Column(name = "nationId", nullable = false)
    public int getNationId() {
        return nationId;
    }

    public void setNationId(int nationId) {
        this.nationId = nationId;
    }

    @Basic
    @Column(name = "nation", nullable = true, length = 30)
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbNationEntity that = (TbNationEntity) o;

        if (nationId != that.nationId) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nationId;
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        return result;
    }
}
