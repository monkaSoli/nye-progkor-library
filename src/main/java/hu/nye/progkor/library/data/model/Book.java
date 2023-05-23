package hu.nye.progkor.library.data.model;

import java.util.Objects;

/**
 * Model class for books.
 */
public class Book {

    private Long id;
    private String title;
    private String author;
    private String series;
    private Genre genre;

    public Book() {
    }

    public Book(Long id, String title, String author, String series, Genre genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.series = series;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String artist) {
        this.author = artist;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        if (!Objects.equals(id, book.id)) {
            return false;
        }
        if (!Objects.equals(title, book.title)) {
            return false;
        }
        if (!Objects.equals(author, book.author)) {
            return false;
        }
        if (!Objects.equals(series, book.series)) {
            return false;
        }
        return genre == book.genre;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{"
                + "id=" + id
                + ", title='" + title + '\''
                + ", author='" + author + '\''
                + ", series='" + series + '\''
                + ", genre=" + genre
                + '}';
    }
}
