package cafe;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CafeViewPageAdapter extends FragmentStatePagerAdapter {

    public CafeViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm,behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new FragmentCuli();
            case 1: return new Fragmentmoka();
            case 2: return new fragmentrobusta();
            default:return new FragmentCuli();
        }
    }

    @Override
    public int getCount() {

        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "CULI";
            case 1: return "MOKA";
            case 2: return "ROBUSTA";
            default: return "CULI";
        }
    }
}
