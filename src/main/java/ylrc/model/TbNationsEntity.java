package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_nations", schema = "my_ylrc", catalog = "")
public class TbNationsEntity {
    private int nationId;
    private String nationName;

    @Id
    @Column(name = "nationId", nullable = false)
    public int getNationId() {
        return nationId;
    }

    public void setNationId(int nationId) {
        this.nationId = nationId;
    }

    @Basic
    @Column(name = "nationName", nullable = false, length = 20)
    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbNationsEntity that = (TbNationsEntity) o;

        if (nationId != that.nationId) return false;
        if (nationName != null ? !nationName.equals(that.nationName) : that.nationName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nationId;
        result = 31 * result + (nationName != null ? nationName.hashCode() : 0);
        return result;
    }
}
