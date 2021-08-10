package com.irfanharfiansyah.listfootballclub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{
    private ArrayList<Club> listClub;

    public  ListAdapter(ArrayList<Club> list) {
        this.listClub = list;
    }

    @NonNull
    @Override
    public ListAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_club, parent, false);
        return new ListViewHolder(view);
    }
//    pengisian data ke dalam item melalui holder
    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ListViewHolder holder, int position) {
        Club club = listClub.get(position);
        Glide.with(holder.itemView.getContext())
                .load(club.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgLogo);

//  menetapkan tampilan item berdasarkan tampilan dan model data
        holder.name.setText(club.getName());
        holder.country.setText(club.getCountry());
    }
//  Mengembalikan jumlah total item dalam daftar
    @Override
    public int getItemCount() {
        return listClub.size();
    }

     class ListViewHolder extends RecyclerView.ViewHolder {
//         untuk tampilan apa pun yang akan disetel saat  membuat baris
        ImageView imgLogo;
        TextView name;
        TextView country;

//        membuat konstruktor yang menerima seluruh baris item dan melakukan pencarian tampilan untuk menemukan setiap subview
        ListViewHolder(View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.img_club);
            name = itemView.findViewById(R.id.name_club);
            country = itemView.findViewById(R.id.country);
        }
    }
}
