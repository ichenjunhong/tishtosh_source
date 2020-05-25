package com.p683ss.android.ugc.aweme.net;

import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9864d;
import com.bytedance.ies.p621b.p624c.C10205b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.net.interceptor.C37783d;
import com.p683ss.android.ugc.aweme.net.interceptor.C37784e;
import com.p683ss.android.ugc.aweme.net.interceptor.C37785f;
import com.p683ss.android.ugc.aweme.net.interceptor.C37786g;
import com.p683ss.android.ugc.aweme.net.interceptor.C37788i;
import com.p683ss.android.ugc.aweme.net.interceptor.C37789j;
import com.p683ss.android.ugc.aweme.sec.C41481h;
import java.net.CookieHandler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.C53659m;
import okhttp3.C53661n;
import okhttp3.C53676u;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import okhttp3.C53685z;

/* renamed from: com.ss.android.ugc.aweme.net.s */
public final class C37809s {

    /* renamed from: a */
    private static final C37809s f96273a = new C37809s();

    /* renamed from: b */
    private C53682y f96274b;

    /* renamed from: c */
    private C53682y f96275c;

    /* renamed from: d */
    private C53682y f96276d = new C53682y();

    /* renamed from: com.ss.android.ugc.aweme.net.s$a */
    static abstract class C37810a {

        /* renamed from: a */
        public static C37810a f96277a;

        C37810a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo77263a();

        /* renamed from: a */
        public static void m84412a(C37810a aVar) {
            f96277a = aVar;
        }
    }

    /* renamed from: a */
    public static C37809s m84409a() {
        return f96273a;
    }

    private C37809s() {
    }

    /* renamed from: b */
    public final C53682y mo77268b() {
        if (this.f96275c != null) {
            return this.f96275c;
        }
        C53684a b = m84409a().mo77269c().mo111653b();
        List<C53676u> list = b.f133221e;
        list.add(0, new C37785f());
        list.add(0, new C37783d());
        this.f96275c = b.mo111667a();
        return this.f96275c;
    }

    /* renamed from: c */
    public final C53682y mo77269c() {
        if (this.f96274b != null) {
            return this.f96274b;
        }
        C37810a.f96277a.mo77263a();
        C53684a b = this.f96276d.mo111653b();
        b.mo111654a(60000, TimeUnit.MILLISECONDS);
        b.mo111668b(60000, TimeUnit.MILLISECONDS);
        b.mo111671b(true);
        if (C37808r.m84408a() != null) {
            b.mo111661a(new C53661n(C37808r.m84408a()));
        }
        if (C18920g.m46048a(C11010c.m22280a())) {
            b.mo111660a((C53659m) new C10205b(CookieHandler.getDefault()));
        }
        C53676u a = C41481h.m91300a();
        if (a != null) {
            b.mo111665a(a);
        }
        b.mo111670b((C53676u) new C37788i());
        b.mo111670b((C53676u) new C9864d());
        b.mo111670b((C53676u) new C37784e());
        b.mo111665a((C53676u) new C37786g());
        b.mo111665a((C53676u) new C37789j());
        b.mo111665a(C37811t.f96278a);
        b.mo111655a(Collections.singletonList(C53685z.HTTP_1_1));
        this.f96274b = b.mo111667a();
        return this.f96274b;
    }
}
