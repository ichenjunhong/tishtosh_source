package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14963ax;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xn */
public final class C16377xn implements C16359ww {

    /* renamed from: a */
    private C16095nb<JSONObject, JSONObject> f45964a;

    /* renamed from: b */
    private C16095nb<JSONObject, JSONObject> f45965b;

    public C16377xn(Context context) {
        C16099nf<JSONObject> nfVar = C16100ng.f45246b;
        this.f45964a = C14963ax.m30843m().mo31189a(context, zzbgz.m39278a()).mo31193a("google.afma.request.getAdDictionary", nfVar, nfVar);
        C16099nf<JSONObject> nfVar2 = C16100ng.f45246b;
        this.f45965b = C14963ax.m30843m().mo31189a(context, zzbgz.m39278a()).mo31193a("google.afma.sdkConstants.getSdkConstants", nfVar2, nfVar2);
    }

    /* renamed from: a */
    public final C16095nb<JSONObject, JSONObject> mo31461a() {
        return this.f45964a;
    }

    /* renamed from: b */
    public final C16095nb<JSONObject, JSONObject> mo31462b() {
        return this.f45965b;
    }
}
