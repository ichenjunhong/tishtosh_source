package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.bytedance.sdk.account.p865g.C13168a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.r */
public final class C13160r extends C13090h<C12993e<C13120s>> {

    /* renamed from: e */
    private C13120s f34358e;

    /* renamed from: a */
    public static C13074a m26493a(C13120s sVar) {
        return new C13074a().mo24755a(m26494b(sVar), sVar.f34327y);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_sendcode", "mobile", this.f34210b.mo24750a("type"), (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: b */
    private static Map<String, String> m26494b(C13120s sVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(sVar.f34314a)) {
            hashMap.put("mobile", C9431p.m18668d(sVar.f34314a));
        }
        if (!TextUtils.isEmpty(sVar.f34320g)) {
            hashMap.put("old_mobile", C9431p.m18668d(sVar.f34320g));
        }
        if (!TextUtils.isEmpty(sVar.f34315b)) {
            hashMap.put("captcha", sVar.f34315b);
        }
        hashMap.put("type", C9431p.m18668d(String.valueOf(sVar.f34318e)));
        hashMap.put("unbind_exist", C9431p.m18668d(String.valueOf(sVar.f34319f)));
        hashMap.put("mix_mode", "1");
        if (sVar.f34328z == 1) {
            hashMap.put("check_register", "1");
        } else if (sVar.f34328z == 0) {
            hashMap.put("check_register", "0");
        }
        if (!TextUtils.isEmpty(sVar.f34322t)) {
            hashMap.put("ticket", sVar.f34322t);
        }
        hashMap.put("auto_read", String.valueOf(sVar.f34323u));
        if (!TextUtils.isEmpty(sVar.f34324v)) {
            hashMap.put("shark_ticket", sVar.f34324v);
        }
        if (!TextUtils.isEmpty(sVar.f34326x)) {
            hashMap.put("auth_token", sVar.f34326x);
        }
        if (!TextUtils.isEmpty(sVar.f34325w)) {
            hashMap.put("unusable_mobile_ticket", sVar.f34325w);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, BaseNotice.CHECK_PROFILE, this.f34358e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34358e.f34321s = jSONObject2.optInt("retry_time", 30);
        this.f34358e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34358e, jSONObject);
        this.f34358e.f34279l = jSONObject2;
    }

    public C13160r(Context context, C13073a aVar, C13120s sVar, C13139p pVar) {
        super(context, aVar, pVar);
        this.f34358e = sVar;
    }
}
