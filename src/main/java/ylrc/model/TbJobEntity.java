package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "tb_job", schema = "new_ylrc", catalog = "")
public class TbJobEntity {
    private int jobId;
    private String job;

    @Id
    @Column(name = "jobId", nullable = false)
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "job", nullable = false, length = 20)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbJobEntity that = (TbJobEntity) o;

        if (jobId != that.jobId) return false;
        if (job != null ? !job.equals(that.job) : that.job != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobId;
        result = 31 * result + (job != null ? job.hashCode() : 0);
        return result;
    }
}
