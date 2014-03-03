package com.jk.ct;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by john on 3/2/14.
 */
public class DetailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View rootView=inflater.inflate(R.layout.detail_layout,container,false);
         rootView.setOnKeyListener(new View.OnKeyListener() {
             @Override
             public boolean onKey(View view, int i, KeyEvent keyEvent) {
                 if(i==KeyEvent.KEYCODE_BACK){
                     Toast.makeText(getActivity(),"Pressed back",Toast.LENGTH_LONG).show();
                     getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.content, getActivity().getSupportFragmentManager().findFragmentByTag(ScreenSlideFragment.TAG)).commit();
                    return true;
                 }
                 return false;
             }
         });
         return rootView;
    }

    public Fragment getInstance(){
        return this;
    }


}
