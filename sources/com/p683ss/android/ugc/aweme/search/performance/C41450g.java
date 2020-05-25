package com.p683ss.android.ugc.aweme.search.performance;

import com.bytedance.ies.abmock.C10181b;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.search.C41428h;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.search.performance.g */
public final class C41450g {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f105071a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C41450g.class), "ENABLE", "getENABLE()Z"))};

    /* renamed from: b */
    public static final ExecutorService f105072b = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49847a());

    /* renamed from: c */
    public static final C41450g f105073c = new C41450g();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C17971f f105074d = C41428h.f105000a.getCommonGsonBuilder().mo34900d();

    /* renamed from: e */
    private static final C52668f f105075e = C52732g.m112285a(C41451a.f105076a);

    /* renamed from: com.ss.android.ugc.aweme.search.performance.g$a */
    static final class C41451a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C41451a f105076a = new C41451a();

        C41451a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(C10181b.m20511a().mo18172a(SearchJsonLazyParseOptimize.class, true, "search_json_lazy_parse", 31744, true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.performance.g$b */
    public static final class C41452b implements Runnable {

        /* renamed from: a */
        public static final C41452b f105077a = new C41452b();

        C41452b() {
        }

        public final void run() {
            C41450g.f105074d.mo34879a(C28334m.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.performance.g$c */
    static final class C41453c<V> implements Callable<C28334m> {

        /* renamed from: a */
        final /* synthetic */ String f105078a;

        /* renamed from: b */
        final /* synthetic */ int f105079b;

        /* renamed from: c */
        final /* synthetic */ C28334m f105080c;

        C41453c(String str, int i, C28334m mVar) {
            this.f105078a = str;
            this.f105079b = i;
            this.f105080c = mVar;
        }

        public final /* synthetic */ Object call() {
            C28334m mVar = (C28334m) C41450g.f105074d.mo34884a(this.f105078a, C28334m.class);
            if (mVar != null) {
                List<C28333l> list = mVar.f74376d;
                if (list.size() > this.f105079b) {
                    mVar.setRequestId(this.f105080c.getRequestId());
                    mVar.f74376d = list.subList(this.f105079b, list.size());
                    return mVar;
                }
            }
            return null;
        }
    }

    private C41450g() {
    }

    /* renamed from: a */
    public final boolean mo84192a() {
        return ((Boolean) f105075e.getValue()).booleanValue();
    }

    /* renamed from: a */
    public final void mo84191a(C28334m mVar) {
        C52711k.m112240b(mVar, "originalData");
        if (mo84192a()) {
            List<C28333l> list = mVar.f74376d;
            int size = list.size();
            String str = mVar.f74378f;
            C52711k.m112236a((Object) list, "originalItems");
            if ((!list.isEmpty()) && str != null && ((C28333l) C52575l.m112142g(list)).f74343I) {
                mVar.f74379g = C0013i.m18a((Callable<TResult>) new C41453c<TResult>(str, size, mVar), (Executor) f105072b);
            }
        }
    }
}
