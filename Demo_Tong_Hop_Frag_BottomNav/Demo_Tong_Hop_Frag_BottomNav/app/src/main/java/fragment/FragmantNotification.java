package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.R;

import java.util.ArrayList;
import java.util.List;

import adapter.MessageAdapter;
import model.Message;

public class FragmantNotification extends Fragment {
    MessageAdapter messageAdapter;
    RecyclerView recyclerView;
    List<Message> list;

    public FragmantNotification() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noti,container, false);
        list = new ArrayList<>();
        list.add(new Message(R.drawable.cat,"Thanh","Em ăn cơm chưa","15:30"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Rồi","19:30"));
        list.add(new Message(R.drawable.cat,"Thanh","Giờ mới rep thì chắc ăn tối rồi hihi","19:31"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Dạ","21:30"));
        list.add(new Message(R.drawable.cat,"Thanh","E mắc nghủ chưa","21:31"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Đã seen","8:30"));
        list.add(new Message(R.drawable.cat,"Thanh","Em ăn cơm chưa","15:30"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Rồi","19:30"));
        list.add(new Message(R.drawable.cat,"Thanh","Giờ mới rep thì chắc ăn tối rồi hihi","19:31"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Dạ","21:30"));
        list.add(new Message(R.drawable.cat,"Thanh","E mắc nghủ chưa","21:31"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Đã seen","8:30"));
        list.add(new Message(R.drawable.cat,"Thanh","Em ăn cơm chưa","15:30"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Rồi","19:30"));
        list.add(new Message(R.drawable.cat,"Thanh","Giờ mới rep thì chắc ăn tối rồi hihi","19:31"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Dạ","21:30"));
        list.add(new Message(R.drawable.cat,"Thanh","E mắc nghủ chưa","21:31"));
        list.add(new Message(R.drawable.cobetocnau,"Kim","Đã seen","8:30"));

        recyclerView = view.findViewById(R.id.recylcerView);
        LinearLayoutManager manager = new LinearLayoutManager(view.getContext(), recyclerView.VERTICAL,false);
        messageAdapter = new MessageAdapter(view.getContext(),list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(messageAdapter);

         return view;
    }
}
