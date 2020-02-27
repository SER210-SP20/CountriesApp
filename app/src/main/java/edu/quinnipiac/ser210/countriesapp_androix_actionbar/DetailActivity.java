package edu.quinnipiac.ser210.countriesapp_androix_actionbar;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    private int countryId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)// Enabling Up / Back navigation
            actionBar.setDisplayHomeAsUpEnabled(true);


        countryId = getIntent().getExtras().getInt("countryid");

        CountryDetail frag = (CountryDetail) getSupportFragmentManager().findFragmentById(R.id.fragment_country_detail);
        frag.setCountryId(countryId);
      
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.refresh:
                Toast.makeText(this,"Refresh", Toast.LENGTH_SHORT).show();
                break;
            case R.id.location:
                break;
            case R.id.search:
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

}
