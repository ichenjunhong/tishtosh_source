package com.bytedance.android.livesdkapi.depend.p436d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdkapi.depend.p436d.C8620a.C8622a;
import com.bytedance.android.livesdkapi.depend.p436d.C8620a.C8624c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.android.livesdkapi.depend.d.b */
public class C8626b {

    /* renamed from: a */
    public static final String f23598a = "b";

    /* renamed from: b */
    public static volatile C8624c f23599b;

    /* renamed from: c */
    private static final String f23600c;

    /* renamed from: d */
    private static final C8624c f23601d = new C8624c() {
        /* renamed from: a */
        public final void mo14291a() {
            if (C8626b.f23599b != null) {
                C8626b.f23599b.mo14291a();
            }
        }
    };

    /* renamed from: e */
    private static volatile C8626b f23602e;

    /* renamed from: f */
    private boolean f23603f;

    /* renamed from: g */
    private Executor f23604g;

    /* renamed from: h */
    private Handler f23605h;

    private C8626b() {
    }

    /* renamed from: a */
    public final void mo15106a(Callable callable) {
        m17018a((Handler) null, callable, 0);
    }

    /* renamed from: b */
    private synchronized void m17021b() {
        m17015a(64);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f23598a);
        sb.append("-Thread");
        f23600c = sb.toString();
    }

    /* renamed from: a */
    public static C8626b m17014a() {
        if (f23602e == null) {
            synchronized (C8626b.class) {
                if (f23602e == null) {
                    C8626b bVar = new C8626b();
                    f23602e = bVar;
                    bVar.m17021b();
                }
            }
        }
        return f23602e;
    }

    /* renamed from: a */
    public final synchronized void mo15104a(C8624c cVar) {
        f23599b = cVar;
    }

    /* renamed from: a */
    private synchronized void m17015a(int i) {
        m17016a(64, f23600c);
    }

    /* renamed from: a */
    private static void m17019a(C8626b bVar) {
        if (!bVar.f23603f) {
            throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
        }
    }

    /* renamed from: a */
    private synchronized void m17020a(Executor executor) {
        this.f23604g = executor;
        this.f23605h = new Handler(Looper.getMainLooper());
        this.f23603f = true;
    }

    /* renamed from: a */
    public final void mo15105a(Runnable runnable) {
        m17019a(this);
        if (this.f23605h != null) {
            this.f23605h.post(runnable);
        }
    }

    /* renamed from: a */
    private synchronized void m17016a(int i, String str) {
        m17017a(i, str, f23601d);
    }

    /* renamed from: a */
    private synchronized void m17017a(int i, String str, C8624c cVar) {
        C8622a aVar = new C8622a();
        aVar.f23591a = i;
        aVar.f23593c = str;
        aVar.f23592b = cVar;
        m17020a((Executor) new C8620a(aVar.f23591a, new C8625d(aVar.f23593c), aVar.f23592b));
    }

    /* renamed from: a */
    private void m17018a(Handler handler, final Callable callable, int i) {
        m17019a(this);
        this.f23604g.execute(new Runnable(null, 0) {
            public final void run() {
                if (null == null) {
                    try {
                        callable.call();
                    } catch (Exception unused) {
                    }
                } else {
                    Message obtainMessage = null.obtainMessage(0);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e) {
                        obtainMessage.obj = e;
                    }
                    null.sendMessage(obtainMessage);
                }
            }
        });
    }
}
