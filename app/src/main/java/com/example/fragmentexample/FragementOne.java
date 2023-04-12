package com.example.fragmentexample;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragementOne extends Fragment {
    Button button;
    EditText text;
    FragementInterface frag;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        frag = (FragementInterface) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragement_one, container, false);
        button=view.findViewById(R.id.btn);
        text=view.findViewById(R.id.ed1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value= text.getText().toString();
                frag.getDataFromFragement(value);
            }
        });
        return view;
    }
}