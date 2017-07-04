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

public class lvadapter_ttgn extends BaseAdapter {
    private Context context_ttgn;
    private ArrayList<itemlv_ttgn> arritem_ttgn;

    public lvadapter_ttgn(Context context, ArrayList<itemlv_ttgn> arr)
    {
        this.context_ttgn = context;
        this.arritem_ttgn = arr;
    }

    @Override
    public int getCount() {
        if (arritem_ttgn!=null)
            return arritem_ttgn.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return arritem_ttgn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity)context_ttgn).getLayoutInflater();
        View rowView = inflater.inflate(R.layout.itemtheotacgianext,parent,false);

        ImageView img_ttgn = (ImageView) rowView.findViewById(R.id.img_ttgn);
        TextView tvchuto_ttgn = (TextView) rowView.findViewById(R.id.tvchunho_ttgn);
        TextView tvchunho_ttgn = (TextView) rowView.findViewById(R.id.tvchuto_ttgn);

        itemlv_ttgn itlv = arritem_ttgn.get(position);
        img_ttgn.setImageResource(itlv.getAnh_ttgn());
        tvchuto_ttgn.setText(itlv.getChuto_ttgn());
        tvchunho_ttgn.setText(itlv.getChunho_ttgn());
        return rowView;
    }
}

