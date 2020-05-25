package p064c.p065a;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p070c.C1700b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p075c.C1749c;
import p064c.p065a.p072e.p076d.C1763h;
import p064c.p065a.p072e.p077e.p081d.C1946au;
import p064c.p065a.p072e.p077e.p082e.C2031a;
import p064c.p065a.p072e.p077e.p082e.C2035c;
import p064c.p065a.p072e.p077e.p082e.C2037d;
import p064c.p065a.p072e.p077e.p082e.C2039e;
import p064c.p065a.p072e.p077e.p082e.C2041f;
import p064c.p065a.p072e.p077e.p082e.C2044g;
import p064c.p065a.p072e.p077e.p082e.C2045h;
import p064c.p065a.p072e.p077e.p082e.C2046i;
import p064c.p065a.p072e.p077e.p082e.C2048j;
import p064c.p065a.p072e.p077e.p082e.C2049k;
import p064c.p065a.p072e.p077e.p082e.C2051l;
import p064c.p065a.p072e.p077e.p082e.C2057o;
import p064c.p065a.p072e.p077e.p082e.C2059p;
import p064c.p065a.p072e.p077e.p082e.C2063r;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: c.a.ad */
public abstract class C1680ad<T> implements C1685ai<T> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6154a(C1683ag<? super T> agVar);

    /* renamed from: a */
    public final <R> R mo6153a(C1681ae<T, ? extends R> aeVar) {
        return ((C1681ae) C1745b.m6050a(aeVar, "converter is null")).mo6163a(this);
    }

    /* renamed from: a */
    public final <R> C1680ad<R> mo6149a(C1686aj<? super T, ? extends R> ajVar) {
        return m5959a(((C1686aj) C1745b.m6050a(ajVar, "transformer is null")).mo6172a(this));
    }

    /* renamed from: a */
    public final C1680ad<T> mo6150a(C1710e<? super C1690c> eVar) {
        C1745b.m6050a(eVar, "onSubscribe is null");
        return C2150a.m6480a((C1680ad<T>) new C2037d<T>(this, eVar));
    }

    /* renamed from: a */
    public final <R> C1680ad<R> mo6151a(C1711f<? super T, ? extends C1685ai<? extends R>> fVar) {
        C1745b.m6050a(fVar, "mapper is null");
        return C2150a.m6480a((C1680ad<T>) new C2041f<T>(this, fVar));
    }

    /* renamed from: a */
    public final C1680ad<T> mo6148a(C1675ac acVar) {
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6480a((C1680ad<T>) new C2051l<T>(this, acVar));
    }

    /* renamed from: a */
    public final C1690c mo6152a(C1710e<? super T> eVar, C1710e<? super Throwable> eVar2) {
        C1745b.m6050a(eVar, "onSuccess is null");
        C1745b.m6050a(eVar2, "onError is null");
        C1763h hVar = new C1763h(eVar, eVar2);
        mo6159b((C1683ag<? super T>) hVar);
        return hVar;
    }

    /* renamed from: c */
    public final C2201v<T> mo6161c() {
        if (this instanceof C1749c) {
            return ((C1749c) this).cz_();
        }
        return C2150a.m6486a((C2201v<T>) new C2063r<T>(this));
    }

    /* renamed from: b */
    public final C1690c mo6158b() {
        return mo6152a(C1723a.m6037b(), C1723a.f5847f);
    }

    /* renamed from: a */
    public final C1680ad<T> mo6147a() {
        return C2150a.m6480a((C1680ad<T>) new C2046i<T>(this));
    }

    /* renamed from: d */
    public final C1690c mo6162d(C1710e<? super T> eVar) {
        return mo6152a(eVar, C1723a.f5847f);
    }

    /* renamed from: b */
    public final C1680ad<T> mo6155b(C1675ac acVar) {
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6480a((C1680ad<T>) new C2057o<T>(this, acVar));
    }

    /* renamed from: c */
    public final C1680ad<T> mo6160c(C1710e<? super Throwable> eVar) {
        C1745b.m6050a(eVar, "onError is null");
        return C2150a.m6480a((C1680ad<T>) new C2035c<T>(this, eVar));
    }

    /* renamed from: b */
    public final C1680ad<T> mo6156b(C1710e<? super T> eVar) {
        C1745b.m6050a(eVar, "onSuccess is null");
        return C2150a.m6480a((C1680ad<T>) new C2039e<T>(this, eVar));
    }

    /* renamed from: a */
    public static <T> C1680ad<T> m5958a(C1684ah<T> ahVar) {
        C1745b.m6050a(ahVar, "source is null");
        return C2150a.m6480a((C1680ad<T>) new C2031a<T>(ahVar));
    }

    /* renamed from: b */
    public final <R> C1680ad<R> mo6157b(C1711f<? super T, ? extends R> fVar) {
        C1745b.m6050a(fVar, "mapper is null");
        return C2150a.m6480a((C1680ad<T>) new C2049k<T>(this, fVar));
    }

    /* renamed from: a */
    private static <T> C1680ad<T> m5959a(C1685ai<T> aiVar) {
        C1745b.m6050a(aiVar, "source is null");
        if (aiVar instanceof C1680ad) {
            return C2150a.m6480a((C1680ad) aiVar);
        }
        return C2150a.m6480a((C1680ad<T>) new C2045h<T>(aiVar));
    }

    /* renamed from: a */
    public static <T> C1680ad<T> m5960a(C2206z<? extends T> zVar) {
        C1745b.m6050a(zVar, "observableSource is null");
        return C2150a.m6480a((C1680ad<T>) new C1946au<T>(zVar, null));
    }

    /* renamed from: b */
    public final void mo6159b(C1683ag<? super T> agVar) {
        C1745b.m6050a(agVar, "subscriber is null");
        C1683ag a = C2150a.m6481a(this, agVar);
        C1745b.m6050a(a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo6154a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C1700b.m6017b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: a */
    public static <T> C1680ad<T> m5961a(T t) {
        C1745b.m6050a(t, "value is null");
        return C2150a.m6480a((C1680ad<T>) new C2048j<T>(t));
    }

    /* renamed from: a */
    public static <T> C1680ad<T> m5962a(Callable<? extends T> callable) {
        C1745b.m6050a(callable, "callable is null");
        return C2150a.m6480a((C1680ad<T>) new C2044g<T>(callable));
    }

    /* renamed from: a */
    public static C1680ad<Long> m5956a(long j, TimeUnit timeUnit) {
        return m5957a(j, timeUnit, C2168a.m6519a());
    }

    /* renamed from: a */
    private static C1680ad<Long> m5957a(long j, TimeUnit timeUnit, C1675ac acVar) {
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(acVar, "scheduler is null");
        return C2150a.m6480a((C1680ad<T>) new C2059p<T>(j, timeUnit, acVar));
    }
}
