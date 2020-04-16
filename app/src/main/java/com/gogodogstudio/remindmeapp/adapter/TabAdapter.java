package com.gogodogstudio.remindmeapp.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gogodogstudio.remindmeapp.R;
import com.gogodogstudio.remindmeapp.fragments.ExampleFragment;

public class TabAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Tab 1",
                "Сповіщення",
                "Tab 2"
        };
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return ExampleFragment.getInstance();

            case 1:
                return ExampleFragment.getInstance();

            case 2:
                return ExampleFragment.getInstance();

        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
