package com.everestadvanced.facedetectionforcamera;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends Activity {

    Button btnimage;
    ImageView imgresult;
    MyGlobal myGlobal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myGlobal=new MyGlobal();

        btnimage=(Button)findViewById(R.id.takeimage);
        imgresult=(ImageView) findViewById(R.id.imagerst);

        btnimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Main2Activity.this,MainActivity.class));

            }
        });

        try
        {
            Bitmap bitmap=  myGlobal.getstrBitmap();

            if(bitmap!=null)
            {
                imgresult.setImageBitmap(bitmap);
            }
        }
        catch (Exception e)
        {

        }


    }

}
