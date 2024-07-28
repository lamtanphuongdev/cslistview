package com.example.cslistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MotoAdapter extends BaseAdapter {
    private Context context;
    private int layOut;
    private List<clsMoto> motoList;

    public MotoAdapter(Context context, int layOut, List<clsMoto> motoList) {
        this.context = context;
        this.layOut = layOut;
        this.motoList = motoList;
    }

    @Override
    public int getCount() {
        return motoList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layOut,null);

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvDetail = convertView.findViewById(R.id.tvDetail);
        ImageView imgHinh = convertView.findViewById(R.id.imgHinh);

        clsMoto moto = motoList.get(position);

        tvName.setText(moto.getNAME());
        tvDetail.setText(moto.getDETAIL());
        imgHinh.setImageResource(moto.getImgHinh());

        return convertView;
    }
}
