package com.example.healthyminds;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.healthyminds.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

        FirebaseAuth auth;



//    private String[] drawerListViewItems;
//    private DrawerLayout drawerLayout;
//    private ListView drawerListView;
//    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();




//        drawerListViewItems = getResources().getStringArray(R.array.item);


//            binding.bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//             switch (item.getItemId()){
//                 case R.id.home:
//                     Intent i = new Intent(getApplicationContext(),HomeActivity.class);
//                     break;
//
//                 case R.id.meditate:
//                     Intent in = new Intent(getApplicationContext(), MeditateActivity.class);
//                     break;
//
//                 case R.id.member:
//                     Intent inte = new Intent(getApplicationContext(), MemberActivity.class);
//                     break;
//
//                 case R.id.profile:
//                     Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
//                     break;
//             }
//                return true;
//            }
//        });
    }

    }


