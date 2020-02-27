package edu.quinnipiac.ser210.countriesapp_androix_actionbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.widget.ShareActionProvider;


public class MainActivity extends AppCompatActivity implements CountryList.CountryListListener{

    ShareActionProvider provider;
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
            case R.id.share:
                // populate the share intent with data
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "This is a message for you");
                provider.setShareIntent(intent);
                break;
            default:
                return super.onOptionsItemSelected(item);

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

       /* MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) searchItem.getActionView(); */
        // Get the ActionProvider for later usage
        MenuItem shareItem =  menu.findItem(R.id.share);
        provider = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    public void itemClickedMoveToDetail(int position) {
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            CountryDetail countryDetail = new CountryDetail();
            countryDetail.setCountryId(position);
            ft.replace(R.id.fragment_container,countryDetail);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();


        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("countryid", position);
            startActivity(intent);
        }
    }
}