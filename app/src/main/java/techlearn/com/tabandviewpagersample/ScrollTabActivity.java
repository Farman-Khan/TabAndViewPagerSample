package techlearn.com.tabandviewpagersample;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScrollTabActivity extends AppCompatActivity {

    ViewPager pager;

    int PAGE_COUNT=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tab);

        pager= (ViewPager) findViewById(R.id.pager_scroll);

        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), PAGE_COUNT));
    }
}
