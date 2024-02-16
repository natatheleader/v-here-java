package com.redemption.v_here;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.redemption.v_here.fragment.main.addFragment;
import com.redemption.v_here.fragment.main.exploreFragment;
import com.redemption.v_here.fragment.main.homeFragment;
import com.redemption.v_here.fragment.main.profileFragment;
import com.redemption.v_here.fragment.main.settingFragment;

public class WelcomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    TextView text;
    String provider;

    BottomNavigationView bottomNavigationView;

    homeFragment homeFragment = new homeFragment();
    exploreFragment exploreFragment = new exploreFragment();
    addFragment chatsFragment = new addFragment();
    profileFragment profileFragment = new profileFragment();
    settingFragment settingFragment = new settingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(WelcomeActivity.this);
        bottomNavigationView.setSelectedItemId(R.id.home);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, homeFragment)
                        .commit();
                return true;
            case R.id.explore:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, exploreFragment)
                        .commit();
                return true;
            case R.id.add_new:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, chatsFragment)
                        .commit();
                return true;
            case R.id.profile:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, profileFragment)
                        .commit();
                return true;
            case R.id.settings:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.flFragment, settingFragment)
                        .commit();
                return true;
        }
        return false;
    }
}