package com.example.mvvm_demo.baseAdapter;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by luoling on 2019/10/14.
 * description:
 */
public class BaseBindingViewHolder extends RecyclerView.ViewHolder {

    ViewDataBinding dataBinding;

    public BaseBindingViewHolder(ViewDataBinding dataBinding) {
        super(dataBinding.getRoot());
        this.dataBinding = dataBinding;
    }

    public ViewDataBinding getDataBinding() {
        return dataBinding;
    }
}
