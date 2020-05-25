package com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a;

import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.C35128a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import java.util.LinkedHashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.a */
public final class C35100a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f90271a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35100a.class), "shareVideoIdMap", "getShareVideoIdMap()Ljava/util/LinkedHashMap;"))};

    /* renamed from: b */
    public static final C35100a f90272b = new C35100a();

    /* renamed from: c */
    private static final C52668f f90273c = C52732g.m112285a(C35101a.f90274a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.a$a */
    static final class C35101a extends C52712l implements C52670a<LinkedHashMap<String, Integer>> {

        /* renamed from: a */
        public static final C35101a f90274a = new C35101a();

        C35101a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C35284t a = C35284t.m79782a();
            C52711k.m112236a((Object) a, "IMSPUtils.get()");
            LinkedHashMap M = a.mo73387M();
            if (M == null) {
                return new C35128a(10);
            }
            return M;
        }
    }

    private C35100a() {
    }
}
