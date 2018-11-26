package com.example.dell.compareprice.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dell.compareprice.PesoFragment;

import java.util.List;

public class CalcularViewPagerAdapter extends FragmentPagerAdapter{
    List<Fragment> fragmentList;
    List<String> tituloList;


    public CalcularViewPagerAdapter(FragmentManager fm, List<Fragment> fragmentList,  List<String> tituloList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.tituloList = tituloList;
    }


    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tituloList.get(position);
    }
}
