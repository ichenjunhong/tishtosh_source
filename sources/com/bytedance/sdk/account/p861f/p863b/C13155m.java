package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
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
import com.bytedance.sdk.account.p861f.p862a.C13114m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13134k;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.m */
public final class C13155m extends C13090h<C12993e<C13114m>> {

    /* renamed from: e */
    private C13114m f34353e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_login_continue", "mobile", "login_continue", (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1022, this.f34353e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34353e.f34292d = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34353e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34353e, jSONObject);
        this.f34353e.f34279l = jSONObject2;
    }

    private C13155m(Context context, C13073a aVar, C13114m mVar, C13134k kVar) {
        super(context, aVar, kVar);
        this.f34353e = mVar;
    }

    /* renamed from: a */
    public static C13155m m26468a(Context context, String str, String str2, C13134k kVar) {
        C13114m mVar = new C13114m(str, str2);
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/mobile/sms_login_continue/"));
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(mVar.f34289a));
        hashMap.put("sms_code_key", C9431p.m18668d(String.valueOf(mVar.f34290b)));
        if (mVar.f34291c > 0) {
            hashMap.put("vcd_auth", String.valueOf(mVar.f34291c));
        }
        hashMap.put("mix_mode", "1");
        return new C13155m(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), mVar, kVar);
    }
}
