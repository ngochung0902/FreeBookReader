package com.example.hungn.fbr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by hungn on 4/12/2017.
 */

public class Main_mtv_fbn extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<itemlv_mtv_fbn> arritem_mtv_fbn = new ArrayList<>();
    private ListView lvfeedbooksnext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvfeedbooksnext);

        datamang_mtv_fbn();
        lvfeedbooksnext = (ListView) this.findViewById(R.id.lvfeedbooksnext);
        lvadapter_mtv_fbn adapter_mtv_fbn = new lvadapter_mtv_fbn(this,arritem_mtv_fbn);
        lvfeedbooksnext.setAdapter(adapter_mtv_fbn);

        lvfeedbooksnext.setOnItemClickListener(this);
    }

    private void datamang_mtv_fbn()
    {
        arritem_mtv_fbn.add((new itemlv_mtv_fbn("Search books on feedbooks.com","Tìm", R.drawable.timmangthuviennext)));
        arritem_mtv_fbn.add((new itemlv_mtv_fbn("Free classics and CC-licensed books","Public Domain Books", R.drawable.fbmangthuviennext)));
        arritem_mtv_fbn.add((new itemlv_mtv_fbn("Free Samples","Free Samples", R.drawable.fbmangthuviennext)));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position)
        {
            case 0:
                Toast.makeText(this, "Xin lỗi, danh sách yêu thích của bạn đang trống", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Intent intent = new Intent(this, Main_mtv_fbn_pdbn.class);
                startActivity(intent);
                break;
            case 2:
                Intent intent1 = new Intent(this, Main_mtv_fbn_fsp.class);
                startActivity(intent1);
                break;
        }
    }
}
