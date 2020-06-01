package com.example.japanbox2;

import android.graphics.ImageDecoder;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.UUID;

@Entity(tableName = "recipes")
public class Recipe {
    @PrimaryKey
    @ColumnInfo(name = "recipeid")
    private String  mId;

    @ColumnInfo(name = "name")
    private String mName;

    @ColumnInfo(name = "timetoprepare")
    private String mTimeToPrepare;

    @ColumnInfo(name = "ingredients")
    private String mIngredients;

    @ColumnInfo(name = "steps")
    private String mStepsToMake;




    @Ignore
    public Recipe(String name) {
        mId = UUID.randomUUID().toString();
        mName = name;
    }

    public Recipe(String id, String name, String timetoprepare, String ingredients, String steps)  {

        this.mId = id;
        this.mName = name;
        this.mTimeToPrepare = timetoprepare;
        this.mIngredients = ingredients;
        this.mStepsToMake = steps;
    }




}
