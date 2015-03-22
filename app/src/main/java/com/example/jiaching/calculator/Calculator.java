package com.example.jiaching.calculator;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;



/**
 * Created by JiaChing on 2015/3/21.
 */
public class Calculator {
    private RelativeLayout calRelativeLayout;
    private TextView tvShowResult = null;

    private OperandNumber imageButtonsNumber[];
    private int numberImage[] = {R.drawable.zero,R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four
    ,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine};
    private OperandImageButton imaageButtonDot;
    private int maxNumber = 10;
    private static Calculator calculatorInstance = null;
    private Calculator() {


    }
    public static Calculator getInstance() {
        if(calculatorInstance == null) {
            calculatorInstance = new Calculator();
        }
        return calculatorInstance;
    }
    public void initCalculator() {
        initTextView();
        initButtonNumber();
    }

    /**
     * About textView
     */
    public void initTextView() {
        tvShowResult = new TextView(calRelativeLayout.getContext());
        tvShowResult.setText("sdfsdf");
        tvShowResult.setWidth(350);
        tvShowResult.setHeight(50);
        tvShowResult.setGravity(Gravity.RIGHT);
        tvShowResult.setX(10);
        tvShowResult.setY(10);
        tvShowResult.setTextSize(20);
        tvShowResult.setBackgroundColor(Color.BLUE);
        calRelativeLayout.addView(tvShowResult);
    }
    public void setTextViewResult(String _result) {
        tvShowResult.setText(_result);
    }
    public String getTextViewText() {
        return tvShowResult.getText().toString();
    }
    /**
     * inital number button
     */
    public void initButtonNumber() {
        int widthCard = 140;
        int heightCard = 140;
        int widthPaddingImage = 30;
        int heightPaddingImage = 50;
        int widthNumber = 3;
        imageButtonsNumber = new OperandNumber[maxNumber];
        imaageButtonDot = new OperadnImageButtonDot(calRelativeLayout.getContext());
        for (int i = maxNumber-1; i >= 0 ; i--) {
            imageButtonsNumber[i] = new OperandNumber(calRelativeLayout.getContext());
            imageButtonsNumber[i].setNumber(String.valueOf(i));
            imageButtonsNumber[i].setImageID(numberImage[i], numberImage[i]);
            imageButtonsNumber[i].setX(((maxNumber - i - 1) % widthNumber) * widthCard + widthPaddingImage - 25);
            imageButtonsNumber[i].setY(((maxNumber - i - 1) / widthNumber) * heightCard + heightPaddingImage + 30);
            imageButtonsNumber[i].drawImage();
            calRelativeLayout.addView(imageButtonsNumber[i]);
            if (i == 0) {
                imaageButtonDot.setNumber(".");
                imaageButtonDot.setImageID(R.drawable.dot, R.drawable.dot);
                imaageButtonDot.setX(((maxNumber - i) % widthNumber) * widthCard + widthPaddingImage - 25);
                imaageButtonDot.setY(((maxNumber - i - 1) / widthNumber) * heightCard + heightPaddingImage + 30);
                imaageButtonDot.drawImage();
                calRelativeLayout.addView(imaageButtonDot);
            }
        }
    }

    /**
     *  Layout function
     * @param context android context
     */
    public void initLayout(Context context) {
        calRelativeLayout = new RelativeLayout(context);
    }
    public RelativeLayout getLayout() {
        return calRelativeLayout;
    }

}
