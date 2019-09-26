package com.android.buttomtabbed.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.android.buttomtabbed.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class Fragment4 extends Fragment {
    TextView textView;


    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        textView = view.findViewById(R.id.section_label);

        return view;
    }
}