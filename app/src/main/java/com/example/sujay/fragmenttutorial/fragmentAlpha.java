package com.example.sujay.fragmenttutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by aqua on 4/19/2016.
 */
public class fragmentAlpha extends Fragment {
    public void onCreate(Bundle savedInstance)
    {
        super.onCreate(savedInstance);
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup parent,Bundle instance)
    {
       return inflater.inflate(R.layout.frgment_alpha_layout,parent,false);
    }
}
