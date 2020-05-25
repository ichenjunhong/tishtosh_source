package p064c.p065a.p090h;

import java.util.concurrent.Callable;
import org.p2692b.C53695c;
import p064c.p065a.C1674ab;
import p064c.p065a.C1675ac;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C1687b;
import p064c.p065a.C1705d;
import p064c.p065a.C2149h;
import p064c.p065a.C2193n;
import p064c.p065a.C2196q;
import p064c.p065a.C2201v;
import p064c.p065a.p070c.C1695a;
import p064c.p065a.p070c.C1701c;
import p064c.p065a.p070c.C1702d;
import p064c.p065a.p070c.C1704f;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1709d;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p087j.C2131h;
import p064c.p065a.p088f.C2143a;

/* renamed from: c.a.h.a */
public final class C2150a {

    /* renamed from: a */
    static volatile C1710e<? super Throwable> f6911a;

    /* renamed from: b */
    static volatile C1711f<? super Runnable, ? extends Runnable> f6912b;

    /* renamed from: c */
    public static volatile C1711f<? super Callable<C1675ac>, ? extends C1675ac> f6913c;

    /* renamed from: d */
    public static volatile C1711f<? super Callable<C1675ac>, ? extends C1675ac> f6914d;

    /* renamed from: e */
    public static volatile C1711f<? super Callable<C1675ac>, ? extends C1675ac> f6915e;

    /* renamed from: f */
    public static volatile C1711f<? super Callable<C1675ac>, ? extends C1675ac> f6916f;

    /* renamed from: g */
    static volatile C1711f<? super C1675ac, ? extends C1675ac> f6917g;

    /* renamed from: h */
    static volatile C1711f<? super C1675ac, ? extends C1675ac> f6918h;

    /* renamed from: i */
    public static volatile C1711f<? super C1675ac, ? extends C1675ac> f6919i;

    /* renamed from: j */
    static volatile C1711f<? super C1675ac, ? extends C1675ac> f6920j;

    /* renamed from: k */
    static volatile C1711f<? super C2149h, ? extends C2149h> f6921k;

    /* renamed from: l */
    static volatile C1711f<? super C2201v, ? extends C2201v> f6922l;

    /* renamed from: m */
    public static volatile C1711f<? super C2143a, ? extends C2143a> f6923m;

    /* renamed from: n */
    static volatile C1711f<? super C2193n, ? extends C2193n> f6924n;

    /* renamed from: o */
    static volatile C1711f<? super C1680ad, ? extends C1680ad> f6925o;

    /* renamed from: p */
    static volatile C1711f<? super C1687b, ? extends C1687b> f6926p;

    /* renamed from: q */
    static volatile C1707b<? super C2149h, ? super C53695c, ? extends C53695c> f6927q;

    /* renamed from: r */
    static volatile C1707b<? super C2193n, ? super C2196q, ? extends C2196q> f6928r;

    /* renamed from: s */
    static volatile C1707b<? super C2201v, ? super C1674ab, ? extends C1674ab> f6929s;

    /* renamed from: t */
    static volatile C1707b<? super C1680ad, ? super C1683ag, ? extends C1683ag> f6930t;

    /* renamed from: u */
    public static volatile C1707b<? super C1687b, ? super C1705d, ? extends C1705d> f6931u;

    /* renamed from: v */
    static volatile C1709d f6932v;

    /* renamed from: w */
    public static volatile boolean f6933w;

    /* renamed from: x */
    static volatile boolean f6934x;

    /* renamed from: a */
    public static boolean m6493a() {
        return f6934x;
    }

    /* renamed from: b */
    public static C1710e<? super Throwable> m6495b() {
        return f6911a;
    }

