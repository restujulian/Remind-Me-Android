package com.gmail.restujulian07.restuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class JadwalActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private JadwalAdapter adapter;
    private ArrayList<Jadwal> JadwalArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new JadwalAdapter(JadwalArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(JadwalActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        JadwalArrayList = new ArrayList<>();
        JadwalArrayList.add(new Jadwal("Seminar Nasional iSRITI", "Rabu - Kamis, 21 -22 November 2018", "Seminar di adakan di STMIK AKAKOM"));
        JadwalArrayList.add(new Jadwal("UTS", "22 Oktober - 2 Desember 2018", "Ujian Tengah Semester"));
        JadwalArrayList.add(new Jadwal("UAS (Teori)", "2 - 11 Januari 2019", "Ujian Akhir Semester untuk matkul Teori"));
        JadwalArrayList.add(new Jadwal("UAS (Praktik / Praktikum)", "14 - 18 Januari 2019", "Ujian Akhir Semester untuk matkul Praktik / Praktikum"));
        JadwalArrayList.add(new Jadwal("Campus Hiring", "4 - 22 Maret 2019", "Campus Hiring di STMIK Akakom"));
    }

}
