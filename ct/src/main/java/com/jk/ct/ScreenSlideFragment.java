package com.jk.ct;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorInflater;

/**
 * Created by john on 3/2/14.
 */
public class ScreenSlideFragment extends Fragment {
    private Button btn_detail;
    private FragmentManager fm;
    private ViewGroup rootView;
    private static ScreenSlideFragment instance;
    public static final String TAG="screenFragment";


    public static Fragment getInstance(){
        if(instance==null){
            instance=new ScreenSlideFragment();
            return instance;
        }
        return instance;
    }


    //

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);
        btn_detail=(Button)rootView.findViewById(R.id.btn_detail);
        btn_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail(view);
            }
        });
        fm=getChildFragmentManager();
        return rootView;
    }

    public void showDetail(View view){
        DetailFragment dF=new DetailFragment();
        getActivity().getSupportFragmentManager().beginTransaction()
                //.setCustomAnimations(AnimationUtils.loadAnimation(this,R.animator.card_flip_right_in), R.animator.card_flip_right_out, R.animator.card_flip_left_in, R.animator.card_flip_left_out)
                //.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)

                .replace(R.id.frame_container, dF).addToBackStack(null).commit();

         Toast toast=Toast.makeText(getActivity(),"Detail view",Toast.LENGTH_LONG);
        toast.show();
    }
 
    
}
