package com.example.asheransari.whatsappcopy.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asheransari.whatsappcopy.R;
import com.example.asheransari.whatsappcopy.variableClass.ContactVariableClass;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by asher.ansari on 3/15/2017.
 */

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.myViewHolder> {

    private Context mContext;
    private List<ContactVariableClass> variableClasses;

    public ContactAdapter(Context mContext, List<ContactVariableClass> variableClasses) {
        this.mContext = mContext;
        this.variableClasses = variableClasses;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return null;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_item,parent,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        final ContactVariableClass aClass = variableClasses.get(position);

//        Picasso.with(mContext).load(aClass.getImagePath()).fit().into(holder.circleImage);
        holder.name.setText(aClass.getName());
        holder.slogan.setText(aClass.getSlogan());
//        Log.e("",""+);
        if(aClass.isImage()){
            Picasso.with(mContext).load(aClass.getImagePath()).fit().into(holder.circleImage);
        }
        else{
            Picasso.with(mContext).load(R.drawable.unknown).fit().into(holder.circleImage);
        }

    }

    @Override
    public int getItemCount() {
        return variableClasses.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView circleImage;
        //circleImageView
        TextView name,slogan;//name_contact_list,slogan_contact_list
        public myViewHolder(View itemView) {
            super(itemView);
            circleImage = (ImageView)itemView.findViewById(R.id.circleImageView);
            name = (TextView)itemView.findViewById(R.id.name_contact_list);
            slogan = (TextView)itemView.findViewById(R.id.slogan_contact_list);


        }
    }
}
