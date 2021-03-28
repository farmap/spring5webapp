package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		Author phil = new Author("Phil", "Stein");
		Author julie = new Author("Julie", "Stein");
		Book dune = new Book("dune", "22333");
		Book sade = new Book("Justine", "666");
		Publisher roundHouse = new Publisher("Round House", "5 Rolo Road", "New York", "USA");
		publisherRepository.save(roundHouse);
		Publisher gallimard = new Publisher("Gallimard", "4 Rue de Turenne", "Paris", "France");
		publisherRepository.save(gallimard);
		phil.getBooks().add(dune);
		dune.getAuthors().add(phil);
		julie.getBooks().add(sade);
		sade.getAuthors().add(julie);
		
		authorRepository.save(phil);
		bookRepository.save(dune);
		authorRepository.save(julie);
		bookRepository.save(sade);
		for (Publisher publisher: publisherRepository.findAll()) {
			System.out.println(publisher);
		}
		System.out.println("Number of Books: " + bookRepository.count());
		
	}

}
