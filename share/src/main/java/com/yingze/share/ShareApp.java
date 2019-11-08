package com.yingze.share;

import android.app.Application;
import android.util.Log;

import com.yingze.base.BaseApp;

public class ShareApp extends BaseApp {


    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
    }

    @Override
    public void initModuleApp(Application application) {
        Log.e("initModuleApp: ", "---------------init ShareApp--------------------");
    }

    @Override
    public void initModuleData(Application application) {

    }
}
