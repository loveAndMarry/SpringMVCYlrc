package ylrc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ylrc.model.TbUserinformationEntity;

/**
 * Created by 18401606107 on 2017/5/1.
 */
public interface userInfoRepository extends JpaRepository<TbUserinformationEntity, Integer>  {

}
