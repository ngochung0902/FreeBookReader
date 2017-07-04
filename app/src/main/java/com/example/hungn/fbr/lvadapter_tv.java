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
 * Created by hungn on 4/7/2017.
 */

public class lvadapter_tv extends BaseAdapter {
    private Context context;
    private ArrayList<itemlv_tv> arritem;

    public lvadapter_tv(Context context, ArrayList<itemlv_tv> arr)
    {
        this.context = context;
        this.arritem = arr;
    }
    @Override
    public int getCount() {
        if (arritem!=null)
            return arritem.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemthuviennext,parent,false);

        ImageView img = (ImageView) rowView.findViewById(R.id.imageView);
        TextView tvchuto = (TextView) rowView.findViewById(R.id.tvchuto);
        TextView tvchunho = (TextView) rowView.findViewById(R.id.tvchunho);

        itemlv_tv itlv = arritem.get(position);
        img.setImageResource(itlv.getAnh());
        tvchuto.setText(itlv.getChuto());
        tvchunho.setText(itlv.getChunho());
        return rowView;
    }
}
