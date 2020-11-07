package spring_mvc_v2.belka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import spring_mvc_v2.belka.model.Authors;

import java.util.List;

//@Repository
public interface AuthorsRepository extends JpaRepository<Authors, Long> {
//List<Authors> findAuthorsByBook(String book);
}
