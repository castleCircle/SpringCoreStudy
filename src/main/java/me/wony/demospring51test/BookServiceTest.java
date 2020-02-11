package me.wony.demospring51test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceTest {

    @Autowired
    List<BookRepositoryTest> bookRepositoryTest;

    public void printBookRepository(){
        bookRepositoryTest.forEach(s-> System.out.println(s.getClass()));
    }

    /*@Autowired
    public void setBookSetBookRepositoy(BookRepositoryTest book1RepositoryTest){
        this.bookRepositoryTest = book1RepositoryTest;
    }*/

    /*@Autowired
    public BookServiceTest(BookRepositoryTest bookRepositoryTest){
        this.bookRepositoryTest = bookRepositoryTest;
    }*/

}
