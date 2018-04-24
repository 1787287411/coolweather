package com.coolweather.app.util;

/**
 * Created by 17872 on 2018/4/24.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
