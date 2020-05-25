package com.p683ss.android.ugc.aweme.base.mvvm.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.mvvm.C23561d;
import com.p683ss.android.ugc.aweme.base.mvvm.C23562e;

/* renamed from: com.ss.android.ugc.aweme.base.mvvm.impl.IViewDefault */
public abstract class IViewDefault<K extends C23562e> implements C23561d<K> {
    protected View mView;

    public View getAndroidView() {
        return this.mView;
    }

    public void refresh() {
    }

    public Activity getActivity() {
        return (Activity) getAndroidView().getContext();
    }

    public Context getContext() {
        return getAndroidView().getContext();
    }

    public IViewDefault(Context context) {
    }
}
