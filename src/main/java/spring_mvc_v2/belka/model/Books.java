package spring_mvc_v2.belka.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Authors> BooksAuthors;

    public List<Authors> getBooksAuthors() {
        return BooksAuthors;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Books(String name) {
        this.name = name;
    }

    public Books() {
    }
}
