package com.example.zhongshifeng.dierci;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;

import java.security.KeyException;

public class MyButton extends android.support.v7.widget.AppCompatButton{
    public MyButton(Context context, AttributeSet set){
        super(context,set);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        super.onKeyDown(keyCode,event);
        Log.v("-crazyit.org-","the onKeyDown in MyButton");

        return false;
    }
}
