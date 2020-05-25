package com.bytedance.p702im.core.internal.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.im.core.internal.utils.n */
public final class C11501n extends Handler {

    /* renamed from: a */
    WeakReference<C11502a> f30842a;

    /* renamed from: com.bytedance.im.core.internal.utils.n$a */
    public interface C11502a {
        /* renamed from: a */
        void mo20961a(Message message);
    }

    public final void handleMessage(Message message) {
        C11502a aVar = (C11502a) this.f30842a.get();
        if (aVar != null && message != null) {
            aVar.mo20961a(message);
        }
    }

    public C11501n(C11502a aVar) {
        this.f30842a = new WeakReference<>(aVar);
    }

    public C11501n(Looper looper, C11502a aVar) {
        super(looper);
        this.f30842a = new WeakReference<>(aVar);
    }
}
