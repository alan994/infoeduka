package hr.alanjagar.infoeduka.ui.drawer;

import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import hr.alanjagar.infoeduka.R;
import hr.alanjagar.infoeduka.backend.model.PersonalInfo;
import hr.alanjagar.infoeduka.backend.repository.MockRepository;
import hr.alanjagar.infoeduka.ui.news.NewsFragment;
import hr.alanjagar.infoeduka.ui.schedule.ScheduleFragment;

public class DrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.activity_drawer_drawer_layout)
    DrawerLayout drawer;

    @BindView(R.id.activity_drawer_nav_view)
    NavigationView navigationView;

    @BindView(R.id.activity_drawer_app_bar_toolbar)
    Toolbar toolbar;



    FragmentManager fragmentManager;

    PersonalInfo personalInfo = new MockRepository().getPersonalInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        this.fragmentManager = getSupportFragmentManager();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        NavHeader navHeader = new NavHeader(this.navigationView.getHeaderView(0));
        navHeader.setData(this.personalInfo.getImageUrl());

    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.activity_drawer_items_news) {
            showNews();
        } else if (id == R.id.activity_drawer_items_schedule) {
            showSchedule();
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void showNews(){
        NewsFragment newsFragment = new NewsFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity_drawer_content_frame_layout, newsFragment);
        fragmentTransaction.commit();
    }

    private void showSchedule(){
        ScheduleFragment scheduleFragment = new ScheduleFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity_drawer_content_frame_layout, scheduleFragment);
        fragmentTransaction.commit();
    }


    public class NavHeader {
        @BindView(R.id.activity_drawer_nav_header_iv_profile_picture)
        ImageView ivProfilePicture;

        public NavHeader(View view) {
            ButterKnife.bind(this, view);
        }

        public void  setData(String profilePictureUrl){
            Picasso.get().load(profilePictureUrl).into(ivProfilePicture);
        }
    }
}
