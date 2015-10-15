package com.example.bangnguyen.rss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Bang Nguyen on 10/12/2015.
 */
public class NewsAdapter extends ArrayAdapter<RssItem> {
    private Context context;
    private List<RssItem> items;
    private int ivIcon;

    public NewsAdapter(Context context, int ivIcon,
                       List<RssItem> items) {
        super(context, ivIcon, items);
        // TODO Auto-generated constructor stub
        this.context = context;
        this.items = items;
        this.ivIcon = ivIcon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.news, parent, false);
        ImageView iv = (ImageView) rowView.findViewById(R.id.ivIcon);
        TextView tv = (TextView) rowView.findViewById(R.id.tvNews);
        iv.setImageResource(ivIcon);
        tv.setText(items.get(position).getTitle());
        return rowView;
    }


}
