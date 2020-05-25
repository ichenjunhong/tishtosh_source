package com.bytedance.android.live.core.performance;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class BaseSampler<T> implements C0183j, Runnable {

    /* renamed from: f */
    private static final String f11058f = BaseSampler.class.getClass().getSimpleName();

    /* renamed from: a */
    protected final int f11059a;

    /* renamed from: b */
    protected final int f11060b;

    /* renamed from: c */
    protected Handler f11061c;

    /* renamed from: d */
    protected WeakReference<Context> f11062d;

    /* renamed from: e */
    protected C3972a f11063e;

    /* renamed from: g */
    private ArrayList<T> f11064g = new ArrayList<>();

    /* renamed from: com.bytedance.android.live.core.performance.BaseSampler$a */
    public interface C3972a {
        /* renamed from: a */
        void mo9368a();

        /* renamed from: a */
        void mo9369a(ArrayList arrayList, HashMap<String, String> hashMap);
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        mo9358a();
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
    }

    @C0200t(mo345a = C0177a.ON_START)
    public void onStart() {
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
    }

    /* renamed from: a */
    public final void mo9358a() {
        if (this.f11061c != null) {
            this.f11061c.removeCallbacks(this);
            this.f11061c = null;
        }
        if (this.f11063e != null) {
            this.f11063e.mo9368a();
            this.f11063e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9360a(T t) {
        this.f11064g.add(t);
    }

    /* renamed from: a */
    public void mo9361a(HashMap<String, String> hashMap) {
        if (this.f11061c != null) {
            this.f11061c.removeCallbacks(this);
            this.f11061c = null;
        }
        if (this.f11063e != null) {
            this.f11063e.mo9369a(this.f11064g, hashMap);
            this.f11063e = null;
        }
    }

    public BaseSampler(int i, int i2) {
        this.f11059a = i;
        this.f11060b = i2;
    }

    /* renamed from: a */
    public final void mo9359a(Handler handler, Context context, C3972a aVar) {
        this.f11061c = handler;
        this.f11062d = new WeakReference<>(context);
        this.f11063e = aVar;
        if (this.f11061c != null) {
            this.f11061c.post(this);
        }
    }
}
