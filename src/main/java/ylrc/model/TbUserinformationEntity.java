package ylrc.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by xxxxx on 2017/4/19.
 */
@Entity
@Table(name = "tb_userinformation", schema = "ylrc", catalog = "")
public class TbUserinformationEntity {
    private int uid;
    private String uSex;
    private int uSalary;
    private int uSexOri;
    private int uHobby;
    private int uLabels;
    private byte[] uIcon;
    private String uAddress;
    private int uHeight;
    private int uWeigh;
    private String uTrName;
    private String uIdNum;
    private String uMemoir;
    private String uName;

    @Id
    @Column(name = "uid", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "uSex", nullable = false, length = 1)
    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    @Basic
    @Column(name = "uSalary", nullable = false)
    public int getuSalary() {
        return uSalary;
    }

    public void setuSalary(int uSalary) {
        this.uSalary = uSalary;
    }

    @Basic
    @Column(name = "uSexOri", nullable = false)
    public int getuSexOri() {
        return uSexOri;
    }

    public void setuSexOri(int uSexOri) {
        this.uSexOri = uSexOri;
    }

    @Basic
    @Column(name = "uHobby", nullable = false)
    public int getuHobby() {
        return uHobby;
    }

    public void setuHobby(int uHobby) {
        this.uHobby = uHobby;
    }

    @Basic
    @Column(name = "uLabels", nullable = false)
    public int getuLabels() {
        return uLabels;
    }

    public void setuLabels(int uLabels) {
        this.uLabels = uLabels;
    }

    @Basic
    @Column(name = "uIcon", nullable = false)
    public byte[] getuIcon() {
        return uIcon;
    }

    public void setuIcon(byte[] uIcon) {
        this.uIcon = uIcon;
    }

    @Basic
    @Column(name = "uAddress", nullable = false, length = 20)
    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    @Basic
    @Column(name = "uHeight", nullable = false)
    public int getuHeight() {
        return uHeight;
    }

    public void setuHeight(int uHeight) {
        this.uHeight = uHeight;
    }

    @Basic
    @Column(name = "uWeigh", nullable = false)
    public int getuWeigh() {
        return uWeigh;
    }

    public void setuWeigh(int uWeigh) {
        this.uWeigh = uWeigh;
    }

    @Basic
    @Column(name = "uTrName", nullable = false, length = 10)
    public String getuTrName() {
        return uTrName;
    }

    public void setuTrName(String uTrName) {
        this.uTrName = uTrName;
    }

    @Basic
    @Column(name = "uIdNum", nullable = false, length = 18)
    public String getuIdNum() {
        return uIdNum;
    }

    public void setuIdNum(String uIdNum) {
        this.uIdNum = uIdNum;
    }

    @Basic
    @Column(name = "uMemoir", nullable = true, length = 150)
    public String getuMemoir() {
        return uMemoir;
    }

    public void setuMemoir(String uMemoir) {
        this.uMemoir = uMemoir;
    }

    @Basic
    @Column(name = "uName", nullable = false, length = 10)
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUserinformationEntity that = (TbUserinformationEntity) o;

        if (uid != that.uid) return false;
        if (uSalary != that.uSalary) return false;
        if (uSexOri != that.uSexOri) return false;
        if (uHobby != that.uHobby) return false;
        if (uLabels != that.uLabels) return false;
        if (uHeight != that.uHeight) return false;
        if (uWeigh != that.uWeigh) return false;
        if (uSex != null ? !uSex.equals(that.uSex) : that.uSex != null) return false;
        if (!Arrays.equals(uIcon, that.uIcon)) return false;
        if (uAddress != null ? !uAddress.equals(that.uAddress) : that.uAddress != null) return false;
        if (uTrName != null ? !uTrName.equals(that.uTrName) : that.uTrName != null) return false;
        if (uIdNum != null ? !uIdNum.equals(that.uIdNum) : that.uIdNum != null) return false;
        if (uMemoir != null ? !uMemoir.equals(that.uMemoir) : that.uMemoir != null) return false;
        if (uName != null ? !uName.equals(that.uName) : that.uName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (uSex != null ? uSex.hashCode() : 0);
        result = 31 * result + uSalary;
        result = 31 * result + uSexOri;
        result = 31 * result + uHobby;
        result = 31 * result + uLabels;
        result = 31 * result + Arrays.hashCode(uIcon);
        result = 31 * result + (uAddress != null ? uAddress.hashCode() : 0);
        result = 31 * result + uHeight;
        result = 31 * result + uWeigh;
        result = 31 * result + (uTrName != null ? uTrName.hashCode() : 0);
        result = 31 * result + (uIdNum != null ? uIdNum.hashCode() : 0);
        result = 31 * result + (uMemoir != null ? uMemoir.hashCode() : 0);
        result = 31 * result + (uName != null ? uName.hashCode() : 0);
        return result;
    }
}
