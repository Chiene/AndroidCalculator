package com.example.jiaching.calculator;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by JiaChing on 2015/3/21.
 */
public class OperandNumber extends ImageButton implements Button.OnClickListener{
    private String numberString = "";
    private int imageID ;
    private int imageIdClicked ;


    private Calculator calculator;
    public OperandNumber(Context context) {
        super(context);
        calculator = calculator.getInstance();
        setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        calculator.setTextViewResult(calculator.getTextViewText()+numberString);
    }
    public void setNumber(String _number) {
        numberString = _number;
    }
    public void setImageID(int _clickedImage,int _image) {
        imageID = _image;
        imageIdClicked = _clickedImage;
    }

    public void drawImage() {
        setImageResource(imageID);
    }
}
