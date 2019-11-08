package com.yingze.share;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.yingze.componentsbase.ServiceFactory;

@Route(path = "/share/share")
public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ServiceFactory.getInstance().getAccountService().isLogin()) {
            Toast.makeText(this, "分享成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "分享失败", Toast.LENGTH_SHORT).show();
        }
    }
}
