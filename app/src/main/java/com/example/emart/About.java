package com.example.emart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class About extends AppCompatActivity {
    Button fb,tw,qr,ld,gt,ig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        fb=findViewById(R.id.fb);
        gt=findViewById(R.id.gt);
        qr=findViewById(R.id.qr);
        tw=findViewById(R.id.tw);
        ig=findViewById(R.id.ig);
        ld=findViewById(R.id.ld);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
                //startActivity(intent);
                Toast.makeText(About.this, "This is my Instagram Page", Toast.LENGTH_SHORT).show();
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
                //startActivity(intent);
                Toast.makeText(About.this, "This is my Facebook Page", Toast.LENGTH_SHORT).show();
            }
        });

        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
                //startActivity(intent);
                Toast.makeText(About.this, "This is my GitHub Page", Toast.LENGTH_SHORT).show();
            }
        });

        ld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
                //startActivity(intent);
                Toast.makeText(About.this, "This is my LinkedIn Page", Toast.LENGTH_SHORT).show();
            }
        });

        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
                //startActivity(intent);
                Toast.makeText(About.this, "This is my Twitter Page", Toast.LENGTH_SHORT).show();
            }
        });

        qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(""));
                //startActivity(intent);
                Toast.makeText(About.this, "This is my Quora Page", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
