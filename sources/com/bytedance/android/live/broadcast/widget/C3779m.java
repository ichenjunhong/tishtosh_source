package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.model.C3452a;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p388k.C7714f;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.widget.m */
final /* synthetic */ class C3779m implements C1710e {

    /* renamed from: a */
    private final C3776k f10681a;

    C3779m(C3776k kVar) {
        this.f10681a = kVar;
    }

    public final void accept(Object obj) {
        C3776k kVar = this.f10681a;
        C4177d dVar = (C4177d) obj;
        if (dVar != null && dVar.data != null) {
            boolean z = true;
            switch (((C3452a) dVar.data).f9870a) {
                case 0:
                    kVar.f10670c.setText(C3922z.m9903a((int) R.string.efc));
                    kVar.f10670c.setAlpha(1.0f);
                    C3899m.m9868b(kVar.f10668a, ((C3452a) dVar.data).f9872c);
                    break;
                case 1:
                    kVar.f10670c.setText(C3922z.m9903a((int) R.string.gyf));
                    kVar.f10670c.setAlpha(1.0f);
                    C3899m.m9868b(kVar.f10668a, ((C3452a) dVar.data).f9871b);
                    break;
                default:
                    z = false;
                    kVar.f10670c.setText(C3922z.m9903a((int) R.string.efa));
                    kVar.f10670c.setAlpha(0.64f);
                    break;
            }
            C7714f fVar = new C7714f();
            fVar.f21220a = 2;
            fVar.f21221b = z;
            C4495a.m10823a().mo10301a((Object) fVar);
        }
    }
}
