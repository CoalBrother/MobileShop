package com.coalbrother.mobileshop.activity;import android.support.v7.app.AppCompatActivity;import android.os.Bundle;import android.widget.TextView;import com.coalbrother.mobileshop.R;import com.coalbrother.mobileshop.common.BaseActivity;import butterknife.BindView;import butterknife.OnClick;public class MyOrderActivity extends BaseActivity {    @BindView(R.id.tv_title)    TextView tvTitle;    @Override    public int getContentViewId() {        return R.layout.activity_my_order;    }    @Override    protected void initView() {        super.initView();        tvTitle.setText("我的订单");    }    @OnClick(R.id.iv_back)    void close(){        finish();    }}