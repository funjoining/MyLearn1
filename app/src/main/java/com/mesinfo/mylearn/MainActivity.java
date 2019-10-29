package com.mesinfo.mylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        File sdcard = Environment.getExternalStorageDirectory();
        Uri uri = Uri.parse(sdcard.getPath()+"/Movies/video1.mov");
        intent.setDataAndType(uri,"video/mov");
        startActivity(intent);
    }
}
