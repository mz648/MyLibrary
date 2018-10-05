package com.qeshm.mylib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class myImageView extends android.support.v7.widget.AppCompatImageView {
    public myImageView(Context context) {
        super(context);
        init(null);
    }

    public myImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public myImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    void init(AttributeSet attrs){

        if(attrs==null)
            return;

        TypedArray typedArray=getContext().obtainStyledAttributes(attrs,R.styleable.myImageView);

        set_tint_color(typedArray);

        typedArray.recycle();
    }

    void set_tint_color(TypedArray typedArray){

        String _set_tint_color=typedArray.getString(R.styleable.myImageView_set_tint_color);
        if(_set_tint_color==null || _set_tint_color.equals("") )
            return;

        boolean set_tint_color=Boolean.parseBoolean(_set_tint_color);
        if(set_tint_color==false)
            return;

        String tint_color=typedArray.getString(R.styleable.myImageView_tint_color);
        if(tint_color==null || tint_color.equals("") )
            return;

//        setColorFilter(Color.parseColor(tint_color), PorterDuff.Mode.MULTIPLY);
        setColorFilter(Color.parseColor(tint_color));
    }
}
