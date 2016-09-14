package com.shopgun.android.zoompanviewgroup.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.shopgun.android.zoompanviewgroup.ZoomLayout;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ZoomLayout mZoomLayout;
    TextView mTextView;

    Catalog mCatalog = Catalog.getNetto();
    ImageView mPage26;
//    ImageView mPage27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mZoomLayout = (ZoomLayout) findViewById(R.id.zoomLayout);
        mTextView = (TextView) findViewById(R.id.info);

        // setup ZoomLayout
//        mZoomLayout.setAllowOverScale(false);
        mZoomLayout.setMinScale(0.8f);

        // Load content to zoom
        mPage26 = (ImageView) findViewById(R.id.imageViewLeft);
//        mPage27 = (ImageView) findViewById(R.id.imageViewRight);
        Picasso.with(this).load(mCatalog.getView(26)).into(mPage26);
//        Picasso.with(this).load(mCatalog.getView(27)).into(mPage27);

    }

}
