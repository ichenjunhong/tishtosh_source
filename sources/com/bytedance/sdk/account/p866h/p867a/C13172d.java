package com.bytedance.sdk.account.p866h.p867a;

import android.os.Message;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.bytedance.sdk.account.h.a.d */
public final class C13172d extends C13169a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24771a() {
        super.mo24771a();
    }

    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo24773b() {
        return super.mo24773b();
    }

    /* renamed from: d */
    public final void mo24775d() {
        this.f34374c.removeMessages(1);
    }

    /* renamed from: c */
    public final void mo24774c() {
        mo24775d();
        this.f34374c.sendEmptyMessageDelayed(1, 2000);
    }

    /* renamed from: a */
    public final void mo24772a(C13171c cVar) {
        if (cVar != null) {
            cVar.mo24787h();
        }
    }

    public final void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 1) {
                    f34372a.mo24792e();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C13172d(BlockingQueue<C13173e> blockingQueue, String str, String str2) {
        super(blockingQueue, str, str2);
    }
}
