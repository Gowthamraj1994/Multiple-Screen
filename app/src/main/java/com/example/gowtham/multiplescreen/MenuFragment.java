package com.example.gowtham.multiplescreen;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuFragment extends Fragment {

ListView listView;
    ArrayAdapter<String> adapter;
    String menu[];
    Personselected personselected;
    String test;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.menu_fragment,container,false);
        listView=(ListView)view.findViewById(R.id.list_data);
        menu=getResources().getStringArray(R.array.Menu_array);
        adapter=new ArrayAdapter<String>(getActivity(),R.layout.list_row,R.id.txt_sample,menu);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String personname=menu[position];
                personselected.selectedcandidate(personname);
            }
        });
        return  view;
    }
 public interface Personselected{
     public void selectedcandidate(String candidatename);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
       try{
           personselected=(Personselected)activity;
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
