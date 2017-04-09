package com.persional.retrofitposttingtest;

import android.app.Application;

import com.persional.retrofitposttingtest.db.DaoMaster;
import com.persional.retrofitposttingtest.db.DaoSession;

/**
 * Created by duoqi.tao on 2017/4/7.
 */

public class GlobalApplication extends Application {

    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(getApplicationContext(), "retrofittest.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoSession(){
        return daoSession;
    }
}
