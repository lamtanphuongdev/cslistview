package com.example.cslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExample;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
    }

    private void Init() {
        lvExample = findViewById(R.id.lvExample);

//        String[] strings = {"Anh","Đức","Bỉ","Áo","Bồ Đào Nha","Tây Ban Nha","Pháp","Ý"};
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
//                strings);
//
//        lvExample.setAdapter(adapter);

        ArrayList<clsMoto> motoList = new ArrayList<>();
        motoList.add(new clsMoto("Tên số 01","Đây là tên số 01",R.drawable.h1));
        motoList.add(new clsMoto("Tên số 02","Đây là tên số 02",R.drawable.h2));
        motoList.add(new clsMoto("Tên số 03","Đây là tên số 03",R.drawable.h3));
        motoList.add(new clsMoto("Tên số 04","Đây là tên số 04",R.drawable.h4));
        motoList.add(new clsMoto("Tên số 05","Đây là tên số 05",R.drawable.h5));
        motoList.add(new clsMoto("Tên số 06","Đây là tên số 06",R.drawable.h6));
        motoList.add(new clsMoto("Tên số 07","Đây là tên số 07",R.drawable.h7));
        motoList.add(new clsMoto("Tên số 08","Đây là tên số 08",R.drawable.h8));

        MotoAdapter adapter = new MotoAdapter(this,R.layout.row_moto,motoList);

        lvExample.setAdapter(adapter);

    }
}