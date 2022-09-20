package com.example.recyclerview3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployerViewHolder extends RecyclerView.ViewHolder {

    private TextView tvEmployer;

    public EmployerViewHolder(@NonNull View itemView) {
        super(itemView);
        tvEmployer = itemView.findViewById(R.id.tv_name_employers);
    }
    public void bind(String employer){
        tvEmployer.setText(employer);
    }
}
