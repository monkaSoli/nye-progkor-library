package hu.nye.progkor.library.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.nye.progkor.library.data.model.Book;
import hu.nye.progkor.library.data.repository.Repository;
import hu.nye.progkor.library.service.BookService;

/**
 * Default implementation of {@link BookService}.
 */
@Service
public class DefaultBookService implements BookService {

    private final Repository<Book, Long> bookRepository;

    @Autowired
    public DefaultBookService(Repository<Book, Long> songRepository) {
        this.bookRepository = songRepository;
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> retrieveBookById(Long id) {
        return bookRepository.getById(id);
    }

    @Override
    public List<Book> retrieveAllBooks() {
        return bookRepository.getAll();
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.update(book);
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
