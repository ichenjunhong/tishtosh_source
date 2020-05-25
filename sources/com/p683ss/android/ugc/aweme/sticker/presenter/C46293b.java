package com.p683ss.android.ugc.aweme.sticker.presenter;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.b */
public final class C46293b implements C46298g {

    /* renamed from: a */
    public Effect f116789a;

    /* renamed from: b */
    private final C0198r<Effect> f116790b = new C0198r<>();

    /* renamed from: c */
    private final C0198r<C46299h> f116791c = new C0198r<>();

    /* renamed from: d */
    private final C0198r<C46353k> f116792d = new C0198r<>();

    /* renamed from: e */
    private final C0198r<C46351i> f116793e = new C0198r<>();

    /* renamed from: f */
    private final C0198r<Effect> f116794f = new C0198r<>();

    /* renamed from: a */
    public final Effect mo93011a() {
        return this.f116789a;
    }

    /* renamed from: b */
    public final LiveData<Effect> mo93014b() {
        return this.f116790b;
    }

    /* renamed from: c */
    public final LiveData<C46299h> mo93016c() {
        return this.f116791c;
    }

    /* renamed from: d */
    public final LiveData<C46353k> mo93018d() {
        return this.f116792d;
    }

    /* renamed from: e */
    public final LiveData<C46351i> mo93019e() {
        return this.f116793e;
    }

    /* renamed from: f */
    public final LiveData<Effect> mo93020f() {
        return this.f116794f;
    }

    /* renamed from: b */
    public final void mo93015b(Effect effect) {
        this.f116794f.setValue(effect);
    }

    /* renamed from: a */
    public final void mo93012a(Effect effect) {
        Effect effect2;
        this.f116790b.setValue(effect);
        C46353k kVar = (C46353k) this.f116792d.getValue();
        if (kVar != null) {
            effect2 = kVar.f116948b;
        } else {
            effect2 = null;
        }
        this.f116792d.setValue(new C46353k(effect2, effect));
        this.f116791c.setValue(null);
        this.f116789a = effect;
    }

    /* renamed from: c */
    public final boolean mo93017c(Effect effect) {
        Boolean bool;
        Effect a = mo93011a();
        if (a != null) {
            List children = a.getChildren();
            if (children != null) {
                if (effect != null) {
                    bool = Boolean.valueOf(children.contains(effect.getEffectId()));
                } else {
                    bool = null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo93013a(Effect effect, int i) {
        int i2;
        C46299h hVar = (C46299h) this.f116791c.getValue();
        if (hVar != null) {
            i2 = hVar.f116796b;
        } else {
            i2 = -1;
        }
        if (i2 != i) {
            this.f116790b.setValue(effect);
            C46299h hVar2 = (C46299h) this.f116791c.getValue();
            if (hVar2 == null) {
                hVar2 = new C46299h(null, 0, 3, null);
            }
            C52711k.m112236a((Object) hVar2, "currentMultiSticker.value ?: MultiSticker()");
            C46299h hVar3 = new C46299h(effect, i);
            this.f116791c.setValue(hVar3);
            this.f116793e.setValue(new C46351i(hVar2, hVar3));
        }
    }
}
