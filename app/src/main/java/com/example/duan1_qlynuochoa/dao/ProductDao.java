package com.example.duan1_qlynuochoa.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.duan1_qlynuochoa.database.DatabaseHelper;
import com.example.duan1_qlynuochoa.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public static final String TABLE_NAME = "Product";
    public static final String CREATE_TABLE_PRODUCT = "CREATE TABLE Product(maSP " +
            "text primary key, tenSP text, loaiSP text,madeIn text, giaNhap text,giaBan text, soLuong text,ngayNhap text);";
    public static final String TAG = "ProductDao";

    public ProductDao(Context context) {
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();

    }
    public int insertProduct(String maSP, String tenSP, String loaiSP, String madeIn, String giaNhap, String giaBan, String soLuong, String ngayNhap){
        ContentValues contentValues = new ContentValues();
        contentValues.put("maSP",maSP);
        contentValues.put("tenSP",tenSP);
        contentValues.put("loaiSP",loaiSP);
        contentValues.put("madeIn",madeIn);
        contentValues.put("giaNhap",giaNhap);
        contentValues.put("giaBan",giaBan);
        contentValues.put("soLuong",soLuong);
        contentValues.put("ngayNhap",ngayNhap);

        try{
            if (db.insert(TABLE_NAME,null,contentValues)==-1){
                return -1;
            }

        }catch (Exception e){
            Log.d(TAG, "Không thành công: " + e);
        }
        return 1;
    }

    public List<Product>getAll(){
        List<Product> list = new ArrayList<>();
        Cursor cursor = db.query(TABLE_NAME, null,null,
                null,null,null,null);
        cursor.moveToFirst();
        while (cursor.isAfterLast()){//neu khong phai ban ghi cuoi cung
            Product product = new Product();
            product.setMaSP(cursor.getString(0));
            product.setTenSP(cursor.getString(1));
            product.setLoaiSP(cursor.getString(2));
            product.setMadeIn(cursor.getString(3));
            product.setGiaNhap(cursor.getString(4));
            product.setGiaBan(cursor.getString(5));
            product.setSoLuong(cursor.getString(6));
            product.setNgayNhap(cursor.getString(7));

            list.add(product);
            cursor.moveToFirst();

        }
        return list;
    }

    public ProductDao(DatabaseHelper dbHelper) {
        this.dbHelper = dbHelper;
    }
}
