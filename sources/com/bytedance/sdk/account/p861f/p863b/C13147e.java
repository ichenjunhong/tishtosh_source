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
import com.bytedance.sdk.account.p861f.p862a.C13105d;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13127d;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.e */
public final class C13147e extends C13090h<C12993e<C13105d>> {

    /* renamed from: e */
    private C13105d f34345e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_change_password", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34345e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1010, this.f34345e);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34345e, jSONObject);
        this.f34345e.f34279l = jSONObject2;
    }

    private C13147e(Context context, C13073a aVar, C13105d dVar, C13127d dVar2) {
        super(context, aVar, dVar2);
        this.f34345e = dVar;
    }

    /* renamed from: a */
    public static C13147e m26428a(Context context, String str, String str2, String str3, C13127d dVar) {
        C13105d dVar2 = new C13105d(str, str2, str3);
        C13074a a = new C13074a().mo24752a(C12998a.m26124g());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(dVar2.f34248c)) {
            hashMap.put("captcha", dVar2.f34248c);
        }
        hashMap.put("code", C9431p.m18668d(dVar2.f34246a));
        hashMap.put("password", C9431p.m18668d(dVar2.f34247b));
        hashMap.put("mix_mode", "1");
        return new C13147e(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), dVar2, dVar);
    }
}
