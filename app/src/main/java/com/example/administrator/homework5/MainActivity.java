package com.example.administrator.homework5;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setOnClickListener(this);
        ImageView qq = (ImageView)findViewById(R.id.qq);
        qq.setOnClickListener(this);
        ImageView wx = (ImageView)findViewById(R.id.wx);
        wx.setOnClickListener(this);
        ImageView wb = (ImageView)findViewById(R.id.wb);
        wb.setOnClickListener(this);
        ImageView wy = (ImageView)findViewById(R.id.wy);
        wy.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent =new Intent(MainActivity.this,
                        RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 =new Intent(MainActivity.this,
                        EnrollActivity.class);
                startActivity(intent2);
                break;

            case R.id.qq:
                Toast.makeText(MainActivity.this,"想多了，没那么多功能哈哈哈",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.wx:
                Toast.makeText(MainActivity.this,"想多了，没那么多功能哈哈哈",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.wb:
                Toast.makeText(MainActivity.this,"想多了，没那么多功能哈哈哈",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.wy:
                Toast.makeText(MainActivity.this,"想多了，没那么多功能哈哈哈",
                        Toast.LENGTH_SHORT).show();
                break;

                default:
                    break;
        }



    }
}
