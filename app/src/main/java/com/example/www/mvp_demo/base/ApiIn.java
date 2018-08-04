package com.example.www.mvp_demo.base;


import com.example.www.mvp_demo.api.Api;

import retrofit2.Retrofit;

/**
 * Description:
 */

public class ApiIn extends BaseApi {

    @Override
    public Api getObservable(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }
}
