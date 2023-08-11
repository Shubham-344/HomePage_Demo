package com.example.homepage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.homepage.ui.ItemModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    ViewPager mViewPager;
    int[] images = {R.drawable.poster, R.drawable.poster2, R.drawable.poster3, R.drawable.poster4,
            R.drawable.poster5, R.drawable.poster1};
    ViewPagerAdapter mViewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ItemModel> arrItem = new ArrayList<>();
        RecyclerView recyclerView;
        RecyclerContactAdapter adapter;
        Toolbar toolbar;
        EditText search_bar;
        ImageView login1;
        login1 = findViewById(R.id.login1);
        recyclerView = findViewById(R.id.recyclerview);
        search_bar = findViewById(R.id.search_bar);
        Dialog dialog =  new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.activity_dialogbox);
        search_bar.setSelection(0);
        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);
        mViewPagerAdapter = new ViewPagerAdapter(MainActivity.this, images);
        mViewPager.setAdapter(mViewPagerAdapter);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });

        arrItem.add(new ItemModel(R.drawable.item,"a","999"));
        arrItem.add(new ItemModel(R.drawable.item,"b","888"));
        arrItem.add(new ItemModel(R.drawable.item,"c","777"));
        arrItem.add(new ItemModel(R.drawable.item,"d","666"));
        arrItem.add(new ItemModel(R.drawable.item,"e","555"));
        arrItem.add(new ItemModel(R.drawable.item,"g","444"));
        arrItem.add(new ItemModel(R.drawable.item,"h","333"));
        arrItem.add(new ItemModel(R.drawable.item,"i","222"));
        arrItem.add(new ItemModel(R.drawable.item,"j","111"));
        arrItem.add(new ItemModel(R.drawable.item,"k","222"));
        arrItem.add(new ItemModel(R.drawable.item,"l","333"));
        arrItem.add(new ItemModel(R.drawable.item,"m","444"));
        arrItem.add(new ItemModel(R.drawable.item,"n","333"));
        arrItem.add(new ItemModel(R.drawable.item,"o","555"));
        arrItem.add(new ItemModel(R.drawable.item,"p","666"));
        arrItem.add(new ItemModel(R.drawable.item,"q","777"));
        arrItem.add(new ItemModel(R.drawable.item,"r","888"));
        arrItem.add(new ItemModel(R.drawable.item,"s","444"));
        arrItem.add(new ItemModel(R.drawable.item,"t","999"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapter = new RecyclerContactAdapter(MainActivity.this, arrItem);

        recyclerView.setAdapter(adapter);

//toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }
        toolbar.setTitle("My Toolbar");
        toolbar.setTitle("subtitle");
    }

    //step4
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.oot_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //step5
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemid = item.getItemId();
        if(itemid==R.id.login){
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
            Dialog dialog =  new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.activity_dialogbox);
            dialog.show();
        } else if (itemid == R.id.opt_open) {
            Toast.makeText(this, "Report", Toast.LENGTH_SHORT).show();
        } else if (itemid == R.id.opt_save) {
            Toast.makeText(this, "Contact us", Toast.LENGTH_SHORT).show();
        } else {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
}
}
