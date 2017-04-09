package com.persional.retrofitposttingtest.http.exception;

/**
 * Created by duoqi.tao on 2017/4/6.
 */

public class HttpTimeException extends RuntimeException {

    public static final int NO_DATA = 200;
    public static final int NO_DATA2 = 204;
    public static final int NO_DATA1 = 300;


    public HttpTimeException(int resultCode) {
        this(getApiExceptionMessage(resultCode));
    }

    public HttpTimeException(String detailMessage) {
        super(detailMessage);
    }

    /**
     * 转换错误数据
     *
     * @param code
     * @return
     */
    private static String getApiExceptionMessage(int code) {
        String message = "";
        switch (code) {
            case NO_DATA:
                message = "无数据";
                break;
            case NO_DATA1:
                message = "无数据1";
                break;
            case NO_DATA2:
                message = "无数据2";
                break;
            default:
                message = "error";
                break;

        }
        return message;
    }
}
