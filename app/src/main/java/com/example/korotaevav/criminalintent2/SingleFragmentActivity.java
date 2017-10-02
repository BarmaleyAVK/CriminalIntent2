package com.example.korotaevav.criminalintent2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by korotaevav on 02.10.2017.
 */

public abstract class SingleFragmentActivity extends Activity {

    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getFragmentManager();
        Fragment frag = fm.findFragmentById(R.id.fragmentContainer);

        if (frag == null) {
            frag = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, frag)
                    .commit();
        }
    }

}
