package com.jk.ct;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by john on 3/2/14.
 */
public class PeopleFragment extends Fragment {
    public PeopleFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_home,container,false);
        TextView textView=(TextView)rootView.findViewById(R.id.txtLabel);
        textView.setText("Lide");
        return rootView;
    }
}
