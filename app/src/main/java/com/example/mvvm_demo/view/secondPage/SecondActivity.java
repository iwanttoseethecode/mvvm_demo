package com.example.mvvm_demo.view.secondPage;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.example.mvvm_demo.R;
import com.example.mvvm_demo.databinding.ActivitySecondBinding;
import com.example.mvvm_demo.utils.DeviderDecoration;

public class SecondActivity extends AppCompatActivity {

    private CommonAdapter adapter;
    private ActivitySecondBinding secondBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);

        secondBinding = DataBindingUtil.setContentView(this,R.layout.activity_second);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        secondBinding.myRecyclerView.setLayoutManager(linearLayoutManager);
        secondBinding.myRecyclerView.addItemDecoration(new DeviderDecoration(2));

        adapter = new CommonAdapter(this,DataModel.getGirlList());
        secondBinding.myRecyclerView.setAdapter(adapter);

    }



}
