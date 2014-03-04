package com.jk.ct.model.CustomApi;

/**
 * Created by john on 3/4/14.
 */
public class Lecture {
    private int id;
    private String title;

    public Lecture(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
