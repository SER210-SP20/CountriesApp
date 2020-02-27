package ser210.quinnipiac.edu.countriesapp;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

    private int countryId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        countryId = getIntent().getExtras().getInt("countryId");

      
    }
}
