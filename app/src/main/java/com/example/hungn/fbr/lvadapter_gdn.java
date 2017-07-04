package com.example.hungn.fbr;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hungn on 4/12/2017.
 */

public class lvadapter_gdn extends BaseAdapter{
    private Context context_gdn;
    private ArrayList<itemlv_gdn> arritem_gdn;

    public lvadapter_gdn(Context context, ArrayList<itemlv_gdn> arr)
    {
        this.context_gdn = context;
        this.arritem_gdn = arr;
    }

    @Override
    public int getCount() {
        if (arritem_gdn!=null)
            return arritem_gdn.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_gdn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_gdn).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemgandaynext,parent,false);

        ImageView img_gdn = (ImageView) rowView.findViewById(R.id.img_gdn);
        TextView tvchuto_gdn = (TextView) rowView.findViewById(R.id.tvchunho_gdn);
        TextView tvchunho_gdn = (TextView) rowView.findViewById(R.id.tvchuto_gdn);

        itemlv_gdn itlv = arritem_gdn.get(position);
        img_gdn.setImageResource(itlv.getAnh_gdn());
        tvchuto_gdn.setText(itlv.getChuto_gdn());
        tvchunho_gdn.setText(itlv.getChunho_gdn());
        return rowView;
    }
}

