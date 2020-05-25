package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.C2149h;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p079b.C1797af;
import p064c.p065a.p072e.p077e.p079b.C1817g;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bf */
final /* synthetic */ class C4874bf implements C1711f {

    /* renamed from: a */
    private final C4869bd f13132a;

    /* renamed from: b */
    private final File f13133b;

    C4874bf(C4869bd bdVar, File file) {
        this.f13132a = bdVar;
        this.f13133b = file;
    }

    public final Object apply(Object obj) {
        C4869bd bdVar = this.f13132a;
        Throwable th = (Throwable) obj;
        if (this.f13133b.length() <= 0 && bdVar.f13115f <= 10) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C1675ac a = C2168a.m6519a();
            C1745b.m6050a(timeUnit, "unit is null");
            C1745b.m6050a(a, "scheduler is null");
            C2150a.m6483a((C2149h<T>) new C1797af<T>(Math.max(0, 500), timeUnit, a));
        }
        C1745b.m6050a(th, "throwable is null");
        Callable a2 = C1723a.m6036a(th);
        C1745b.m6050a(a2, "errorSupplier is null");
        return C2150a.m6483a((C2149h<T>) new C1817g<T>(a2));
    }
}
