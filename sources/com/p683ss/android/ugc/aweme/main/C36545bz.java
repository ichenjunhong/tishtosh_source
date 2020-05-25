package com.p683ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;

/* renamed from: com.ss.android.ugc.aweme.main.bz */
public final class C36545bz extends C0185l {

    /* renamed from: a */
    Handler f93634a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final C0178b mo323a() {
        return super.mo323a();
    }

    /* renamed from: b */
    private static boolean m82436b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo75664c(C0183j jVar) {
        super.mo325b(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo75665d(C0183j jVar) {
        super.mo324a(jVar);
    }

    public C36545bz(C0184k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    public final void mo324a(C0183j jVar) {
        m82435a((Runnable) new C36550ca(this, jVar));
    }

    /* renamed from: a */
    private void m82435a(Runnable runnable) {
        if (m82436b()) {
            runnable.run();
            return;
        }
        this.f93634a.post(runnable);
        C9220a.m18312a((Throwable) new IllegalAccessError("should be in main thread"), "should call in main thread");
    }

    /* renamed from: b */
    public final void mo325b(C0183j jVar) {
        m82435a((Runnable) new C36551cb(this, jVar));
    }
}
