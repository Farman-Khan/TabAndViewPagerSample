package techlearn.com.tabandviewpagersample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ashish on 9/5/2016.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {
    int totalTabs;

    public MyPagerAdapter(FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FirstFragment firstFragment = new FirstFragment();
                return firstFragment;

            case 1:
                SecondFragment secondFragment = new SecondFragment();
                return secondFragment;

            case 2:
                ThirdFragment thirdFragment = new ThirdFragment();
                return thirdFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}