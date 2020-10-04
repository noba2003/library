package com.example.myapplication;

import java.io.Serializable;

public class bookItem implements Serializable {
    String price;
    private int coverBook, year;
    private String bookTiltle, author;
    private float RatingBar;

    public bookItem(int coverBook, int year, String price, String bookTiltle, String author, float ratingBar) {
        this.coverBook = coverBook;
        this.year = year;
        this.price = price;
        this.bookTiltle = bookTiltle;
        this.author = author;
        RatingBar = ratingBar;

    }

    public int getCoverBook() {
        return coverBook;
    }

    public void setCoverBook(int coverBook) {
        this.coverBook = coverBook;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBookTiltle() {
        return bookTiltle;
    }

    public void setBookTiltle(String bookTiltle) {
        this.bookTiltle = bookTiltle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getRatingBar() {
        return RatingBar;
    }

    public void setRatingBar(float ratingBar) {
        RatingBar = ratingBar;
    }

}
