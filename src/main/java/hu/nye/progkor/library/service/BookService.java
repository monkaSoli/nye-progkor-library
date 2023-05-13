package hu.nye.progkor.library.service;

import java.util.List;
import java.util.Optional;

import hu.nye.progkor.library.data.model.Book;

/**
 * A service for managing songs in the music catalog.
 */
public interface BookService {

    /**
     * Creates a new song.
     *
     * @param book the song to create
     * @return the created song
     */
    Book createBook(Book book);

    /**
     * Retrieves a book by its id.
     *
     * @param id the id of the song to retrieve
     * @return the retrieved song or empty optional if it was not found
     */
    Optional<Book> retrieveBookById(Long id);

    /**
     * Retrieves all the songs in the catalog.
     *
     * @return the list of found songs
     */
    List<Book> retrieveAllBooks();

    /**
     * Updates an existing song.
     *
     * @param book the song to update
     * @return the updated song
     */
    Book updateBook(Book book);

    /**
     * Deletes a song by its id.
     *
     * @param id the id of the song to delete
     */
    void deleteBookById(Long id);
}
