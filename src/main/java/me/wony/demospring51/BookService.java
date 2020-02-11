package me.wony.demospring51;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {

    @Autowired
    List<BookRepository> bookRepository;

    public void printBookRespository(){
        this.bookRepository.forEach(s->System.out.println(s.getClass()));
    }

    @PostConstruct
    public void setUp(){
        System.out.println("Test");
    }
}
