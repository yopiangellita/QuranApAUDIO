package com.pemrogramanbergerak.quranap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class  AyatAdapter extends RecyclerView.Adapter<AyatAdapter.AyatViewHolder> {
    private List<VersesItem> results;

    public AyatAdapter(List<VersesItem> results) {
        this.results = results;
    }

    @NonNull
    @Override
    public AyatAdapter.AyatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AyatViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.ayat, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull AyatAdapter.AyatViewHolder holder, int position) {
        VersesItem result = results.get(position);

        holder.textViewAyat.setText(result.getTextUthmani());
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class AyatViewHolder extends RecyclerView.ViewHolder {
        TextView textViewAyat;
        public AyatViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewAyat = itemView.findViewById(R.id.tvAyatArab);
        }
    }

    public void setData(List<VersesItem> data){
    results.clear();
    results.addAll(data);
    notifyDataSetChanged();
    }
}
