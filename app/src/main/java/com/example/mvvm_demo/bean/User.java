package com.example.mvvm_demo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.example.mvvm_demo.BR;
import com.squareup.picasso.Picasso;

/**
 * Created by luoling on 2019/10/11.
 * description:
 */
public class User extends BaseObservable {

    private String name;
    private String password;
    private String header;

    @Bindable
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
        notifyPropertyChanged(BR.header);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public User(String name, String password, String header){
        this.name = name;
        this.password = password;
        this.header = header;
    }

}
