package com.example.hungn.fbr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by hungn on 4/11/2017.
 */

public class Main_mtv extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private ArrayList<itemlv_mtv> arritem_mtv = new ArrayList<>();
    private ListView lvmangthuviennext;
    ImageButton imageButton3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvmangthuviennext);

        datamang_mtv();
        lvmangthuviennext = (ListView) this.findViewById(R.id.lvmangthuviennext);
        lvadapter_mtv adapter_mtv = new lvadapter_mtv(this,arritem_mtv);
        lvmangthuviennext.setAdapter(adapter_mtv);

        lvmangthuviennext.setOnItemClickListener(this);

        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Main_mtv.this, imageButton3);
                popup.getMenuInflater().inflate(R.menu.poupup_menu1, popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    public boolean onMenuItemClick(MenuItem item){
//                        Toast.makeText(Main_tv.this, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                popup.show();
            }
        });
    }

    private void datamang_mtv()
    {
        arritem_mtv.add((new itemlv_mtv("Tìm","Tìm sách trong danh mục", R.drawable.timmangthuviennext)));
        arritem_mtv.add((new itemlv_mtv("Feedbooks OPDS Catalog","Feedbooks: Food for the mind. Aplace to discover.", R.drawable.fbmangthuviennext)));
        arritem_mtv.add((new itemlv_mtv("ManyBooks Catalog","ManyBooks.net: The best ebooks at the best price: free!", R.drawable.manybookmangthuviennext)));
        arritem_mtv.add((new itemlv_mtv("Thêm","Thêm tùy chỉnh OPDS", R.drawable.themmangthuviennext)));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //itemlv_mtv itemlvTv = arritem_mtv.get(position);
        switch (position)
        {
            case 0:
                Toast.makeText(this, "Xin lỗi, danh sách yêu thích của bạn đang trống", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Intent intent10 = new Intent(this, Main_mtv_fbn.class);
                startActivity(intent10);
                break;
            case 2:
                Intent intent1 = new Intent(this, Main_mtv_mnbn.class);
                startActivity(intent1);

                break;
            case 3:
                Intent intent2 = new Intent(this, Main_gdn.class);
                startActivity(intent2);
                break;
        }

    }
}
