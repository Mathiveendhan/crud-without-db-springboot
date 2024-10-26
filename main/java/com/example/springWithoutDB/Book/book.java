package com.example.springWithoutDB.Book;

import java.util.Random;

public class book {


    Random random=new Random();
    public long id;
    public String name;
    public String author;
    public int quantity;
    public int releaseDate;

    public book() {
    }


    public book(String name, String author, int quantity, int releaseDate) {
        this.id= random.nextLong(126516591,Integer.MAX_VALUE);
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.releaseDate = releaseDate;
    }
}
