package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.arch.lifecycle.C0184k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34181a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34196e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34201f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34205g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34799b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34804d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34816g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34821h;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.k */
public final class C35049k {
    /* renamed from: a */
    public static C34799b<IMContact> m79233a(C0184k kVar, int i) {
        C52711k.m112240b(kVar, "owner");
        switch (i) {
            case 0:
            case 4:
                return new C34816g<>(kVar);
            case 1:
                if (RefineShareInSiteExperiment.INSTANCE.mo73738c() || RefineShareInSiteExperiment.m80104a() == 5 || C33229c.f86227e.mo70574g() == 1 || C33229c.f86227e.mo70574g() == 2) {
                    return new C34804d<>(kVar);
                }
                return new C34821h<>(kVar);
            case 2:
            case 3:
                return new C34205g<>(kVar);
            case 5:
                return new C34201f<>(kVar);
            case 6:
                return new C34181a<>(kVar);
            case 7:
                return new C34196e<>(kVar);
            default:
                return new C34816g<>(kVar);
        }
    }
}
