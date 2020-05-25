package com.p683ss.android.ugc.aweme.crossplatform.p1613b;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.b.f */
public final class C27142f {

    /* renamed from: d */
    public static final C27143a f71604d = new C27143a(null);

    /* renamed from: a */
    public long f71605a;

    /* renamed from: b */
    public boolean f71606b;

    /* renamed from: c */
    public final C27138d f71607c;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.b.f$a */
    public static final class C27143a {
        private C27143a() {
        }

        public /* synthetic */ C27143a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo55459a() {
        this.f71605a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo55460b() {
        C26890h.m65011a("stay_time", new C23089d().mo47829a("type", this.f71607c.f71598c).mo47829a("project_name", this.f71607c.f71596a).mo47829a("enter_from", this.f71607c.f71597b).mo47827a("duration", System.currentTimeMillis() - this.f71605a).f61491a);
    }

    public C27142f(C27138d dVar) {
        C52711k.m112240b(dVar, "info");
        this.f71607c = dVar;
    }
}
