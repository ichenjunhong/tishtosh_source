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
import com.bytedance.sdk.account.p861f.p862a.C13122u;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13142s;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.v */
public final class C13165v extends C13090h<C12993e<C13122u>> {

    /* renamed from: e */
    private C13122u f34364e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_account_register", (String) null, (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1023, this.f34364e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34364e.f34340c = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34364e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34364e, jSONObject);
        this.f34364e.f34279l = jSONObject2;
    }

    private C13165v(Context context, C13073a aVar, C13122u uVar, C13142s sVar) {
        super(context, aVar, sVar);
        this.f34364e = uVar;
    }

    /* renamed from: a */
    public static C13165v m26515a(Context context, String str, String str2, C13142s sVar) {
        C13122u uVar = new C13122u(str, str2);
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/username/register/"));
        HashMap hashMap = new HashMap();
        hashMap.put("username", C9431p.m18668d(uVar.f34338a));
        hashMap.put("password", C9431p.m18668d(uVar.f34339b));
        hashMap.put("mix_mode", "1");
        return new C13165v(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), uVar, sVar);
    }
}