    /* renamed from: a */
    public static void m6492a(Throwable th) {
        C1710e<? super Throwable> eVar = f6911a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m6496b(th)) {
            th = new C1704f(th);
        }
        if (eVar != null) {
            try {
                eVar.accept(th);
                return;
            } catch (Throwable th2) {
                m6498c(th2);
            }
        }
        m6498c(th);
    }

    /* renamed from: a */
    public static Runnable m6489a(Runnable runnable) {
        C1745b.m6050a(runnable, "run is null");
        C1711f<? super Runnable, ? extends Runnable> fVar = f6912b;
        if (fVar == null) {
            return runnable;
        }
        return (Runnable) m6488a(fVar, (T) runnable);
    }

    /* renamed from: a */
    public static void m6491a(C1710e<? super Throwable> eVar) {
        if (!f6933w) {
            f6911a = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    /* renamed from: a */
    public static <T> C53695c<? super T> m6490a(C2149h<T> hVar, C53695c<? super T> cVar) {
        C1707b<? super C2149h, ? super C53695c, ? extends C53695c> bVar = f6927q;
        return bVar != null ? (C53695c) m6487a(bVar, hVar, cVar) : cVar;
    }

    /* renamed from: a */
    public static <T> C2196q<? super T> m6485a(C2193n<T> nVar, C2196q<? super T> qVar) {
        C1707b<? super C2193n, ? super C2196q, ? extends C2196q> bVar = f6928r;
        return bVar != null ? (C2196q) m6487a(bVar, nVar, qVar) : qVar;
    }

    /* renamed from: a */
    public static <T> C2193n<T> m6484a(C2193n<T> nVar) {
        C1711f<? super C2193n, ? extends C2193n> fVar = f6924n;
        return fVar != null ? (C2193n) m6488a(fVar, (T) nVar) : nVar;
    }

    /* renamed from: a */
    public static <T> C2201v<T> m6486a(C2201v<T> vVar) {
        C1711f<? super C2201v, ? extends C2201v> fVar = f6922l;
        return fVar != null ? (C2201v) m6488a(fVar, (T) vVar) : vVar;
    }

    /* renamed from: a */
    public static <T, R> R m6488a(C1711f<T, R> fVar, T t) {
        try {
            return fVar.apply(t);
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }

    /* renamed from: a */
    public static <T, U, R> R m6487a(C1707b<T, U, R> bVar, T t, U u) {
        try {
            return bVar.mo6200a(t, u);
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }

    /* renamed from: c */
    public static boolean m6499c() {
        C1709d dVar = f6932v;
        if (dVar == null) {
            return false;
        }
        try {
            return dVar.mo6202a();
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }

    /* renamed from: b */
    public static C1675ac m6494b(C1675ac acVar) {
        C1711f<? super C1675ac, ? extends C1675ac> fVar = f6919i;
        if (fVar == null) {
            return acVar;
        }
        return (C1675ac) m6488a(fVar, (T) acVar);
    }

    /* renamed from: c */
    public static C1675ac m6497c(C1675ac acVar) {
        C1711f<? super C1675ac, ? extends C1675ac> fVar = f6920j;
        if (fVar == null) {
            return acVar;
        }
        return (C1675ac) m6488a(fVar, (T) acVar);
    }

    /* renamed from: d */
    public static C1675ac m6500d(C1675ac acVar) {
        C1711f<? super C1675ac, ? extends C1675ac> fVar = f6918h;
        if (fVar == null) {
            return acVar;
        }
        return (C1675ac) m6488a(fVar, (T) acVar);
    }

    /* renamed from: a */
    public static C1675ac m6477a(C1675ac acVar) {
        C1711f<? super C1675ac, ? extends C1675ac> fVar = f6917g;
        if (fVar == null) {
            return acVar;
        }
        return (C1675ac) m6488a(fVar, (T) acVar);
    }

    /* renamed from: c */
    private static void m6498c(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    /* renamed from: b */
    private static boolean m6496b(Throwable th) {
        if (!(th instanceof C1702d) && !(th instanceof C1701c) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C1695a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C1675ac m6479a(Callable<C1675ac> callable) {
        try {
            return (C1675ac) C1745b.m6050a(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }

    /* renamed from: a */
    public static <T> C1680ad<T> m6480a(C1680ad<T> adVar) {
        C1711f<? super C1680ad, ? extends C1680ad> fVar = f6925o;
        if (fVar != null) {
            return (C1680ad) m6488a(fVar, (T) adVar);
        }
        return adVar;
    }

    /* renamed from: a */
    public static C1687b m6482a(C1687b bVar) {
        C1711f<? super C1687b, ? extends C1687b> fVar = f6926p;
        if (fVar != null) {
            return (C1687b) m6488a(fVar, (T) bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public static <T> C2149h<T> m6483a(C2149h<T> hVar) {
        C1711f<? super C2149h, ? extends C2149h> fVar = f6921k;
        if (fVar != null) {
            return (C2149h) m6488a(fVar, (T) hVar);
        }
        return hVar;
    }

    /* renamed from: a */
    public static <T> C1674ab<? super T> m6476a(C2201v<T> vVar, C1674ab<? super T> abVar) {
        C1707b<? super C2201v, ? super C1674ab, ? extends C1674ab> bVar = f6929s;
        if (bVar != null) {
            return (C1674ab) m6487a(bVar, vVar, abVar);
        }
        return abVar;
    }

    /* renamed from: a */
    public static C1675ac m6478a(C1711f<? super Callable<C1675ac>, ? extends C1675ac> fVar, Callable<C1675ac> callable) {
        return (C1675ac) C1745b.m6050a(m6488a(fVar, (T) callable), "Scheduler Callable result can't be null");
    }

    /* renamed from: a */
    public static <T> C1683ag<? super T> m6481a(C1680ad<T> adVar, C1683ag<? super T> agVar) {
        C1707b<? super C1680ad, ? super C1683ag, ? extends C1683ag> bVar = f6930t;
        if (bVar != null) {
            return (C1683ag) m6487a(bVar, adVar, agVar);
        }
        return agVar;
    }
}
