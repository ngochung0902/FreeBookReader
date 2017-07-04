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

public class lvadapter_mtv_mnbn_au extends BaseAdapter {
    private Context context_mtv_mnbn_au;
    private ArrayList<itemlv_mtv_mnbn_au> arritem_mtv_mnbn_au;

    public lvadapter_mtv_mnbn_au(Context context_mtv_mnbn_au, ArrayList<itemlv_mtv_mnbn_au> arritem_mtv_mnbn_au) {
        this.context_mtv_mnbn_au = context_mtv_mnbn_au;
        this.arritem_mtv_mnbn_au = arritem_mtv_mnbn_au;
    }

    @Override
    public int getCount() {
        if (arritem_mtv_mnbn_au!=null)
            return arritem_mtv_mnbn_au.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_mtv_mnbn_au.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_mtv_mnbn_au).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemauthorsnext,parent,false);

        ImageView img_mtv_mnbn_au = (ImageView) rowView.findViewById(R.id.img_mnbn_au);
        TextView tvchuto_mtv_mnbn_au = (TextView) rowView.findViewById(R.id.tvchunho_mnbn_au);
        TextView tvchunho_mtv_mnbn_au = (TextView) rowView.findViewById(R.id.tvchuto_mnbn_au);

        itemlv_mtv_mnbn_au itlv = arritem_mtv_mnbn_au.get(position);
        img_mtv_mnbn_au.setImageResource(itlv.getAnh_mtv_mnbn_au());
        tvchuto_mtv_mnbn_au.setText(itlv.getChuto_mtv_mnbn_au());
        tvchunho_mtv_mnbn_au.setText(itlv.getChunho_mtv_mnbn_au());
        return rowView;
    }
}
