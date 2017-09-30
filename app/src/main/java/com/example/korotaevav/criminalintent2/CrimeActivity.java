package com.example.korotaevav.criminalintent2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class CrimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.fragmentContainer);

        if (frag == null) {
            frag = new CrimeFragment();
            fm.beginTransaction()
                .add(R.id.fragmentContainer, frag)
                .commit();
        }
    }
}
