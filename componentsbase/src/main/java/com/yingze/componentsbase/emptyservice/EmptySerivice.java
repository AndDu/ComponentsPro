package com.yingze.componentsbase.emptyservice;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.yingze.componentsbase.service.IAccountService;

public class EmptySerivice implements IAccountService {


    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }

    @Override
    public Fragment getSomeFragment(Activity activity, FragmentManager manager, int container, Bundle bundle, String tag) {
        return null;
    }
}
