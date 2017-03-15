package com.example.asheransari.whatsappcopy.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.asheransari.whatsappcopy.Calls;
import com.example.asheransari.whatsappcopy.Chats;
import com.example.asheransari.whatsappcopy.Contacts;
import com.example.asheransari.whatsappcopy.R;

/**
 * Created by asher.ansari on 3/11/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Calls();
        } else if (position == 1) {
            return new Chats();
        } else {
            return new Contacts();
        }
//        else{
//            return new Contacts();
//        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.calls);
        } else if (position == 1) {
            return mContext.getString(R.string.chats);
        } else {
            return mContext.getString(R.string.contact);
        }
    }

}
