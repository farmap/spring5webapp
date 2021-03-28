package guru.springframework.spring5webapp.repositories;

<<<<<<< HEAD
import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
=======
import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

>>>>>>> 4af54cc41c4485a54d2feed4c323ecf05668592e
}
