package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.ak */
public final class C39105ak extends BaseResponse implements Serializable {

    /* renamed from: a */
    private Exception f99745a;
    @C17952c(mo34828a = "coupon_activity")

    /* renamed from: b */
    private final C39136t f99746b;
    @C17952c(mo34828a = "challenge")

    /* renamed from: c */
    private final Challenge f99747c;

    public static /* synthetic */ C39105ak copy$default(C39105ak akVar, C39136t tVar, Challenge challenge, int i, Object obj) {
        if ((i & 1) != 0) {
            tVar = akVar.f99746b;
        }
        if ((i & 2) != 0) {
            challenge = akVar.f99747c;
        }
        return akVar.copy(tVar, challenge);
    }

    public final C39136t component1() {
        return this.f99746b;
    }

    public final Challenge component2() {
        return this.f99747c;
    }

    public final C39105ak copy(C39136t tVar, Challenge challenge) {
        return new C39105ak(tVar, challenge);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f99747c, (java.lang.Object) r3.f99747c) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.poi.model.C39105ak
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.model.ak r3 = (com.p683ss.android.ugc.aweme.poi.model.C39105ak) r3
            com.ss.android.ugc.aweme.poi.model.t r0 = r2.f99746b
            com.ss.android.ugc.aweme.poi.model.t r1 = r3.f99746b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r2.f99747c
            com.ss.android.ugc.aweme.discover.model.Challenge r3 = r3.f99747c
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.C39105ak.equals(java.lang.Object):boolean");
    }

    public final C39136t getActivity() {
        return this.f99746b;
    }

    public final Challenge getChallenge() {
        return this.f99747c;
    }

    public final Exception getException() {
        return this.f99745a;
    }

    public final int hashCode() {
        C39136t tVar = this.f99746b;
        int i = 0;
        int hashCode = (tVar != null ? tVar.hashCode() : 0) * 31;
        Challenge challenge = this.f99747c;
        if (challenge != null) {
            i = challenge.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiQRDetailStruct(activity=");
        sb.append(this.f99746b);
        sb.append(", challenge=");
        sb.append(this.f99747c);
        sb.append(")");
        return sb.toString();
    }

    public final <T> T checkValid() throws Throwable {
        try {
            super.checkValid();
        } catch (Exception e) {
            this.f99745a = e;
        }
        return this;
    }

    public C39105ak(C39136t tVar, Challenge challenge) {
        this.f99746b = tVar;
        this.f99747c = challenge;
    }
}
