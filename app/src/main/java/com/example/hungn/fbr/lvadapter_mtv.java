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
 * Created by hungn on 4/10/2017.
 */

public class lvadapter_mtv extends BaseAdapter {
    private Context context_mtv;
    private ArrayList<itemlv_mtv> arritem_mtv;

    public lvadapter_mtv(Context context, ArrayList<itemlv_mtv> arr)
    {
        this.context_mtv = context;
        this.arritem_mtv = arr;
    }

    @Override
    public int getCount() {
        if (arritem_mtv!=null)
            return arritem_mtv.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_mtv.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_mtv).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemlayoutmangthuvien,parent,false);

        ImageView img_mtv = (ImageView) rowView.findViewById(R.id.img_mtv);
        TextView tvchuto_mtv = (TextView) rowView.findViewById(R.id.tvchuto_mtv);
        TextView tvchunho_mtv = (TextView) rowView.findViewById(R.id.tvchunho_mtv);

        itemlv_mtv itlv = arritem_mtv.get(position);
        img_mtv.setImageResource(itlv.getAnh_mtv());
        tvchuto_mtv.setText(itlv.getChuto_mtv());
        tvchunho_mtv.setText(itlv.getChunho_mtv());
        return rowView;
    }
}
