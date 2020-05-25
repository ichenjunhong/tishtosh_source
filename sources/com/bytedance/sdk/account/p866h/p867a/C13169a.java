package com.bytedance.sdk.account.p866h.p867a;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.account.h.a.a */
class C13169a extends Thread implements C9382a {

    /* renamed from: a */
    protected static C13175f f34372a = C13175f.m26551a();

    /* renamed from: b */
    protected static final AtomicInteger f34373b = new AtomicInteger();

    /* renamed from: c */
    protected C9381g f34374c;

    /* renamed from: d */
    private final BlockingQueue<C13173e> f34375d;

    /* renamed from: e */
    private volatile boolean f34376e;

    /* renamed from: f */
    private volatile boolean f34377f;

    /* renamed from: g */
    private String f34378g;

    /* renamed from: b */
    public boolean mo24773b() {
        return this.f34377f;
    }

    /* renamed from: a */
    public void mo24771a() {
        this.f34376e = true;
        interrupt();
    }

    /* renamed from: d */
    public void mo24775d() {
        this.f34374c.removeMessages(0);
    }

    /* renamed from: c */
    public void mo24774c() {
        mo24775d();
        this.f34374c.sendEmptyMessageDelayed(0, 2000);
    }

    public void run() {
        String str;
        String str2;
        Process.setThreadPriority(10);
        while (true) {
            try {
                C13173e eVar = (C13173e) this.f34375d.take();
                mo24775d();
                if (eVar != null && (eVar instanceof C13171c)) {
                    C13171c cVar = (C13171c) eVar;
                    try {
                        this.f34377f = true;
                        mo24772a(cVar);
                        if (cVar.mo24779a()) {
                            this.f34377f = false;
                        } else {
                            str2 = Thread.currentThread().getName();
                            try {
                                str = cVar.f34386d;
                                try {
                                    if (!C9431p.m18664a(str) && !C9431p.m18664a(str2)) {
                                        Thread.currentThread().setName(str);
                                    }
                                    cVar.run();
                                    mo24774c();
                                } catch (Throwable unused) {
                                }
                            } catch (Throwable unused2) {
                                str = null;
                            }
                            this.f34377f = false;
                            if (!C9431p.m18664a(str) && !C9431p.m18664a(str2)) {
                                Thread.currentThread().setName(str2);
                            }
                        }
                    } catch (Throwable unused3) {
                        str2 = null;
                        str = null;
                    }
                }
            } catch (InterruptedException unused4) {
                if (this.f34376e) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo24772a(C13171c cVar) {
        if (cVar != null) {
            cVar.mo24786g();
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 0) {
                    f34372a.mo24791d();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C13169a(BlockingQueue<C13173e> blockingQueue, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "ApiDispatcher-Thread";
        }
        super(str);
        this.f34374c = new C9381g(Looper.getMainLooper(), this);
        this.f34376e = false;
        this.f34377f = false;
        this.f34378g = "ApiDispatcher";
        this.f34375d = blockingQueue;
        this.f34378g = str2;
    }
}
