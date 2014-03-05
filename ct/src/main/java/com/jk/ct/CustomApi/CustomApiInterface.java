package com.jk.ct.CustomApi;

import com.jk.ct.model.CustomApi.Lecture;


import java.util.List;

import retrofit.http.GET;

/**
 * Created by john on 3/4/14.
 */
public interface CustomApiInterface {
   @GET("/lectures/{id}")
   public List<Lecture> getLectures();
}
