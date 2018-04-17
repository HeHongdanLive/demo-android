package com.demo.demo_android.is_pad;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.demo.demo_android.R;

/**
 * 测试是否为平板电脑Activity
 *
 * @author HHD
 * @date 2018/04/17
 */
public class IsPadActivity extends AppCompatActivity {

    /** 上下文 */
    private Context mContext;
    /** 显示结果内容文本组件 */
    private TextView tv_conten;
    /** 判断按钮组件 */
    private TextView btn_is_pad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_pad);

        mContext = this;
        tv_conten = findViewById(R.id.tv_content);
        btn_is_pad = findViewById(R.id.btn_is_pad);

        btn_is_pad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (UtilPad.isPad(mContext)){
                    tv_conten.setText("是平板电脑");
                } else {
                    tv_conten.setText("不是平板电脑");
                }
            }
        });
    }
}
