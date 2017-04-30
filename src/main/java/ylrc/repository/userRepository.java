package ylrc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ylrc.model.*;

/**
 * Created by xxxxx on 2017/4/19.
 */
public interface userRepository extends JpaRepository<TbUseraccountEntity, Integer> {

}
