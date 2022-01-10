package com.example.sqlitelogin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context,"login.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase myDB) {
        String query = "create table Users(username text primary key,password text)";
        myDB.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase myDB, int i, int i1) {
        myDB.execSQL("drop table if exists Users");
    }

    public boolean insertData(String username,String password){
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        long result = myDB.insert("Users",null,contentValues);
        myDB.close();
        if(result==-1){
            return false;
        }else{
            return true;
        }
    }

    public boolean checkUsername(String username){
//        String query = "Select * from Users where username =?";
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cursor = myDB.rawQuery("Select * from Users where username =?",new String[] {username});
        if(cursor.getCount()>0){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkUserNamePassword(String username,String passowrd){
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cursor = myDB.rawQuery("Select * from Users where username =? and password=?",new String[] {username,passowrd});
        if(cursor.getCount()>0){
            return true;
        }else{
            return false;
        }
    }
}
