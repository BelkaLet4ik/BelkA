package spring_mvc_v2.belka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring_mvc_v2.belka.model.Authors;
import spring_mvc_v2.belka.repository.AuthorsRepository;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class AuthorService {
    private final AuthorsRepository authrep;

    @Autowired
    EntityManager em;

    @Autowired
    public AuthorService(AuthorsRepository authrep) {
        this.authrep = authrep;
    }

    public List<Authors> findAllById(List<Long> id){

        return authrep.findAllById(id);
    }

    public List<Authors> findAll(){
        return authrep.findAll();

    }
}
