package com.example.mybioapp.bookModel;

public class BookFactor {

    public IBook getModel(){

        return new BookData();
    }
}
