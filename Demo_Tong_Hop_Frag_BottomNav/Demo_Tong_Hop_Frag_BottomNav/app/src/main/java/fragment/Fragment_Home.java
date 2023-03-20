package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.test.R;

import java.util.ArrayList;

import adapter.FlagAdapter;
import model.Flag;

public class Fragment_Home extends Fragment {

    public Fragment_Home() {
    }
    ListView list;
    ArrayList<Flag> arrayList;
    FlagAdapter flagAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container, false);
        list = view.findViewById(R.id.list);
        arrayList = Flag.initFlag();
        flagAdapter = new FlagAdapter(view.getContext(), R.layout.layout_row,arrayList);
        list.setAdapter(flagAdapter);
        return view;
    }
}
