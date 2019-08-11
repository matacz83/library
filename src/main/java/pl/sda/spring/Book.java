package pl.sda.spring;

public class Book {
    int id;
    String author;
    String title;
    int dateOfReturn;

    public Book(int id, String author, String title, int dateOfReturn) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.dateOfReturn = dateOfReturn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(int dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }
}
