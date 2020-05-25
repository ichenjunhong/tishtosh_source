package p064c.p065a.p072e.p077e.p078a;

import java.util.concurrent.Callable;
import p064c.p065a.C1687b;
import p064c.p065a.C1705d;
import p064c.p065a.C2142f;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p072e.p073a.C1719c;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.e.a.b */
public final class C1776b extends C1687b {

    /* renamed from: a */
    final Callable<? extends C2142f> f5907a;

    public C1776b(Callable<? extends C2142f> callable) {
        this.f5907a = callable;
    }

    /* renamed from: b */
    public final void mo6178b(C1705d dVar) {
        try {
            ((C2142f) C1745b.m6050a(this.f5907a.call(), "The completableSupplier returned a null CompletableSource")).mo6175a(dVar);
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C1719c.error(th, dVar);
        }
    }
}
