package com.plane.missyou.plane.view.fragment;

import android.os.Bundle;
import android.view.View;

import com.plane.missyou.plane.base.presentation.BaseFragment;

/**
 * Created by MissC on 2017/4/4.
 */

public class HomeFragment extends BaseFragment {

    public static BaseFragment newInstance() {
        return new HomeFragment();
    }


    @Override
    protected int getLayouResId() {
        return 0;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }
}
