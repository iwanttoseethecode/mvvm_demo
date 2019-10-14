package com.example.mvvm_demo.view.mainPage;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mvvm_demo.R;
import com.example.mvvm_demo.bean.User;
import com.example.mvvm_demo.bean.UserField;
import com.example.mvvm_demo.databinding.ActivityMainBinding;
import com.example.mvvm_demo.view.secondPage.SecondActivity;

/*
* dataBinding的使用可以参考 https://www.jianshu.com/p/d429174b8d07
* */

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("李四","123456789","http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg");
        final UserField userField = new UserField();
        binding.setUser(user);
        binding.setField(userField);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                userField.name.set("sindy");
                userField.password.set("123456789");
            }
        },2000);
    }

    public void skipPage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
