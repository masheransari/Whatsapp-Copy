package com.example.asheransari.whatsappcopy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asheransari.whatsappcopy.Adapter.WordAdapter;
import com.example.asheransari.whatsappcopy.Customs.CustomRecyclerView;
import com.example.asheransari.whatsappcopy.variableClass.VariableClass;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 3/11/2017.
 */

public class Chats extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.word_list,container,false);

        final ArrayList<VariableClass> arrayList = new ArrayList<>();
//        arrayList.add(new VariableClass("M. Asher Ansari","i'll call you back",R.drawable.a1));

        arrayList.add(new VariableClass("me","i'll call you back",R.drawable.user1));
        arrayList.add(new VariableClass("Uni Hamza","Asher me nhe aounga, Zara dekh lena..",R.drawable.user2));
        arrayList.add(new VariableClass("Shery Uni","Git combine status??",R.drawable.user4));
        arrayList.add(new VariableClass("uni nabeel","Where are you all guys, already 9p.m has been done",R.drawable.user5));
        arrayList.add(new VariableClass("uni rafay","Asher..??",R.drawable.user6));
        arrayList.add(new VariableClass("uni Ammar","Asher bat suno...",R.drawable.user7));
        arrayList.add(new VariableClass("Zeeshan Bhai","Asher bhai ap ready ho jae me ur shery a rhe hai",R.drawable.user3));
        arrayList.add(new VariableClass("uni usama","asher batao abhi tujay...",R.drawable.user8));
        arrayList.add(new VariableClass("school ashar","asher kabhi hum se bhe mil liya kro",R.drawable.user9));
        arrayList.add(new VariableClass("school hussain","dinner pe ja rhe hai paisy leke ana...",R.drawable.user10));

        WordAdapter wordAdapter = new WordAdapter(getActivity(),arrayList);
        CustomRecyclerView recyclerView = (CustomRecyclerView) rootView.findViewById(R.id.recyclerView);

        CustomRecyclerView.LayoutManager manager = new GridLayoutManager(this.getContext(),1);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        //yeh additional lagaya hai,,,
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        //this is additional....
        recyclerView.setAdapter(wordAdapter);

        return rootView;
    }
}
