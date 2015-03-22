package com.example.jiaching.calculator.operatorPackage;

import android.content.Context;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by JiaChing on 2015/3/22.
 */
public abstract class Operator extends ImageButton implements Button.OnClickListener {
    public Operator(Context context) {
        super(context);
    }
    abstract String calculateResult();
}
