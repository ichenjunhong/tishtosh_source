package com.bytedance.sdk.account.p860e;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13001b;
import com.bytedance.sdk.account.p844a.p848d.C13013b;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.b */
public final class C13097b extends C13090h<C13013b> {

    /* renamed from: e */
    private C13013b f34222e;

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_check_password", (String) null, (String) null, (C12990b) (C13013b) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C13013b bVar2 = this.f34222e;
        if (bVar2 == null) {
            bVar2 = new C13013b(z, 10011);
        } else {
            bVar2.f33998a = z;
        }
        if (!z) {
            bVar2.f34000c = bVar.f34150b;
            bVar2.f34001d = bVar.f34151c;
        }
        return bVar2;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34222e = new C13013b(true, 10011);
        this.f34222e.f34025h = jSONObject2.optString("captcha");
    }

    private C13097b(Context context, C13073a aVar, C13001b bVar) {
        super(context, aVar, bVar);
    }

    /* renamed from: a */
    public static C13097b m26365a(Context context, String str, C13001b bVar) {
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/password/check/"));
        HashMap hashMap = new HashMap();
        hashMap.put("password", C9431p.m18668d(str));
        hashMap.put("mix_mode", "1");
        return new C13097b(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), bVar);
    }
}
