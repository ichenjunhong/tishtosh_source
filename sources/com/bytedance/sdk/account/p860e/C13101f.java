package com.bytedance.sdk.account.p860e;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13005f;
import com.bytedance.sdk.account.p844a.p848d.C13019h;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.f */
public final class C13101f extends C13090h<C13019h> {
    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_update_pwd", (String) null, (String) null, (C12990b) (C13019h) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C13019h hVar = new C13019h(z, 10012);
        if (!z) {
            hVar.f34000c = bVar.f34150b;
            hVar.f34001d = bVar.f34151c;
        }
        return hVar;
    }

    private C13101f(Context context, C13073a aVar, C13005f fVar) {
        super(context, aVar, fVar);
    }

    /* renamed from: a */
    public static C13101f m26384a(Context context, String str, String str2, C13005f fVar) {
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/password/update/"));
        HashMap hashMap = new HashMap();
        hashMap.put("current_password", C9431p.m18668d(str));
        hashMap.put("password", C9431p.m18668d(str2));
        hashMap.put("mix_mode", "1");
        return new C13101f(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), fVar);
    }
}
