package ser210.quinnipiac.edu.countriesapp;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CountryDetail extends Fragment {


    private int countryId;
    public CountryDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country_detail, container, false);
    }

    public void setCountryId(int countryId) {
        this.countryId= countryId;
    }

    @Override
    public void onStart() {
       
    }
}
