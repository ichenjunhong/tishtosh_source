package com.bytedance.common.utility.p522b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.common.utility.b.g */
public final class C9381g extends Handler {

    /* renamed from: a */
    WeakReference<C9382a> f25612a;

    /* renamed from: com.bytedance.common.utility.b.g$a */
    public interface C9382a {
        void handleMsg(Message message);
    }

    public final void handleMessage(Message message) {
        C9382a aVar = (C9382a) this.f25612a.get();
        if (aVar != null && message != null) {
            aVar.handleMsg(message);
        }
    }

    public C9381g(C9382a aVar) {
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        } else {
            looper = Looper.myLooper();
        }
        this(looper, aVar);
    }

    public C9381g(Looper looper, C9382a aVar) {
        super(looper);
        this.f25612a = new WeakReference<>(aVar);
    }
}
