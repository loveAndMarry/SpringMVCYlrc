package ylrc.model;

import javax.persistence.*;

/**
 * Created by 18401606107 on 2017/4/29.
 */
@Entity
@Table(name = "tb_userinfo", schema = "my_ylrc", catalog = "")
public class TbUserinfoEntity {
    private int userId;
    private String userNickName;
    private String userTrusName;
    private String userSex;
    private Integer userSexOri;
    private Integer userHeight;
    private Integer userWeight;
    private String userBloodType;
    private String userJob;
    private String userLabel;
    private String userHopeLabel;
    private String userAddress;
    private String userHobby;
    private String userIntroduction;
    private Integer userSalary;
    private Integer userNation;
    private String userIdCardNum;

    @Id
    @Column(name = "userId", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "userNickName", nullable = true, length = 300)
    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    @Basic
    @Column(name = "userTrusName", nullable = true, length = 300)
    public String getUserTrusName() {
        return userTrusName;
    }

    public void setUserTrusName(String userTrusName) {
        this.userTrusName = userTrusName;
    }

    @Basic
    @Column(name = "userSex", nullable = true, length = 30)
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "userSexOri", nullable = true)
    public Integer getUserSexOri() {
        return userSexOri;
    }

    public void setUserSexOri(Integer userSexOri) {
        this.userSexOri = userSexOri;
    }

    @Basic
    @Column(name = "userHeight", nullable = true)
    public Integer getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(Integer userHeight) {
        this.userHeight = userHeight;
    }

    @Basic
    @Column(name = "userWeight", nullable = true)
    public Integer getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(Integer userWeight) {
        this.userWeight = userWeight;
    }

    @Basic
    @Column(name = "userBloodType", nullable = true, length = 4)
    public String getUserBloodType() {
        return userBloodType;
    }

    public void setUserBloodType(String userBloodType) {
        this.userBloodType = userBloodType;
    }

    @Basic
    @Column(name = "userJob", nullable = true, length = 20)
    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    @Basic
    @Column(name = "userLabel", nullable = true, length = 20)
    public String getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(String userLabel) {
        this.userLabel = userLabel;
    }

    @Basic
    @Column(name = "userHopeLabel", nullable = true, length = 20)
    public String getUserHopeLabel() {
        return userHopeLabel;
    }

    public void setUserHopeLabel(String userHopeLabel) {
        this.userHopeLabel = userHopeLabel;
    }

    @Basic
    @Column(name = "userAddress", nullable = true, length = 50)
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Basic
    @Column(name = "userHobby", nullable = true, length = 50)
    public String getUserHobby() {
        return userHobby;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
    }

    @Basic
    @Column(name = "userIntroduction", nullable = true, length = 2000)
    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
    }

    @Basic
    @Column(name = "userSalary", nullable = true)
    public Integer getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(Integer userSalary) {
        this.userSalary = userSalary;
    }

    @Basic
    @Column(name = "userNation", nullable = true)
    public Integer getUserNation() {
        return userNation;
    }

    public void setUserNation(Integer userNation) {
        this.userNation = userNation;
    }

    @Basic
    @Column(name = "userIDCardNum", nullable = true, length = 100)
    public String getUserIdCardNum() {
        return userIdCardNum;
    }

    public void setUserIdCardNum(String userIdCardNum) {
        this.userIdCardNum = userIdCardNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUserinfoEntity that = (TbUserinfoEntity) o;

        if (userId != that.userId) return false;
        if (userNickName != null ? !userNickName.equals(that.userNickName) : that.userNickName != null) return false;
        if (userTrusName != null ? !userTrusName.equals(that.userTrusName) : that.userTrusName != null) return false;
        if (userSex != null ? !userSex.equals(that.userSex) : that.userSex != null) return false;
        if (userSexOri != null ? !userSexOri.equals(that.userSexOri) : that.userSexOri != null) return false;
        if (userHeight != null ? !userHeight.equals(that.userHeight) : that.userHeight != null) return false;
        if (userWeight != null ? !userWeight.equals(that.userWeight) : that.userWeight != null) return false;
        if (userBloodType != null ? !userBloodType.equals(that.userBloodType) : that.userBloodType != null)
            return false;
        if (userJob != null ? !userJob.equals(that.userJob) : that.userJob != null) return false;
        if (userLabel != null ? !userLabel.equals(that.userLabel) : that.userLabel != null) return false;
        if (userHopeLabel != null ? !userHopeLabel.equals(that.userHopeLabel) : that.userHopeLabel != null)
            return false;
        if (userAddress != null ? !userAddress.equals(that.userAddress) : that.userAddress != null) return false;
        if (userHobby != null ? !userHobby.equals(that.userHobby) : that.userHobby != null) return false;
        if (userIntroduction != null ? !userIntroduction.equals(that.userIntroduction) : that.userIntroduction != null)
            return false;
        if (userSalary != null ? !userSalary.equals(that.userSalary) : that.userSalary != null) return false;
        if (userNation != null ? !userNation.equals(that.userNation) : that.userNation != null) return false;
        if (userIdCardNum != null ? !userIdCardNum.equals(that.userIdCardNum) : that.userIdCardNum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userNickName != null ? userNickName.hashCode() : 0);
        result = 31 * result + (userTrusName != null ? userTrusName.hashCode() : 0);
        result = 31 * result + (userSex != null ? userSex.hashCode() : 0);
        result = 31 * result + (userSexOri != null ? userSexOri.hashCode() : 0);
        result = 31 * result + (userHeight != null ? userHeight.hashCode() : 0);
        result = 31 * result + (userWeight != null ? userWeight.hashCode() : 0);
        result = 31 * result + (userBloodType != null ? userBloodType.hashCode() : 0);
        result = 31 * result + (userJob != null ? userJob.hashCode() : 0);
        result = 31 * result + (userLabel != null ? userLabel.hashCode() : 0);
        result = 31 * result + (userHopeLabel != null ? userHopeLabel.hashCode() : 0);
        result = 31 * result + (userAddress != null ? userAddress.hashCode() : 0);
        result = 31 * result + (userHobby != null ? userHobby.hashCode() : 0);
        result = 31 * result + (userIntroduction != null ? userIntroduction.hashCode() : 0);
        result = 31 * result + (userSalary != null ? userSalary.hashCode() : 0);
        result = 31 * result + (userNation != null ? userNation.hashCode() : 0);
        result = 31 * result + (userIdCardNum != null ? userIdCardNum.hashCode() : 0);
        return result;
    }
}
