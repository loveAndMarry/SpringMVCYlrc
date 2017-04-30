package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_salary", schema = "my_ylrc", catalog = "")
public class TbSalaryEntity {
    private int salaryId;
    private String salaryNumRange;

    @Id
    @Column(name = "SalaryId", nullable = false)
    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    @Basic
    @Column(name = "SalaryNumRange", nullable = false, length = 20)
    public String getSalaryNumRange() {
        return salaryNumRange;
    }

    public void setSalaryNumRange(String salaryNumRange) {
        this.salaryNumRange = salaryNumRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSalaryEntity that = (TbSalaryEntity) o;

        if (salaryId != that.salaryId) return false;
        if (salaryNumRange != null ? !salaryNumRange.equals(that.salaryNumRange) : that.salaryNumRange != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = salaryId;
        result = 31 * result + (salaryNumRange != null ? salaryNumRange.hashCode() : 0);
        return result;
    }
}
