package com.example.hungn.fbr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hungn on 4/12/2017.
 */

public class Main_cttn extends AppCompatActivity {
    private ArrayList<itemlv_cttn> arritem_cttn = new ArrayList<>();
    private ListView lvcaytaptinnext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvcaytaptinnext);

        datamang_cttn();
        lvcaytaptinnext = (ListView) this.findViewById(R.id.lvcaytaptinnext);
        lvadapter_cttn adapter_cttn = new lvadapter_cttn(this,arritem_cttn);
        lvcaytaptinnext.setAdapter(adapter_cttn);
    }

    private void datamang_cttn() {
        arritem_cttn.add((new itemlv_cttn("Thư viện FBReader","Thư mục sách FBReader", R.drawable.caytaptin)));
        arritem_cttn.add((new itemlv_cttn("Thiết bị","Toàn bộ tập tin hệ thống", R.drawable.caytaptin)));
        arritem_cttn.add((new itemlv_cttn("Thẻ nhớ","Có thể thêm thẻ nhớ vào máy", R.drawable.caytaptin)));
    }
}
