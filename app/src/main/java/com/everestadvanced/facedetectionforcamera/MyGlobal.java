package com.everestadvanced.facedetectionforcamera;

import android.app.Application;
import android.graphics.Bitmap;
import android.net.Uri;

/**
 * Created by Administrator on 14-12-2017.
 */

public class MyGlobal extends Application
{
    public static Bitmap strBitmap;

    public void setstrBitmap(Bitmap strBitma)
    {
        strBitmap=strBitma;
    }

    public Bitmap getstrBitmap()
    {
        return strBitmap;
    }
}
