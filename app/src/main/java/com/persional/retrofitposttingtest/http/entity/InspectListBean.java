package com.persional.retrofitposttingtest.http.entity;

import com.persional.retrofitposttingtest.db.entity.Inspect;

import java.util.List;

/**
 * Created by duoqi.tao on 2016/11/30.
 */

public class InspectListBean {

    public int totalpagel;
    public int currentpage;
    public boolean hasnextpage;
    public List<Inspect> list;
}
