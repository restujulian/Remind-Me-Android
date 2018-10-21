package com.gmail.restujulian07.restuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AcaraActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AcaraAdapter adapter;
    private ArrayList<Acara> AcaraArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acara);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new AcaraAdapter(AcaraArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AcaraActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        AcaraArrayList = new ArrayList<>();
        AcaraArrayList.add(new Acara("Study Club Web Programming", "Sabtu, 15 Desember 2018", "Study Club dilaksanakan pada pukul 08:00am"));
        AcaraArrayList.add(new Acara("Seminar Internet Marketing", "Senin, 10 Desember 2018", "Seminar dilaksanakan di kampus STMIK Akakom"));
        AcaraArrayList.add(new Acara("Belajar Pemrograman Java Mobile", "Minggu, 9 Desember 2018", "Belajar Pemrograman Java Mobile"));
        AcaraArrayList.add(new Acara("Rapat Anggota HMJSI", "Jum'at, 23 November 2018", "Rapat pembahasan proker"));
    }

}
