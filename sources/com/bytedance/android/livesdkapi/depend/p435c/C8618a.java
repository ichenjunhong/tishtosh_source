package com.bytedance.android.livesdkapi.depend.p435c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdkapi.depend.c.a */
public final class C8618a extends Handler {

    /* renamed from: a */
    WeakReference<C8619a> f23586a;

    /* renamed from: com.bytedance.android.livesdkapi.depend.c.a$a */
    public interface C8619a {
        /* renamed from: a */
        void mo11060a(Message message);
    }

    public final void handleMessage(Message message) {
        C8619a aVar = (C8619a) this.f23586a.get();
        if (aVar != null && message != null) {
            aVar.mo11060a(message);
        }
    }

    public C8618a(C8619a aVar) {
        this.f23586a = new WeakReference<>(aVar);
    }

    public C8618a(Looper looper, C8619a aVar) {
        super(looper);
        this.f23586a = new WeakReference<>(aVar);
    }
}
