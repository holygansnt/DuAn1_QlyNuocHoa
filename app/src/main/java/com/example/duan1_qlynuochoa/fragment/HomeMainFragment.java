package com.example.duan1_qlynuochoa.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.duan1_qlynuochoa.R;
import com.example.duan1_qlynuochoa.ui.LoginActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeMainFragment extends Fragment {
    private LinearLayout User;
    private LinearLayout Perfume;
    private LinearLayout tintuc;
    private LinearLayout bill;
    private LinearLayout thongke;
    private LinearLayout top;




    public HomeMainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_home_main, container, false);
        User = container.findViewById(R.id.User);
        Perfume = container.findViewById(R.id.Perfume);
        tintuc = container.findViewById(R.id.tintuc);
        bill = container.findViewById(R.id.bill);
        thongke = container.findViewById(R.id.thongke);
        top = container.findViewById(R.id.top);

        User.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), LoginActivity.class));
            }
        });


        return view;



}

}
