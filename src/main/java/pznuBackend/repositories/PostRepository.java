package pznuBackend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pznuBackend.model.Post;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    @Query(value = "select * from PZNU_POSTS order by id desc limit 6", nativeQuery = true)
    List<Post> findAll();

}
