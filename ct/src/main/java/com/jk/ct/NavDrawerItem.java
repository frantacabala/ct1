package com.jk.ct;

/**
 * Created by john on 3/2/14.
 */
public class NavDrawerItem {
    private String title;
    private int icon;
    private String count="0";

    private boolean isCounterVisible=false;

    public NavDrawerItem(){

    }
    public NavDrawerItem(String tile, int icon){
        this.title=tile;
        this.icon=icon;
    }

    public NavDrawerItem(String title, int icon, boolean isCounterVisible, String count){
        this.title = title;
        this.icon = icon;
        this.isCounterVisible = isCounterVisible;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public boolean getCounterVisible() {
        return isCounterVisible;
    }


    public void setCounterVisible(boolean isCounterVisible) {
        this.isCounterVisible = isCounterVisible;
    }

}
