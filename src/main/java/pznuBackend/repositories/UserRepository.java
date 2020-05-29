package pznuBackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pznuBackend.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByLogin(String login);

}
