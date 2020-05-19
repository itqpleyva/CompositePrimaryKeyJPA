package Main.Loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import Main.Models.Account.Account;
import Main.Models.Book.Book;
import Main.Models.Book.BookId;
import Main.Repositories.AccountRepository;
import Main.Repositories.BookRepository;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	AccountRepository accountRepo;
	
	@Autowired
	BookRepository bookRepo;
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		Account account1 = new Account();
		account1.setName("Pepe Pepe Pepe");
		System.out.println("salvando a pepe");
		accountRepo.save(account1);
		
		
		
		BookId bookid = new BookId();
		bookid.setLanguage("Español");
		bookid.setTitle("La isla misteriosa");
		
		Book book1 = new Book();
		book1.setBookId(bookid);
		
		System.out.println("guardando libro la isla misteriosa");
		bookRepo.save(book1);
		
	}

}
