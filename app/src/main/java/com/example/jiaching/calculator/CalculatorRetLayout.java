package com.example.jiaching.calculator;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaching.calculator.operatorPackage.MinsOperator;
import com.example.jiaching.calculator.operatorPackage.Operator;
import com.example.jiaching.calculator.operatorPackage.PlusOperator;

/**
 * Created by JiaChing on 2015/3/22.
 */
public class CalculatorRetLayout extends RelativeLayout {
    private TextView tvShowResult = null;
    private ImageButton imageButtonBackSpace = null;

    //Operator
    private Operator addOperator = null;
    private Operator subOperator = null;
    private Operator subOperator = null;
    private Operator multipleOperator = null;
    private Operator dividOperator = null;
    private Operator equalOperator = null;

    private OperandNumber imageButtonsNumber[];
    private int numberImage[] = {R.drawable.zero,R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four
            ,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine};
    private OperandImageButton imaageButtonDot;
    private int maxNumber = 10;
    public CalculatorRetLayout(Context context) {
        super(context);
        initTextView();
        initButtonNumber();
        initFeatureButton();
    }

    /**
     * About textView
     */
    public void initTextView() {
        tvShowResult = new TextView(this.getContext());
        tvShowResult.setText("sdfsdf");
        tvShowResult.setWidth(350);
        tvShowResult.setHeight(50);
        tvShowResult.setGravity(Gravity.RIGHT);
        tvShowResult.setX(10);
        tvShowResult.setY(10);
        tvShowResult.setTextSize(20);
        tvShowResult.setBackgroundColor(Color.BLUE);
        this.addView(tvShowResult);
    }
    public void setTextViewResult(String _result) {
        tvShowResult.setText(_result);
    }
    public String getTextViewText() {
        return tvShowResult.getText().toString();
    }

    /**
     * Feature
     */
    public void initFeatureButton() {
        imageButtonBackSpace = new ImageButton(this.getContext());
        imageButtonBackSpace.setX(360);
        imageButtonBackSpace.setY(10);
        imageButtonBackSpace.getBackground().setAlpha(0);
        imageButtonBackSpace.setImageResource(R.drawable.back);
        this.addView(imageButtonBackSpace);
        //
        addOperator = new PlusOperator(this.getContext());
        addOperator.setX(360);
        addOperator.setY(70);
        addOperator.getBackground().setAlpha(0);
        addOperator.setImageResource(R.drawable.plus);
        this.addView(addOperator);

        subOperator = new MinsOperator(this.getContext());
        subOperator.setX(360);
        subOperator.setY(180);
        subOperator.getBackground().setAlpha(0);
        subOperator.setImageResource(R.drawable.minus);
        this.addView(subOperator);


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
        imaageButtonDot = new OperadnImageButtonDot(this.getContext());
        for (int i = maxNumber-1; i >= 0 ; i--) {
            imageButtonsNumber[i] = new OperandNumber(this.getContext());
            imageButtonsNumber[i].setNumber(String.valueOf(i));
            imageButtonsNumber[i].setImageID(numberImage[i], numberImage[i]);
            imageButtonsNumber[i].setX(((maxNumber - i - 1) % widthNumber) * widthCard + widthPaddingImage - 25);
            imageButtonsNumber[i].setY(((maxNumber - i - 1) / widthNumber) * heightCard + heightPaddingImage + 30);
            imageButtonsNumber[i].getBackground().setAlpha(0);
            imageButtonsNumber[i].drawImage();
            this.addView(imageButtonsNumber[i]);
            if (i == 0) {
                imaageButtonDot.setNumber(".");
                imaageButtonDot.setImageID(R.drawable.dot, R.drawable.dot);
                imaageButtonDot.setX(((maxNumber - i) % widthNumber) * widthCard + widthPaddingImage - 25);
                imaageButtonDot.setY(((maxNumber - i - 1) / widthNumber) * heightCard + heightPaddingImage + 30);
                imaageButtonDot.getBackground().setAlpha(0);
                imaageButtonDot.drawImage();
                this.addView(imaageButtonDot);
            }
        }
    }

}
