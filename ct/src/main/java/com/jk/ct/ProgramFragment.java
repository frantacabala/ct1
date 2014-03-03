package com.jk.ct;

import android.app.ActionBar;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by john on 3/2/14.
 */
public class ProgramFragment extends Fragment {
    private ActionBar actionBar;
    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private FragmentManager fragmentManager;
    public final String TAG = ProgramFragment.class.getSimpleName();
    public static ProgramFragment newInstance(){
        return new ProgramFragment();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_program,container,false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mViewPager =(ViewPager)view.findViewById(R.id.programPager);
        mPagerAdapter=new SlideFragmentAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
    }




    public void addTables(){

    }



}
