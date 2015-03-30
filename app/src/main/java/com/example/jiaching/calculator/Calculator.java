package com.example.jiaching.calculator;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaching.calculator.operatorPackage.PlusOperator;
import com.example.jiaching.calculator.operatorPackage.Operator;
import com.example.jiaching.calculator.operatorPackage.MinsOperator;

import java.util.LinkedList;


/**
 * Created by JiaChing on 2015/3/21.
 */
public class Calculator {
    private CalculatorRetLayout calRelativeLayout;
    private String postfixString = "";
    private int location = 0;
    private static Calculator calculatorInstance = null;
    private Calculator() {


    }
    public static Calculator getInstance() {
        if(calculatorInstance == null) {
            calculatorInstance = new Calculator();
        }
        return calculatorInstance;
    }

    public void setTextViewResult(String _result) {
        calRelativeLayout.setTextViewResult(_result);
    }
    public String getTextViewText() {
        return calRelativeLayout.getTextViewText();
    }


    /**
     *  Layout function
     * @param context android context
     */
    public void initLayout(Context context) {
        calRelativeLayout = new CalculatorRetLayout(context);
    }

    public RelativeLayout getLayout() {

        return calRelativeLayout;
    }
    public void addPostfixString(String addString) {
        postfixString += postfixString+addString;
    }
    public void infixToPostfix() {

    }

}
