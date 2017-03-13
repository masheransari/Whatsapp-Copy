package com.example.asheransari.whatsappcopy.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asheransari.whatsappcopy.R;
import com.example.asheransari.whatsappcopy.variableClass.CallsVariableClass;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asher.ansari on 3/12/2017.
 */

//public class CallAdapter extends ArrayAdapter<CallsVariableClass> {
//
//
//    public CallAdapter(Activity context, ArrayList<CallsVariableClass> classes) {
//        super(context, 0, classes);
//
//    }
//
//    @Override
//    public View getView(int pos, View convertView, ViewGroup parent) {
//        View listItemView = convertView;
//        if (listItemView == null) {
//            Log.e("size",""+getItem(pos).getName());
//            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.call_list_item, parent, false);
//
//        }
//        CallsVariableClass aClass = getItem(pos);
//        ImageView circle, check;
//        TextView name, detail;
//
//        detail = (TextView) listItemView.findViewById(R.id.detail_call_list);
//        check = (ImageView) listItemView.findViewById(R.id.check_arrow_image);
//        circle = (ImageView) listItemView.findViewById(R.id.circle_call_list);
//        name = (TextView) listItemView.findViewById(R.id.name_call_list);
//        detail.setText(aClass.getDetail());
//        circle.setImageBitmap(
//                decodeSampledBitmapFromResource(listItemView.getResources(), aClass.getImagePath(), 70, 50));
////        Picasso.with(getContext()).load(aClass.getCheckColor()).fit().into(check);
////        Picasso.with(getContext()).load(aClass.getImagePath()).fit().into(circle);
//        name.setText(aClass.getName());
//
//
//        return listItemView;
//
//    }
//    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
//                                                         int reqWidth, int reqHeight) {
//
//        // First decode with inJustDecodeBounds=true to check dimensions
//        final BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inJustDecodeBounds = true;
//        BitmapFactory.decodeResource(res, resId, options);
//
//        // Calculate inSampleSize
//        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
//
//        // Decode bitmap with inSampleSize set
//        options.inJustDecodeBounds = false;
//        return BitmapFactory.decodeResource(res, resId, options);
//    }
//    public static int calculateInSampleSize(
//            BitmapFactory.Options options, int reqWidth, int reqHeight) {
//        // Raw height and width of image
//        final int height = options.outHeight;
//        final int width = options.outWidth;
//        int inSampleSize = 1;
//
//        if (height > reqHeight || width > reqWidth) {
//
//            final int halfHeight = height / 2;
//            final int halfWidth = width / 2;
//
//            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
//            // height and width larger than the requested height and width.
//            while ((halfHeight / inSampleSize) >= reqHeight
//                    && (halfWidth / inSampleSize) >= reqWidth) {
//                inSampleSize *= 2;
//            }
//        }
//
//        return inSampleSize;
//    }
//}

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.myViewHolder>{

    private Context mContext;
    private ArrayList<CallsVariableClass> variableClasses;

    public CallAdapter(Context mContext,ArrayList<CallsVariableClass> classes){
        this.variableClasses =classes;
        this.mContext = mContext;
    }
    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return null;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_list_item,parent,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        final CallsVariableClass variableClass = variableClasses.get(position);
        Log.e("Data",variableClasses.get(position).getName());
        holder.detail.setText(variableClass.getDetail());
        holder.name.setText(variableClass.getName());
        Picasso.with(mContext).load(variableClass.getImagePath()).fit().into(holder.circle);
        Picasso.with(mContext).load(variableClass.getCheckColor()).fit().into(holder.check);

    }

    @Override
    public int getItemCount() {
        return variableClasses.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder{
        ImageView circle, check;
        TextView name,detail;
        public myViewHolder(View itemView) {
            super(itemView);
            detail = (TextView)itemView.findViewById(R.id.detail_call_list);
            check = (ImageView)itemView.findViewById(R.id.check_arrow_image);
            circle = (ImageView)itemView.findViewById(R.id.circle_call_list);
            name = (TextView)itemView.findViewById(R.id.name_call_list);
        }
    }

}
//
//    private Context mContext;
//    private List<CallsVariableClass> variableClasses;
//
//    public CallAdapter(Context mContext, List<CallsVariableClass> classes){
//        this.mContext = mContext;
//        this.variableClasses = classes;
//        Log.e("size",""+variableClasses.size());
//    }
//
//    @Override
//    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
////        return null;
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_list_item,parent,false);
//
//        return new myViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(myViewHolder holder, int position) {
//        final CallsVariableClass variableClass = variableClasses.get(position);
//        Log.e("Data",variableClasses.get(position).getName());
//        holder.detail.setText(variableClass.getDetail());
//        holder.name.setText(variableClass.getName());
//        Picasso.with(mContext).load(variableClass.getImagePath()).fit().into(holder.circle);
//        Picasso.with(mContext).load(variableClass.getCheckColor()).fit().into(holder.check);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return variableClasses.size();
//    }
//
//
//    public class myViewHolder extends RecyclerView.ViewHolder{
//        ImageView circle, check;
//        TextView name,detail;
//        public myViewHolder(View itemView) {
//            super(itemView);
//            detail = (TextView)itemView.findViewById(R.id.detail_call_list);
//            check = (ImageView)itemView.findViewById(R.id.check_arrow_image);
//            circle = (ImageView)itemView.findViewById(R.id.circle_call_list);
//            name = (TextView)itemView.findViewById(R.id.name_call_list);
//        }
//    }
//
