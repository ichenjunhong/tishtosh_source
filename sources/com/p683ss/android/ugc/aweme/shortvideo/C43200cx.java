package com.p683ss.android.ugc.aweme.shortvideo;

import com.bytedance.als.C2767k;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.gamora.recorder.filter.filter_panel.C49756e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cx */
final /* synthetic */ class C43200cx implements C2767k {

    /* renamed from: a */
    private final C42562ct f109229a;

    C43200cx(C42562ct ctVar) {
        this.f109229a = ctVar;
    }

    public final void onChanged(Object obj) {
        C42562ct ctVar = this.f109229a;
        C49756e eVar = (C49756e) obj;
        if (eVar == C49756e.ON_SHOWN) {
            ctVar.mo86791d().mo86534a(new C47336q(0));
            return;
        }
        if (eVar == C49756e.ON_DISMISSED) {
            ctVar.mo86791d().mo86534a(new C47336q(4));
            C31459g e = ((C43906h) ctVar.f107646l.mo89445c()).mo89440e();
            C31405ah a = ctVar.f107646l.mo97568a();
            C44885g K = ctVar.f107645k.mo91305K();
            K.getClass();
            C26890h.m65011a("adjust_filter_complete", C23089d.m56640a().mo47829a("enter_from", "video_shoot_page").mo47829a("creation_id", ctVar.f107648n.f107131x).mo47829a("shoot_way", ctVar.f107648n.f107132y).mo47826a("draft_id", ctVar.f107648n.f107022A).mo47826a("filter_id", e.f82324a).mo47829a("filter_name", e.f82325b).mo47828a("value", (Object) Float.valueOf(C31460h.m73279a(e, a, (C31406ai) new C43202cz(K)))).f61491a);
        }
    }
}
