package com.p683ss.android.ugc.aweme.draft.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.draft.model.h */
public final class C29070h {
    @C17952c(mo34828a = "uploadId")

    /* renamed from: a */
    public final String f76191a;
    @C17952c(mo34828a = "trackType")

    /* renamed from: b */
    public int f76192b;
    @C17952c(mo34828a = "trackIndex")

    /* renamed from: c */
    public int f76193c;
    @C17952c(mo34828a = "effectPath")

    /* renamed from: d */
    public String f76194d;
    @C17952c(mo34828a = "effectTag")

    /* renamed from: e */
    public String f76195e;
    @C17952c(mo34828a = "seqIn")

    /* renamed from: f */
    public int f76196f;
    @C17952c(mo34828a = "seqOut")

    /* renamed from: g */
    public int f76197g;
    @C17952c(mo34828a = "challenge")

    /* renamed from: h */
    public AVChallenge f76198h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftVEAudioEffectParam(uploadId=");
        sb.append(this.f76191a);
        sb.append(", trackType=");
        sb.append(this.f76192b);
        sb.append(", trackIndex=");
        sb.append(this.f76193c);
        sb.append(", effectPath=");
        sb.append(this.f76194d);
        sb.append(", effectTag=");
        sb.append(this.f76195e);
        sb.append(", seqIn=");
        sb.append(this.f76196f);
        sb.append(", seqOut=");
        sb.append(this.f76197g);
        sb.append(", challenge=");
        sb.append(this.f76198h);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Integer.valueOf(this.f76192b).hashCode() * 31;
        String str = this.f76191a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + Integer.valueOf(this.f76193c).hashCode()) * 31;
        String str2 = this.f76194d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode2 + i2) * 31;
        String str3 = this.f76195e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((((i4 + i3) * 31) + Integer.valueOf(this.f76196f).hashCode()) * 31) + Integer.valueOf(this.f76197g).hashCode();
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        Class cls = getClass();
        if (obj != null) {
            obj2 = obj.getClass();
        } else {
            obj2 = null;
        }
        if (!C52711k.m112239a((Object) cls, obj2)) {
            return false;
        }
        if (obj != null) {
            C29070h hVar = (C29070h) obj;
            if (this.f76192b != hVar.f76192b || !C52711k.m112239a((Object) this.f76191a, (Object) hVar.f76191a) || this.f76193c != hVar.f76193c || !C52830p.m112407a(this.f76194d, hVar.f76194d, false, 2, null) || !C52830p.m112407a(this.f76195e, hVar.f76195e, false, 2, null) || this.f76196f != hVar.f76196f || this.f76197g != hVar.f76197g || ((this.f76198h == null || hVar.f76198h == null || !C52711k.m112239a((Object) this.f76198h, (Object) hVar.f76198h)) && (this.f76198h != null || hVar.f76198h != null))) {
                return false;
            }
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam");
    }

    public C29070h(String str, int i, int i2, String str2, String str3, int i3, int i4, AVChallenge aVChallenge) {
        this.f76191a = str;
        this.f76192b = i;
        this.f76193c = i2;
        this.f76194d = str2;
        this.f76195e = str3;
        this.f76196f = i3;
        this.f76197g = i4;
        this.f76198h = aVChallenge;
    }
}
