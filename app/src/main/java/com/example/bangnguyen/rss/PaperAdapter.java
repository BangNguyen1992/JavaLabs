package com.example.bangnguyen.rss;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bang Nguyen on 10/12/2015.
 */
public class PaperAdapter extends ArrayAdapter<String> {

    private Context context;
    private String[] papers;

    public PaperAdapter(Context context, int textViewResourceId,
                        String[] papers) {
        super(context, textViewResourceId, papers);
        this.context = context;
        this.papers = papers;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_main, parent, false);
        ImageView iv = (ImageView) rowView.findViewById(R.id.ivIcon);
        TextView tv = (TextView) rowView.findViewById(R.id.tvPaper);
        iv.setImageResource(Variables.ICONS[position]);
        tv.setText(Variables.PAPERS[position]);
        return rowView;
    }

}
