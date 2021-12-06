package com.example.mybioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.example.mybioapp.bookModel.Book;
import com.example.mybioapp.bookModel.BookFactor;
import com.example.mybioapp.bookModel.IBook;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnGetBookOnClick(View view) {

        BookFactor factor = new BookFactor();
        IBook objBook = factor.getModel();

        ArrayList<Book> arrayListBook = (ArrayList<Book>) objBook.getBook("java");
        String strBooks = "";
        for (Book b : arrayListBook){
            strBooks+=b.getTitle() + "\n";
        }

        Toast.makeText(this,strBooks , Toast.LENGTH_SHORT).show();

    }
}