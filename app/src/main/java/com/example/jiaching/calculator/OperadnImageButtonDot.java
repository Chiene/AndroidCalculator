package com.example.jiaching.calculator;

import android.content.Context;
import android.view.View;
import android.widget.Button;

/**
 * Created by JiaChing on 2015/3/21.
 */
public class OperadnImageButtonDot extends OperandImageButton {
    private String numbeString = null;
    private int imageID ;
    private int imageIdClicked ;
    public OperadnImageButtonDot(Context context) {
        super(context);
        setOnClickListener(this);
    }

    @Override
    public void setNumber(String _number) {
        numbeString = _number;
    }
    @Override
    public void setImageID(int _clickedImage, int _image) {
        imageID = _image;
        imageIdClicked = _clickedImage;
    }

    @Override
    public void drawImage() {
        setImageResource(imageID);
    }

    @Override
    public void onClick(View v) {

    }
}
