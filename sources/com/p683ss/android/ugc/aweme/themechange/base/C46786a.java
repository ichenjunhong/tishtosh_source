package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.a */
public final class C46786a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f118222a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46786a.class), "TEX_VIEW_WIDTH", "getTEX_VIEW_WIDTH()F"))};

    /* renamed from: b */
    static final int f118223b = C43303dy.m94971b(C39629l.m88233b());

    /* renamed from: c */
    public static final C46786a f118224c;

    /* renamed from: d */
    private static final float f118225d = C9432q.m18687b((Context) C39629l.m88233b(), 12.0f);

    /* renamed from: e */
    private static final float f118226e = C9432q.m18687b((Context) C39629l.m88233b(), 20.0f);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final float f118227f = C9432q.m18687b((Context) C39629l.m88233b(), 56.0f);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final float f118228g = C9432q.m18687b((Context) C39629l.m88233b(), 80.0f);

    /* renamed from: h */
    private static final C52668f f118229h = C52732g.m112285a(C46787a.f118231a);

    /* renamed from: i */
    private static final float f118230i;

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.a$a */
    static final class C46787a extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        public static final C46787a f118231a = new C46787a();

        C46787a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C46786a aVar = C46786a.f118224c;
            double b = (double) ((((float) C46786a.f118223b) - C46786a.m101624b()) - (C46786a.m101622a() * 5.0f));
            Double.isNaN(b);
            float f = (float) (b / 5.3d);
            if (f < C46786a.f118227f) {
                f = C46786a.f118227f;
            } else if (f > C46786a.f118228g) {
                f = C46786a.f118228g;
            }
            return Float.valueOf(f);
        }
    }

    private C46786a() {
    }

    /* renamed from: a */
    public static float m101622a() {
        return f118225d;
    }

    /* renamed from: b */
    public static float m101624b() {
        return f118226e;
    }

    /* renamed from: d */
    public static float m101626d() {
        return f118230i;
    }

    /* renamed from: c */
    public final float mo94006c() {
        return ((Number) f118229h.getValue()).floatValue();
    }

    static {
        C46786a aVar = new C46786a();
        f118224c = aVar;
        f118230i = aVar.mo94006c() + f118225d;
    }
}
