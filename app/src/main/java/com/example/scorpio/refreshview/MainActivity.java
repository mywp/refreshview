package com.example.scorpio.refreshview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout llGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        llGroup =(LinearLayout)findViewById(R.id.ll);
    }
    
    public void onClick(View view){
        
        //添加一个TextView向llGroup
        TextView tv=new TextView(this);
        tv.setText("张三   女    34");
        llGroup.addView(tv);
    }
}
