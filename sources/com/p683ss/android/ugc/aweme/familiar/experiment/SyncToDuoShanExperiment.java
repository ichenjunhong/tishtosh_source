package com.p683ss.android.ugc.aweme.familiar.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

@C10178a(mo18163a = "douyin_sync_to_duoshan")
/* renamed from: com.ss.android.ugc.aweme.familiar.experiment.SyncToDuoShanExperiment */
public final class SyncToDuoShanExperiment {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SyncToDuoShanExperiment.class), "experimentValue", "getExperimentValue()I"))};
    @C10179b
    public static final int GROUP_2 = 1;
    @C10179b
    public static final int GROUP_3 = 2;
    @C10179b
    public static final int GROUP_4 = 3;
    @C10179b
    public static final int GROUP_5 = 4;
    public static final SyncToDuoShanExperiment INSTANCE = new SyncToDuoShanExperiment();
    @C10179b(mo18165a = true)
    public static final int NORMAL = 0;
    private static final C52668f experimentValue$delegate = C52732g.m112285a(C29643a.f77505a);

    /* renamed from: com.ss.android.ugc.aweme.familiar.experiment.SyncToDuoShanExperiment$a */
    static final class C29643a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C29643a f77505a = new C29643a();

        C29643a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C10181b.m20511a().mo18168a(SyncToDuoShanExperiment.class, true, "douyin_sync_to_duoshan", 31744, 0));
        }
    }

    private SyncToDuoShanExperiment() {
    }
}
