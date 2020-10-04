package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class bookAdapter extends RecyclerView.Adapter<bookAdapter.holde> {
    ArrayList<bookItem> books;
    Context context;
    callbackSendData callbackSendData;

    public bookAdapter(ArrayList<bookItem> books, Context context, com.example.myapplication.callbackSendData callbackSendData) {
        this.books = books;
        this.context = context;
        this.callbackSendData = callbackSendData;
    }

    @NonNull
    @Override
    public holde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new holde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holde holder, int position) {
        bookItem bookItems = books.get(position);
        holder.bookAuthor.setText(bookItems.getAuthor());
        holder.bookTitle.setText(bookItems.getBookTiltle());
        holder.bookYear.setText(bookItems.getYear() + "");
        holder.ratingBar.setRating(bookItems.getRatingBar());
        holder.imgBook.setImageResource(bookItems.getCoverBook());
        holder.priceBook.setText(bookItems.getPrice());


    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class holde extends RecyclerView.ViewHolder {
        ImageView imgBook;
        TextView bookTitle, bookAuthor, bookYear, priceBook;
        RatingBar ratingBar;


        public holde(@NonNull View itemView) {
            super(itemView);
            imgBook = itemView.findViewById(R.id.img_book);
            bookTitle = itemView.findViewById(R.id.book_title);
            bookAuthor = itemView.findViewById(R.id.author_book);
            bookYear = itemView.findViewById(R.id.book_year);
            ratingBar = itemView.findViewById(R.id.rating);
            priceBook = itemView.findViewById(R.id.book_price);

        }
    }
}
