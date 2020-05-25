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
import com.bytedance.sdk.account.p861f.p862a.C13106e;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13128e;
import com.bytedance.sdk.account.p865g.C13168a;
import com.bytedance.sdk.account.p878m.C13217i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.f */
public final class C13148f extends C13090h<C12993e<C13106e>> {

    /* renamed from: e */
    private C13106e f34346e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_email_check_register", "email", this.f34210b.mo24750a("type"), (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1026, this.f34346e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34346e.f34252d = jSONObject2.optInt("is_registered");
        this.f34346e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34346e, jSONObject);
        this.f34346e.f34279l = jSONObject2;
    }

    private C13148f(Context context, C13073a aVar, C13106e eVar, C13128e eVar2) {
        super(context, aVar, eVar2);
        this.f34346e = eVar;
    }

    /* renamed from: a */
    public static C13148f m26433a(Context context, String str, Map map, String str2, C13128e eVar) {
        C13106e eVar2 = new C13106e(str, map, str2);
        C13074a aVar = new C13074a();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(eVar2.f34249a)) {
            hashMap.put("email", C9431p.m18668d(eVar2.f34249a));
        }
        hashMap.put("mix_mode", "1");
        return new C13148f(context, aVar.mo24755a((Map<String, String>) hashMap, eVar2.f34250b).mo24752a(C13217i.m26602a(C12998a.m26118a("/passport/user/check_email_registered"), str2)).mo24757c(), eVar2, eVar);
    }
}
