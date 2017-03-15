package com.example.asheransari.whatsappcopy;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asheransari.whatsappcopy.Adapter.ContactAdapter;
import com.example.asheransari.whatsappcopy.Customs.CustomRecyclerView;
import com.example.asheransari.whatsappcopy.variableClass.ContactVariableClass;

import java.util.ArrayList;

/**
 * Created by asher.ansari on 3/11/2017.
 */

public class Contacts extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.word_list,container,false);

        ArrayList<ContactVariableClass> classes = new ArrayList<>();

        classes.add(new ContactVariableClass(R.drawable.user1,"me","Busy",true));
        classes.add(new ContactVariableClass(R.drawable.user2,"Uni Hamza","Always be happy and Shine",true));
        classes.add(new ContactVariableClass(R.drawable.user4,"Uni Shery","only Believe to Allah",true));
        classes.add(new ContactVariableClass(R.drawable.user6,"Uni Rafay","Good One",true));
        classes.add(new ContactVariableClass(R.drawable.user5,"Uni Nabeel","Every Thing is Good",true));
        classes.add(new ContactVariableClass(R.drawable.user7,"Uni Ammar","Car Finder",true));
        classes.add(new ContactVariableClass(R.drawable.user3,"Zeeshan Bhai","Bismillah Hir rahman Hir Rahim",true));
        classes.add(new ContactVariableClass(R.drawable.user8,"Uni usama","Its Holiday Time",true));
        classes.add(new ContactVariableClass(R.drawable.user9,"School asher","Believe YourSelf",true));
        classes.add(new ContactVariableClass(R.drawable.user10,"school hussain","Speak Truth",true));
        classes.add(new ContactVariableClass("Uzair Asghar","",false));
        classes.add(new ContactVariableClass("Shoaib Coaching","No Status",false));
        classes.add(new ContactVariableClass("Yaseen Coaching","Hmm",false));
        classes.add(new ContactVariableClass("Ibrahim Saylani","Show yourSelf",false));
        classes.add(new ContactVariableClass("Yaqoob bhai","Nothing to Commit..",false));
        classes.add(new ContactVariableClass("Aijaz-ul-haq","Busy",false));

        ContactAdapter adapter = new ContactAdapter(getActivity(),classes);
        CustomRecyclerView recyclerView = (CustomRecyclerView)v.findViewById(R.id.recyclerView);

        CustomRecyclerView.LayoutManager manager =new GridLayoutManager(this.getContext(),1);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerView.setAdapter(adapter);

        return v;

    }
}
