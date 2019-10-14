package com.example.mvvm_demo.view.secondPage;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.example.mvvm_demo.BR;
import com.example.mvvm_demo.R;
import com.example.mvvm_demo.baseAdapter.BaseBindingAdapter;
import com.example.mvvm_demo.baseAdapter.BaseBindingViewHolder;
import com.example.mvvm_demo.bean.GirlBean;

import java.util.List;

/**
 * Created by luoling on 2019/10/12.
 * description:
 */
public class CommonAdapter extends BaseBindingAdapter<GirlBean> {

    public CommonAdapter(Context context,List<GirlBean> list){
        super(context,list);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public BaseBindingViewHolder onCreateVH(@NonNull ViewGroup viewGroup, int position) {
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(inflater,R.layout.item,viewGroup,false);
        return new BaseBindingViewHolder(viewDataBinding);
    }

    @Override
    public void onBindVH(@NonNull BaseBindingViewHolder baseBindingViewHolder, int position) {
        ViewDataBinding viewDataBinding = baseBindingViewHolder.getDataBinding();
        viewDataBinding.setVariable(BR.girlBean,mList.get(position));
        viewDataBinding.executePendingBindings();
    }



}
