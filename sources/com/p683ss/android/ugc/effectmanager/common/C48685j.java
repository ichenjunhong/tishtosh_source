package com.p683ss.android.ugc.effectmanager.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.effectmanager.common.j */
public final class C48685j extends Handler {

    /* renamed from: a */
    WeakReference<C48686a> f122342a;

    /* renamed from: com.ss.android.ugc.effectmanager.common.j$a */
    public interface C48686a {
        /* renamed from: a */
        void mo96274a(Message message);
    }

    public final void handleMessage(Message message) {
        C48686a aVar = (C48686a) this.f122342a.get();
        if (aVar != null && message != null) {
            aVar.mo96274a(message);
        }
    }

    public C48685j(C48686a aVar) {
        super(Looper.getMainLooper());
        this.f122342a = new WeakReference<>(aVar);
    }

    public C48685j(Looper looper, C48686a aVar) {
        super(looper);
        this.f122342a = new WeakReference<>(aVar);
    }
}
