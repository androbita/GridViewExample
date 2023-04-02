package com.example.gridviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.gridviewexample.R;

public class CustomAdapter extends BaseAdapter {

    Context ctx;

    public CustomAdapter(Context context) {
        this.ctx = context;
    }

    @Override
    public int getCount() {
        return logo.length;
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
        ImageView img;

        if (view == null){
            img = new ImageView(ctx);
            img.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
            img.setScaleType(ImageView.ScaleType.CENTER_CROP);
            img.setPadding(8, 8, 8, 8);
        }else {
            img = (ImageView) view;
        }
        img.setImageResource(logo[i]);
        return img;
    }

    public int logo[] = {R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground};
}
