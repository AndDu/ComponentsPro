package com.yingze.componentsdemo;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.yingze.base.AppConfig;
import com.yingze.base.BaseApp;

public class MyApplication extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);

        if (isDebug()) {
            // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();
            ARouter.openDebug();  // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this);
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    @Override
    public void initModuleApp(Application application) {
        for (String moduleApp : AppConfig.sMoudleApp) {
            try {
                Class clazz = Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.initModuleApp(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void initModuleData(Application application) {

        for (String moduleApp : AppConfig.sMoudleApp) {
            try {
                Class clazz = Class.forName(moduleApp);
                BaseApp baseApp = (BaseApp) clazz.newInstance();
                baseApp.initModuleData(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }


    }
}
