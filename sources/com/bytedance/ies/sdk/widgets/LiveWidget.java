package com.bytedance.ies.sdk.widgets;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.rxutils.C3984a;
import com.bytedance.android.live.core.rxutils.C4056e;
import com.bytedance.android.live.core.rxutils.C4059g;
import com.bytedance.android.live.core.rxutils.autodispose.C3991a;
import com.bytedance.android.live.core.rxutils.autodispose.C4004ae;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.rxutils.autodispose.C4034m;
import com.bytedance.android.livesdk.C8580y;
import p064c.p065a.p069b.C1689b;

public abstract class LiveWidget extends Widget {
    private C1689b compositeDisposable;
    private C3984a lifecycleTransformer;
    private C4059g transformer;

    public final <T> C3984a<T> getAutoUnbindTransformer() {
        return this.lifecycleTransformer;
    }

    public Context getContext() {
        return this.context;
    }

    public DataCenter getDataCenter() {
        return this.dataCenter;
    }

    public final <T> C4034m<T> autoDispose() {
        return C4021e.m10136a((C0184k) this);
    }

    public final <T> C4034m<T> activityAutoDispose() {
        return C4021e.m10136a((C0184k) this.context);
    }

    public void onDestroy() {
        super.onDestroy();
        this.compositeDisposable.dispose();
        this.subWidgetManager = null;
    }

    public final <T> C4034m<T> activityAutoDisposeWithTransformer() {
        if (this.transformer == null) {
            this.transformer = new C4059g();
        }
        return C4021e.m10142a((C4004ae) C3991a.m10107a((C0184k) this.context, C0177a.ON_DESTROY), (C4056e<T>) this.transformer);
    }

    public final <T> C4034m<T> autoDisposeWithTransformer() {
        if (this.transformer == null) {
            this.transformer = new C4059g();
        }
        return C4021e.m10142a((C4004ae) C3991a.m10107a((C0184k) this, C0177a.ON_DESTROY), (C4056e<T>) this.transformer);
    }

    public void onCreate() {
        if (this.compositeDisposable != null) {
            this.compositeDisposable.dispose();
        }
        this.compositeDisposable = new C1689b();
        this.lifecycleTransformer = new C3984a(this.compositeDisposable);
        super.onCreate();
    }

    public void enableSubWidgetManager() {
        if (this.subWidgetManager == null) {
            this.subWidgetManager = RecyclableWidgetManager.m22271of(this.widgetCallback.getFragment(), this.contentView);
            ((RecyclableWidgetManager) this.subWidgetManager).setWidgetProvider(C8580y.m16962a());
            this.subWidgetManager.setDataCenter(this.dataCenter);
        }
    }

    public final <T extends View> T findViewById(int i) {
        return this.contentView.findViewById(i);
    }
}
