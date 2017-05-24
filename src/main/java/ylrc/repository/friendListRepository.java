package ylrc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ylrc.model.TbFriendlistEntity;
import java.util.Date;
import java.util.List;
/**
 * Created by 10107 on 2017/5/11.
 */
public interface friendListRepository extends JpaRepository<TbFriendlistEntity,Integer> {
    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    @Query("update TbFriendlistEntity us set us.userIdA=:userIdA, us.userIdB=:userIdB")
    public void updateUserInfo(@Param("fid") Integer fid, @Param("userIdA")Integer userIdA, @Param("userIdB")Integer userIdB);
    @Query("select u from TbFriendlistEntity u where u.userIdA = :qUId")
    public List<TbFriendlistEntity> findByUserIdA(@Param("qUId") int userIdA);
}
