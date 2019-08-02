package com.example.duan1_qlynuochoa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1_qlynuochoa.R;
import com.example.duan1_qlynuochoa.dao.NguoiDungDao;
import com.example.duan1_qlynuochoa.model.NguoiDung;

import java.util.List;

public class UserRecyclerViewAdapter extends RecyclerView.Adapter<ItemUserHolder> {
    private Context context;
    private List<NguoiDung> nguoiDungList;
    NguoiDungDao nguoiDungDao;

    public UserRecyclerViewAdapter(Context context, List<NguoiDung> nguoiDungList) {
        this.context = context;
        this.nguoiDungList = nguoiDungList;
        nguoiDungDao=new NguoiDungDao(context);
    }

    @NonNull
    @Override
    public ItemUserHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_user_name, viewGroup, false);
        return new ItemUserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemUserHolder itemUserHolder, final int position) {
        NguoiDung nguoiDung = nguoiDungList.get(position);
        itemUserHolder.tvName.setText(nguoiDung.getUserName());
        itemUserHolder.tvPhone.setText(nguoiDung.getPhone());
        itemUserHolder.ivDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NguoiDung nguoiDung=nguoiDungList.get(position);
                nguoiDungList.remove(nguoiDung);
               /* nguoiDungDao.deleteNguoiDung(nguoiDung.getUserName());*/
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
