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

public class lvadapter_cttn extends BaseAdapter {
    private Context context;
    private ArrayList<itemlv_cttn> arritem;

    public lvadapter_cttn(Context context, ArrayList<itemlv_cttn> arritem) {
        this.context = context;
        this.arritem = arritem;
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
        View rowView = inflater.inflate(R.layout.itemcaytaptinnext,parent,false);

        ImageView img = (ImageView) rowView.findViewById(R.id.img_cttn);
        TextView tvchuto = (TextView) rowView.findViewById(R.id.tvchuto_cttn);
        TextView tvchunho = (TextView) rowView.findViewById(R.id.tvchunho_cttn);

        itemlv_cttn itlv = arritem.get(position);
        img.setImageResource(itlv.getAnh_cttn());
        tvchuto.setText(itlv.getChuto_cttn());
        tvchunho.setText(itlv.getChunho_cttn());
        return rowView;
    }
}
