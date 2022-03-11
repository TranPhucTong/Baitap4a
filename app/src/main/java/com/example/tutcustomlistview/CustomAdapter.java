package com.example.tutcustomlistview;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Contact> {
        private Activity activity;
        private int idLayout;
        private ArrayList<Contact> list;

        public CustomAdapter(Activity activity, int idLayout,
                             ArrayList<Contact> list){
            super(activity, idLayout, list);
            this.activity =activity;
            this.idLayout = idLayout;
            this.list = list;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(idLayout, null);

            ImageView image = (ImageView)convertView.findViewById(R.id.image);
            TextView tvName = (TextView)convertView.findViewById(R.id.tv_name);
            TextView tvNCC = (TextView) convertView.findViewById(R.id.tv_nhaCC);
            Button btnChat = (Button)convertView.findViewById(R.id.btn_chat);

            tvName.setText(list.get(position).getName());
            tvNCC.setText(list.get(position).getnCC());
            image.setImageResource(list.get(position).getchat());

            return convertView;

        }
}
