package com.example.asheransari.whatsappcopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView ;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.asheransari.whatsappcopy.Adapter.CallAdapter;
import com.example.asheransari.whatsappcopy.Customs.CustomRecyclerView;
import com.example.asheransari.whatsappcopy.Customs.CustomRecyclerView  ;
import com.example.asheransari.whatsappcopy.variableClass.CallsVariableClass;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 3/11/2017.
 */

public class Calls extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v  = inflater.inflate(R.layout.word_list,container,false);

        final ArrayList<CallsVariableClass> arrayList = new ArrayList<>();

        arrayList.add(new CallsVariableClass(R.drawable.user1,"me", "Yesterday, 10:24 P.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user4,"Shery Uni", "Tomorrow, 11:49 P.M",R.drawable.green_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user6,"uni rafay", "Tomorrow, 10:02 P.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user2,"Uni Hamza", "March 9, 2017, 06:24 A.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user2,"Uni Hamza", "March 9, 2017, 05:55 P.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user3,"Zeeshan Bhai", "March 7, 2017, 11:24 A.M",R.drawable.green_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user1,"me", "March 6, 2017, 1:24 P.M",R.drawable.green_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user8,"uni usama", "March 6, 2017, 10:24 A.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user9,"school ashar", "March 5, 2017, 4:02 P.M",R.drawable.green_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user7,"uni Ammar", "March 4, 2017, 10:24 A.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user4,"Shery Uni", "March 4, 2017, 9:20 A.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user9,"school ashar", "Feburary 28, 2017, 12:24 P.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user5,"uni nabeel", "Feburary 28, 8:08 A.M",R.drawable.green_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user5,"uni nabeel", "Feburary 26, 6:36 P.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user10,"school hussain", "Feburary 26, 8:45 P.M",R.drawable.green_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user6,"uni rafay", "Feburary 25, 10:24 P.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user2,"Uni Hamza", "Feburary 25, 4:24 P.M",R.drawable.green_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user7,"uni Ammar", "Feburary 24, 10:24 P.M",R.drawable.red_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user1,"me", "Feburary 24, 05:24 A.M",R.drawable.green_arrow));
        arrayList.add(new CallsVariableClass(R.drawable.user10,"school hussain", "Feburary 24, 06:24 A.M",R.drawable.red_arrow));

        CallAdapter adapter = new CallAdapter(getActivity(),arrayList);
//        ListView listView = (ListView)v.findViewById(R.id.listView);
//        listView.setAdapter(adapter);
        CustomRecyclerView recyclerView  = (CustomRecyclerView)v.findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager manager = new GridLayoutManager(this.getContext(),1);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

//        CustomRecyclerView.LayoutManager manager = new GridLayoutManager(this.getContext(),1);
//

        return v;
    }

}
