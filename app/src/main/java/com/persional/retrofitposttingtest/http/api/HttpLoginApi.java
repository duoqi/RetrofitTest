package com.persional.retrofitposttingtest.http.api;

import android.app.Activity;

import com.persional.retrofitposttingtest.http.listener.HttpOnNextListener;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by duoqi.tao on 2017/4/6.
 */

public class HttpLoginApi extends BaseApi {

    private String username;
    private String password;
    private String deviceId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public HttpLoginApi(HttpOnNextListener listener, Activity activity) {
        super(listener, activity);
        setShowProgress(false);
    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        HttpService httpService = retrofit.create(HttpService.class);
        return httpService.getLogin(getUsername(), getPassword(), getDeviceId());
    }
}
