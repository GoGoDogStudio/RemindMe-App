package com.gogodogstudio.remindmeapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gogodogstudio.remindmeapp.R;

public class IdeasFragment extends AbstractTabFragmnet {

    public static IdeasFragment getInstance(Context context){
        Bundle args = new Bundle();
        IdeasFragment exampleFragment = new IdeasFragment();
        exampleFragment.setArguments(args);
        exampleFragment.setContext(context);
        exampleFragment.setTitle(context.getString(R.string.TabIdeas));
        return exampleFragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.example_layout, container, false);

        return view;
    }


    public void setContext(Context context) {
        this.context = context;
    }


}
