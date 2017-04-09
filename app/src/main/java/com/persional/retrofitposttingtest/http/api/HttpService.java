package com.persional.retrofitposttingtest.http.api;

import com.persional.retrofitposttingtest.http.entity.InspectListBean;
import com.persional.retrofitposttingtest.http.entity.ResultData;
import com.persional.retrofitposttingtest.http.entity.UserBean;

import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Tao on 2016/11/16.
 */

public interface HttpService {


    public static final String root_url = "http://121.196.205.177:8082/pms_wn/";//测试版本


    /**
     * 登录接口
     *
     * @param username
     * @param password
     * @return
     */
    @POST("app/login/")
    Observable<ResultData<UserBean>> getLogin
    (@Query("username") String username,
     @Query("password") String password,
     @Query("deviceid") String deviceId);


    /**
     * 获取巡查记录列表接口
     *
     * @param companyid
     * @param zonecode
     * @param page
     * @return
     */
    @POST("app/getInspectionList/{companyid}/{zonecode}/{companytype}/{page}/")
    Observable<ResultData<InspectListBean>> getInspectList(
            @Path("companyid") String companyid,
            @Path("zonecode") String zonecode,
            @Path("companytype") String companytype,
            @Path("page") int page);


}
