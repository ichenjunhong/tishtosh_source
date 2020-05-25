package com.p683ss.android.ugc.aweme.p2108r.p2109a;

import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38050a;
import com.p683ss.android.ugc.aweme.notice.api.p2008sp.C38053d.C38054a;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.r.a.a */
public final class C41049a {

    /* renamed from: a */
    public static final C41050a f104381a = new C41050a(null);

    /* renamed from: com.ss.android.ugc.aweme.r.a.a$a */
    public static final class C41050a {
        private C41050a() {
        }

        /* renamed from: a */
        public final IIMService mo83571a() {
            return m90717a(true);
        }

        /* renamed from: b */
        public static boolean m90718b() {
            if (((C38050a) C38054a.m85114a(C38050a.class)).mo48538a(1) == 1) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C41050a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static IIMService m90717a(boolean z) {
            IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
            C52711k.m112236a((Object) provideIMService_Monster, "imService");
            return provideIMService_Monster;
        }
    }

    /* renamed from: a */
    public static final IIMService m90714a() {
        return f104381a.mo83571a();
    }

    /* renamed from: a */
    public static final IIMService m90715a(boolean z) {
        return C41050a.m90717a(false);
    }

    /* renamed from: b */
    public static final boolean m90716b() {
        return C41050a.m90718b();
    }
}
