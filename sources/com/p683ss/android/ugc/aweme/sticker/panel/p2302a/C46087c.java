package com.p683ss.android.ugc.aweme.sticker.panel.p2302a;

import android.text.format.DateUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.a.c */
public final class C46087c implements C46085a {

    /* renamed from: a */
    private final C46354l f116307a;

    /* renamed from: b */
    private final int f116308b;

    private C46087c(C46354l lVar, int i) {
        C52711k.m112240b(lVar, "stickerDataManager");
        this.f116307a = lVar;
        this.f116308b = i;
    }

    /* renamed from: a */
    public final boolean mo92784a(Effect effect, int i, int i2) {
        C52711k.m112240b(effect, "effect");
        boolean z = false;
        if (this.f116307a.mo92985c() != null) {
            return false;
        }
        if (!DateUtils.isToday(C39629l.m88232a().mo58574e().mo83119c(C40796a.AutoApplySticker)) && i == this.f116308b) {
            z = true;
        }
        if (z) {
            C39629l.m88232a().mo58574e().mo83114a(C40796a.AutoApplySticker, System.currentTimeMillis());
        }
        return z;
    }

    public /* synthetic */ C46087c(C46354l lVar, int i, int i2, C52707g gVar) {
        this(lVar, C45859b.m99695a(lVar));
    }
}
