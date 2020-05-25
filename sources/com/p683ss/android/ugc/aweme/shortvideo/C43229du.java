package com.p683ss.android.ugc.aweme.shortvideo;

import android.support.p030v4.app.FragmentActivity;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.p683ss.android.ugc.aweme.tools.C47026e;
import com.p683ss.android.ugc.aweme.tools.C47346u;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a.C49608a;
import com.p683ss.android.ugc.gamora.recorder.p2468e.C49659a;
import com.p683ss.android.ugc.gamora.recorder.p2477k.C49850a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.du */
public final class C43229du {

    /* renamed from: a */
    private C49607a f109324a;

    /* renamed from: b */
    private final C43225dr f109325b;

    public C43229du(C43225dr drVar) {
        C52711k.m112240b(drVar, "mOwner");
        this.f109325b = drVar;
    }

    public final void onEvent(C47346u uVar) {
        C52711k.m112240b(uVar, "event");
        if (this.f109325b.f33840g_ != null) {
            if (this.f109324a == null) {
                this.f109324a = C49608a.m107072a(this.f109325b.mo87882I());
            }
            FragmentActivity I = this.f109325b.mo87882I();
            C52711k.m112236a((Object) I, "mOwner.fragmentActivity()");
            ApiCenter a = C2755a.m7851a(I);
            C49860a aVar = (C49860a) a.mo7341b(C49860a.class);
            if (aVar != null) {
                aVar.mo97698e(4);
                aVar.mo97695d(4);
            }
            C49659a aVar2 = (C49659a) a.mo7341b(C49659a.class);
            if (aVar2 != null) {
                aVar2.mo97559b(4);
            }
            C47026e eVar = new C47026e();
            C43225dr drVar = this.f109325b;
            if (drVar != null) {
                ((C42562ct) drVar).mo86791d().mo86530a(eVar);
                C49850a aVar3 = (C49850a) a.mo7341b(C49850a.class);
                if (aVar3 != null) {
                    aVar3.mo97680a(false);
                }
                C49607a aVar4 = this.f109324a;
                if (aVar4 != null) {
                    aVar4.mo97519a(false);
                }
                C49577b bVar = (C49577b) a.mo7339a(C49577b.class);
                bVar.mo97483a(false);
                bVar.mo97484b(false);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.PlanC");
        }
    }
}
