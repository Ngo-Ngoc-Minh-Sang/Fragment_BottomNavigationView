package adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import fragment.FragmantNotification;
import fragment.FragmentCafe;
import fragment.Fragment_Home;
import fragment.Fragment_Saerch;

public class ViewPaperAdapter extends FragmentStatePagerAdapter {


    public ViewPaperAdapter(@NonNull FragmentManager fm, int behavior) {

        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Fragment_Home();
            case 1:
                return new FragmantNotification();
            case 2:
                return new Fragment_Saerch();
            case 3:
                return new FragmentCafe();
            default:
                return new Fragment_Home();
        }
    }

    @Override
    public int getCount() {

        return 4;
    }
}
