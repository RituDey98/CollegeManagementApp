package com.ritudey.departmentmanagement.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.ritudey.departmentmanagement.Adapters.FragmentAdapter;
import com.ritudey.departmentmanagement.Fragments.AttendanceFragment;
import com.ritudey.departmentmanagement.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    //ViewPager mainViewPager;
    ViewPager2 viewPager2;
    TabLayout mainTabLayout;
    ArrayList<String> arrayList;
    FragmentAdapter fragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Views
        drawerLayout = findViewById(R.id.drawerLayout);
        toolbar=findViewById(R.id.toolbar);
        navigationView=findViewById(R.id.navigation_view);
        mainTabLayout=findViewById(R.id.main_tab_layout);
        viewPager2=findViewById(R.id.main_view_pager);




        //setting toolbar
        setSupportActionBar(toolbar);



        //Navigation Drawer
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);



        /**Adding View pager and Tab layout*/

        prepareViewPager(viewPager2);




    }






    private void prepareViewPager(ViewPager2 viewPager2) {
        //initializing main adapter
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentAdapter = new FragmentAdapter(fragmentManager,getLifecycle());
        viewPager2.setAdapter(fragmentAdapter);

        mainTabLayout.addTab(mainTabLayout.newTab().setText("Department"));
        mainTabLayout.addTab(mainTabLayout.newTab().setText("Attendance"));
        mainTabLayout.addTab(mainTabLayout.newTab().setText("Library"));

        mainTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
                Log.d(TAG, "onTabSelected: "+String.valueOf(tab.getPosition()));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                mainTabLayout.selectTab(mainTabLayout.getTabAt(position));
            }
        });
    }






    //Navigation drawer OnBackPressed
    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
      if(item.getItemId() == R.id.menu_notes){
          startActivity(new Intent(MainActivity.this,NotesActivity.class));
      }
        if(item.getItemId() == R.id.menu_notice){
            startActivity(new Intent(MainActivity.this,NoticeActivity.class));
        }
        if(item.getItemId() == R.id.menu_qna){
            startActivity(new Intent(MainActivity.this,QnaActivity.class));
        }
        if(item.getItemId() == R.id.menu_info){
            startActivity(new Intent(MainActivity.this,StudentInfoActivity.class));
        }
        return true;

    }




    //Settings icon

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    //setting menu onClickListener
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.settings)
        {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}