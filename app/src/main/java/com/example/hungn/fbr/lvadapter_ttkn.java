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
 * Created by hungn on 4/14/2017.
 */

public class lvadapter_ttkn extends BaseAdapter {
    private Context context_ttkn;
    private ArrayList<itemlv_ttkn> arritem_ttkn;

    public lvadapter_ttkn(Context context_ttkn, ArrayList<itemlv_ttkn> arritem_ttkn) {
        this.context_ttkn = context_ttkn;
        this.arritem_ttkn = arritem_ttkn;
    }

    @Override
    public int getCount() {
        if (arritem_ttkn!=null)
            return arritem_ttkn.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_ttkn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_ttkn).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemtheotukhoanext,parent,false);

        ImageView img_ttkn = (ImageView) rowView.findViewById(R.id.img_ttkn);
        TextView tvchuto_ttkn = (TextView) rowView.findViewById(R.id.tvchunho_ttkn);
        TextView tvchunho_ttkn = (TextView) rowView.findViewById(R.id.tvchuto_ttkn);

        itemlv_ttkn itlv = arritem_ttkn.get(position);
        img_ttkn.setImageResource(itlv.getAnh_ttkn());
        tvchuto_ttkn.setText(itlv.getChuto_ttkn());
        tvchunho_ttkn.setText(itlv.getChunho_ttkn());
        return rowView;
    }
}
