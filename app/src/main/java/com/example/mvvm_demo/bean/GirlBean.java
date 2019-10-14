package com.example.mvvm_demo.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mvvm_demo.BR;
import com.squareup.picasso.Picasso;

/**
 * Created by luoling on 2019/9/16.
 * description:
 */
public class GirlBean extends BaseObservable {

    private int icon;
    private String like;
    private String style;

    public GirlBean(int icon, String like, String style) {
        this.icon = icon;
        this.like = like;
        this.style = style;
    }

    @Bindable
    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
        notifyPropertyChanged(BR.icon);
    }

    @Bindable
    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
        notifyPropertyChanged(BR.like);
    }

    @Bindable
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
        notifyPropertyChanged(BR.style);
    }

    public void click(View view){
        Toast.makeText(view.getContext(),getLike(),Toast.LENGTH_LONG).show();
    }

}
