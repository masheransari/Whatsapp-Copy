package com.example.asheransari.whatsappcopy.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asheransari.whatsappcopy.R;
import com.example.asheransari.whatsappcopy.variableClass.VariableClass;
import com.squareup.picasso.Picasso;

import java.util.List;

import static com.example.asheransari.whatsappcopy.R.id.imageView;

/**
 * Created by asher.ansari on 3/11/2017.
 */
public class WordAdapter extends RecyclerView.Adapter<WordAdapter.myViewHolder>{
    private Context mContext;
//    private List<VariableClass> list;
    private List<VariableClass> variableClasses;
    public WordAdapter(Context mContext, List<VariableClass> variableClasses){
        this.mContext = mContext;
        this.variableClasses = variableClasses;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        final VariableClass variableClass = variableClasses.get(position);
//        holder.imageView.setImageResource(variableClass.getImageID());
//        Picasso.with(mContext).load(variableClass.getImageID()).fit().centerCrop()
//                .into();
        Picasso.with(mContext).load(variableClass.getImageID()).fit().into(holder.imageVi);
        holder.heading.setText(variableClass.getName());
        holder.detail.setText(variableClass.getDetail());

    }

    @Override
    public int getItemCount() {
        return variableClasses.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView imageVi;
        TextView heading, detail;

        public myViewHolder(View itemView) {
            super(itemView);
            imageVi = (ImageView)itemView.findViewById(R.id.imageView);
            heading = (TextView)itemView.findViewById(R.id.heading_list);
            detail = (TextView)itemView.findViewById(R.id.detail_list);
        }
    }
}

//public class WordAdapter extends ArrayAdapter<VariableClass> {
//    public WordAdapter(Context context, ArrayList<VariableClass> resource) {
//        super(context, 0, resource);
//    }
//    @Override
//    public View getView(int poition, View convertView, ViewGroup parent){
//        View rootView = convertView;
//        if(rootView == null)
//        {
//            rootView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
//        }
//        VariableClass variableClass = getItem(poition);
//        ImageView imageView = (ImageView)rootView.findViewById(R.id.image_list);
//        TextView heading = (TextView)rootView.findViewById(R.id.heading_list);
//        TextView detail = (TextView)rootView.findViewById(R.id.detail_list);
//
//        imageView.setImageResource(variableClass.getImageID());
//        heading.setText(variableClass.getName());
//        detail.setText(variableClass.getDetail());
//        return rootView;
//
//    }
//}
