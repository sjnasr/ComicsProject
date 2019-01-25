package com.saranasr.comicbooksearch;


import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class ComicDatabase extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "ComicbookDatabase";

    //Table Contents
    private static final String KEY_ID = "id";
    private static final String Character_Name = "character name";
    //private static Blob image = "image";
    //String encodedImage = Base64.encodeToString(byteArrayImage, Base64.DEFAULT);
    private static final String image = "image";
    private static final String HeroOrVillian = "Hero or Villian";
    private static final String Alias = "Alias";
    private static final String Publisher = "Publisher";
    private static final String Gender = "Gender";
    private static final String Species = "Species";
    private static final String Birthday = "Birthday";
    private static final String Death = "Death";
    private static final String Powers = "Powers";
    private static final String Origin = "Origin";
    private static final String Citizenship = "Citizenship";
    private static final String PlaceOfBirth = "Place of Birth";
    private static final String MaritalStatus = "Single or Married";
    private static final String Occupation = "Occupation";
    private static final String KnownRelatives = "Known Relatives";


    //Create Table
    /*private static final String CreateTable = "CREATE TABLE " + DATABASE_NAME + "(" + KEY_ID + " INTEGER PRIMARY KEY," + Character_Name
            + " TEXT," + image + " BLOB," + HeroOrVillian + " TEXT," + Alias + " TEXT," + Publisher + " TEXT,"
            + Gender + " TEXT," + Species + " TEXT," + Birthday + " TEXT," + Death + " TEXT," + Powers + " TEXT,"
            + Origin + " TEXT," + Citizenship + " TEXT," + PlaceOfBirth + " TEXT," + MaritalStatus + " TEXT,"
            + Occupation + " TEXT," + KnownRelatives + " TEXT" + ")";*/
    private static final String CreateTable = "CREATE TABLE " + DATABASE_NAME + "(KEY_ID INTEGER PRIMARY KEY autoincrement NOT NULL, " +
            "Character_Name TEXT, image BLOB, HeroOrVillian TEXT, Alias  TEXT, Publisher TEXT, " +
            "Gender TEXT, Species  TEXT, Birthday TEXT, Death TEXT, Powers TEXT, Origin TEXT, Citizenship TEXT, PlaceOfBirth TEXT," +
            "MaritalStatus TEXT, Occupation TEXT, KnownRelatives TEXT)";

    public ComicDatabase(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creating table
        db.execSQL(CreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int old, int newV) {
        //Drop old table if exists
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);
        //Create table again
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    //Adding new entry
    //public void addEntry()
}
