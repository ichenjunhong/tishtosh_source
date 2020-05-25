package com.p683ss.android.ugc.aweme.p1963ml;

import com.p683ss.android.ugc.aweme.p1963ml.p1964ab.SmartPreloadExperiment.C37101a;
import com.p683ss.android.ugc.aweme.setting.model.MLModel;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.ml.n */
public final class C37118n {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f94764a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37118n.class), "TRACK_RANGE_N", "getTRACK_RANGE_N()I"))};

    /* renamed from: b */
    public static final C52668f f94765b = C52732g.m112285a(C37119a.f94767a);

    /* renamed from: c */
    public static final C37118n f94766c = new C37118n();

    /* renamed from: com.ss.android.ugc.aweme.ml.n$a */
    static final class C37119a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C37119a f94767a = new C37119a();

        C37119a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            MLModel a = C37101a.m83332a();
            if (a == null || a.params == null || a.params.length <= 0) {
                i = 5;
            } else {
                i = a.params[0];
            }
            return Integer.valueOf(i);
        }
    }

    private C37118n() {
    }
}
