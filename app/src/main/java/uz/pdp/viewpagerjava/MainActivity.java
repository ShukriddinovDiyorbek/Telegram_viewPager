package uz.pdp.viewpagerjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import uz.pdp.viewpagerjava.adapter.ViewPagerAdapter;
import uz.pdp.viewpagerjava.fragments.CloudFragment;
import uz.pdp.viewpagerjava.fragments.FastFragment;
import uz.pdp.viewpagerjava.fragments.FreeFragment;
import uz.pdp.viewpagerjava.fragments.PowerfulFragment;
import uz.pdp.viewpagerjava.fragments.SecureFragment;
import uz.pdp.viewpagerjava.fragments.TelegramFragment;

public class MainActivity extends AppCompatActivity {
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.viewpager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new TelegramFragment());
        viewPagerAdapter.add(new FastFragment());
        viewPagerAdapter.add(new FreeFragment());
        viewPagerAdapter.add(new PowerfulFragment());
        viewPagerAdapter.add(new SecureFragment());
        viewPagerAdapter.add(new CloudFragment());

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}