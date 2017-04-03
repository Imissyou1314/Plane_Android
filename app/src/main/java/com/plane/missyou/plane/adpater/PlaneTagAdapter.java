package com.plane.missyou.plane.adpater;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.plane.missyou.plane.comment.Comment;
import com.plane.missyou.plane.view.fragment.HomeFragment;
import com.plane.missyou.plane.view.fragment.MessageFragment;
import com.plane.missyou.plane.view.fragment.ShareFragment;
import com.plane.missyou.plane.view.fragment.UserInfoFragment;

/**
 * Created by MissC on 2017/4/4.
 */

public class PlaneTagAdapter extends FragmentPagerAdapter {
    private static final int PAGE_COUNT = 3;
    private Context mContext;

    public PlaneTagAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        int type;
        switch (position) {
            case Comment.TYPE_PLANE_HOME:
                return HomeFragment.newInstance();
            case Comment.TYPE_PLANE_MESSAGE:
                return MessageFragment.newInstance();
            case Comment.TYPE_PLANE_SHARE:
                return ShareFragment.newInstance();
            case Comment.TYPE_PLANE_UESRINFO:
                return UserInfoFragment.newInstance();
            default:
                return HomeFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "主页";
            case 1:
                return "消息";
            case 2:
                return "分享";
            case 3:
                return "我的";
            default:
                return "主页";
        }
    }
}
