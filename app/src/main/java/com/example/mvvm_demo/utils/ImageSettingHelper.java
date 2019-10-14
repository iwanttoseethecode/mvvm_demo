package com.example.mvvm_demo.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by luoling on 2019/10/14.
 * description:为ImageView提供图片资源绑定属性
 */
public class ImageSettingHelper {

    @BindingAdapter("imgNet")
    public static void setImageNet(ImageView view,String url){
        Picasso.with(view.getContext()).load(url).into(view);
    }

    @BindingAdapter("imgRes")
    public static void setImageRes(ImageView view,int res){
        view.setImageResource(res);
    }


}
