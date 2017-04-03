package com.plane.missyou.plane.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.plane.missyou.plane.base.presentation.BaseFragment;

/**
 * Created by MissC on 2017/4/4.
 */

public class PlaneMessageFragment extends BaseFragment {

    private static final String PLAEN_MESSAGE_TYPE = "PLAEN_MESSAGE_TYPE";
    private int mType;

    public static PlaneMessageFragment newInstance(int type) {
        Bundle bundle = new Bundle();
        bundle.putInt(PLAEN_MESSAGE_TYPE, type);
        PlaneMessageFragment fragment = new PlaneMessageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mType = getArguments().getInt(PLAEN_MESSAGE_TYPE);
    }

    @Override
    protected int getLayouResId() {
        return 0;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }
}
