package com.p683ss.android.ugc.aweme.player;

import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.video.C48121w;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p089g.C2147b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.player.d */
public final class C38851d {

    /* renamed from: a */
    public static C1689b f98954a = new C1689b();

    /* renamed from: b */
    public static boolean f98955b;

    /* renamed from: c */
    public static long f98956c = 30000;

    /* renamed from: d */
    public static C2147b<Long> f98957d;

    /* renamed from: e */
    public static final C38851d f98958e = new C38851d();

    /* renamed from: com.ss.android.ugc.aweme.player.d$a */
    public static final class C38852a extends C2147b<Long> {
        C38852a() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onComplete() {
            if (C11016e.m22313h()) {
                C48121w.m104249M().mo95264A();
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            ((Number) obj).longValue();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.d$b */
    public static final class C38853b<T> implements C1710e<Boolean> {

        /* renamed from: a */
        public static final C38853b f98959a = new C38853b();

        C38853b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                if (C38851d.f98957d != null) {
                    C2147b<Long> bVar = C38851d.f98957d;
                    if (bVar == null) {
                        C52711k.m112234a();
                    }
                    bVar.dispose();
                    C38851d.f98957d = null;
                }
                C38851d.f98957d = (C2147b) C2201v.m6592a(C38851d.f98956c, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6526b(new C38852a());
                return;
            }
            if (C38851d.m86289a() != null) {
                C2147b a = C38851d.m86289a();
                if (a == null) {
                    C52711k.m112234a();
                }
                a.dispose();
                C38851d.f98957d = null;
            }
        }
    }

    private C38851d() {
    }

    /* renamed from: a */
    public static C2147b<Long> m86289a() {
        return f98957d;
    }
}
