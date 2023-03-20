package cafe.test;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.test.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import adapter.FlagAdapter;
import adapter.ViewPaperAdapter;
import model.Flag;
import model.TranslateAnimationUtil;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;
    private ViewPager viewPager;
    ListView list;
    ArrayList<Flag> arrayList;
    FlagAdapter flagAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager = findViewById(R.id.viewPaper);
        navigationView = findViewById(R.id.navigation);

        viewPager.setOnTouchListener(new TranslateAnimationUtil(this, navigationView));

        ViewPaperAdapter adapter = new ViewPaperAdapter(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0: navigationView.getMenu().findItem(R.id.home).setChecked(true);
                        break;
                    case 1: navigationView.getMenu().findItem(R.id.noti).setChecked(true);
                        break;
                    case 2: navigationView.getMenu().findItem(R.id.search).setChecked(true);
                        break;
                    case 3: navigationView.getMenu().findItem(R.id.cafe).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.home:
                        viewPager.setCurrentItem(0);
                        break;
                    case  R.id.noti:
                        viewPager.setCurrentItem(1);
                        break;
                    case  R.id.search:
                        viewPager.setCurrentItem(2);
                        break;
                    case  R.id.cafe:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });
    }
}