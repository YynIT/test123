package com.example.test123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.test);
        // 创建新分支dev
        // 重新clone代码，切到dev分支，提交
        // 创建新分支feature
        // 分支feature,再次提交
        // 创建新分支feature_1
        // 在dev分支上创建新分支dev_1
        // 再提交dev_1
        // 我是员工甲,在dev_1分支上改动
        // 我是员工已,在dev_1分支上改动
        // 我是test123,在dev_1分支上改动
        // 我是test123,在dev_1分支上改动，需要此改动merge到dev上
        // 我是test123,在dev分支上改动，123
    }
}
