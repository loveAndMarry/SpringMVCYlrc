package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_labels", schema = "my_ylrc", catalog = "")
public class TbLabelsEntity {
    private int labelId;
    private String labelName;

    @Id
    @Column(name = "labelId", nullable = false)
    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    @Basic
    @Column(name = "labelName", nullable = false, length = 20)
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbLabelsEntity that = (TbLabelsEntity) o;

        if (labelId != that.labelId) return false;
        if (labelName != null ? !labelName.equals(that.labelName) : that.labelName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = labelId;
        result = 31 * result + (labelName != null ? labelName.hashCode() : 0);
        return result;
    }
}
