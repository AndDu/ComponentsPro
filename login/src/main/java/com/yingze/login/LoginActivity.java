package com.yingze.login;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.yingze.componentsbase.ServiceFactory;

@Route(path = "/login/login")
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //假装登录了，然后把登录信息赋值给公共组件，其他组件依赖公共主键既能拿到相应的信息
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    public void login(View view) {
        LoginUtil.loginMsg = new LoginMsg("1", "男");
    }

    public void exit(View view) {
        LoginUtil.loginMsg = null;
    }


    public void jump(View view) {
        ARouter.getInstance().build("/share/share").navigation();
    }
}
