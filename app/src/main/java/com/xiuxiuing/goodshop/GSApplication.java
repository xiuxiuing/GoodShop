package com.xiuxiuing.goodshop;

import android.app.Application;
import android.util.Log;

import com.alibaba.baichuan.android.trade.AlibcTradeSDK;
import com.alibaba.baichuan.android.trade.callback.AlibcTradeInitCallback;

/**
 * Created by wang on 2017/8/1.
 */

public class GSApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AlibcTradeSDK.asyncInit(this, new AlibcTradeInitCallback() {
            @Override
            public void onSuccess() {
                //初始化成功，设置相关的全局配置参数
                Log.d("TAG","SUCCESS");
                // ...
            }

            @Override
            public void onFailure(int code, String msg) {
                //初始化失败，可以根据code和msg判断失败原因，详情参见错误说明
                Log.d("TAG","onFailure");
            }
        });

    }

}
