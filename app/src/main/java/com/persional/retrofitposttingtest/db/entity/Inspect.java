package com.persional.retrofitposttingtest.db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by duoqi.tao on 2017/4/7.
 */
@Entity
public class Inspect {

    public String roadname; //巡查线路
    public String inspectiondate;//巡查日期
    public String weather;//天气
    public String checkpos;//巡查部位
    public String information;//存在问题
    public String process;//处理措施
    public String imagepath;//图片链接
    public String createdate;//添加日期
    public String roadcode;//线路编号
    @Id
    public String inspectionid;//巡查ID
    public String address;//巡查ID
    @Generated(hash = 440802390)
    public Inspect(String roadname, String inspectiondate, String weather,
            String checkpos, String information, String process, String imagepath,
            String createdate, String roadcode, String inspectionid,
            String address) {
        this.roadname = roadname;
        this.inspectiondate = inspectiondate;
        this.weather = weather;
        this.checkpos = checkpos;
        this.information = information;
        this.process = process;
        this.imagepath = imagepath;
        this.createdate = createdate;
        this.roadcode = roadcode;
        this.inspectionid = inspectionid;
        this.address = address;
    }
    @Generated(hash = 1505544833)
    public Inspect() {
    }
    public String getRoadname() {
        return this.roadname;
    }
    public void setRoadname(String roadname) {
        this.roadname = roadname;
    }
    public String getInspectiondate() {
        return this.inspectiondate;
    }
    public void setInspectiondate(String inspectiondate) {
        this.inspectiondate = inspectiondate;
    }
    public String getWeather() {
        return this.weather;
    }
    public void setWeather(String weather) {
        this.weather = weather;
    }
    public String getCheckpos() {
        return this.checkpos;
    }
    public void setCheckpos(String checkpos) {
        this.checkpos = checkpos;
    }
    public String getInformation() {
        return this.information;
    }
    public void setInformation(String information) {
        this.information = information;
    }
    public String getProcess() {
        return this.process;
    }
    public void setProcess(String process) {
        this.process = process;
    }
    public String getImagepath() {
        return this.imagepath;
    }
    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
    public String getCreatedate() {
        return this.createdate;
    }
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
    public String getRoadcode() {
        return this.roadcode;
    }
    public void setRoadcode(String roadcode) {
        this.roadcode = roadcode;
    }
    public String getInspectionid() {
        return this.inspectionid;
    }
    public void setInspectionid(String inspectionid) {
        this.inspectionid = inspectionid;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
