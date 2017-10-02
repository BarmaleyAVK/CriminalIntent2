package com.example.korotaevav.criminalintent2;

import android.app.Fragment;

/**
 * Created by korotaevav on 02.10.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
