package com.example.themenubar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

public class SecondLayout extends Fragment {
   View v;
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.second_layout, container, false);
        return v;
    }
}
