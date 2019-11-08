package com.yingze.componentsbase.service;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public interface IAccountService {

    /**
     * 是否已经登录
     *
     * @return
     */
    boolean isLogin();

    /**
     * 获取登录用户的 AccountId
     *
     * @return
     */
    String getAccountId();


    /**
     * 避免直接引用组件中的fragment
     *
     * @return
     */
    Fragment getSomeFragment(Activity activity, FragmentManager manager, int container, Bundle bundle, String tag);

}
