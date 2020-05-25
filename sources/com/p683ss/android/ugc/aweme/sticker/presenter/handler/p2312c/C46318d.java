package com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.c.d */
public final class C46318d extends C46317c {

    /* renamed from: a */
    public final Effect f116858a;

    /* renamed from: b */
    public final int f116859b;

    /* renamed from: c */
    public final C45815a f116860c;

    /* renamed from: d */
    public final boolean f116861d;

    /* renamed from: e */
    public final Bundle f116862e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46318d) {
                C46318d dVar = (C46318d) obj;
                if (C52711k.m112239a((Object) this.f116858a, (Object) dVar.f116858a)) {
                    if ((this.f116859b == dVar.f116859b) && C52711k.m112239a((Object) this.f116860c, (Object) dVar.f116860c)) {
                        if (!(this.f116861d == dVar.f116861d) || !C52711k.m112239a((Object) this.f116862e, (Object) dVar.f116862e)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Effect effect = this.f116858a;
        int i = 0;
        int hashCode = (((effect != null ? effect.hashCode() : 0) * 31) + this.f116859b) * 31;
        C45815a aVar = this.f116860c;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.f116861d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Bundle bundle = this.f116862e;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnselectedStickerHandleSession(sticker=");
        sb.append(this.f116858a);
        sb.append(", clickPosition=");
        sb.append(this.f116859b);
        sb.append(", requestSource=");
        sb.append(this.f116860c);
        sb.append(", interceptLoad=");
        sb.append(this.f116861d);
        sb.append(", extraData=");
        sb.append(this.f116862e);
        sb.append(")");
        return sb.toString();
    }

    private C46318d(Effect effect, int i, C45815a aVar, boolean z, Bundle bundle) {
        C52711k.m112240b(aVar, "requestSource");
        super(null);
        this.f116858a = effect;
        this.f116859b = i;
        this.f116860c = aVar;
        this.f116861d = z;
        this.f116862e = bundle;
    }

    public /* synthetic */ C46318d(Effect effect, int i, C45815a aVar, boolean z, Bundle bundle, int i2, C52707g gVar) {
        this(effect, i, aVar, false, bundle);
    }
}
