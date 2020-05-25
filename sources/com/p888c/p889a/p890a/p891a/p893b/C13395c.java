package com.p888c.p889a.p890a.p891a.p893b;

import com.p888c.p889a.p890a.p891a.p897e.C13422b;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.b.c */
public final class C13395c {

    /* renamed from: a */
    final C13401i f34908a;

    /* renamed from: b */
    public final C13401i f34909b;

    /* renamed from: c */
    private final boolean f34910c;

    /* renamed from: d */
    private final C13398f f34911d;

    /* renamed from: e */
    private final C13400h f34912e;

    private C13395c(C13398f fVar, C13400h hVar, C13401i iVar, C13401i iVar2, boolean z) {
        this.f34911d = fVar;
        this.f34912e = hVar;
        this.f34908a = iVar;
        if (iVar2 == null) {
            this.f34909b = C13401i.NONE;
        } else {
            this.f34909b = iVar2;
        }
        this.f34910c = z;
    }

    /* renamed from: a */
    public final JSONObject mo25093a() {
        Object obj;
        String str;
        JSONObject jSONObject = new JSONObject();
        C13422b.m27062a(jSONObject, "impressionOwner", this.f34908a);
        if (this.f34911d == null || this.f34912e == null) {
            str = "videoEventsOwner";
            obj = this.f34909b;
        } else {
            C13422b.m27062a(jSONObject, "mediaEventsOwner", this.f34909b);
            C13422b.m27062a(jSONObject, "creativeType", this.f34911d);
            str = "impressionType";
            obj = this.f34912e;
        }
        C13422b.m27062a(jSONObject, str, obj);
        C13422b.m27062a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f34910c));
        return jSONObject;
    }

    /* renamed from: a */
    public static C13395c m27004a(C13398f fVar, C13400h hVar, C13401i iVar, C13401i iVar2, boolean z) {
        C13426e.m27071a((Object) fVar, "CreativeType is null");
        C13426e.m27071a((Object) hVar, "ImpressionType is null");
        C13426e.m27071a((Object) iVar, "Impression owner is null");
        if (iVar == C13401i.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (fVar == C13398f.DEFINED_BY_JAVASCRIPT && iVar == C13401i.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (hVar == C13400h.DEFINED_BY_JAVASCRIPT && iVar == C13401i.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else {
            C13395c cVar = new C13395c(fVar, hVar, iVar, iVar2, false);
            return cVar;
        }
    }
}
