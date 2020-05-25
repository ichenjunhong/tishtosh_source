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
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13108g;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13130g;
import com.bytedance.sdk.account.p865g.C13168a;
import com.bytedance.sdk.account.p878m.C13217i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.h */
public final class C13150h extends C13090h<C12993e<C13108g>> {

    /* renamed from: e */
    private C13108g f34348e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_email_register_verify", "email", this.f34210b.mo24750a("type"), (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1025, this.f34348e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34348e.f34263f = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34348e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34348e, jSONObject);
        this.f34348e.f34279l = jSONObject2;
    }

    private C13150h(Context context, C13073a aVar, C13108g gVar, C13130g gVar2) {
        super(context, aVar, gVar2);
        this.f34348e = gVar;
    }

    /* renamed from: a */
    public static C13150h m26443a(Context context, String str, String str2, int i, Map map, String str3, C13130g gVar) {
        C13108g gVar2 = new C13108g(str, str2, i, map, str3);
        C13074a aVar = new C13074a();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(gVar2.f34258a)) {
            hashMap.put("email", C9431p.m18668d(gVar2.f34258a));
        }
        hashMap.put("type", C9431p.m18668d(String.valueOf(gVar2.f34260c)));
        if (!TextUtils.isEmpty(gVar2.f34259b)) {
            hashMap.put("code", gVar2.f34259b);
        }
        hashMap.put("mix_mode", "1");
        return new C13150h(context, aVar.mo24755a((Map<String, String>) hashMap, gVar2.f34261d).mo24752a(C13217i.m26602a(C12998a.m26118a("/passport/email/register_verify_login/"), str3)).mo24757c(), gVar2, gVar);
    }
}
