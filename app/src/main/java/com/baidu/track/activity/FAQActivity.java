package com.baidu.track.activity;

import android.os.Bundle;

import com.venjee.speed.R;


public class FAQActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.fag_title);
        setOptionsButtonInVisible();
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_faq;
    }
}
