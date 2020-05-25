package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13112k;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13140q;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.t */
public final class C13162t extends C13090h<C12993e<C13163a>> {

    /* renamed from: e */
    private C13163a f34360e;

    /* renamed from: com.bytedance.sdk.account.f.b.t$a */
    public static class C13163a extends C13112k {

        /* renamed from: a */
        String f34361a;

        /* renamed from: b */
        String f34362b;

        public C13163a(String str, String str2) {
            super(13);
            this.f34361a = str;
            this.f34362b = str2;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_set_password", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34360e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 10002, this.f34360e);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34360e, jSONObject);
        this.f34360e.f34279l = jSONObject2;
    }

    private C13162t(Context context, C13073a aVar, C13163a aVar2, C13140q qVar) {
        super(context, aVar, qVar);
        this.f34360e = aVar2;
    }

    /* renamed from: a */
    public static C13162t m26505a(Context context, String str, String str2, C13140q qVar) {
        C13163a aVar = new C13163a(str, str2);
        C13074a a = new C13074a().mo24752a(C12998a.m26128k());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(aVar.f34362b)) {
            hashMap.put("captcha", aVar.f34362b);
        }
        hashMap.put("password", C9431p.m18668d(aVar.f34361a));
        hashMap.put("mix_mode", "1");
        return new C13162t(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), aVar, qVar);
    }
}
