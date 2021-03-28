package guru.springframework.spring5webapp.repositories;

<<<<<<< HEAD
import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
=======
import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
>>>>>>> refs/remotes/origin/add-publisher
