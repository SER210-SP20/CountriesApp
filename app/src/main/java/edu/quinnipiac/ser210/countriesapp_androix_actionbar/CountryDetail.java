package edu.quinnipiac.ser210.countriesapp_androix_actionbar;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
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
        super.onStart();
        View view = getView();
        if( view != null && countryId!=-1){
            TextView countyFact = (TextView) view.findViewById(R.id.textView);
            countyFact.setText(Country.countries[countryId].getFact());

            ImageView countryMap =(ImageView) view.findViewById(R.id.imageView);
            countryMap.setImageResource(Country.countries[countryId].getMap());


        }
    }
}
