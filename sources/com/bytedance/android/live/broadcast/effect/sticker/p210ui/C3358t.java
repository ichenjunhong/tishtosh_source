package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.t */
final /* synthetic */ class C3358t implements OnClickListener {

    /* renamed from: a */
    private final C3353s f9645a;

    /* renamed from: b */
    private final int f9646b;

    /* renamed from: c */
    private final C3357b f9647c;

    /* renamed from: d */
    private final C8688c f9648d;

    C3358t(C3353s sVar, int i, C3357b bVar, C8688c cVar) {
        this.f9645a = sVar;
        this.f9646b = i;
        this.f9647c = bVar;
        this.f9648d = cVar;
    }

    public final void onClick(View view) {
        C3353s sVar = this.f9645a;
        int i = this.f9646b;
        C3357b bVar = this.f9647c;
        C8688c cVar = this.f9648d;
        C8688c cVar2 = (C8688c) sVar.f9632c.get(i);
        sVar.f9630a.mo8646a(cVar2.f23756q, cVar2.f23754o, (C48715t) new C3359u(sVar, cVar2, bVar));
        if (!sVar.f9630a.mo8282a(cVar2)) {
            sVar.f9634e = cVar2;
            sVar.f9630a.mo8281a(C3037b.f8914b, cVar2, (C3044a) sVar);
        } else {
            C8688c cVar3 = sVar.f9631b;
            sVar.f9631b = cVar2;
            if (cVar3 != null && sVar.f9632c.contains(cVar3)) {
                int indexOf = sVar.f9632c.indexOf(cVar3);
                if (indexOf >= 0) {
                    sVar.notifyItemChanged(indexOf);
                }
            }
            if (sVar.f9633d != null) {
                sVar.f9633d.mo8727a(sVar.f9631b);
            }
        }
        int b = sVar.mo8726b(cVar);
        if (b >= 0) {
            sVar.notifyItemChanged(b);
        }
    }
}
