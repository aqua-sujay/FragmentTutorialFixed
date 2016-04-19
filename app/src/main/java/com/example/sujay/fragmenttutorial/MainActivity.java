package com.example.sujay.fragmenttutorial;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * Created by aqua on 4/19/2016.
 */
public class MainActivity extends Activity {
    public void onCreate(Bundle savedInstance)
    {



        super.onCreate(savedInstance);
        setContentView(R.layout.main_activity_layout);
       fragmentAlpha falpha=new fragmentAlpha();
        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
          transaction.add(R.id.fragalpha,falpha,"falpha");
         transaction.addToBackStack("falpha");
         transaction.commit();
    }

}
