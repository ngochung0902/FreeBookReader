package com.example.hungn.fbr.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by hungn on 05/19/17.
 */

public class SQLiteHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "freebook.db";

    public static final String TABLE_NAME1 = "TACGIA";
    //columns
    public static final String COLUMN_TACGIA_IDtacgia = "_idtacgia,";
    public static final String COLUMN_TACGIA_Tentacgia = "tentacgia,";
    //DB info
    private static final String CREATE_DATABASE_TACGIA = "CREATE TABLE "   + TABLE_NAME1 + "( "
            +COLUMN_TACGIA_IDtacgia +"INTEGER PRIMARY KEY,"
            +COLUMN_TACGIA_Tentacgia+"text not null);";
    public static final String TABLE_NAME = "SACH";
    // columns
    public static final String COLUMN_SACH_IDSach = "_idsach";
    public static final String COLUMN_SACH_IDtacgia = "_idtacgia";
    public static final String COLUMN_SACH_TITLE = "tensach";
    public static final String COLUMN_SACH_NOTE = "noidung";
    public static final String COLUMN_SACH_IMAGE = "image";
    public static final String COLUMN_SACH_DATETIME = "datetime";
    // DB info
    public static final int DATABASE_VERSION = 1;
    private static final String CREATE_DATABASE_SACH = "CREATE TABLE "   + TABLE_NAME + "( "
            + COLUMN_SACH_IDSach + " INTEGER PRIMARY KEY  autoincrement," +
            COLUMN_SACH_IDtacgia+"INTEGER not null" //CONSTRAINT _idtacgia"+
            //"REFERENCES TACGIA(_idtacgia) ON DELETE CASCADE,"
            + COLUMN_SACH_TITLE + " text not null,"
            + COLUMN_SACH_NOTE + " text not null, "
            + COLUMN_SACH_DATETIME+" text not null,"
            + COLUMN_SACH_IMAGE + " text);";


    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DATABASE_SACH);
        db.execSQL(CREATE_DATABASE_TACGIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXIST " + TABLE_NAME1);
        onCreate(db);
    }
}
