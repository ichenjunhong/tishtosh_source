package com.p683ss.android.ugc.aweme.money.growth;

import com.bytedance.keva.Keva;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.money.growth.e */
public final class C37168e {

    /* renamed from: c */
    public static final C37169a f94862c = new C37169a(null);

    /* renamed from: a */
    public long f94863a;

    /* renamed from: b */
    public long f94864b;

    /* renamed from: d */
    private final Keva f94865d;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.e$a */
    public static final class C37169a {
        private C37169a() {
        }

        public /* synthetic */ C37169a(C52707g gVar) {
            this();
        }
    }

    public C37168e() {
        Keva repo = Keva.getRepo("money_growth_read_task");
        C52711k.m112236a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f94865d = repo;
        mo76491a(this.f94865d.getLong("today_timestamp", 0));
        mo76492b(this.f94865d.getLong("progress_time", 0));
    }

    /* renamed from: a */
    public final void mo76491a(long j) {
        this.f94863a = j;
        this.f94865d.storeLong("today_timestamp", j);
    }

    /* renamed from: b */
    public final void mo76492b(long j) {
        this.f94864b = j;
        this.f94865d.storeLong("progress_time", j);
    }
}
