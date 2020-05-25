package com.p683ss.android.ugc.aweme.mvp.p1986b;

/* renamed from: com.ss.android.ugc.aweme.mvp.b.a */
public final class C37721a<M> {

    /* renamed from: a */
    public M f96125a;

    /* renamed from: b */
    public C37722a f96126b;

    /* renamed from: c */
    public int f96127c;

    /* renamed from: d */
    public Throwable f96128d;

    /* renamed from: com.ss.android.ugc.aweme.mvp.b.a$a */
    public enum C37722a {
        INIT,
        SUCCESS,
        ERROR,
        LOADING,
        PROGRESS
    }

    /* renamed from: a */
    public static <M> C37721a<M> m84217a() {
        C37721a<M> aVar = new C37721a<>();
        aVar.f96126b = C37722a.LOADING;
        return aVar;
    }

    /* renamed from: a */
    public static <M> C37721a<M> m84221a(M m) {
        C37721a<M> aVar = new C37721a<>();
        aVar.f96126b = C37722a.SUCCESS;
        aVar.f96125a = m;
        return aVar;
    }

    /* renamed from: a */
    public static <T extends Throwable, M> C37721a<M> m84222a(T t) {
        C37721a<M> aVar = new C37721a<>();
        aVar.f96126b = C37722a.ERROR;
        aVar.f96128d = t;
        return aVar;
    }

    /* renamed from: a */
    public static <M> C37721a<M> m84218a(C37722a aVar, M m) {
        C37721a<M> aVar2 = new C37721a<>();
        aVar2.f96126b = aVar;
        aVar2.f96125a = m;
        return aVar2;
    }

    /* renamed from: a */
    public static <T extends Throwable, M> C37721a<M> m84220a(C37722a aVar, T t) {
        C37721a<M> aVar2 = new C37721a<>();
        aVar2.f96126b = aVar;
        aVar2.f96128d = t;
        return aVar2;
    }

    /* renamed from: a */
    public static <M> C37721a<M> m84219a(C37722a aVar, M m, int i) {
        C37721a<M> aVar2 = new C37721a<>();
        aVar2.f96126b = aVar;
        aVar2.f96125a = m;
        aVar2.f96127c = i;
        return aVar2;
    }
}
