package com.p683ss.android.ugc.aweme.sticker.panel.defaultpanel;

import android.support.p043v7.p051e.C1208c.C1210a;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.defaultpanel.l */
public final class C46161l extends C1210a {

    /* renamed from: a */
    private Effect f116487a;

    /* renamed from: b */
    private List<StickerWrapper> f116488b;

    /* renamed from: c */
    private List<StickerWrapper> f116489c;

    /* renamed from: a */
    public final int mo159a() {
        return this.f116488b.size();
    }

    /* renamed from: b */
    public final int mo161b() {
        return this.f116489c.size();
    }

    /* renamed from: b */
    public final boolean mo162b(int i, int i2) {
        return ((StickerWrapper) this.f116488b.get(i)).f115779a.getEffectId().equals(((StickerWrapper) this.f116489c.get(i2)).f115779a.getEffectId());
    }

    /* renamed from: c */
    public final boolean mo163c(int i, int i2) {
        if (this.f116487a == null || ((StickerWrapper) this.f116488b.get(i)).f115779a.getEffectId().equals(this.f116487a.getEffectId()) == ((StickerWrapper) this.f116489c.get(i2)).f115779a.getEffectId().equals(this.f116487a.getEffectId())) {
            return true;
        }
        return false;
    }

    public C46161l(Effect effect, List<StickerWrapper> list, List<StickerWrapper> list2) {
        this.f116487a = effect;
        this.f116488b = list;
        this.f116489c = list2;
    }
}
