package com.example.duan1_qlynuochoa.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.duan1_qlynuochoa.database.DatabaseHelper;
import com.example.duan1_qlynuochoa.model.Bill;
import com.example.duan1_qlynuochoa.model.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class BillDao {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public static final String TABLE_NAME = "Bill";
    public static final String CREATE_TABLE_BILL = "CREATE TABLE Bill(maBill " +
            "text primary key, ngayMua text);";
    public static final String TAG = "BillDao";

    public BillDao(Context context) {
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();

    }

    public BillDao(DatabaseHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public int insertBill(String maBill, String ngayMua){
        ContentValues contentValues = new ContentValues();
        contentValues.put("maBill",maBill);
        contentValues.put("ngayMua",ngayMua);
        try{
            if (db.insert(TABLE_NAME,null,contentValues)==-1){
                return -1;
            }

        }catch (Exception e){
            Log.d(TAG, "Không thành công: " + e);
        }
        return 1;

    }


    public List<Bill> getAll(){
        List<Bill> list = new ArrayList<>();
        Cursor cursor = db.query(TABLE_NAME, null,null,
                null,null,null,null);
        cursor.moveToFirst();
        while (cursor.isAfterLast()){//neu khong phai ban ghi cuoi cung
            Bill model = new Bill();
            model.setMaBill(cursor.getString(0));
            model.setNgayMua(cursor.getString(1));

            list.add(model);
            cursor.moveToFirst();

        }
        return list;
    }

}
