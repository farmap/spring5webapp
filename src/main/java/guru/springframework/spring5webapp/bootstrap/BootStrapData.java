package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	
	

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		Author phil = new Author("Phil", "Stein");
		Author julie = new Author("Julie", "Stein");
		Book dune = new Book("dune", "22333");
		Book sade = new Book("Justine", "666");
		phil.getBooks().add(dune);
		dune.getAuthors().add(phil);
		julie.getBooks().add(sade);
		sade.getAuthors().add(julie);
		
		authorRepository.save(phil);
		bookRepository.save(dune);
		authorRepository.save(julie);
		bookRepository.save(sade);
		System.out.println("Number of Books: " + bookRepository.count());
		
	}

}
