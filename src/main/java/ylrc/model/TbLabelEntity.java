package ylrc.model;

import javax.persistence.*;

/**
 * Created by xxxxx on 2017/4/19.
 */
@Entity
@Table(name = "tb_label", schema = "ylrc", catalog = "")
public class TbLabelEntity {
    private int lid;
    private String cCharacter;

    @Id
    @Column(name = "lid", nullable = false)
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    @Basic
    @Column(name = "cCharacter", nullable = false, length = 10)
    public String getcCharacter() {
        return cCharacter;
    }

    public void setcCharacter(String cCharacter) {
        this.cCharacter = cCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbLabelEntity that = (TbLabelEntity) o;

        if (lid != that.lid) return false;
        if (cCharacter != null ? !cCharacter.equals(that.cCharacter) : that.cCharacter != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lid;
        result = 31 * result + (cCharacter != null ? cCharacter.hashCode() : 0);
        return result;
    }
}
