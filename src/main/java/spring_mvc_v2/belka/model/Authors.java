package spring_mvc_v2.belka.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;


    @ManyToMany(mappedBy = "BooksAuthors",  fetch = FetchType.EAGER)
    private List<Books> BA;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public List<Books> getBooksAuthor() {
        return BA;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    public Authors(String name) {
        this.name = name;
    }

    public Authors() {
    }
}
