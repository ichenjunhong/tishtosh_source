package com.p683ss.android.ugc.aweme.account.network.p1301a;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.account.C13072c;
import com.p683ss.android.C18843c;
import com.p683ss.android.ugc.aweme.C20842a;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.network.a.a */
public final class C22078a implements C18843c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59590a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C22078a.class), "mNetwork", "getMNetwork()Lcom/ss/android/ugc/aweme/account/network/ttaccount/TTAccountNetworkImpl;"))};

    /* renamed from: b */
    private final C52668f f59591b = C52732g.m112285a(C22079a.f59592a);

    /* renamed from: com.ss.android.ugc.aweme.account.network.a.a$a */
    static final class C22079a extends C52712l implements C52670a<C22080b> {

        /* renamed from: a */
        public static final C22079a f59592a = new C22079a();

        C22079a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C22080b();
        }
    }

    /* renamed from: a */
    public final String mo38461a() {
        String l = C24095a.m58955l();
        C52711k.m112236a((Object) l, "BuildConfigDiff.getApiHost()");
        return l;
    }

    /* renamed from: b */
    public final Context mo38462b() {
        Application application = C20842a.f56783a;
        if (application == null) {
            C52711k.m112237a("sContext");
        }
        return application;
    }

    /* renamed from: c */
    public final C13072c mo38463c() {
        return (C22080b) this.f59591b.getValue();
    }

    /* renamed from: d */
    public final boolean mo38464d() {
        Object a = C23826bi.m58450a(C22475af.class);
        C52711k.m112236a(a, "ModuleStore.getService(I…oduleService::class.java)");
        return ((C22475af) a).mo46778e();
    }
}
