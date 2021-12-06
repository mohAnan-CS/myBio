package com.example.mybioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


import com.example.mybioapp.bookModel.Book;
import com.example.mybioapp.bookModel.BookFactor;
import com.example.mybioapp.bookModel.IBook;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spBookCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spBookCat = findViewById(R.id.spBookCat);
        fillSpinner();

    }

    private void fillSpinner() {

        BookFactor factor = new BookFactor();
        IBook objBook = factor.getModel();

        String[] arrCat = objBook.getCategory();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item , arrCat);
        spBookCat.setAdapter(adapter);

    }

    public void btnGetBookOnClick(View view) {

        BookFactor factor = new BookFactor();
        IBook objBook = factor.getModel();

        String bookCat = spBookCat.getSelectedItem().toString().trim();
        ArrayList<Book> arrayListBook = (ArrayList<Book>) objBook.getBook(bookCat);
        StringBuilder strBooks = new StringBuilder();
        for (Book b : arrayListBook){
            strBooks.append(b.getTitle()).append("\n");
        }

        Toast.makeText(this, strBooks.toString(), Toast.LENGTH_SHORT).show();

    }
}