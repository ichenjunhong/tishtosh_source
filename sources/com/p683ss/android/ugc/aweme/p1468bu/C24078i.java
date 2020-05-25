package com.p683ss.android.ugc.aweme.p1468bu;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.bu.i */
public final class C24078i {

    /* renamed from: a */
    public final boolean f63918a;

    /* renamed from: b */
    public final List<C24093p> f63919b;

    /* renamed from: c */
    public final List<String> f63920c;

    /* renamed from: d */
    public final long f63921d;

    /* renamed from: e */
    public final long f63922e;

    /* renamed from: f */
    public final long f63923f;

    /* renamed from: com.ss.android.ugc.aweme.bu.i$a */
    public static final class C24080a {

        /* renamed from: a */
        public boolean f63924a;

        /* renamed from: b */
        public List<C24093p> f63925b;

        /* renamed from: c */
        public List<String> f63926c;

        /* renamed from: d */
        public long f63927d;

        /* renamed from: e */
        public long f63928e;

        /* renamed from: f */
        public long f63929f;

        /* renamed from: a */
        public final C24078i mo49843a() {
            return new C24078i(this);
        }

        private C24080a() {
            this.f63925b = (List) C24078i.m58917a(Collections.emptyList());
            this.f63926c = (List) C24078i.m58917a(Collections.emptyList());
            this.f63927d = TimeUnit.MINUTES.toMillis(5);
            this.f63928e = TimeUnit.MINUTES.toMillis(5);
            this.f63929f = TimeUnit.MINUTES.toMillis(15);
        }
    }

    /* renamed from: a */
    public static C24080a m58916a() {
        return new C24080a();
    }

    /* renamed from: a */
    public static long m58915a(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("should not be zero!");
    }

    /* renamed from: a */
    public static <T> T m58917a(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("should not be null!");
    }

    private C24078i(C24080a aVar) {
        this.f63918a = aVar.f63924a;
        this.f63919b = (List) m58917a((T) aVar.f63925b);
        this.f63920c = (List) m58917a((T) aVar.f63926c);
        this.f63921d = m58915a(aVar.f63927d);
        this.f63922e = m58915a(aVar.f63928e);
        this.f63923f = m58915a(aVar.f63929f);
    }
}
