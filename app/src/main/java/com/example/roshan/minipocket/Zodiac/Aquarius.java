package com.example.roshan.minipocket.Zodiac;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;

import com.example.roshan.minipocket.FragmentPageAdapter.FragmentPageAdapter;
import com.example.roshan.minipocket.Libra.This_Month;
import com.example.roshan.minipocket.Libra.This_Week;
import com.example.roshan.minipocket.Libra.This_Year;
import com.example.roshan.minipocket.Libra.Today;
import com.example.roshan.minipocket.Libra.Tomorrow;
import com.example.roshan.minipocket.Libra.Yesterday;
import com.example.roshan.minipocket.R;

import java.util.ArrayList;
import java.util.List;

public class Aquarius extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener {
    private View view;
    ViewPager viewPager;
    TabHost tabhost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aries);
        initTabHost();
        initViewPager();
        Aquarius.this.setTitle("Aquarius");
    }
    private void initTabHost() {
        tabhost = (TabHost) findViewById(R.id.tabHost);
        tabhost.setup();
        String[] tabnames = {
                "Yesterday", "Today", "Tomorrow","This Week","This Month","This Year"
        };
        for (int i = 0; i < tabnames.length; i++) {
            TabHost.TabSpec tabspec;
            tabspec = tabhost.newTabSpec(tabnames[i]);
            tabspec.setIndicator(tabnames[i]);
            tabspec.setContent(new FakeContent(getApplicationContext()));
            tabhost.addTab(tabspec);

        }
        tabhost.setOnTabChangedListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int SelectedItem) {
        tabhost.setCurrentTab(SelectedItem);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabChanged(String tabId) {
        int SelectedItem = tabhost.getCurrentTab();
        viewPager.setCurrentItem(SelectedItem);
        HorizontalScrollView scrollView = (HorizontalScrollView)findViewById(R.id.h_scrollview);
        View tabView = tabhost.getCurrentTabView();
        int scrollPos = tabView.getLeft() - (scrollView.getWidth() - tabView.getWidth()) / 2;
        scrollView.smoothScrollTo(scrollPos, 0);
    }


    public class FakeContent implements TabHost.TabContentFactory {
        Context context;

        public FakeContent(Context mcontext) {
            context = mcontext;
        }

        @Override
        public View createTabContent(String tag) {
            View fakeview = new View(context);
            fakeview.setMinimumHeight(0);
            fakeview.setMinimumWidth(0);
            return fakeview;
        }
    }

    private void initViewPager() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        List<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new Yesterday());
        fragmentList.add(new Today());
        fragmentList.add(new Tomorrow());
        fragmentList.add(new This_Week());
        fragmentList.add(new This_Month());
        fragmentList.add(new This_Year());
        FragmentPagerAdapter pagerAdapter = new FragmentPageAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOnPageChangeListener(this);
    }

}
