package com.example.gowtham.multiplescreen;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gowtham on 18-08-2015.
 */
public class DetailsFragment extends Fragment {

    TextView txtname;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.list_fragment,container,false);
        txtname=(TextView)view.findViewById(R.id.txt_name);
        return view;
    }
    public void copyname(String name){
        txtname.setText(name);

    }
}