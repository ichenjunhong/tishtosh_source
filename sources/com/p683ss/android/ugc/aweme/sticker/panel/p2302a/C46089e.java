package com.p683ss.android.ugc.aweme.sticker.panel.p2302a;

import com.p683ss.android.ugc.aweme.sticker.p2280d.C45859b;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46354l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.a.e */
public final class C46089e implements C46085a {

    /* renamed from: a */
    private final C46354l f116311a;

    /* renamed from: b */
    private final int f116312b;

    /* renamed from: c */
    private final int f116313c;

    private C46089e(C46354l lVar, int i, int i2) {
        C52711k.m112240b(lVar, "stickerDataManager");
        this.f116311a = lVar;
        this.f116312b = i;
        this.f116313c = i2;
    }

    /* renamed from: a */
    public final boolean mo92784a(Effect effect, int i, int i2) {
        C52711k.m112240b(effect, "effect");
        if (i2 == this.f116313c && i == this.f116312b) {
            return true;
        }
        return false;
    }

    public /* synthetic */ C46089e(C46354l lVar, int i, int i2, int i3, C52707g gVar) {
        this(lVar, C45859b.m99695a(lVar), 0);
    }
}
