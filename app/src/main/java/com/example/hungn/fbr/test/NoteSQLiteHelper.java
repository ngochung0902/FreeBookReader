package com.example.hungn.fbr.test;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tuanlq on 7/14/2016.
 */
public class NoteSQLiteHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "freebook.db";
    public static final String TABLE_NAME = "SACH";
    // columns
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_TITLE = "tensach";
    public static final String COLUMN_NOTE = "noidung";
    public static final String COLUMN_IMAGE = "image";
    public static final String COLUMN_DATETIME = "datetime";
    // DB info
    public static final int DATABASE_VERSION = 1;
    private static final String CREATE_DATABASE_SACH = "CREATE TABLE "   + TABLE_NAME + "( "
                                                                    + COLUMN_ID + " INTEGER PRIMARY KEY  autoincrement,"
                                                                    + COLUMN_TITLE + " text not null,"
                                                                    + COLUMN_NOTE + " text not null, "
                                                                    + COLUMN_DATETIME+" text not null,"
                                                                    + COLUMN_IMAGE + " text);";

    public static final String TABLE_NAME1 = "TACGIA";
    public static final String COLUMN_ID1 = "";
    public NoteSQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DATABASE_SACH);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + TABLE_NAME);
        onCreate(db);
    }
}
