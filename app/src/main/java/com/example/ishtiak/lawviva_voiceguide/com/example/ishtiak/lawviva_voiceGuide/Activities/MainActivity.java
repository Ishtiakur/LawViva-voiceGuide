package com.example.ishtiak.lawviva_voiceguide.com.example.ishtiak.lawviva_voiceGuide.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.ishtiak.lawviva_voiceguide.R;
/*import com.example.ishtiak.lawviva_voiceguide.fragment.Foujdari_karjobidhi_fragment;*/

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView lv;




  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);




      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        FragmentManager fragmentManager = getSupportFragmentManager();


        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_foujdari_karjobidhi) {
           /* fragmentManager.beginTransaction().replace(R.id.contentMainFrame,
                    new Foujdari_karjobidhi_fragment()).commit();*/
            Intent i=new Intent(this,Foujdari_karjobidhi.class);
            startActivity(i);
/**/
        } else if (id == R.id.nav_foujdari_dondobidhi) {

        } else if (id == R.id.nav_dewani_karjobidhi) {

        } else if (id == R.id.nav_prothikar_ain) {

        } else if (id == R.id.nav_foujdari_karjobidhi_1898) {

        } else if (id == R.id.nav_dondobidhi_1860) {

        }else if (id == R.id.nav_sakko_ain) {

        }else if (id == R.id.nav_tamadi_ain) {

        }else if (id == R.id.nav_court_ain_1870) {

        }
        else if (id == R.id.nav_artho_rin_ain) {

        }else if (id == R.id.nav_shrom_ain_2006) {

        }else if (id == R.id.nav_moukhik_viva) {

        }else if (id == R.id.nav_pdf_book) {

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
