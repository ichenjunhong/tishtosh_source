package com.p683ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.DataCenter */
public class DataCenter extends C0209x {

    /* renamed from: a */
    public AtomicInteger f62224a = new AtomicInteger(0);

    /* renamed from: b */
    private Map<String, Object> f62225b = new HashMap();

    /* renamed from: c */
    private Map<String, C23275b<C23274a>> f62226c = new HashMap();

    /* renamed from: d */
    private C0184k f62227d;

    /* renamed from: e */
    private Thread f62228e;

    /* renamed from: f */
    private Handler f62229f = new Handler(Looper.getMainLooper());

    public void onCleared() {
        this.f62225b.clear();
        this.f62226c.clear();
        this.f62227d = null;
    }

    /* renamed from: a */
    public final DataCenter mo48225a(C0199s<C23274a> sVar) {
        for (C23275b removeObserver : this.f62226c.values()) {
            removeObserver.removeObserver(sVar);
        }
        return this;
    }

    /* renamed from: b */
    private C23275b<C23274a> m57236b(String str) {
        C23275b<C23274a> bVar = (C23275b) this.f62226c.get(str);
        if (bVar == null) {
            bVar = new C23275b<>();
            if (this.f62225b.containsKey(str)) {
                bVar.setValue(new C23274a(str, this.f62225b.get(str)));
            }
            this.f62226c.put(str, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public final <T> T mo48229a(String str) {
        T t = this.f62225b.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final DataCenter mo48226a(String str, C0199s<C23274a> sVar) {
        return mo48227a(str, sVar, false);
    }

    /* renamed from: a */
    public static DataCenter m57235a(C0210y yVar, C0184k kVar) {
        DataCenter dataCenter = (DataCenter) yVar.mo359a(DataCenter.class);
        dataCenter.f62227d = kVar;
        return dataCenter;
    }

    /* renamed from: b */
    public final <T> T mo48230b(String str, T t) {
        if (!this.f62225b.containsKey(str)) {
            return t;
        }
        return mo48229a(str);
    }

    /* renamed from: a */
    public final DataCenter mo48228a(final String str, final Object obj) {
        boolean z;
        if (this.f62228e == null) {
            this.f62228e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f62228e) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f62229f.post(new Runnable() {
                public final void run() {
                    DataCenter.this.mo48228a(str, obj);
                }
            });
            return this;
        }
        while (this.f62224a.get() > 0) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            this.f62225b.put(str, obj);
            C0198r rVar = (C0198r) this.f62226c.get(str);
            if (rVar != null) {
                rVar.setValue(new C23274a(str, obj));
            }
        }
        return this;
    }

    /* renamed from: a */
    public final DataCenter mo48227a(String str, C0199s<C23274a> sVar, boolean z) {
        if (TextUtils.isEmpty(str) || sVar == null) {
            return this;
        }
        m57236b(str).mo48247a(this.f62227d, sVar, z);
        return this;
    }
}
