package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.test.R;

import java.util.ArrayList;

import fragment.Fragment_Home;
import model.Flag;

public class FlagAdapter extends ArrayAdapter {
    Context context;
    ArrayList<Flag> arrayList;
    int layout;


    public FlagAdapter(@NonNull Context context, int resource, @NonNull
    ArrayList<Flag> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.layout = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull
    ViewGroup parent) {
        Flag flag = arrayList.get(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(layout,null);
        }
        ImageView img = convertView.findViewById(R.id.imageFlag);
        img.setImageResource(flag.getId());
        TextView txt = convertView.findViewById(R.id.flagName);
        txt.setText(flag.getName());
        return convertView;
    }
}
