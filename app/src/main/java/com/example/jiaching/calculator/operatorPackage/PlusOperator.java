package com.example.jiaching.calculator.operatorPackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import com.example.jiaching.calculator.Calculator;

/**
 * Created by JiaChing on 2015/3/22.
 */
public class PlusOperator extends Operator implements Button.OnClickListener {
    private Calculator calculator;
    private String operatorName = "+";
    public PlusOperator(Context context) {
        super(context);
        calculator = Calculator.getInstance();
        setOnClickListener(this);
    }

    @Override
    String calculateResult() {

        return null;
    }

    @Override
    public void onClick(View v) {

        calculator.setTextViewResult(calculator.getTextViewText()+operatorName);
    }
}
