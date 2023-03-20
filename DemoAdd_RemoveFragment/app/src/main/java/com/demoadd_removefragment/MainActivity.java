package com.demoadd_removefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAddFragment, btnRemoveA, btnRemoveB, btnAddA, btnAddB, btnAddC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        addControls();
        btnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Fragment2 fragment2 = new Fragment2();
                    fragmentTransaction.add(R.id.frameLayout_1, fragment2, "fragmentB");
                    fragmentTransaction.commit();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, e.getMessage().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
        btnRemoveA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Fragment fragmentA = (Fragment) getSupportFragmentManager().findFragmentById(R.id.fragment1);
                    fragmentTransaction.remove(fragmentA);
                    fragmentTransaction.commit();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Không tìm thấy Fragment A!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btnRemoveB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Fragment2 fragment2 = (Fragment2) getSupportFragmentManager().findFragmentByTag("fragmentB");
                    fragmentTransaction.remove(fragment2);
                    fragmentTransaction.commit();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Không tìm thấy Fragment B!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    private void addControls(){
        btnAddFragment = (Button) findViewById(R.id.btnAddFragment);
        btnRemoveA = (Button) findViewById(R.id.btnRemoveA);
        btnRemoveB = (Button) findViewById(R.id.btnRemoveB);
        btnAddA = (Button) findViewById(R.id.btnAddA);
        btnAddB = (Button) findViewById(R.id.btnAddB);
        btnAddC = (Button) findViewById(R.id.btnAddC);
    }
    public void addFragmentA(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout_2, new Fragment1());
        fragmentTransaction.addToBackStack("FragmentA");
        fragmentTransaction.commit();
    }
    public void addFragmentB(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout_2, new Fragment2());
        fragmentTransaction.addToBackStack("FragmentB");
        fragmentTransaction.commit();
    }
    public void addFragmentC(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout_2, new Fragment3());
        fragmentTransaction.addToBackStack("FragmentC");
        fragmentTransaction.commit();
    }
    public void popFragmentA(View view){
        getSupportFragmentManager().popBackStack("FragmentA", 0);
    }
}