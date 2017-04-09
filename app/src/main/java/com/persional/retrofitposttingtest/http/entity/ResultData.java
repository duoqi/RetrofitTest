package com.persional.retrofitposttingtest.http.entity;

/**
 * Created by duoqi.tao on 2017/3/30.
 */

public class ResultData<T> {

    public int code;
    public String error;
    public T content;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }


}
