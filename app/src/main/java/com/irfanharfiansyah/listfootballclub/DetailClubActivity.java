package com.irfanharfiansyah.listfootballclub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DetailClubActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
    private RecyclerView rvClubDet;
    private ArrayList<Club> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_club);

        ImageView imgClub = findViewById(R.id.club_image);
        TextView dtlName = findViewById(R.id.dtl_name);
        TextView desc = findViewById(R.id.desc);

        Club club = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (club != null) {
            Glide.with(this)
                    .load(club.getPhoto())
                    .into(imgClub);
            dtlName.setText(club.getName());
            desc.setText(club.getDescription());


        }
        detailList();
    }
    public  void detailList() {

        rvClubDet = findViewById(R.id.rv_club);
        rvClubDet.setHasFixedSize(true);
        list.addAll(ClubData.getClub());

//  Menampilkan list RecyclerView


        rvClubDet.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ListAdapter listAdapter = new ListAdapter(list);
        rvClubDet.setAdapter(listAdapter);

        listAdapter.setOnItemClickCallback(new ListAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Club data) {
                Intent moveIntent = new Intent(DetailClubActivity.this, DetailClubActivity.class);
                moveIntent.putExtra(DetailClubActivity.ITEM_EXTRA, data);
                startActivity(moveIntent);
            }
        });

    }
}