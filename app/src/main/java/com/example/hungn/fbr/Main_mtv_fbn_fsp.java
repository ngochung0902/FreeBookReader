package com.example.hungn.fbr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.hungn.fbr.download.Maindownload;

import java.util.ArrayList;

/**
 * Created by hungn on 4/13/2017.
 */

public class Main_mtv_fbn_fsp extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ArrayList<itemlv_mtv_fbn_fsp> arritem_mtv_fbn_fsp = new ArrayList<>();
    private ListView lvfreesamplesnext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvfreesamplesnext);

        datamang_mtv_fbn_fsp();
        lvfreesamplesnext = (ListView) this.findViewById(R.id.lvfreesamplesnext);
        lvadapter_mtv_fbn_fsp adapter_mtv_fbn_fsp = new lvadapter_mtv_fbn_fsp(this,arritem_mtv_fbn_fsp);
        lvfreesamplesnext.setAdapter(adapter_mtv_fbn_fsp);
        lvfreesamplesnext.setOnItemClickListener(this);
    }

    private void datamang_mtv_fbn_fsp()
    {
        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("Heather Graham","The Rising", R.drawable.therising)));
        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("Charles Cumming","A Divided Spy", R.drawable.adiviedspy)));
        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("MiChelle","Black Wave", R.drawable.black)));
        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("Julie Buntin","Marlena", R.drawable.lotus)));

        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("Heather Graham","The Rising", R.drawable.exes)));
        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("Charles Cumming","A Divided Spy", R.drawable.ifwewarevilan)));
        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("MiChelle","Black Wave", R.drawable.iwilltake)));
        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("Julie Buntin","Marlena", R.drawable.lotus)));

        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("Heather Graham","The Rising", R.drawable.shiningcity)));
        arritem_mtv_fbn_fsp.add((new itemlv_mtv_fbn_fsp("Charles Cumming","A Divided Spy", R.drawable.themeninmylife)));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent1 = new Intent(this, Maindownload.class);
        startActivity(intent1);
    }
}
