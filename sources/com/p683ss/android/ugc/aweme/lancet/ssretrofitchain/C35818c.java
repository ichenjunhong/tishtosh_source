package com.p683ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.c */
public abstract class C35818c {

    /* renamed from: b */
    C35818c f91991b;

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a */
    public static class C35819a {

        /* renamed from: a */
        public final boolean f91992a;

        /* renamed from: b */
        public final boolean f91993b;

        /* renamed from: c */
        final Map<String, String> f91994c;

        public C35819a() {
            this(false, false);
        }

        public C35819a(boolean z, boolean z2) {
            this.f91992a = z2;
            this.f91993b = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C35819a mo74476a(C35823f fVar, C12686c cVar, C12799u uVar);

    public C35818c(C35818c cVar) {
        this.f91991b = cVar;
    }

    /* renamed from: b */
    public final C35819a mo74483b(C35823f fVar, C12686c cVar, C12799u uVar) {
        C35819a a;
        C35818c cVar2 = this;
        while (true) {
            a = cVar2.mo74476a(fVar, cVar, uVar);
            if (a.f91993b || cVar2.f91991b == null) {
                return a;
            }
            cVar2 = cVar2.f91991b;
        }
        return a;
    }
}
