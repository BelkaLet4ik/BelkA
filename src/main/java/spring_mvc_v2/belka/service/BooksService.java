package spring_mvc_v2.belka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_mvc_v2.belka.model.Books;
import spring_mvc_v2.belka.repository.BooksRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    private final BooksRepository bookrepos;

    @Autowired
    public BooksService(BooksRepository bookrepos) {

        this.bookrepos = bookrepos;
    }

    public List<Books> findAll(){
        return bookrepos.findAll();
    }
    public Optional<Books> findById (Long id){
        return bookrepos.findById(id);
    }
}
