package com.example.www.mvp_demo.model;

import com.example.www.mvp_demo.api.Api;
import com.example.www.mvp_demo.base.BaseRetrofit;
import com.example.www.mvp_demo.base.ApiIn;

import okhttp3.ResponseBody;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Description: 处理请求
 */
public class Model {
    private static Model model;



    private Api api = BaseRetrofit.getInstance().getObservable(new ApiIn());

    /**
     * @return 返回Model实例
     */
    public static Model getInstance() {

        if (model == null) {
            synchronized (Model.class) {
                if (model == null) {
                    model = new Model();
                }
            }
        }
        return model;
    }

    public Api getApi() {
        return api;
    }

    /**
     * 测试请求
     */
    public Observable<ResponseBody> apiBase(Observable<ResponseBody> obser) {
        return obser.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

}