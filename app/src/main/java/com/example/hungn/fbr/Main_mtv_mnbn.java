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
 * Created by hungn on 4/13/2017.
 */

public class Main_mtv_mnbn extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ArrayList<itemlv_mtv_mnbn> arritem_mtv_mnbn = new ArrayList<>();
    private ListView lvmanybooksnext;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvmanybooksnext);

        datamang_mtv_mnbn();
        lvmanybooksnext = (ListView) this.findViewById(R.id.lvmanybooksnext);
        lvadapter_mtv_mnbn adapter_mtv_mnbn = new lvadapter_mtv_mnbn(this,arritem_mtv_mnbn);
        lvmanybooksnext.setAdapter(adapter_mtv_mnbn);

        lvmanybooksnext.setOnItemClickListener(this);
    }

    private void datamang_mtv_mnbn()
    {
        arritem_mtv_mnbn.add((new itemlv_mtv_mnbn("Search books on manybooks.net","Tìm", R.drawable.timmangthuviennext)));
        arritem_mtv_mnbn.add((new itemlv_mtv_mnbn("Recently Added books","New Title", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn.add((new itemlv_mtv_mnbn("Alphabetical listing","Authors", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn.add((new itemlv_mtv_mnbn("All titles, listed alphabetically","Titles", R.drawable.manybookmangthuviennext)));
        arritem_mtv_mnbn.add((new itemlv_mtv_mnbn("Titles grouped ny category","Genres", R.drawable.manybookmangthuviennext)));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:

                break;
            case 1:
                Intent intent = new Intent(this, Main_mtv_fbn_fsp.class);
                startActivity(intent);
                break;
            case 2:
                Intent intent1 = new Intent(this, Main_mtv_mnbn_au.class);
                startActivity(intent1);
                break;
            case 3:
                Toast.makeText(this, "Xin lỗi, thư mục này trống", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
