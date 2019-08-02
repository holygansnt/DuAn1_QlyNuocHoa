package com.example.duan1_qlynuochoa.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.duan1_qlynuochoa.database.DatabaseHelper;
import com.example.duan1_qlynuochoa.model.LoaiNuocHoa;
import com.example.duan1_qlynuochoa.model.NguoiDung;

import java.util.ArrayList;
import java.util.List;

public class LoaiNuocHoaDao {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public static final String TABLE_NAME = "LoaiNuocHoa";
    public static final String CREATE_TABLE_LOAI_NUOC_HOA = "CREATE TABLE LoaiNuocHoa(maLoaiSP " +
            "text primary key, tenLoaiSP text, moTa text,viTri text);";
    public static final String TAG = "LoaiNuocHoaDao";

    public LoaiNuocHoaDao(Context context) {
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();

    }
    public int insertLoaiNuocHoa(String maLoaiSP, String tenLoaiSP, String moTa, String viTri){
        ContentValues contentValues = new ContentValues();
        contentValues.put("maLoaiSP",maLoaiSP);
        contentValues.put("tenLoaiSP",tenLoaiSP);
        contentValues.put("moTa",moTa);
        contentValues.put("viTri",viTri);

        try{
            if (db.insert(TABLE_NAME,null,contentValues)==-1){
                return -1;
            }

        }catch (Exception e){
            Log.d(TAG, "Không thành công: " + e);
        }
        return 1;
    }

    public List<LoaiNuocHoa> getAll(){
        List<LoaiNuocHoa> list = new ArrayList<>();
        Cursor cursor = db.query(TABLE_NAME, null,null,
                null,null,null,null);
        cursor.moveToFirst();
        while (cursor.isAfterLast()){//neu khong phai ban ghi cuoi cung
            LoaiNuocHoa model = new LoaiNuocHoa();
            model.setMaLoaiSP(cursor.getString(0));
            model.setTenLoaiSP(cursor.getString(1));
            model.setMoTa(cursor.getString(2));
            model.setViTri(cursor.getString(3));

            list.add(model);
            cursor.moveToFirst();

        }
        return list;
    }


    public LoaiNuocHoaDao(DatabaseHelper dbHelper) {
        this.dbHelper = dbHelper;
    }
}
