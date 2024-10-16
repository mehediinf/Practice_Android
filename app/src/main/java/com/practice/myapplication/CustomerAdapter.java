package com.practice.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomerAdapter extends BaseAdapter {

    Context context;
    int[] flags;
    String[] countryName;
    private LayoutInflater layoutInflater;

    CustomerAdapter(Context context,String[] countryName,int[] flags){
        this.context=context;
        this.countryName=countryName;
        this.flags=flags;
    }


    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.sample,viewGroup,false);

        }

        ImageView imageView = view.findViewById(R.id.imgSampleId);
        TextView textView = view.findViewById(R.id.txtSampleId);

        imageView.setImageResource(flags[i]);
        textView.setText(countryName[i]);

        return view;

    }
}
