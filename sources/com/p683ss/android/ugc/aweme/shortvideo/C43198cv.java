package com.p683ss.android.ugc.aweme.shortvideo;

import com.bytedance.als.C2767k;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cv */
final /* synthetic */ class C43198cv implements C2767k {

    /* renamed from: a */
    private final C42562ct f109227a;

    C43198cv(C42562ct ctVar) {
        this.f109227a = ctVar;
    }

    public final void onChanged(Object obj) {
        C42562ct ctVar = this.f109227a;
        Effect effect = (Effect) obj;
        if (C39618d.f101151O.mo83117a(C40796a.EnableCommerceUnlockStickerCollectTips)) {
            ctVar.f107651q.post(new C43201cy(ctVar));
        }
    }
}
