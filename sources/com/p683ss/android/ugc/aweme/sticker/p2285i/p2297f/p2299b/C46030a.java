package com.p683ss.android.ugc.aweme.sticker.p2285i.p2297f.p2299b;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.f.b.a */
public abstract class C46030a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo92549a(String str, Effect effect);

    /* renamed from: b */
    public final boolean mo92585b(String str, Effect effect) {
        C52711k.m112240b(str, "category");
        if (effect == null) {
            return true;
        }
        return mo92549a(str, effect);
    }
}
