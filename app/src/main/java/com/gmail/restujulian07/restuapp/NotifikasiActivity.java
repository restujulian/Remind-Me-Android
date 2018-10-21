package com.gmail.restujulian07.restuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NotifikasiActivity extends AppCompatActivity {
    ListView simpleList;
    String  Item[] = {"Seminar", "UTS"};
    String  SubItem[] = {"Rabu - Kamis, 21 - 22 November 2019. Seminar Nasional iSRITI di STMIK Akakom",
            "Senin, 22 Oktober 2019. Ujian Tengah Semester"};
    int flags[] = {R.drawable.notif_icon, R.drawable.notif_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);

        simpleList = (ListView)findViewById(R.id.ListView);
        NotifikasiAdapter NotifikasiAdapter = new NotifikasiAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(NotifikasiAdapter);
    }
}