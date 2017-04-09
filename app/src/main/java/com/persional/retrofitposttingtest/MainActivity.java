package com.persional.retrofitposttingtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.persional.retrofitposttingtest.db.entity.Inspect;
import com.persional.retrofitposttingtest.http.HttpManager;
import com.persional.retrofitposttingtest.http.api.HttpGetInspectListApi;
import com.persional.retrofitposttingtest.http.api.HttpService;
import com.persional.retrofitposttingtest.http.entity.InspectListBean;
import com.persional.retrofitposttingtest.http.entity.ResultData;
import com.persional.retrofitposttingtest.http.entity.UserBean;
import com.persional.retrofitposttingtest.http.listener.HttpOnNextListener;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv_text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onText();
            }
        });
    }

    public void onText() {


//        HttpLoginApi postEntity = new HttpLoginApi(simpleOnNextListener, this);
//        postEntity.setUsername("lwxc");
//        postEntity.setPassword("1");
//        postEntity.setDeviceId("123");
//        HttpManager manager = HttpManager.getInstance();
//        manager.doHttpDeal(postEntity);


        HttpGetInspectListApi httpGetInspectListApi = new HttpGetInspectListApi(getInspectListListener, this);
        httpGetInspectListApi.setCompanyid("a8ec9fb288364bfcb7b28523882926dc");
        httpGetInspectListApi.setZonecode("6110502");
        httpGetInspectListApi.setCompanytype("2");
        httpGetInspectListApi.setPage(1);
        HttpManager.getInstance().doHttpDeal(httpGetInspectListApi);

        HttpManager.getInstance().getHttpService().getLogin("lwxc","1","123")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResultData<UserBean>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(ResultData<UserBean> userBeanResultData) {
Log.e("MainActivity.class",userBeanResultData.getContent().companyid);
                    }
                });

    }


//    HttpOnNextListener simpleOnNextListener = new HttpOnNextListener<ResultData<UserBean>>() {
//        @Override
//        public void onNext(ResultData<UserBean> userBean) {
//            Log.e("mainActivity.class.this", String.valueOf(userBean.getContent().companyid));
//        }
//    };


    HttpOnNextListener getInspectListListener = new HttpOnNextListener<ResultData<InspectListBean>>() {

        @Override
        public void onNext(ResultData<InspectListBean> resultData) {
            Log.e("mainActivity.class.this", resultData.getContent().list.size() + "");
            for (int i = 0; i < resultData.getContent().list.size(); i++) {
                String address = resultData.getContent().list.get(i).address;
                String roadname = resultData.getContent().list.get(i).roadname;
                String inspectiondate = resultData.getContent().list.get(i).inspectiondate;
                String weather = resultData.getContent().list.get(i).weather;
                String checkpos = resultData.getContent().list.get(i).checkpos;
                String information = resultData.getContent().list.get(i).information;
                String process = resultData.getContent().list.get(i).process;
                String imagepath = resultData.getContent().list.get(i).imagepath;
                String createdate = resultData.getContent().list.get(i).createdate;
                String roadcode = resultData.getContent().list.get(i).roadcode;
                String inspectionid = resultData.getContent().list.get(i).inspectionid;
                Inspect inspect = new Inspect(roadname, inspectiondate, weather,
                        checkpos, information, process, imagepath,
                        createdate, roadcode, inspectionid, address);
                GlobalApplication.getDaoSession().getInspectDao().insertOrReplace(inspect);


            }

        }

    };


}
