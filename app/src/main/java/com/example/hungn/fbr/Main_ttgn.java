package com.example.hungn.fbr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hungn on 4/12/2017.
 */

public class Main_ttgn extends AppCompatActivity {
    private ArrayList<itemlv_ttgn> arritem_ttgn = new ArrayList<>();
    private ListView lvtheotacgianext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvtheotacgianext);

        datamang_ttgn();
        lvtheotacgianext = (ListView) this.findViewById(R.id.lvtheotacgianext);
        lvadapter_ttgn adapter_ttgn = new lvadapter_ttgn(this,arritem_ttgn);
        lvtheotacgianext.setAdapter(adapter_ttgn);
    }

    private void datamang_ttgn() {
        arritem_ttgn.add((new itemlv_ttgn("FBReader","Về FBReaderJ", R.drawable.theotacgianext)));
    }
}

