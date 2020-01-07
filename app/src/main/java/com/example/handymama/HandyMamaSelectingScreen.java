package com.example.handymama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HandyMamaSelectingScreen extends AppCompatActivity {
ArrayList<HandyMamaData> handyMamaData;
private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation);

        toolbar =  findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.menuwhite);
        actionBar.setDisplayHomeAsUpEnabled(true);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        final NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        if (navigationView != null){
            setupDrawerContent(navigationView);
        }

        ImageView imageView = findViewById(R.id.imageProfile);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HandyMamaSelectingScreen.this, Profile.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView = findViewById(R.id.handyMamaRecycler);
        handyMamaData = new ArrayList<>();

        handyMamaData.add(new HandyMamaData(R.drawable.cleaningservice,"Cleaning Service"));
        handyMamaData.add(new HandyMamaData(R.drawable.plumbingservice,"Plumbing Service"));
        handyMamaData.add(new HandyMamaData(R.drawable.paintingservice,"Painting Service"));
        handyMamaData.add(new HandyMamaData(R.drawable.packandshift,"Pack and Shift"));
        handyMamaData.add(new HandyMamaData(R.drawable.computerservicing,"Pest Control"));
        handyMamaData.add(new HandyMamaData(R.drawable.carpentry,"Carpentry"));
        handyMamaData.add(new HandyMamaData(R.drawable.computerservicing,"Property Management"));
        handyMamaData.add(new HandyMamaData(R.drawable.laundaryservice,"Laundry Service"));
        handyMamaData.add(new HandyMamaData(R.drawable.electricalservice,"Electrical Service"));
        handyMamaData.add(new HandyMamaData(R.drawable.acservicing,"AC Service"));
        handyMamaData.add(new HandyMamaData(R.drawable.homeappliencesservice,"Home Appliences Service"));
        handyMamaData.add(new HandyMamaData(R.drawable.computerservicing,"Computer Servicing"));

        handyMamaData.add(new HandyMamaData(R.drawable.homeappliencesservice,"Home Appliences Service"));
        handyMamaData.add(new HandyMamaData(R.drawable.computerservicing,"Computer Servicing"));



        HandyMamaAdapter objAdapter = new HandyMamaAdapter(this,handyMamaData, this.handyMamaData);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(HandyMamaSelectingScreen.super.getApplicationContext(),2, GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(objAdapter);
    }

    public boolean onPrepareOptionsMenu(Menu menu){
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(

                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                        int id = menuItem.getItemId();
                        switch (id){
                            case R.id.add_account:
                                Intent intent1 = new Intent(HandyMamaSelectingScreen.this, RegistrationScreen.class);
                                startActivity(intent1);
                                break;

                            case R.id.logout:
                                Intent intent = new Intent(HandyMamaSelectingScreen.this, LoginScreen.class);
                                startActivity(intent);
                                break;

                        }
                        menuItem.setChecked(true);
                        drawerLayout.closeDrawers();
                        return false;
                    }
                });
    }
}
