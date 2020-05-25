package com.p683ss.android.ugc.aweme.sticker.p2301k;

import com.bytedance.keva.Keva;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.k.e */
public final class C46055e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f116202a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46055e.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;"))};

    /* renamed from: b */
    public static final C46055e f116203b = new C46055e();

    /* renamed from: c */
    private static final C52668f f116204c = C52732g.m112285a(C46056a.f116205a);

    /* renamed from: com.ss.android.ugc.aweme.sticker.k.e$a */
    static final class C46056a extends C52712l implements C52670a<Keva> {

        /* renamed from: a */
        public static final C46056a f116205a = new C46056a();

        C46056a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Keva.getRepo("sticker_bind_music");
        }
    }

    private C46055e() {
    }

    /* renamed from: a */
    public final Keva mo92603a() {
        return (Keva) f116204c.getValue();
    }

    /* renamed from: a */
    public static final String m100052a(String str) {
        if (str == null) {
            return null;
        }
        return f116203b.mo92603a().getString(str, null);
    }

    /* renamed from: a */
    public static final void m100053a(String str, String str2) {
        C52711k.m112240b(str, "musicId");
        C52711k.m112240b(str2, "musicPath");
        f116203b.mo92603a().storeString(str, str2);
    }
}
