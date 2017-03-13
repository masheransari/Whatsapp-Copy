package com.example.asheransari.whatsappcopy;

import android.support.design.widget.TabLayout;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.asheransari.whatsappcopy.Adapter.CategoryAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        ViewPager viewPager = (ViewPager)findViewById(R.id.materialup_viewPager);

        CategoryAdapter adapter = new CategoryAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
//        final MenuItem searchItem = menu.findItem(R.id.action_search);
//        if (searchItem != null) {
//            searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
//        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId()){

            case R.id.action_search:
//                final MenuItem searchItem = item.findItem(R.id.action_search);
                Toast.makeText(this, "search is Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.messageId:
                Toast.makeText(this, "Message is Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settingId:
                Toast.makeText(this, "Setting is Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.newId:
                Toast.makeText(this, "New Group is Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.broadCastId:
                Toast.makeText(this, "New Broadcast is Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.webId:
                Toast.makeText(this, "Whatsapp Web is Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.starId:
                Toast.makeText(this, "Starred Message is Selected", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
