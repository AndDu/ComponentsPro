package com.yingze.login;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.yingze.componentsbase.service.IAccountService;

public class AccountService implements IAccountService {


    @Override
    public boolean isLogin() {
        //假装有loginMode,然后就是登录了
        return LoginUtil.loginMsg != null;
    }

    @Override
    public String getAccountId() {
        //假装有loginMode
        return LoginUtil.loginMsg == null ? null : LoginUtil.loginMsg.getName();
    }

    @Override
    public Fragment getSomeFragment(Activity activity, FragmentManager manager, int container, Bundle bundle, String tag) {

        SomeFragment someFragment = new SomeFragment();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        someFragment.setArguments(bundle);
        fragmentTransaction.add(container, someFragment);
        fragmentTransaction.commit();

        return someFragment;
    }
}
