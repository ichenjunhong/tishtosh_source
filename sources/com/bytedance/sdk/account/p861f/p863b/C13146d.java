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
import com.bytedance.sdk.account.p861f.p862a.C13104c;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13126c;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.d */
public final class C13146d extends C13090h<C12993e<C13104c>> {

    /* renamed from: e */
    private C13104c f34344e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_change", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    private static Map<String, String> m26423a(C13104c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(cVar.f34240a));
        if (!TextUtils.isEmpty(cVar.f34241b)) {
            hashMap.put("captcha", cVar.f34241b);
        }
        hashMap.put("code", C9431p.m18668d(cVar.f34242c));
        hashMap.put("mix_mode", "1");
        if (!TextUtils.isEmpty(cVar.f34243d)) {
            hashMap.put("ticket", cVar.f34243d);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1011, this.f34344e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34344e.f34245f = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34344e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34344e, jSONObject);
        this.f34344e.f34279l = jSONObject2;
    }

    private C13146d(Context context, C13073a aVar, C13104c cVar, C13126c cVar2) {
        super(context, aVar, cVar2);
        this.f34344e = cVar;
    }

    /* renamed from: a */
    public static C13146d m26420a(Context context, String str, String str2, String str3, C13126c cVar) {
        C13104c cVar2 = new C13104c(str, str2, str3);
        return new C13146d(context, new C13074a().mo24752a(C12998a.m26127j()).mo24754a(m26423a(cVar2)).mo24757c(), cVar2, cVar);
    }

    /* renamed from: a */
    public static C13146d m26421a(Context context, String str, String str2, String str3, String str4, C13126c cVar) {
        C13104c cVar2 = new C13104c(str, str2, str3, str4);
        return new C13146d(context, new C13074a().mo24752a(C12998a.m26127j()).mo24754a(m26423a(cVar2)).mo24757c(), cVar2, cVar);
    }

    /* renamed from: a */
    public static C13146d m26422a(Context context, String str, String str2, String str3, String str4, Map map, C13126c cVar) {
        C13104c cVar2 = new C13104c(str, str2, str3, str4, map);
        return new C13146d(context, new C13074a().mo24752a(C12998a.m26127j()).mo24755a(m26423a(cVar2), cVar2.f34244e).mo24757c(), cVar2, cVar);
    }
}
