package com.example.www.mvp_demo.model;

import com.example.www.mvp_demo.base.RxSchedelers;
import com.example.www.mvp_demo.iview.OnHomeListener;

import okhttp3.ResponseBody;

/**
 * Description:
 * Date       : 2018/8/4.
 */
public class HomeModellmpl implements HomeModel {
    @Override
    public void getData(int id, final OnHomeListener listener) {
        Model m = Model.getInstance();
       m.getApi().getempty().subscribe(new RxSchedelers<ResponseBody>(){
           @Override
           public void onNext(ResponseBody responseBody) {
               super.onNext(responseBody);
               listener.onSuccess("成功");
           }

           @Override
           public void onError(Throwable e) {
               super.onError(e);
               listener.onFail("失败");
           }
       });
    }
}
