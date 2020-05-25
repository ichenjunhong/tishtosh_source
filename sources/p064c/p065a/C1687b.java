package p064c.p065a;

import java.util.concurrent.Callable;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p076d.C1762g;
import p064c.p065a.p072e.p077e.p078a.C1776b;
import p064c.p065a.p072e.p077e.p078a.C1777c;
import p064c.p065a.p072e.p077e.p078a.C1778d;
import p064c.p065a.p072e.p077e.p078a.C1779e;
import p064c.p065a.p072e.p077e.p078a.C1781f;
import p064c.p065a.p072e.p077e.p078a.C1783g;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.b */
public abstract class C1687b implements C2142f {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo6178b(C1705d dVar);

    /* renamed from: a */
    public static C1687b m5986a() {
        return C2150a.m6482a(C1777c.f5908a);
    }

    /* renamed from: b */
    public final C1687b mo6176b() {
        return m5987a(C1723a.m6041c());
    }

    /* renamed from: a */
    private C1687b m5987a(C1715j<? super Throwable> jVar) {
        C1745b.m6050a(jVar, "predicate is null");
        return C2150a.m6482a((C1687b) new C1781f(this, jVar));
    }

    /* renamed from: a */
    public static C1687b m5988a(Throwable th) {
        C1745b.m6050a(th, "error is null");
        return C2150a.m6482a((C1687b) new C1778d(th));
    }

    /* renamed from: b */
    public final C1687b mo6177b(C1675ac acVar) {
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6482a((C1687b) new C1783g(this, acVar));
    }

    /* renamed from: a */
    public static C1687b m5989a(Callable<? extends C2142f> callable) {
        C1745b.m6050a(callable, "completableSupplier");
        return C2150a.m6482a((C1687b) new C1776b(callable));
    }

    /* renamed from: a */
    public final C1687b mo6174a(C1675ac acVar) {
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6482a((C1687b) new C1779e(this, acVar));
    }

    /* renamed from: a */
    public final void mo6175a(C1705d dVar) {
        C1745b.m6050a(dVar, "s is null");
        try {
            C1707b<? super C1687b, ? super C1705d, ? extends C1705d> bVar = C2150a.f6931u;
            if (bVar != null) {
                dVar = (C1705d) C2150a.m6487a(bVar, this, dVar);
            }
            C1745b.m6050a(dVar, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo6178b(dVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C1700b.m6017b(th);
            C2150a.m6492a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    public final C1690c mo6173a(C1706a aVar, C1710e<? super Throwable> eVar) {
        C1745b.m6050a(eVar, "onError is null");
        C1745b.m6050a(aVar, "onComplete is null");
        C1762g gVar = new C1762g(eVar, aVar);
        mo6175a((C1705d) gVar);
        return gVar;
    }
}
