package com.shengsheng.daohanglan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyTabPageAdapter extends FragmentPagerAdapter {
    private final String[] mTitlees;

    public MyTabPageAdapter(FragmentManager fm, String[] titlees) {
        super(fm);
        this.mTitlees = titlees;
    }
//显示七个顶部导航栏子页面
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RealSimpleFragment1();
        } else if (position == 1) {
            return new RecommendFragment2();
        } else if (position == 2) {
            return new RealSimpleFragment1();
        } else if (position == 3) {
            return new RealSimpleFragment1();
        } else if (position == 4) {
            return new RealSimpleFragment1();
        } else if (position == 5) {
            return new RealSimpleFragment1();
        }
        return new RealSimpleFragment1();
    }

    @Override
    public int getCount() {
        return mTitlees.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitlees[position];
    }
}
