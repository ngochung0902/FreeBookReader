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
 * Created by hungn on 4/13/2017.
 */

public class lvadapter_mtv_fbn_fsp extends BaseAdapter {
    private Context context_mtv_fbn_fsp;
    private ArrayList<itemlv_mtv_fbn_fsp> arritem_mtv_fbn_fsp;

    public lvadapter_mtv_fbn_fsp(Context context_mtv_fbn_fsp, ArrayList<itemlv_mtv_fbn_fsp> arritem_mtv_fbn_fsp) {
        this.context_mtv_fbn_fsp = context_mtv_fbn_fsp;
        this.arritem_mtv_fbn_fsp = arritem_mtv_fbn_fsp;
    }

    @Override
    public int getCount() {
        if (arritem_mtv_fbn_fsp!=null)
            return arritem_mtv_fbn_fsp.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_mtv_fbn_fsp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_mtv_fbn_fsp).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemfreesamples,parent,false);

        ImageView img_mtv_fbn_fsp = (ImageView) rowView.findViewById(R.id.img_mtv_fbn_fsp);
        TextView tvchuto_mtv_fbn_fsp = (TextView) rowView.findViewById(R.id.tvchunho_mtv_fbn_fsp);
        TextView tvchunho_mtv_fbn_fsp = (TextView) rowView.findViewById(R.id.tvchuto_mtv_fbn_fsp);

        itemlv_mtv_fbn_fsp itlv = arritem_mtv_fbn_fsp.get(position);
        img_mtv_fbn_fsp.setImageResource(itlv.getAnh_mtv_fbn_fsp());
        tvchuto_mtv_fbn_fsp.setText(itlv.getChuto_mtv_fbn_fsp());
        tvchunho_mtv_fbn_fsp.setText(itlv.getChunho_mtv_fbn_fsp());
        return rowView;
    }
}
