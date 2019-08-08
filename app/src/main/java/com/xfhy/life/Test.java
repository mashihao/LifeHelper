package com.xfhy.life;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * @author : 马世豪
 * time : 2019-07-28 20
 * email : ma_shihao@yeah.net
 * des :
 */
public class Test extends AppCompatActivity {


    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);


    }

    String age = "";


    class InnerClass{

        public String getAge(){

            return age+"";
        }
    }
}
