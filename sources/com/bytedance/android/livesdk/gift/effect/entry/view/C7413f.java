package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7396c;
import com.bytedance.android.livesdk.p407r.C8122a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.f */
final /* synthetic */ class C7413f implements C1710e {

    /* renamed from: a */
    private final PortraitNobleEnterTrayView f20296a;

    /* renamed from: b */
    private final C7396c f20297b;

    C7413f(PortraitNobleEnterTrayView portraitNobleEnterTrayView, C7396c cVar) {
        this.f20296a = portraitNobleEnterTrayView;
        this.f20297b = cVar;
    }

    public final void accept(Object obj) {
        PortraitNobleEnterTrayView portraitNobleEnterTrayView = this.f20296a;
        C7396c cVar = this.f20297b;
        Bitmap copy = ((Bitmap) obj).copy(Config.ARGB_8888, true);
        C8122a.m16194a(portraitNobleEnterTrayView.f20239i.getContext(), -1, copy, String.valueOf(cVar.f20207w));
        portraitNobleEnterTrayView.f20238h.setImageBitmap(copy);
    }
}
