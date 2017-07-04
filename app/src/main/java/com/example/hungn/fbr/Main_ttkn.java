package com.example.hungn.fbr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hungn on 4/14/2017.
 */

public class Main_ttkn extends AppCompatActivity {
    private ArrayList<itemlv_ttkn> arritem_ttkn = new ArrayList<>();
    private ListView lvtheotukhoanext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvtheotukhoanext);

        datamang_ttkn();
        lvtheotukhoanext = (ListView) this.findViewById(R.id.lvtheotukhoanext);
        lvadapter_ttkn adapter_ttkn = new lvadapter_ttkn(this,arritem_ttkn);
        lvtheotukhoanext.setAdapter(adapter_ttkn);
    }

    private void datamang_ttkn() {
        arritem_ttkn.add((new itemlv_ttkn("Sách không từ khóa","Về FBReaderJ", R.drawable.theotukhoanext)));
    }
}
