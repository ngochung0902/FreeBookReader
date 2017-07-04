package com.example.hungn.fbr.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by hungn on 05/19/17.
 */

public class Data {
    private SQLiteOpenHelper sqLiteOpenHelper;
    private SQLiteDatabase sqLiteDatabase;
    private String[] allColumns = { SQLiteHelper.COLUMN_SACH_IDSach,
            SQLiteHelper.COLUMN_SACH_TITLE,
            SQLiteHelper.COLUMN_SACH_NOTE,
            SQLiteHelper.COLUMN_SACH_DATETIME,
            SQLiteHelper.COLUMN_SACH_IMAGE};

    private Context context;

    public Data(Context context)
    {
        this.context = context;
        sqLiteOpenHelper = new SQLiteHelper(context);
    }

    public void open() throws SQLiteException
    {
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }
    public void close() throws SQLiteException
    {
        sqLiteOpenHelper.close();
    }
    // add new note to dairy
    public void addNewNote(String title, String note, String image, String datetime)
    {

        ContentValues values = new ContentValues();
        values.put(SQLiteHelper.COLUMN_SACH_TITLE, title);
        values.put(SQLiteHelper.COLUMN_SACH_NOTE, note);
        values.put(SQLiteHelper.COLUMN_SACH_DATETIME,datetime);
        values.put(SQLiteHelper.COLUMN_SACH_IMAGE, image);
        // insert
        sqLiteDatabase.insert(SQLiteHelper.TABLE_NAME,null,values);
    }
    // delete note
    public void deleteNote(int id)
    {
        sqLiteDatabase.delete(SQLiteHelper.TABLE_NAME, SQLiteHelper.COLUMN_SACH_IDSach + "=" + id,null);
        Toast.makeText(this.context,"delete note success",Toast.LENGTH_LONG).show();
    }

    public ArrayList<NoteModel> getAllNotes()
    {
        ArrayList<NoteModel> arr = new ArrayList<NoteModel>();

        Cursor cursor = sqLiteDatabase.query(SQLiteHelper.TABLE_NAME,allColumns,null,null,null,null,null);

        if(cursor == null)
        {
            return null;
        }
        // having notes
        cursor.moveToFirst();

        while(!cursor.isAfterLast())
        {
            NoteModel model = cursorToModel(cursor);
            arr.add(model);
            cursor.moveToNext();
        }
        return arr;
    }
    // get NoteModel from cursor
    private NoteModel cursorToModel(Cursor cursor)
    {
        NoteModel model = new NoteModel();
        model.id = cursor.getInt(0);
        model.title = cursor.getString(1);
        model.content = cursor.getString(2);
        model.datetime = cursor.getString(3);
        model.image = cursor.getString(4);

        return model;
    }
}
