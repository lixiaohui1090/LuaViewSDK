package com.taobao.luaview.activity;

import android.app.Activity;
import android.os.Bundle;

import com.taobao.luaview.global.Constants;
import com.taobao.luaview.global.LuaView;

/**
 * LuaView Activity
 *
 * @author song
 * @date 15/9/22
 */
public class LuaViewActivity extends Activity {
    private LuaView mLuaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLuaView = LuaView.create(this);
        setContentView(mLuaView);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (mLuaView != null) {
            registerNameBeforeLoad(mLuaView);
            load(mLuaView);
        }
    }

    /**
     * 注册接口，注册各种脚本，panel
     */
    public void registerNameBeforeLoad(final LuaView luaView) {
    }

    /**
     * 加载数据
     */
    public void load(final LuaView luaView) {
        luaView.load(getLuaUri());
    }

    /**
     * 获取文件名称
     *
     * @return
     */
    private String getLuaUri() {
        if (getIntent() != null && getIntent().hasExtra(Constants.PARAM_URI)) {
            return getIntent().getStringExtra(Constants.PARAM_URI);
        }
        return null;
    }

    public LuaView getLuaView() {
        return mLuaView;
    }
}
