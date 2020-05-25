package com.p683ss.android.ugc.aweme.effect;

import android.support.p043v7.p051e.C1208c.C1210a;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.r */
public final class C29213r extends C1210a {

    /* renamed from: a */
    private final List<EffectModel> f76519a;

    /* renamed from: b */
    private final List<EffectModel> f76520b;

    /* renamed from: a */
    public final int mo159a() {
        return this.f76519a.size();
    }

    /* renamed from: b */
    public final int mo161b() {
        return this.f76520b.size();
    }

    public C29213r(List<? extends EffectModel> list, List<? extends EffectModel> list2) {
        C52711k.m112240b(list, "old");
        C52711k.m112240b(list2, "new");
        this.f76519a = list;
        this.f76520b = list2;
    }

    /* renamed from: b */
    public final boolean mo162b(int i, int i2) {
        return C52711k.m112239a((Object) ((EffectModel) this.f76519a.get(i)).name, (Object) ((EffectModel) this.f76520b.get(i2)).name);
    }

    /* renamed from: c */
    public final boolean mo163c(int i, int i2) {
        return C52711k.m112239a((Object) (EffectModel) this.f76519a.get(i), (Object) (EffectModel) this.f76520b.get(i2));
    }
}
