package com.bytedance.sdk.account.p860e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13000a;
import com.bytedance.sdk.account.p844a.p848d.C13012a;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import com.bytedance.sdk.account.p878m.C13217i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.a */
public final class C13096a extends C13090h<C13012a> {

    /* renamed from: e */
    private String f34220e;

    /* renamed from: f */
    private JSONObject f34221f;

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        String str;
        C13012a aVar = (C13012a) bVar;
        if (!TextUtils.isEmpty(aVar.f33999b)) {
            if (aVar.f33999b.contains(C12998a.m26121d())) {
                str = "passport_mobile_check_code";
            } else {
                str = "passport_email_check_code";
            }
            C13168a.m26527a(str, (String) null, (String) null, (C12990b) aVar, this.f34211c);
        }
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f34221f = jSONObject2;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34220e = jSONObject2.optString("ticket");
        this.f34221f = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C13012a aVar = new C13012a(z, 1019);
        if (z) {
            aVar.f34024h = this.f34220e;
        } else {
            aVar.f34000c = bVar.f34150b;
            aVar.f34001d = bVar.f34151c;
        }
        aVar.f34003f = this.f34221f;
        return aVar;
    }

    private C13096a(Context context, C13073a aVar, C13000a aVar2) {
        super(context, aVar, aVar2);
    }

    /* renamed from: a */
    public static C13096a m26359a(Context context, String str, String str2, int i, C13000a aVar) {
        C13074a a = new C13074a().mo24752a(C12998a.m26121d());
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(str));
        hashMap.put("code", C9431p.m18668d(str2));
        hashMap.put("type", String.valueOf(i));
        hashMap.put("mix_mode", "1");
        return new C13096a(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), aVar);
    }

    /* renamed from: a */
    public static C13096a m26360a(Context context, String str, String str2, int i, Map map, String str3, C13000a aVar) {
        C13074a a = new C13074a().mo24752a(C13217i.m26602a(C12998a.m26118a("/passport/email/check_code/"), str3));
        HashMap hashMap = new HashMap();
        hashMap.put("email", C9431p.m18668d(str));
        hashMap.put("code", C9431p.m18668d(str2));
        hashMap.put("type", String.valueOf(i));
        hashMap.put("mix_mode", "1");
        return new C13096a(context, a.mo24755a((Map<String, String>) hashMap, map).mo24757c(), aVar);
    }
}
