package com.jk.ct.CustomApi;

import android.app.Application;
import android.app.Service;

import retrofit.RestAdapter;

/**
 * Created by john on 3/4/14.
 */
public class CustomApiService {
    public static final String CUSTOM_API_SERVER="http://customapi.apiary.io";

    private CustomApiInterface custApiInt;

    public CustomApiService() {
        RestAdapter restAdapter = new RestAdapter.Builder().setServer(CUSTOM_API_SERVER).build();
        custApiInt=restAdapter.create(CustomApiInterface.class);

    }



    public CustomApiInterface getCustomApiInterface(){
        return custApiInt;
    }
}
