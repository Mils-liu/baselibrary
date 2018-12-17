package com.mils.baselibrary.dialogfragment;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import com.mils.baselibrary.R;
import com.mils.baselibrary.base.BaseDialogFragment;

import butterknife.BindView;


/**
 * Created by Administrator on 2018/6/11.
 */

public class LoadingDialogFragment extends BaseDialogFragment{

    public TextView txt_loading;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        txt_loading = (TextView)view.findViewById(R.id.txt_loading);
        setDialog_gravity(Gravity.CENTER);
        setWidthPercent(0.8f);
    }

    @Override
    protected int setLayoutResouceId() {
        return R.layout.dialog_loading;
    }

    @Override
    protected int setLayoutStyleId() {
        return R.style.dialog_custom;
    }

    @Override
    protected Boolean setOntouchCancel() {
        return false;
    }

    @Override
    protected void initData(Bundle bundle) {
        super.initData(bundle);
        if(bundle != null){
            String msg = bundle.getString("msg");
            txt_loading.setText(msg);
        }
    }
}
