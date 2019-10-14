package com.example.mvvm_demo.baseAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luoling on 2019/10/14.
 * description:
 */
public abstract class BaseBindingAdapter<T> extends RecyclerView.Adapter<BaseBindingViewHolder> {

    protected List<T> mList = new ArrayList<>();
    protected Context context;
    protected LayoutInflater inflater;

    public BaseBindingAdapter(Context context,List<T> list){
        this.mList = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public BaseBindingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return onCreateVH(viewGroup,i);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseBindingViewHolder baseBindingViewHolder, int i) {
        onBindVH(baseBindingViewHolder, i);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public abstract BaseBindingViewHolder onCreateVH(@NonNull ViewGroup viewGroup, int position);

    public abstract void onBindVH(@NonNull BaseBindingViewHolder baseBindingViewHolder, int position);

}
