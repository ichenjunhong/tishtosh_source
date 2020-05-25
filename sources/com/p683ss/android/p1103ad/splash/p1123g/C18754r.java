package com.p683ss.android.p1103ad.splash.p1123g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ad.splash.g.r */
public final class C18754r extends Handler {

    /* renamed from: a */
    private WeakReference<C18755a> f51845a;

    /* renamed from: com.ss.android.ad.splash.g.r$a */
    public interface C18755a {
        /* renamed from: a */
        void mo37892a(Message message);
    }

    public final void handleMessage(Message message) {
        C18755a aVar = (C18755a) this.f51845a.get();
        if (aVar != null && message != null) {
            aVar.mo37892a(message);
        }
    }

    public C18754r(C18755a aVar) {
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = Looper.myLooper();
        }
        this(looper, aVar);
    }

    public C18754r(Looper looper, C18755a aVar) {
        super(looper);
        this.f51845a = new WeakReference<>(aVar);
    }
}
