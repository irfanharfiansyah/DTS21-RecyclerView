package com.irfanharfiansyah.listfootballclub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private RecyclerView rvClubDet;
    private ArrayList<Club> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        list.addAll(ClubData.getClub());


//  Menampilkan list RecyclerView
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        rvClub.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Club data) {
                Intent moveIntent = new Intent(MainActivity.this, DetailClubActivity.class);
                moveIntent.putExtra(DetailClubActivity.ITEM_EXTRA, data);
                startActivity(moveIntent);
            }
        });

    }


}