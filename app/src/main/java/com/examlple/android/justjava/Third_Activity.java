package com.examlple.android.justjava;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class Third_Activity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
    }
}
