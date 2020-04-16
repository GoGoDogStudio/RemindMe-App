package com.gogodogstudio.remindmeapp.fragments;

import android.content.Context;
import android.view.View;

import androidx.fragment.app.Fragment;

public class AbstractTabFragmnet extends Fragment {

    private String title;
    protected View view;
    protected Context context;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
