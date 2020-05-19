package Main.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import Main.Models.Book.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}
