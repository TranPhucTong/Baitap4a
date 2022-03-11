package com.example.tutcustomlistview;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClickListener, OnItemLongClickListener   {
    private ListView lvContact;
    private CustomAdapter adapter = null;
    private ArrayList<Contact> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = (ListView) findViewById(R.id.lv_contact);
        list = new ArrayList<Contact>();
        list.add(new Contact("Ca nấu lẩu, nấu mì mini","Shop Devang",R.drawable.ca_nau_lau));
        list.add(new Contact("1 KG khô gà bơ tỏi","LTD Food",R.drawable.ga_bo_toi));
        list.add(new Contact("Xe cần cẩu đa năng","Thế giới đồ chơi",R.drawable.xa_can_cau));
        list.add(new Contact("Đồ chơi dạng mô hình","Thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
        list.add(new Contact("Lãnh đạo giản đơn","Minh Long Book",R.drawable.lanh_dao_gian_don));
        list.add(new Contact("Hiểu lòng trẻ con","Minh Long Book",R.drawable.hieu_long_con_tre));
        list.add(new Contact("Donal Trump","Minh Long Book",R.drawable.trump_1));

        adapter  = new CustomAdapter(this, R.layout.item_contact, list);
        lvContact.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, list.get(i).getName(),Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

        return false;
    }
}