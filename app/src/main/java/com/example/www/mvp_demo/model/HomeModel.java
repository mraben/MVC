package com.example.www.mvp_demo.model;

import com.example.www.mvp_demo.iview.OnHomeListener;

/**
 * Description:
 * Date       : 2018/8/4.
 */
public interface HomeModel {

    void getData(int id, OnHomeListener listener);

}
