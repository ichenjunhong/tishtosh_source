package com.p683ss.android.ugc.aweme.video.local;

import com.bytedance.keva.Keva;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.video.local.g */
public final class C48063g {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f120780a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C48063g.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C48063g f120781b;

    /* renamed from: c */
    private static final C52668f f120782c = C52732g.m112285a(C48064a.f120784a);

    /* renamed from: d */
    private static boolean f120783d;

    /* renamed from: com.ss.android.ugc.aweme.video.local.g$a */
    static final class C48064a extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C48064a f120784a = new C48064a();

        C48064a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepoSync("player_setting", 0);
        }
    }

    private C48063g() {
    }

    /* renamed from: b */
    public static final boolean m104079b() {
        return f120783d;
    }

    /* renamed from: a */
    public final Keva mo95335a() {
        return (Keva) f120782c.getValue();
    }

    static {
        C48063g gVar = new C48063g();
        f120781b = gVar;
        f120783d = gVar.mo95335a().getBoolean("useSurfaceView", false);
    }
}
