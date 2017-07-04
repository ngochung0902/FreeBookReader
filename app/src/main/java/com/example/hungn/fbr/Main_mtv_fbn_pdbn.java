package com.example.hungn.fbr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hungn on 4/13/2017.
 */

public class Main_mtv_fbn_pdbn extends AppCompatActivity  {
    private ArrayList<itemlv_mtv_fbn_pdbn> arritem_mtv_fbn_pdbn = new ArrayList<>();
    private ListView lvpublicdomainbooksnext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvpublicdomainbooksnext);

        datamang_mtv_fbn_pdbn();
        lvpublicdomainbooksnext = (ListView) this.findViewById(R.id.lvpublicdomainbooksnext);
        lvadapter_mtv_fbn_pdbn adapter_mtv_fbn_pdbn = new lvadapter_mtv_fbn_pdbn(this,arritem_mtv_fbn_pdbn);
        lvpublicdomainbooksnext.setAdapter(adapter_mtv_fbn_pdbn);
    }

    private void datamang_mtv_fbn_pdbn()
    {
        arritem_mtv_fbn_pdbn.add((new itemlv_mtv_fbn_pdbn("Based on last week's dowloads","Most Popular", R.drawable.fbmangthuviennext)));
        arritem_mtv_fbn_pdbn.add((new itemlv_mtv_fbn_pdbn("Find the latest books available","Recently Added", R.drawable.fbmangthuviennext)));
        arritem_mtv_fbn_pdbn.add((new itemlv_mtv_fbn_pdbn("Browse book by category","Fiction", R.drawable.fbmangthuviennext)));
        arritem_mtv_fbn_pdbn.add((new itemlv_mtv_fbn_pdbn("Browse book by category","Non-Fiction", R.drawable.fbmangthuviennext)));

    }
}
