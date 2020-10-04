package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class listBookFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<bookItem> listBooks = new ArrayList<>();
    callbackSendData callbackSendData;

    public listBookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_book, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        for (int i = 0; i < 10; i++) {
            listBooks.add(new bookItem(R.drawable.a, 2020, " price 12$", "The Glass Hotel", "by Emily St. John Mandel ", 3.5f));
            listBooks.add(new bookItem(R.drawable.w, 2020, " price 22$", "Where The Crawdads sin", "by Delia Owens ", 4f));
            listBooks.add(new bookItem(R.drawable.a1, 2020, " price 10$", "Spendid and the Vile", "Erik Larson ", 4f));
            listBooks.add(new bookItem(R.drawable.a3, 2020, " price 15$", "Hope Kind", "by Delia Owens ", 4f));
        }


        int numGrid = 2;
        recyclerView = view.findViewById(R.id.recycle_book);
        bookAdapter bookAdapter = new bookAdapter(listBooks, requireContext(), callbackSendData);
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), numGrid));
        recyclerView.setAdapter(bookAdapter);
    }
}