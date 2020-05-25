package com.p683ss.android.ugc.aweme.shortvideo.senor;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter */
public abstract class BaseSenorPresenter implements ISenorPresenter {

    /* renamed from: a */
    protected SparseArray<Integer> f112613a = new SparseArray<>();

    /* renamed from: b */
    private SensorManager f112614b;

    /* renamed from: c */
    private List<C44510a> f112615c;

    /* renamed from: d */
    private Context f112616d;

    /* renamed from: e */
    private boolean f112617e;

    /* renamed from: f */
    private Handler f112618f = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public void mo90408a() {
        this.f112617e = true;
    }

    /* renamed from: b */
    public final boolean mo90413b() {
        return this.f112617e;
    }

    /* renamed from: c */
    public final SensorManager mo90414c() {
        return this.f112614b;
    }

    /* renamed from: d */
    public final Context mo90415d() {
        return this.f112616d;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void unRegister() {
        this.f112617e = false;
        for (C44510a unregisterListener : this.f112615c) {
            this.f112614b.unregisterListener(unregisterListener);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90410a(C44510a aVar) {
        this.f112615c.add(aVar);
    }

    /* renamed from: a */
    public final void mo90411a(boolean z) {
        for (C44510a aVar : this.f112615c) {
            aVar.f112621a = z;
        }
    }

    /* renamed from: a */
    public final void mo90409a(int i, int i2) {
        if (i != 0) {
            this.f112613a.put(i, Integer.valueOf(0));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo90412b(int i, int i2) {
        Integer num = (Integer) this.f112613a.get(i);
        if (num == null) {
            return i2;
        }
        return num.intValue();
    }

    public BaseSenorPresenter(Context context, final C0184k kVar) {
        this.f112616d = context;
        this.f112615c = new CopyOnWriteArrayList();
        this.f112614b = (SensorManager) context.getSystemService("sensor");
        this.f112618f.post(new Runnable() {
            public final void run() {
                kVar.getLifecycle().mo324a(BaseSenorPresenter.this);
            }
        });
    }
}
