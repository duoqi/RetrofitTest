package com.persional.retrofitposttingtest.http.api;

import android.app.Activity;

import com.persional.retrofitposttingtest.http.listener.HttpOnNextListener;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * Created by duoqi.tao on 2017/4/7.
 */

public class HttpGetInspectListApi  extends BaseApi{

    private String companyid;
    private String zonecode;
    private String companytype;
    private int page;

    public HttpGetInspectListApi(HttpOnNextListener listener, Activity activity) {
        super(listener, activity);
        setShowProgress(true);
    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        HttpService service = retrofit.create(HttpService.class);
        return service.getInspectList(getCompanyid(),getZonecode(),getCompanytype(),getPage());
    }


    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode;
    }

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
