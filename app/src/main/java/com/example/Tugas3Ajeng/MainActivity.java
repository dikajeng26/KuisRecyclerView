package com.example.Tugas3Ajeng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Tugas3Ajeng.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Kabul Sugiono", "Ayah" ,getDrawable(R.drawable.babe)));
        mahasiswaArrayList.add(new Mahasiswa("Titik Darjati", "Mama", getDrawable(R.drawable.mama)));
        mahasiswaArrayList.add(new Mahasiswa("Triana Pratiwi Dewi", "Kakak",getDrawable(R.drawable.ibun)));
        mahasiswaArrayList.add(new Mahasiswa("Dik Ajeng Ayutantri", "Adek",getDrawable(R.drawable.ajeng)));
    }
}

