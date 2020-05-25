package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.h */
public final class C26125h implements Serializable {
    public static final C26126a Companion = new C26126a(null);
    public static final C26125h DEFAULT_DISABLE_VERSION;
    public static final C26125h DEFAULT_ONLINE_VERSION;
    public static final C26125h DEFAULT_TEST_VERSION;
    @C17952c(mo34828a = "visit_ad_max_interval")

    /* renamed from: a */
    private final long f68979a;
    @C17952c(mo34828a = "visit_ad_min_interval")

    /* renamed from: b */
    private final long f68980b;
    @C17952c(mo34828a = "request_period")

    /* renamed from: c */
    private final long f68981c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.h$a */
    public static final class C26126a {
        private C26126a() {
        }

        public /* synthetic */ C26126a(C52707g gVar) {
            this();
        }
    }

    public C26125h() {
        this(0, 0, 0, 7, null);
    }

    public final long getRequestPeriod() {
        return this.f68981c;
    }

    public final long getVisitAdMaxInterval() {
        return this.f68979a;
    }

    public final long getVisitAdMinInterval() {
        return this.f68980b;
    }

    static {
        C26125h hVar = new C26125h(0, 0, 0, 7, null);
        DEFAULT_DISABLE_VERSION = hVar;
        C26125h hVar2 = new C26125h(0, 0, 0, 7, null);
        DEFAULT_ONLINE_VERSION = hVar2;
        C26125h hVar3 = new C26125h(12, 9, 6);
        DEFAULT_TEST_VERSION = hVar3;
    }

    public C26125h(long j, long j2, long j3) {
        this.f68979a = j;
        this.f68980b = j2;
        this.f68981c = j3;
    }

    public /* synthetic */ C26125h(long j, long j2, long j3, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            j = 120;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = 90;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = 60;
        }
        this(j4, j5, j3);
    }
}
