package com.bytedance.common.wschannel.p534d;

import android.os.Handler;
import com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9493b;
import com.bytedance.common.wschannel.p534d.p535a.C9505a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.common.wschannel.d.b */
public final class C9507b {

    /* renamed from: a */
    public C9505a f25901a;

    /* renamed from: b */
    public AtomicBoolean f25902b = new AtomicBoolean(false);

    /* renamed from: c */
    public C9493b f25903c;

    /* renamed from: d */
    public C9509a f25904d;

    /* renamed from: e */
    public Handler f25905e;

    /* renamed from: f */
    public Runnable f25906f = new Runnable() {
        public final void run() {
            if (C9507b.this.f25902b.getAndSet(false) && C9507b.this.f25904d != null) {
                C9507b.this.f25904d.mo17168a();
            }
        }
    };

    /* renamed from: com.bytedance.common.wschannel.d.b$a */
    public interface C9509a {
        /* renamed from: a */
        void mo17168a();
    }

    public C9507b(C9509a aVar, Handler handler) {
        this.f25904d = aVar;
        this.f25905e = handler;
    }
}
