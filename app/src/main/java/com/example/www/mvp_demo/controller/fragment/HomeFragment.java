package com.example.www.mvp_demo.controller.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.www.mvp_demo.R;
import com.example.www.mvp_demo.base.BaseFragment;
import com.example.www.mvp_demo.model.HomeModellmpl;
import com.example.www.mvp_demo.utils.ToastUtil;
import com.example.www.mvp_demo.iview.OnHomeListener;

import butterknife.BindView;

/**
 * Description:
 * Date       : 2018/7/29.
 */
public class HomeFragment extends BaseFragment implements OnHomeListener{


    @BindView(R.id.h_tv)
    TextView h_tv;
    private HomeModellmpl hlmp;


    @Override
    protected View setLayoutId(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        hlmp = new HomeModellmpl();
        return View.inflate(getContext(), R.layout.homelayout, null);
    }

    @Override
    protected void init() {
        super.init();
        hlmp.getData(0,this);
    }


    @Override
    public void onSuccess(String s) {
        ToastUtil.showShort(getContext(),s);
    }

    @Override
    public void onFail(String e) {
        ToastUtil.showShort(getContext(),e);
    }
}
