package pznuBackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pznuBackend.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    Post findByUserid(int id);

}
