package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like;

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

@C10178a(mo18163a = "shortcut_like_in_dm")
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.DmGuideExperiment */
public final class DmGuideExperiment {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(DmGuideExperiment.class), "experiment", "getExperiment()I"))};
    @C10179b
    public static final int EXPERIMENT_1 = 1;
    @C10179b
    private static final int EXPERIMENT_2 = 2;
    @C10179b
    public static final int EXPERIMENT_3 = 3;
    public static final DmGuideExperiment INSTANCE = new DmGuideExperiment();
    @C10179b(mo18165a = true)
    private static final int ONLINE = 0;
    private static final C52668f experiment$delegate = C52732g.m112285a(C33853a.f87823a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.DmGuideExperiment$a */
    static final class C33853a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        public static final C33853a f87823a = new C33853a();

        C33853a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(C10181b.m20511a().mo18168a(DmGuideExperiment.class, true, "shortcut_like_in_dm", 31744, 0));
        }
    }

    private DmGuideExperiment() {
    }

    /* renamed from: a */
    public final int mo71882a() {
        return ((Number) experiment$delegate.getValue()).intValue();
    }

    /* renamed from: b */
    public final boolean mo71883b() {
        if (mo71882a() == EXPERIMENT_2 || mo71882a() == EXPERIMENT_3) {
            return true;
        }
        return false;
    }
}
