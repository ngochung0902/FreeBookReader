package com.example.hungn.fbr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hungn on 4/13/2017.
 */

public class Main_mtv_mnbn_au extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ArrayList<itemlv_mtv_mnbn_au> arritem_mtv_mnbn_au = new ArrayList<>();
    private ListView lvauthorsnext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvauthorsnext);

        datamang_mtv_mnbn_au();
        lvauthorsnext = (ListView) this.findViewById(R.id.lvauthorsnext);
        lvadapter_mtv_mnbn_au adapter_mtv_mnbn_au = new lvadapter_mtv_mnbn_au(this,arritem_mtv_mnbn_au);
        lvauthorsnext.setAdapter(adapter_mtv_mnbn_au);

        lvauthorsnext.setOnItemClickListener(this);
    }

    private void datamang_mtv_mnbn_au()
    {
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","A", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","B", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","C", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","D", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","E", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","F", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","G", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","H", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","I", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","J", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","K", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","L", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","M", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","N", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","O", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","P", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","Q", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","R", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","S", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn_au.add((new itemlv_mtv_mnbn_au("","T", R.drawable.manybookmangthuviennext)));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent1 = new Intent(this, Main_mtv_fbn_fsp.class);
        startActivity(intent1);
    }
}
