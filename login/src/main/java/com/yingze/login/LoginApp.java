package com.yingze.login;

import android.app.Application;
import android.util.Log;

import com.yingze.base.BaseApp;
import com.yingze.componentsbase.ServiceFactory;

public class LoginApp extends BaseApp {


    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
        Log.e("initModuleApp: ","----------------init LoginApp------------------" );
    }

    @Override
    public void initModuleData(Application application) {

    }
}
