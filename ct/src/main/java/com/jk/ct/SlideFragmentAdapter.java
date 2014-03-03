package com.jk.ct;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by john on 3/2/14.
 */
public class SlideFragmentAdapter extends FragmentPagerAdapter {
    public SlideFragmentAdapter(FragmentManager fm) {
        super(fm);

    }




    @Override
    public Fragment getItem(int i) {

        return new ScreenSlideFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
