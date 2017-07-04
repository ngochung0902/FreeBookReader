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

public class lvadapter_mtv_fbn extends BaseAdapter{
    private Context context_mtv_fbn;
    private ArrayList<itemlv_mtv_fbn> arritem_mtv_fbn;

    public lvadapter_mtv_fbn(Context context_mtv_fbn, ArrayList<itemlv_mtv_fbn> arritem_mtv_fbn) {
        this.context_mtv_fbn = context_mtv_fbn;
        this.arritem_mtv_fbn = arritem_mtv_fbn;
    }

    @Override
    public int getCount() {
        if (arritem_mtv_fbn!=null)
            return arritem_mtv_fbn.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_mtv_fbn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_mtv_fbn).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemfeedboosnext,parent,false);

        ImageView img_mtv_fbn = (ImageView) rowView.findViewById(R.id.img_mtv_fbn);
        TextView tvchuto_mtv_fbn = (TextView) rowView.findViewById(R.id.tvchunho_mtv_fbn);
        TextView tvchunho_mtv_fbn = (TextView) rowView.findViewById(R.id.tvchuto_mtv_fbn);

        itemlv_mtv_fbn itlv = arritem_mtv_fbn.get(position);
        img_mtv_fbn.setImageResource(itlv.getAnh_mtv_fbn());
        tvchuto_mtv_fbn.setText(itlv.getChuto_mtv_fbn());
        tvchunho_mtv_fbn.setText(itlv.getChunho_mtv_fbn());
        return rowView;
    }
}
