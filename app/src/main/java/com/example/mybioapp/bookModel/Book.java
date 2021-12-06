package com.example.mybioapp.bookModel;

public class Book {

    private int numPages ;
    private String title ;
    private String category ;

    public Book(int numPages, String title, String category) {
        this.numPages = numPages;
        this.title = title;
        this.category = category;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
