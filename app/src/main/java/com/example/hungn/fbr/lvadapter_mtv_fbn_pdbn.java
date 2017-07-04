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

public class lvadapter_mtv_fbn_pdbn extends BaseAdapter {
    private Context context_mtv_fbn_pdbn;
    private ArrayList<itemlv_mtv_fbn_pdbn> arritem_mtv_fbn_pdbn;

    public lvadapter_mtv_fbn_pdbn(Context context_mtv_fbn_pdbn, ArrayList<itemlv_mtv_fbn_pdbn> arritem_mtv_fbn_pdbn) {
        this.context_mtv_fbn_pdbn = context_mtv_fbn_pdbn;
        this.arritem_mtv_fbn_pdbn = arritem_mtv_fbn_pdbn;
    }

    @Override
    public int getCount() {
        if (arritem_mtv_fbn_pdbn!=null)
            return arritem_mtv_fbn_pdbn.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_mtv_fbn_pdbn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_mtv_fbn_pdbn).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itempublicdomainbooks,parent,false);

        ImageView img_mtv_fbn_pdbn = (ImageView) rowView.findViewById(R.id.img_mtv_fbn_pdbn);
        TextView tvchuto_mtv_fbn_pdbn = (TextView) rowView.findViewById(R.id.tvchunho_mtv_fbn_pdbn);
        TextView tvchunho_mtv_fbn_pdbn = (TextView) rowView.findViewById(R.id.tvchuto_mtv_fbn_pdbn);

        itemlv_mtv_fbn_pdbn itlv = arritem_mtv_fbn_pdbn.get(position);
        img_mtv_fbn_pdbn.setImageResource(itlv.getAnh_mtv_fbn_pdbn());
        tvchuto_mtv_fbn_pdbn.setText(itlv.getChuto_mtv_fbn_pdbn());
        tvchunho_mtv_fbn_pdbn.setText(itlv.getChunho_mtv_fbn_pdbn());
        return rowView;
    }
}
