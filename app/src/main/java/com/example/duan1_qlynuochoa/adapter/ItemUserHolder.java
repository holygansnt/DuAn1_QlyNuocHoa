package com.example.duan1_qlynuochoa.adapter;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1_qlynuochoa.R;


class ItemUserHolder extends RecyclerView.ViewHolder {
    ImageView ivIcon;
    TextView tvName;
    TextView tvPhone;
    ImageView ivDelete;

    public ItemUserHolder(@NonNull View itemView) {
        super(itemView);
        ivIcon=itemView.findViewById(R.id.ivIcon);
        tvName=itemView.findViewById(R.id.tvName);
        tvPhone=itemView.findViewById(R.id.tvPhone);
        ivDelete=itemView.findViewById(R.id.ivDelete);

    }
}
