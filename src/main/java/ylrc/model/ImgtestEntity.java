package ylrc.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by 18401606107 on 2017/5/5.
 */
@Entity
@Table(name = "imgtest", schema = "new_ylrc", catalog = "")
public class ImgtestEntity {
    private String userId;
    private byte[] img;

    @Id
    @Column(name = "userId", nullable = false, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "img", nullable = true)
    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImgtestEntity that = (ImgtestEntity) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (!Arrays.equals(img, that.img)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(img);
        return result;
    }
}
