package com.json.demo_remove_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.nfc.Tag;
import android.os.Bundle;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void gotoDetail(String name)
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        //gửi dữ liệu sang detail bằng setArgument
        DetailFragment detailFragment=new DetailFragment();
        Bundle bundle=new Bundle();
        bundle.putString("object", name);//put user vào cái key
        detailFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.fragmentContainerView,detailFragment);
        fragmentTransaction.addToBackStack(DetailFragment.Tag);//chuyển các fragment muốn chuyển vào stack
        fragmentTransaction.commit();

    }
}