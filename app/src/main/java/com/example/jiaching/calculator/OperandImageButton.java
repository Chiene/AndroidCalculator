package com.example.jiaching.calculator;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by JiaChing on 2015/3/21.
 */
abstract class OperandImageButton extends ImageButton implements Button.OnClickListener{

    public OperandImageButton(Context context) {
        super(context);
    }
    abstract void setNumber(String _number) ;
    abstract void setImageID(int _clickedImage,int _image);
    abstract void drawImage();
}
