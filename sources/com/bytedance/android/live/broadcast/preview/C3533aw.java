package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.C3452a;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.network.response.C4177d;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.preview.aw */
final /* synthetic */ class C3533aw implements C1710e {

    /* renamed from: a */
    private final C3514al f10090a;

    C3533aw(C3514al alVar) {
        this.f10090a = alVar;
    }

    public final void accept(Object obj) {
        C3514al alVar = this.f10090a;
        C4177d dVar = (C4177d) obj;
        if (!(dVar == null || dVar.data == null)) {
            switch (((C3452a) dVar.data).f9870a) {
                case 0:
                    alVar.f10052g.setText(alVar.getString(R.string.efc));
                    alVar.f10052g.setAlpha(1.0f);
                    C3899m.m9868b(alVar.f10051f, ((C3452a) dVar.data).f9871b);
                    return;
                case 1:
                    alVar.f10052g.setText(alVar.getString(R.string.efb));
                    alVar.f10052g.setAlpha(1.0f);
                    C3899m.m9868b(alVar.f10051f, ((C3452a) dVar.data).f9871b);
                    return;
                default:
                    alVar.f10052g.setText(alVar.getString(R.string.efa));
                    alVar.f10052g.setAlpha(0.64f);
                    break;
            }
        }
    }
}
