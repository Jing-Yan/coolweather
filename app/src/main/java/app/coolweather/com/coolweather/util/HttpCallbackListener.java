package app.coolweather.com.coolweather.util;

/**
 * Created by Jason on 2017/5/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
