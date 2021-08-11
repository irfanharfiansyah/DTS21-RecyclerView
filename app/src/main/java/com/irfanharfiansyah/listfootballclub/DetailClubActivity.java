package com.irfanharfiansyah.listfootballclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailClubActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";
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
    }
}