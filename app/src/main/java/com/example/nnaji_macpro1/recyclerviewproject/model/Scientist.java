package com.example.nnaji_macpro1.recyclerviewproject.model;

/**
 * Created by Nnaji-MacPro1 on 7/25/18.
 */
public class Scientist {
    private String mName;
    private String mBirthYear;
    private String mDeathYear;
    private int mImageId;
    public String getName() {
        return mName;
    }
    public void setName(String mName) {
        this.mName = mName;
    }
    public String getBirthYear() {
        return mBirthYear;
    }
    public void setBirthYear(String mBirthYear) {
        this.mBirthYear = mBirthYear;
    }
    public String getDeathYear() {
        return mDeathYear;
    }
    public void setDeathYear(String mDeathYear) {
        this.mDeathYear = mDeathYear;
    }
    public int getImageId() {
        return mImageId;
    }
    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }
}