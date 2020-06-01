package com.example.japanbox2;

public class PrimjerItem {
    private int mImageResource;
    private String mText1;
    private String mText2;

    public PrimjerItem(int ImageResource, String text1, String text2) {
        mImageResource = ImageResource;
        mText1 = text1;
        mText2 = text2;

    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }

}
