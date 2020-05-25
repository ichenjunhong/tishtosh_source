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
import com.bytedance.sdk.account.p861f.p862a.C13121t;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13141r;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.u */
public final class C13164u extends C13090h<C12993e<C13121t>> {

    /* renamed from: e */
    private C13121t f34363e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_account_login", (String) null, (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1016, this.f34363e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34363e.f34337t = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34363e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34363e, jSONObject);
        this.f34363e.f34279l = jSONObject2;
    }

    private C13164u(Context context, C13073a aVar, C13121t tVar, C13141r rVar) {
        super(context, aVar, rVar);
        this.f34363e = tVar;
    }

    /* renamed from: a */
    public static C13164u m26510a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, C13141r rVar) {
        C13121t tVar = new C13121t(str2, str3, str, str4, str5, str6, str7, i);
        C13074a a = new C13074a().mo24752a(C12998a.m26130m());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(tVar.f34329a)) {
            hashMap.put("email", C9431p.m18668d(tVar.f34329a));
        }
        if (!TextUtils.isEmpty(tVar.f34331c)) {
            hashMap.put("mobile", C9431p.m18668d(tVar.f34331c));
        }
        if (!TextUtils.isEmpty(tVar.f34330b)) {
            hashMap.put("username", C9431p.m18668d(tVar.f34330b));
        }
        if (!TextUtils.isEmpty(tVar.f34332d)) {
            hashMap.put("account", C9431p.m18668d(tVar.f34332d));
        }
        if (!TextUtils.isEmpty(tVar.f34334f)) {
            hashMap.put("token", tVar.f34334f);
        }
        if (!TextUtils.isEmpty(tVar.f34335g)) {
            hashMap.put("captcha", tVar.f34335g);
        }
        if (tVar.f34336s > 0) {
            hashMap.put("scene", C9431p.m18668d(String.valueOf(tVar.f34336s)));
        }
        hashMap.put("password", C9431p.m18668d(tVar.f34333e));
        hashMap.put("mix_mode", "1");
        Context context2 = context;
        return new C13164u(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), tVar, rVar);
    }
}
