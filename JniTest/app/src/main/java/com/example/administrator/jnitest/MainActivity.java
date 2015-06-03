package com.example.administrator.jnitest;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {
    private ListView contentlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contentlist = (ListView) findViewById(R.id.contentlist);
        contentlist.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 20;
            }

            @Override
            public Object getItem(int i) {
                return i;
            }

            @Override
            public long getItemId(int i) {
                return 20;
            }

            @Override
            public View getView(int position, View view, ViewGroup viewGroup) {
                if (view==null)
                    view = LayoutInflater.from(MainActivity.this).inflate(R.layout.search_trade_item, null);
                TextView textView = (TextView) view.findViewById(R.id.year_str);
                ImageView imageView = (ImageView) view.findViewById(R.id.title_line);
                if (position==0)
                {
                    textView.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.INVISIBLE);
                }else
                {
                    textView.setVisibility(View.INVISIBLE);
                    imageView.setVisibility(View.VISIBLE);

                }
                return view;
            }
        });
    }



}
