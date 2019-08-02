package com.example.duan1_qlynuochoa.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;


import com.example.duan1_qlynuochoa.database.DatabaseHelper;
import com.example.duan1_qlynuochoa.model.NguoiDung;
import com.example.duan1_qlynuochoa.model.Product;

import java.util.ArrayList;
import java.util.List;

public class NguoiDungDao {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public static final String TABLE_NAME = "NguoiDung";
    public static final String CREATE_TABLE_NGUOI_DUNG = "CREATE TABLE NguoiDung(username " +
            "text primary key, password text, phone text,hoten text);";
    public static final String TAG = "NguoiDungDao";

    public NguoiDungDao(Context context) {
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();

    }
    public int insertNguoiDung(String username, String password, String phone, String hoten){
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        contentValues.put("phone",phone);
        contentValues.put("hoten",hoten);

            if (db.insert(TABLE_NAME,null,contentValues)==-1){
                return 1;
                //insert thanh cong
            }
            else {
                return -1; //insert ko thanh cong
            }



    }

    public List<NguoiDung> getAll(){
        List<NguoiDung> list = new ArrayList<>();
        Cursor cursor = db.query(TABLE_NAME, null,null,
                null,null,null,null);
        cursor.moveToFirst();
        while (cursor.isAfterLast()){//neu khong phai ban ghi cuoi cung
            NguoiDung model = new NguoiDung();
            model.setUserName(cursor.getString(0));
            model.setPassword(cursor.getString(1));
            model.setHoTen(cursor.getString(2));
            model.setPhone(cursor.getString(3));


            list.add(model);
            cursor.moveToFirst();

        }
        return list;
    }

    public NguoiDungDao(DatabaseHelper dbHelper) {
        this.dbHelper = dbHelper;
    }


}
