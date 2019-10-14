package com.example.mvvm_demo.view.secondPage;

import com.example.mvvm_demo.R;
import com.example.mvvm_demo.bean.GirlBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luoling on 2019/10/12.
 * description:
 */
public class DataModel {

    private static List<GirlBean> girlList = new ArrayList<>();

    static {
        girlList.add(new GirlBean(R.mipmap.f1, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f2, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f3, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f4, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f5, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f6, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f7, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f8, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f9, "一星", "****"));
        girlList.add(new GirlBean(R.mipmap.f10, "一星", "****"));
    }

    public static List<GirlBean> getGirlList(){
        return girlList;
    }

}
