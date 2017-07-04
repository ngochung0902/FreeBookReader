package com.example.hungn.fbr;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hungn on 4/12/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position){
            case 0:
                frag= new htbnext1();
                break;
            case 1:
                frag= new htbnext2();
                break;
            case 2:
                frag= new htbnext3();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
