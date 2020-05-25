package com.p683ss.android.ugc.aweme.crossplatform.platform.p1618rn;

import com.bytedance.keva.Keva;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.b */
public final class C27204b {

    /* renamed from: c */
    public static final C52668f f71829c = C52732g.m112285a(C27206b.f71834a);

    /* renamed from: d */
    public static final C27205a f71830d = new C27205a(null);

    /* renamed from: a */
    public final Keva f71831a;

    /* renamed from: b */
    public String f71832b;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.b$a */
    public static final class C27205a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f71833a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27205a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/JsbDebugSettings;"))};

        private C27205a() {
        }

        public /* synthetic */ C27205a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.b$b */
    static final class C27206b extends C52712l implements C52670a<C27204b> {

        /* renamed from: a */
        public static final C27206b f71834a = new C27206b();

        C27206b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27204b(null);
        }
    }

    /* renamed from: a */
    public static final C27204b m65627a() {
        return (C27204b) f71829c.getValue();
    }

    private C27204b() {
        Keva repo = Keva.getRepo("jsb_debug_settings", 0);
        if (repo == null) {
            C52711k.m112234a();
        }
        this.f71831a = repo;
        this.f71832b = this.f71831a.getString("safe_host", null);
    }

    public /* synthetic */ C27204b(C52707g gVar) {
        this();
    }
}
