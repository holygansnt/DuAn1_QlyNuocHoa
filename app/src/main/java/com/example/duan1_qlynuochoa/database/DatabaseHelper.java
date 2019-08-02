package com.example.duan1_qlynuochoa.database;


import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.duan1_qlynuochoa.dao.BillDao;
import com.example.duan1_qlynuochoa.dao.BillDetailDao;
import com.example.duan1_qlynuochoa.dao.LoaiNuocHoaDao;
import com.example.duan1_qlynuochoa.dao.NguoiDungDao;
import com.example.duan1_qlynuochoa.dao.ProductDao;
import com.example.duan1_qlynuochoa.model.Bill;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "db";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(BillDao.CREATE_TABLE_BILL); //tạo bang du lieu
        sqLiteDatabase.execSQL(BillDetailDao.CREATE_TABLE_BILL_DETAIL); //tạo bang du lieu
        sqLiteDatabase.execSQL(LoaiNuocHoaDao.CREATE_TABLE_LOAI_NUOC_HOA); //tạo bang du lieu
        sqLiteDatabase.execSQL(ProductDao.CREATE_TABLE_PRODUCT); //tạo bang du lieu
        sqLiteDatabase.execSQL(NguoiDungDao.CREATE_TABLE_NGUOI_DUNG); //tạo bang du lieu
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + BillDao.TABLE_NAME); //cap nhap bang du lieu
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + BillDetailDao.TABLE_NAME); //cap nhap bang du lieu
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + NguoiDungDao.TABLE_NAME); //cap nhap bang du lieu
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + LoaiNuocHoaDao.TABLE_NAME); //cap nhap bang du lieu
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ProductDao.TABLE_NAME); //cap nhap bang du lieu

    }
}
