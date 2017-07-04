package com.example.hungn.fbr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hungn on 4/12/2017.
 */

public class Main_gdn extends AppCompatActivity {
    private ArrayList<itemlv_gdn> arritem_gdn = new ArrayList<>();
    private ListView lvgandaynext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvgandaynext);

        datamang_gdn();
        lvgandaynext = (ListView) this.findViewById(R.id.lvgandaynext);
        lvadapter_gdn adapter_gdn = new lvadapter_gdn(this,arritem_gdn);
        lvgandaynext.setAdapter(adapter_gdn);
    }

    private void datamang_gdn() {
        arritem_gdn.add((new itemlv_gdn("Về FBReaderJ","FBReader", R.drawable.gandaynext)));
    }
}
