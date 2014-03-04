package com.jk.ct;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jk.ct.CustomApi.CustomApiInterface;
import com.jk.ct.CustomApi.CustomApiService;
import com.jk.ct.CustomApi.LectureCallback;
import com.jk.ct.model.CustomApi.Lecture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class LectureFragment extends Fragment {
    private ViewGroup rootView;
    private ListView listView;
    private CustomLectureAdapter adapter;

    public LectureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_lecture, container, false);
        listView=(ListView)rootView.findViewById(R.id.listView);
        adapter = new CustomLectureAdapter(loadData());

        listView.setAdapter(adapter);

        return rootView;
    }

    public List<Lecture> loadData(){
        List<Lecture> list = new ArrayList<Lecture>();
        list.add(new Lecture(1,"hovno"));
        list.add(new Lecture(2,"hovno 2"));

        CustomApiService service = new CustomApiService();
        CustomApiInterface apiInterface=service.getCustomApiInterface();
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        List<Lecture> lectures= apiInterface.getLectures();

        return lectures;
    }

    public class CustomLectureAdapter extends BaseAdapter {

        private List<Lecture> listLecture= Collections.emptyList();

        public CustomLectureAdapter(List<Lecture> listLecture) {
            this.listLecture = listLecture;
        }

        @Override
        public int getCount() {
            return listLecture.size();
        }

        @Override
        public Object getItem(int position) {
            return listLecture.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            RelativeLayout myView = view != null
                    ? (RelativeLayout) view
                    : (RelativeLayout) getActivity().getLayoutInflater().inflate(R.layout.custom_list_line, viewGroup, false);

            TextView id = (TextView) myView.findViewById(R.id.textViewId);
            TextView title = (TextView)myView.findViewById(R.id.textViewTitle);
            id.setText(Integer.toString(listLecture.get(i).getId()));
            title.setText(listLecture.get(i).getTitle());

            return myView;
        }
    }
}
