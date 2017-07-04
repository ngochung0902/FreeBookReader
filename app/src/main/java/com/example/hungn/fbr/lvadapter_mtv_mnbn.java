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

public class lvadapter_mtv_mnbn extends BaseAdapter {
    private Context context_mtv_mnbn;
    private ArrayList<itemlv_mtv_mnbn> arritem_mtv_mnbn;

    public lvadapter_mtv_mnbn(Context context_mtv_mnbn, ArrayList<itemlv_mtv_mnbn> arritem_mtv_mnbn) {
        this.context_mtv_mnbn = context_mtv_mnbn;
        this.arritem_mtv_mnbn = arritem_mtv_mnbn;
    }

    @Override
    public int getCount() {
        if (arritem_mtv_mnbn!=null)
            return arritem_mtv_mnbn.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_mtv_mnbn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_mtv_mnbn).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemmanybooksnext,parent,false);

        ImageView img_mtv_mnbn = (ImageView) rowView.findViewById(R.id.img_mtv_mnbn);
        TextView tvchuto_mtv_mnbn = (TextView) rowView.findViewById(R.id.tvchunho_mtv_mnbn);
        TextView tvchunho_mtv_mnbn = (TextView) rowView.findViewById(R.id.tvchuto_mtv_mnbn);

        itemlv_mtv_mnbn itlv = arritem_mtv_mnbn.get(position);
        img_mtv_mnbn.setImageResource(itlv.getAnh_mtv_mnbn());
        tvchuto_mtv_mnbn.setText(itlv.getChuto_mtv_mnbn());
        tvchunho_mtv_mnbn.setText(itlv.getChunho_mtv_mnbn());
        return rowView;
    }
}
