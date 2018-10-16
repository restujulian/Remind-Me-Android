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
        AcaraArrayList.add(new Acara("UAS", "Senin, 1 Januari 2018", "UAS adalah Ujian Akhit Semester"));
        AcaraArrayList.add(new Acara("UTS", "Senin, 22 Oktober 2018", "UTS adalah Ujian Tengah Semester "));
    }

}
