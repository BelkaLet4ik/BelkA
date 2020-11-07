package spring_mvc_v2.belka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_mvc_v2.belka.model.Books;

import java.util.List;

//@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
//    List<Books> findBooksByAuthors(String authors);
}
