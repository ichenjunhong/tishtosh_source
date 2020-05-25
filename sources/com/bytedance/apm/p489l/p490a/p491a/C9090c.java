package com.bytedance.apm.p489l.p490a.p491a;

import android.os.HandlerThread;

/* renamed from: com.bytedance.apm.l.a.a.c */
public class C9090c extends HandlerThread {

    /* renamed from: a */
    public C9091a f24837a;

    /* renamed from: com.bytedance.apm.l.a.a.c$a */
    public interface C9091a {
        /* renamed from: a */
        void mo16453a();
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        synchronized (C9090c.class) {
            if (this.f24837a != null) {
                this.f24837a.mo16453a();
            }
        }
    }

    public C9090c(String str) {
        super(str);
    }
}
