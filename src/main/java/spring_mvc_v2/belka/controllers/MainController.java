package spring_mvc_v2.belka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring_mvc_v2.belka.model.Authors;
import spring_mvc_v2.belka.model.Books;
import spring_mvc_v2.belka.repository.AuthorsRepository;
import spring_mvc_v2.belka.service.AuthorService;
import spring_mvc_v2.belka.service.BooksService;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {
    private final AuthorsRepository authrep;

    private final BooksService booksrv;

    @Autowired
    public MainController(BooksService booksrv, AuthorService authServ, AuthorsRepository authrep) {
        this.booksrv = booksrv;
        this.authServ = authServ;
        this.authrep = authrep;
    }

    private final AuthorService authServ;

    @GetMapping("/")
    public String books (Model model){
        Iterable<Books> books = booksrv.findAll();
        model.addAttribute("books", books);
        return ("Books");
    }

    @GetMapping("/authors")
    public String authors(Model model, @RequestParam(value = "bookId") Long bookId){
     Optional<Books> bks = booksrv.findById(bookId);
        Books bksExist = bks.isPresent() ? bks.get() : new Books();
//        Books bksExist = (Books) Optional.ofNullable(bks.get()).orElseThrow(() -> new IllegalStateException("The object is null"));
//         List<Authors> authorsList = new ArrayList<>();
//        authorsList.add((Authors) authServ.findAllById(bookId));
        List<Authors> authorList = bksExist.getBooksAuthors();
         model.addAttribute("authorsList", authorList);


        return ("Authors");
    }

    @GetMapping("/AddBookForm")
    public String AddBookForm(Model model){
        Iterable<Authors> authList = authServ.findAll();
        model.addAttribute("authList", authList);
        return ("AddBookForm");
    }

    @PostMapping("/AddBookForm")
    public String AddBook(Model model, @RequestParam(value = "bookName") String bookNam, @RequestParam(value = "authorName") List<String> authorsName){

        return("Books");
    }
}
