package Main.Models.Book;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Book {
    
	@EmbeddedId
    private BookId bookId;
     
	public BookId getBookId() {
		return bookId;
	}


	public void setBookId(BookId bookId) {
		this.bookId = bookId;
	}


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}