package ylrc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ylrc.model.TbUserinformationEntity;

import java.util.Date;
import java.util.List;

/**
 * Created by 18401606107 on 2017/5/1.
 */
public interface userInfoRepository extends JpaRepository<TbUserinformationEntity, Integer>  {

    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update TbUserinformationEntity us set us.userTrusName=:trueName, us.userNickName=:nickName, us.userAddress=:address, us.userBirthday=:date,us.userBloodType=:blood,us.userHeight=:height,us.userWeight=:weight,us.userSexOri=:sexOri,us.userSex=:sex,us.userJob=:job,us.userLabel=:label,us.userHopeLabel=:hopeLabel,us.userSalary=:userSalary,us.userHobby=:hobby,us.userIDnum=:idNum,us.userIntroduction=:userIntroduction where us.userId=:id")
    public void updateUserInfo(@Param("id") Integer userId, @Param("nickName")String userNickName, @Param("trueName")String userTrusName, @Param("sex")String userSex,
                               @Param("sexOri")Integer userSexOri, @Param("height")Integer userHeight, @Param("weight")Integer userWeight,
                               @Param("blood")String userBloodType, @Param("job")String userJob, @Param("label")String userLabel, @Param("hopeLabel")String userHopeLabel,
                               @Param("userSalary")Integer userSalary, @Param("hobby")String userHobby, @Param("address")String userAddress, @Param("idNum")String userIDnum,
                               @Param("userIntroduction")String userIntroduction, @Param("date")Date userBirthday);


    @Query("select u from TbUserinformationEntity u where u.userSex = :qUserSex and u.userSexOri = :qUserSexOri")
    public List<TbUserinformationEntity> findByUserSexAndUserSexOri(@Param("qUserSex") String userSex, @Param("qUserSexOri") Integer userSexOri);


    @Query("select u from TbUserinformationEntity u where u.userSex = :qUserSex and u.userJob = :qUserJob and u.userAddress = :qUserAddress and u.userSalary = :qUserSalary")
    public List<TbUserinformationEntity> findByUserSexAndUserJobAndUserAddressAndUserSalary(@Param("qUserSex")String userSex, @Param("qUserJob")String userJob,@Param("qUserAddress")String userAddress,@Param("qUserSalary")Integer userSalary);

    @Query("select u from TbUserinformationEntity u where u.userSex = :qUserSex and u.userJob = :qUserJob and u.userAddress = :qUserAddress")
    public List<TbUserinformationEntity> findByUserSexAndUserJobAndUserAddress(@Param("qUserSex")String userSex, @Param("qUserJob")String userJob,@Param("qUserAddress")String userAddress);
    @Query("select u from TbUserinformationEntity u where u.userId = :qUserId")
    public List<TbUserinformationEntity> findByUserId(@Param("qUserId")Integer userId);
}
