package com.p683ss.android.ugc.aweme;

import android.content.Context;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.services.ITakeInSameOptimize;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44332b;
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

/* renamed from: com.ss.android.ugc.aweme.bt */
public final class C24048bt implements ITakeInSameOptimize {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63833a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24048bt.class), "optimizeType", "getOptimizeType()I"))};

    /* renamed from: b */
    public static final C24048bt f63834b = new C24048bt();

    /* renamed from: c */
    public static final C24049a f63835c = new C24049a(null);

    /* renamed from: d */
    private final C52668f f63836d = C52732g.m112285a(C24050b.f63837a);

    /* renamed from: com.ss.android.ugc.aweme.bt$a */
    public static final class C24049a {
        private C24049a() {
        }

        public /* synthetic */ C24049a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bt$b */
    static final class C24050b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C24050b f63837a = new C24050b();

        C24050b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C39629l.m88232a().mo58583n().mo83104b(C40790a.OpenTakenInSameOptimize));
        }
    }

    /* renamed from: a */
    public static final C24048bt m58876a() {
        return f63834b;
    }

    /* renamed from: b */
    private final int m58877b() {
        return ((Number) this.f63836d.getValue()).intValue();
    }

    public final boolean enableCombineMusicAndEffectDownload() {
        if (m58877b() == 1 || m58877b() == 2) {
            return true;
        }
        return false;
    }

    public final boolean enableTakeInSameRecordOptimize(Context context) {
        C52711k.m112240b(context, "context");
        switch (m58877b()) {
            case 1:
                return C44332b.m97108b(context);
            case 2:
                return true;
            default:
                return false;
        }
    }
}
