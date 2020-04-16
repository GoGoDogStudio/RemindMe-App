package com.gogodogstudio.remindmeapp.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gogodogstudio.remindmeapp.fragments.AbstractTabFragmnet;
import com.gogodogstudio.remindmeapp.fragments.BirthdayFragment;
import com.gogodogstudio.remindmeapp.fragments.HistoryFragment;
import com.gogodogstudio.remindmeapp.fragments.IdeasFragment;
import com.gogodogstudio.remindmeapp.fragments.ToDoFragment;

import java.util.HashMap;
import java.util.Map;

public class TabAdapter extends FragmentPagerAdapter {

    private final Context context;
    private Map<Integer, AbstractTabFragmnet> tabs;

    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        return  tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, ToDoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }
}
