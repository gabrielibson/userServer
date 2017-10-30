package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.model.User;

@Repository
public interface UsersRepository extends CrudRepository<User, String>{

}
