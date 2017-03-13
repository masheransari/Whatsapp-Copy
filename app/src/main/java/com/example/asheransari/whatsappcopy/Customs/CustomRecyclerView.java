package com.example.asheransari.whatsappcopy.Customs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by asher.ansari on 3/11/2017.
 */

public class CustomRecyclerView extends RecyclerView {
    Context context;

    public CustomRecyclerView(Context context) {
        super(context);
        this.context = context;
    }

    public CustomRecyclerView(Context context, AttributeSet attr){
        super(context,attr);
    }

    public CustomRecyclerView(Context context, AttributeSet attr, int defStyle){
        super(context, attr, defStyle);
    }

    @Override
    public boolean fling(int velocityX, int velocityY) {
        velocityY *= 0.7;
        return super.fling(velocityX, velocityY);
    }
}
