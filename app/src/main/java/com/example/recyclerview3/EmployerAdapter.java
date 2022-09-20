package com.example.recyclerview3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmployerAdapter extends RecyclerView.Adapter<EmployerViewHolder> {

    private ArrayList<String> employerList;

    public EmployerAdapter(ArrayList<String> employerList) {
        this.employerList = employerList;
    }

    @NonNull
    @Override
    public EmployerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EmployerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_count_employers,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull EmployerViewHolder holder, int position) {
        holder.bind(employerList.get(position));
    }

    @Override
    public int getItemCount() {
        return employerList.size();
    }
}
