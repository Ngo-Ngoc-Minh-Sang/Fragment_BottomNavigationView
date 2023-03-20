package model;

import com.example.test.R;

import java.util.ArrayList;

public class Flag {
    int id;
    String name;

    public Flag(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList initFlag(){
        ArrayList<Flag> arrayList = new ArrayList<>();
        arrayList.add(new Flag(R.drawable.vietnam, "Viet Nam"));
        arrayList.add(new Flag(R.drawable.ecuqdor, "Ecuador"));
        arrayList.add(new Flag(R.drawable.france, "France"));
        arrayList.add(new Flag(R.drawable.italy, "Italy"));
        arrayList.add(new Flag(R.drawable.laos, "Laos"));
        arrayList.add(new Flag(R.drawable.vietnam, "Viet Nam"));
        arrayList.add(new Flag(R.drawable.ecuqdor, "Ecuador"));
        arrayList.add(new Flag(R.drawable.france, "France"));
        return arrayList;
    }

}
