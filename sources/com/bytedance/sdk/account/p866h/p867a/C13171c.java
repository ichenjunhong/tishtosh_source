package com.bytedance.sdk.account.p866h.p867a;

import android.os.Looper;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.sdk.account.p866h.p867a.C13173e.C13174a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.account.h.a.c */
public abstract class C13171c implements C9382a, C13173e, Comparable<C13173e>, Runnable {

    /* renamed from: f */
    private static C13175f f34382f = C13175f.m26551a();

    /* renamed from: a */
    protected final AtomicBoolean f34383a = new AtomicBoolean(false);

    /* renamed from: b */
    protected final AtomicBoolean f34384b = new AtomicBoolean(false);

    /* renamed from: c */
    C9381g f34385c = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: d */
    public final String f34386d;

    /* renamed from: e */
    protected final C13174a f34387e;

    /* renamed from: g */
    private int f34388g;

    /* renamed from: d */
    public final C13174a mo24783d() {
        return this.f34387e;
    }

    /* renamed from: e */
    public final int mo24784e() {
        return this.f34388g;
    }

    public void run() {
    }

    /* renamed from: a */
    public final boolean mo24779a() {
        return this.f34384b.get();
    }

    /* renamed from: c */
    public final void mo24781c() {
        this.f34384b.compareAndSet(false, true);
    }

    /* renamed from: g */
    public final void mo24786g() {
        this.f34385c.removeMessages(0);
    }

    /* renamed from: h */
    public final void mo24787h() {
        this.f34385c.removeMessages(1);
    }

    /* renamed from: f */
    public final void mo24785f() {
        mo24786g();
        this.f34385c.sendEmptyMessageDelayed(0, 1000);
    }

    /* renamed from: b */
    public final void mo24780b() {
        if (this.f34383a.compareAndSet(false, true)) {
            if (f34382f == null) {
                f34382f = C13175f.m26551a();
            }
            f34382f.mo24788a(this);
        }
    }

    /* renamed from: a */
    public final C13171c mo24778a(int i) {
        this.f34388g = i;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r1) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return
        L_0x0003:
            int r1 = r1.what     // Catch:{ Throwable -> 0x0016 }
            switch(r1) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0009;
                default: goto L_0x0008;
            }     // Catch:{ Throwable -> 0x0016 }
        L_0x0008:
            goto L_0x0015
        L_0x0009:
            com.bytedance.sdk.account.h.a.f r1 = f34382f     // Catch:{ Throwable -> 0x0016 }
            r1.mo24790c()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0015
        L_0x000f:
            com.bytedance.sdk.account.h.a.f r1 = f34382f     // Catch:{ Throwable -> 0x0016 }
            r1.mo24789b()     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0016
        L_0x0015:
            return
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.account.p866h.p867a.C13171c.handleMsg(android.os.Message):void");
    }

    public /* synthetic */ int compareTo(Object obj) {
        C13173e eVar = (C13173e) obj;
        C13174a d = mo24783d();
        C13174a d2 = eVar.mo24783d();
        if (d == null) {
            d = C13174a.NORMAL;
        }
        if (d2 == null) {
            d2 = C13174a.NORMAL;
        }
        if (d == d2) {
            return mo24784e() - eVar.mo24784e();
        }
        return d2.ordinal() - d.ordinal();
    }

    protected C13171c(String str, C13174a aVar) {
        this.f34387e = aVar;
        if (C9431p.m18664a(str)) {
            str = getClass().getSimpleName();
        }
        this.f34386d = str;
    }
}
