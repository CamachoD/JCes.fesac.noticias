package JCes.fesac.noticias.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import JCes.fesac.noticias.Model.User;

public interface IUserRepository  extends CrudRepository<User, Long>{
	@Query(value = "SELECT * FROM Usuario WHERE EMAIL = :email AND PASSWORD = MD5(:password)",nativeQuery = true)
    public User getByEmailAndPassword(String email, String password);
}
