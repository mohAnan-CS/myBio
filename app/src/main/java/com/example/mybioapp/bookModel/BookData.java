package com.example.mybioapp.bookModel;

import java.util.ArrayList;
import java.util.List;

class BookData implements IBook{

    private List<Book> arrayListBooks = new ArrayList<>();

    public BookData(){

        arrayListBooks.add(new Book(901 , "deep learning in java" , "java"));
        arrayListBooks.add(new Book(901 , "learn basics in c#" , "c#"));
        arrayListBooks.add(new Book(901 , "professional java" , "java"));

    }

    public List<Book> getBook(String cat){

        ArrayList arrayListMatches = new ArrayList();
        for (Book b : arrayListBooks){
            if (b.getCategory().equals(cat)){
                arrayListMatches.add(b);
            }
        }

        return arrayListMatches;
    }

    public String[] getCategory(){

        String[] arrCat = new String[]{"java" , "c#" , "python" , "React"};
        return arrCat ;

    }
}
