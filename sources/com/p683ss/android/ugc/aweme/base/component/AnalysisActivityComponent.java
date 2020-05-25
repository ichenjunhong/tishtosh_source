package com.p683ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.GenericLifecycleObserver;
import com.p683ss.android.ugc.aweme.analysis.C22582c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent */
public class AnalysisActivityComponent implements GenericLifecycleObserver {

    /* renamed from: a */
    WeakReference<C22582c> f62559a;

    /* renamed from: b */
    Activity f62560b;

    /* renamed from: c */
    private long f62561c;

    public AnalysisActivityComponent(Activity activity) {
        this.f62560b = activity;
        if (activity instanceof C22582c) {
            this.f62559a = new WeakReference<>((C22582c) activity);
        }
    }

    /* renamed from: a */
    public final void mo265a(C0184k kVar, C0177a aVar) {
        switch (aVar) {
            case ON_RESUME:
                this.f62561c = System.currentTimeMillis();
                return;
            case ON_PAUSE:
                if (this.f62561c != -1) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f62561c;
                    if (currentTimeMillis > 0) {
                        C0013i.m18a((Callable<TResult>) new C23500b<TResult>(this, currentTimeMillis), (Executor) C26890h.m65003a());
                    }
                    this.f62561c = -1;
                    break;
                }
                break;
        }
    }
}
