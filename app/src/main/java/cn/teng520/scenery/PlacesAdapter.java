package cn.teng520.scenery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lenovo on 2017/4/16.
 */

public class PlacesAdapter extends BaseAdapter {
    private Context context;
    private String[] names;
    private int[] icons;
    public PlacesAdapter(Context context) {
        this.context=context;
        names=context.getResources().getStringArray(R.array.photo_names);
        icons=new int[]{
                R.drawable.s1,R.drawable.s2,R.drawable.s3,R.drawable.s4,R.drawable.s5,
                R.drawable.s6,R.drawable.s7,R.drawable.s8,R.drawable.s9,R.drawable.s10
        };
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.place_item,null);
        ImageView iconImageView=(ImageView)itemView.findViewById(R.id.icon_image);
        TextView nameTextView=(TextView)itemView.findViewById(R.id.name_text);
        iconImageView.setImageResource(icons[position]);
        nameTextView.setText(names[position]);
        return itemView;
    }
}
