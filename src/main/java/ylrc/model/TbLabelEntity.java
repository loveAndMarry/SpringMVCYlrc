package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/1.
 */
@Entity
@Table(name = "tb_label", schema = "new_ylrc", catalog = "")
public class TbLabelEntity {
    private int labelId;
    private String label;

    @Id
    @Column(name = "labelId", nullable = false)
    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    @Basic
    @Column(name = "label", nullable = true, length = 30)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbLabelEntity that = (TbLabelEntity) o;

        if (labelId != that.labelId) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = labelId;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        return result;
    }
}
