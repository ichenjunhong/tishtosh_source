package com.bytedance.android.livesdk.gift.relay;

import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.android.livesdk.gift.relay.C7627a.C7628a;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c.C7632a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.relay.c */
final /* synthetic */ class C7636c implements C7628a {

    /* renamed from: a */
    private final C7634b f21031a;

    C7636c(C7634b bVar) {
        this.f21031a = bVar;
    }

    /* renamed from: a */
    public final void mo13993a(C7632a aVar) {
        C7634b bVar = this.f21031a;
        C7632a aVar2 = bVar.f21014k.f20964b;
        if (aVar2 != null) {
            int a = bVar.f21014k.mo13991a(aVar2);
            if (a >= 0) {
                C1352v f = bVar.f21013i.mo4847f(a);
                if (f instanceof C7642i) {
                    ((C7642i) f).mo13998a(false);
                }
            }
        }
        bVar.f21015l.setBackgroundResource(aVar == aVar2 ? R.drawable.br2 : R.drawable.bp2);
        if (bVar.f21019p.hasMessages(0)) {
            bVar.f21019p.removeMessages(0);
            bVar.f21019p.sendEmptyMessage(0);
        }
    }
}
