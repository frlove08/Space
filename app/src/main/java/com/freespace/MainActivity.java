package com.freespace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button fsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fsBtn = findViewById(R.id.freeSpace);
        fsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File dir = getFilesDir();
                File file = new File(dir, "/storage/emulated/0/WhatsApp/Media/.Statuses/0d145930aab04cb8b2a463dd811faeec.jpg");
                boolean deleted = file.delete();
            }
        });
    }
}
