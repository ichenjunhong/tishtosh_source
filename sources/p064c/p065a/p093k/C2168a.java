package p064c.p065a.p093k;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p064c.p065a.C1675ac;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p084g.C2074b;
import p064c.p065a.p072e.p084g.C2079d;
import p064c.p065a.p072e.p084g.C2087f;
import p064c.p065a.p072e.p084g.C2092h;
import p064c.p065a.p072e.p084g.C2104q;
import p064c.p065a.p072e.p084g.C2107s;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.k.a */
public final class C2168a {

    /* renamed from: a */
    static final C1675ac f6966a;

    /* renamed from: b */
    static final C1675ac f6967b;

    /* renamed from: c */
    static final C1675ac f6968c;

    /* renamed from: d */
    public static final C1675ac f6969d = C2107s.f6833b;

    /* renamed from: e */
    static final C1675ac f6970e;

    /* renamed from: c.a.k.a$a */
    static final class C2169a {

        /* renamed from: a */
        static final C1675ac f6971a = new C2074b();
    }

    /* renamed from: c.a.k.a$b */
    static final class C2170b implements Callable<C1675ac> {
        C2170b() {
        }

        public final /* bridge */ /* synthetic */ Object call() throws Exception {
            return C2169a.f6971a;
        }
    }

    /* renamed from: c.a.k.a$c */
    static final class C2171c implements Callable<C1675ac> {
        C2171c() {
        }

        public final /* bridge */ /* synthetic */ Object call() throws Exception {
            return C2172d.f6972a;
        }
    }

    /* renamed from: c.a.k.a$d */
    static final class C2172d {

        /* renamed from: a */
        static final C1675ac f6972a = new C2087f();
    }

    /* renamed from: c.a.k.a$e */
    static final class C2173e {

        /* renamed from: a */
        static final C1675ac f6973a = new C2092h();
    }

    /* renamed from: c.a.k.a$f */
    static final class C2174f implements Callable<C1675ac> {
        C2174f() {
        }

        public final /* bridge */ /* synthetic */ Object call() throws Exception {
            return C2173e.f6973a;
        }
    }

    /* renamed from: c.a.k.a$g */
    static final class C2175g {

        /* renamed from: a */
        static final C1675ac f6974a = new C2104q();
    }

    /* renamed from: c.a.k.a$h */
    static final class C2176h implements Callable<C1675ac> {
        C2176h() {
        }

        public final /* bridge */ /* synthetic */ Object call() throws Exception {
            return C2175g.f6974a;
        }
    }

    /* renamed from: a */
    public static C1675ac m6519a() {
        return C2150a.m6477a(f6967b);
    }

    /* renamed from: b */
    public static C1675ac m6521b() {
        return C2150a.m6494b(f6968c);
    }

    /* renamed from: c */
    public static C1675ac m6522c() {
        return C2150a.m6497c(f6970e);
    }

    /* renamed from: d */
    public static C1675ac m6523d() {
        return C2150a.m6500d(f6966a);
    }

    static {
        C1675ac acVar;
        C1675ac acVar2;
        C1675ac acVar3;
        C1675ac acVar4;
        C2176h hVar = new C2176h();
        C1745b.m6050a(hVar, "Scheduler Callable can't be null");
        C1711f<? super Callable<C1675ac>, ? extends C1675ac> fVar = C2150a.f6914d;
        if (fVar == null) {
            acVar = C2150a.m6479a((Callable<C1675ac>) hVar);
        } else {
            acVar = C2150a.m6478a(fVar, (Callable<C1675ac>) hVar);
        }
        f6966a = acVar;
        C2170b bVar = new C2170b();
        C1745b.m6050a(bVar, "Scheduler Callable can't be null");
        C1711f<? super Callable<C1675ac>, ? extends C1675ac> fVar2 = C2150a.f6913c;
        if (fVar2 == null) {
            acVar2 = C2150a.m6479a((Callable<C1675ac>) bVar);
        } else {
            acVar2 = C2150a.m6478a(fVar2, (Callable<C1675ac>) bVar);
        }
        f6967b = acVar2;
        C2171c cVar = new C2171c();
        C1745b.m6050a(cVar, "Scheduler Callable can't be null");
        C1711f<? super Callable<C1675ac>, ? extends C1675ac> fVar3 = C2150a.f6915e;
        if (fVar3 == null) {
            acVar3 = C2150a.m6479a((Callable<C1675ac>) cVar);
        } else {
            acVar3 = C2150a.m6478a(fVar3, (Callable<C1675ac>) cVar);
        }
        f6968c = acVar3;
        C2174f fVar4 = new C2174f();
        C1745b.m6050a(fVar4, "Scheduler Callable can't be null");
        C1711f<? super Callable<C1675ac>, ? extends C1675ac> fVar5 = C2150a.f6916f;
        if (fVar5 == null) {
            acVar4 = C2150a.m6479a((Callable<C1675ac>) fVar4);
        } else {
            acVar4 = C2150a.m6478a(fVar5, (Callable<C1675ac>) fVar4);
        }
        f6970e = acVar4;
    }

    /* renamed from: a */
    public static C1675ac m6520a(Executor executor) {
        return new C2079d(executor, false);
    }
}
