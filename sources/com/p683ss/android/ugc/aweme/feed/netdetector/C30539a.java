package com.p683ss.android.ugc.aweme.feed.netdetector;

import android.os.Handler;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30553b;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a */
public final class C30539a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f79806a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30539a.class), "fetchFeedDetectorManager", "getFetchFeedDetectorManager()Lcom/ss/android/ugc/aweme/feed/netdetector/fetchfeed/FetchFeedDetectorManager;"))};

    /* renamed from: b */
    public static final C30539a f79807b = new C30539a();

    /* renamed from: c */
    private static final C52668f f79808c = C52732g.m112285a(C30540a.f79809a);

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a$a */
    static final class C30540a extends C52712l implements C52670a<C30553b> {

        /* renamed from: a */
        public static final C30540a f79809a = new C30540a();

        C30540a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C30553b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.a$b */
    static final class C30541b implements Runnable {

        /* renamed from: a */
        public static final C30541b f79810a = new C30541b();

        C30541b() {
        }

        public final void run() {
            C30539a.f79807b.mo62735a().mo62749b();
        }
    }

    private C30539a() {
    }

    /* renamed from: a */
    public final C30553b mo62735a() {
        return (C30553b) f79808c.getValue();
    }

    /* renamed from: b */
    public static void m71515b() {
        if (C30550b.m71531b()) {
            new Handler().postDelayed(C30541b.f79810a, 5000);
        }
    }
}
