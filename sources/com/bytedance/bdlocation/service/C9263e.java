package com.bytedance.bdlocation.service;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.BaseLocate;
import com.bytedance.bdlocation.ILocate;
import com.bytedance.bdlocation.client.BDLocationClient.Callback;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.client.LocationOption;

/* renamed from: com.bytedance.bdlocation.service.e */
public final class C9263e implements Callback {

    /* renamed from: a */
    ILocate f25355a;

    /* renamed from: b */
    public LocationOption f25356b;

    /* renamed from: c */
    public Looper f25357c;

    /* renamed from: d */
    private final Callback f25358d;

    /* renamed from: e */
    private final ILocate f25359e;

    /* renamed from: f */
    private final ILocate f25360f;

    /* renamed from: g */
    private final C9255d f25361g;

    /* renamed from: h */
    private boolean f25362h;

    /* renamed from: i */
    private int f25363i;

    /* renamed from: j */
    private Handler f25364j;

    /* renamed from: a */
    private static ILocate m18373a(ILocate iLocate, ILocate iLocate2) {
        return iLocate != null ? iLocate : iLocate2;
    }

    public final void onLocationChanged(BDLocation bDLocation) {
        this.f25363i = 0;
        this.f25358d.onLocationChanged(bDLocation);
    }

    public final void onError(BDLocationException bDLocationException) {
        this.f25363i++;
        if (this.f25362h) {
            if (m18374a(this.f25360f, bDLocationException)) {
                return;
            }
        } else if (this.f25363i > 2) {
            m18374a(this.f25360f, bDLocationException);
        }
        this.f25358d.onError(bDLocationException);
    }

    /* renamed from: a */
    private boolean m18374a(ILocate iLocate, BDLocationException bDLocationException) {
        if (this.f25355a == iLocate) {
            return false;
        }
        this.f25355a.stopLocation();
        this.f25356b.getTrace().mo16673b(bDLocationException);
        if (this.f25358d instanceof C9250b) {
            ((C9250b) this.f25358d).mo16777b();
        }
        this.f25355a = iLocate;
        this.f25364j.post(new Runnable() {
            public final void run() {
                C9263e.this.mo16794a(C9263e.this, C9263e.this.f25356b, C9263e.this.f25357c);
            }
        });
        return true;
    }

    /* renamed from: a */
    public final void mo16795a(LocationOption locationOption, Looper looper) {
        boolean z;
        if (locationOption.getInterval() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f25362h = z;
        this.f25363i = 0;
        this.f25356b = locationOption;
        this.f25357c = looper;
        this.f25364j = new Handler(looper);
        this.f25355a = m18373a(this.f25359e, this.f25360f);
        mo16794a(this, locationOption, looper);
    }

    /* renamed from: a */
    public final void mo16794a(Callback callback, LocationOption locationOption, Looper looper) {
        try {
            ((BaseLocate) this.f25355a).setLocateCallback(locationOption.getTrace());
            this.f25355a.startLocation(callback, locationOption, looper);
        } catch (Exception e) {
            BDLocationException bDLocationException = new BDLocationException((Throwable) e, this.f25355a.getLocateName(), "5");
            onError(bDLocationException);
            ((BaseLocate) this.f25355a).onLocateError(this.f25355a.getLocateName(), bDLocationException);
            this.f25361g.mo16783a();
        }
    }

    public C9263e(Callback callback, ILocate iLocate, ILocate iLocate2, C9255d dVar) {
        this.f25358d = callback;
        this.f25359e = iLocate;
        this.f25360f = iLocate2;
        this.f25361g = dVar;
    }
}
