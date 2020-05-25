package com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.c.a */
public final class C46315a extends C46317c {

    /* renamed from: a */
    public final Effect f116852a;

    /* renamed from: b */
    public final int f116853b;

    /* renamed from: c */
    public final C45815a f116854c;

    /* renamed from: d */
    public final boolean f116855d;

    /* renamed from: e */
    public final Bundle f116856e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C46315a m100611a(Effect effect, int i, C45815a aVar, boolean z, Bundle bundle) {
        C52711k.m112240b(effect, "sticker");
        C52711k.m112240b(aVar, "requestSource");
        C46315a aVar2 = new C46315a(effect, i, aVar, z, bundle);
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46315a) {
                C46315a aVar = (C46315a) obj;
                if (C52711k.m112239a((Object) this.f116852a, (Object) aVar.f116852a)) {
                    if ((this.f116853b == aVar.f116853b) && C52711k.m112239a((Object) this.f116854c, (Object) aVar.f116854c)) {
                        if (!(this.f116855d == aVar.f116855d) || !C52711k.m112239a((Object) this.f116856e, (Object) aVar.f116856e)) {
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
        Effect effect = this.f116852a;
        int i = 0;
        int hashCode = (((effect != null ? effect.hashCode() : 0) * 31) + this.f116853b) * 31;
        C45815a aVar = this.f116854c;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.f116855d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Bundle bundle = this.f116856e;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedStickerHandleSession(sticker=");
        sb.append(this.f116852a);
        sb.append(", clickPosition=");
        sb.append(this.f116853b);
        sb.append(", requestSource=");
        sb.append(this.f116854c);
        sb.append(", interceptLoad=");
        sb.append(this.f116855d);
        sb.append(", extraData=");
        sb.append(this.f116856e);
        sb.append(")");
        return sb.toString();
    }

    private C46315a(Effect effect, int i, C45815a aVar, boolean z, Bundle bundle) {
        C52711k.m112240b(effect, "sticker");
        C52711k.m112240b(aVar, "requestSource");
        super(null);
        this.f116852a = effect;
        this.f116853b = i;
        this.f116854c = aVar;
        this.f116855d = z;
        this.f116856e = bundle;
    }

    public /* synthetic */ C46315a(Effect effect, int i, C45815a aVar, boolean z, Bundle bundle, int i2, C52707g gVar) {
        this(effect, i, aVar, false, bundle);
    }
}
