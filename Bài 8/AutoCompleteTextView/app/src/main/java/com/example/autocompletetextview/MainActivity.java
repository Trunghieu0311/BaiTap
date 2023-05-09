package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTV);

        String[] countries = getResources().getStringArray(R.array.Countries);
        CountryAdapter countryAdapter = new CountryAdapter(this, R.layout.layout_custom, getListContries());
        autoCompleteTextView.setAdapter(countryAdapter);
    }

    private List<Country> getListContries() {
        List<Country> list = new ArrayList<>();
        list.add(new Country("VietNam"));
        list.add(new Country("Venezuela"));
        list.add(new Country("Vanuatu"));
        return list;
    }
}