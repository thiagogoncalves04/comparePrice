package com.example.dell.compareprice;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell.compareprice.Adapter.CalcularViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ConsultorActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultor);

        viewPager = findViewById(R.id.container_viewpager_id);
        TabLayout tabLayout = findViewById(R.id.tablayout_id);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new PesoFragment());
        fragmentList.add(new VolumeFragment());

        List<String> tituloList = new ArrayList<>();
        tituloList.add("Peso");
        tituloList.add("Volume");

        CalcularViewPagerAdapter adapter = new CalcularViewPagerAdapter(getSupportFragmentManager(), fragmentList, tituloList);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);


        tabLayout.setupWithViewPager(viewPager);

        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(8);




    }
}
