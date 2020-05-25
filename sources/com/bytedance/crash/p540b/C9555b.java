package com.bytedance.crash.p540b;

import android.os.SystemClock;
import com.bytedance.crash.p551k.C9647e;
import com.bytedance.crash.p551k.C9649f;

/* renamed from: com.bytedance.crash.b.b */
public final class C9555b implements Runnable {

    /* renamed from: b */
    public static long f26053b;

    /* renamed from: a */
    public final C9553a f26054a;

    /* renamed from: c */
    public final Runnable f26055c = new Runnable() {
        public final void run() {
            C9553a aVar = C9555b.this.f26054a;
            if (!C9553a.f26033d) {
                synchronized (aVar.f26039f) {
                    if (!C9553a.f26033d) {
                        aVar.f26042i.run();
                    }
                }
            }
            C9555b.f26053b = SystemClock.uptimeMillis();
            if (C9558d.m18966a()) {
                C9649f.m19247b().mo17510a(C9555b.this.f26055c, 500);
            } else {
                C9649f.m19247b().mo17510a(C9555b.this.f26055c, 500);
            }
        }
    };

    public final void run() {
        C9558d.m18965a(true);
        this.f26055c.run();
    }

    public C9555b(C9553a aVar) {
        this.f26054a = aVar;
        C9647e.m19238a().mo17494a(5000, this, 1, 0);
        C9649f.m19247b().mo17510a(this.f26055c, 5000);
    }
}
