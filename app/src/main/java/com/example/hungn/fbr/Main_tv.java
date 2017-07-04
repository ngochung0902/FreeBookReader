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

import com.example.hungn.fbr.service.Mainservice;
import com.example.hungn.fbr.test.MainData;

import java.util.ArrayList;

/**
 * Created by hungn on 4/11/2017.
 */

public class Main_tv extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<itemlv_tv> arritem = new ArrayList<>();
    private ListView lvthuvien;
    ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lvthuviennext);

        datamang();
        lvthuvien = (ListView) this.findViewById(R.id.lvthuviennext);
        lvadapter_tv adapter = new lvadapter_tv(this,arritem);
        lvthuvien.setAdapter(adapter);

        lvthuvien.setOnItemClickListener(this);

        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Main_tv.this, imageButton2);
                popup.getMenuInflater().inflate(R.menu.poupup_menu, popup.getMenu());

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

    private void datamang()
    {
        arritem.add(new itemlv_tv("Yêu thích","Sách của tôi", R.drawable.yeuthich));
        arritem.add(new itemlv_tv("Gần đây","Sách đọc gần đây", R.drawable.ganday));
        arritem.add(new itemlv_tv("Theo tác giả","Sách được xếp theo tác giả", R.drawable.theotacgia));
        arritem.add(new itemlv_tv("By title","Books sorted by title", R.drawable.bytitle));
        arritem.add(new itemlv_tv("Theo từ khóa","Sách được xếp theo từ khóa", R.drawable.theotukhoa));
        arritem.add(new itemlv_tv("Cây tập tin","Duyệt tập tin hệ thống", R.drawable.caytaptin));
        arritem.add(new itemlv_tv("Âm Nhạc","Âm Nhạc", R.drawable.nhac));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //itemlv_tv itemlvTv = arritem.get(position);
        switch (position)
        {
            case 0:
                //Toast.makeText(this, "Xin lỗi, danh sách yêu thích của bạn đang trống", Toast.LENGTH_SHORT).show();
                Intent intent10 = new Intent(this, MainData.class);
                startActivity(intent10);
                break;
            case 1:
                Intent intent = new Intent(this, Main_mtv_fbn.class);
                startActivity(intent);
            break;
            case 2:
                Intent intent1 = new Intent(this, Main_ttgn.class);
                startActivity(intent1);

                break;
            case 3:
                Intent intent2 = new Intent(this, Main_gdn.class);
                startActivity(intent2);
                break;
            case 4:
                Intent intent3 = new Intent(this, Main_ttkn.class);
                startActivity(intent3);
                break;
            case 5:
                Intent intent4 = new Intent(this, Main_cttn.class);
                startActivity(intent4);
                break;
            case 6:
                Intent intent5 = new Intent(this, Mainservice.class);
                startActivity(intent5);
        }

    }
}
