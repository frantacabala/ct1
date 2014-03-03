package com.jk.ct;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by john on 3/2/14.
 */
public class NavDrawerListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<NavDrawerItem> navDrawerItems;

    public NavDrawerListAdapter(Context context, ArrayList<NavDrawerItem> navDrawerItems){
        this.context = context;
        this.navDrawerItems = navDrawerItems;
    }
    @Override
    public int getCount() {
        return navDrawerItems.size();
    }

    @Override
    public Object getItem(int position) {
        return navDrawerItems.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       if(view==null){
           LayoutInflater mInflater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
           view=mInflater.inflate(R.layout.drawer_list_item,null);
       }
        ImageView imgIcon = (ImageView) view.findViewById(R.id.icon);
        TextView txtTitle = (TextView) view.findViewById(R.id.title);
        TextView txtCount = (TextView) view.findViewById(R.id.counter);

        imgIcon.setImageResource(navDrawerItems.get(i).getIcon());
        txtTitle.setText(navDrawerItems.get(i).getTitle());

        if(navDrawerItems.get(i).getCounterVisible()){
            txtCount.setText(navDrawerItems.get(i).getCount());
        }else{
            txtCount.setVisibility(View.GONE);
        }
        return view;
    }
}
