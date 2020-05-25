package com.bytedance.sdk.account.p860e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13004e;
import com.bytedance.sdk.account.p844a.p848d.C13018g;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p865g.C13168a;
import com.bytedance.sdk.account.p876k.C13193a;
import com.bytedance.sdk.account.p877l.C13207b;
import com.bytedance.sdk.account.p878m.C13217i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.e.e */
public final class C13100e extends C13090h<C13018g> {

    /* renamed from: e */
    C13207b f34225e;

    /* renamed from: f */
    private String f34226f = "";

    /* renamed from: g */
    private C13193a f34227g;

    /* renamed from: h */
    private JSONObject f34228h;

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        C13018g gVar = (C13018g) bVar;
        if (!TextUtils.isEmpty(this.f34226f)) {
            if (this.f34226f.equals("mobile")) {
                C13168a.m26527a("passport_mobile_reset_password", "mobile", "ticket", (C12990b) gVar, this.f34211c);
            } else if (this.f34226f.equals("email")) {
                C13168a.m26527a("passport_email_reset_password", "email", "ticket", (C12990b) gVar, this.f34211c);
            }
        }
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f34228h = jSONObject2;
        C13078b.m26264a(this.f34227g, jSONObject, jSONObject2);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34225e = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34228h = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C13018g gVar = new C13018g(z, 1018);
        if (z) {
            gVar.f34009h = this.f34225e;
        } else {
            gVar.f34000c = bVar.f34150b;
            gVar.f34001d = bVar.f34151c;
            if (this.f34227g.f34442g == 1075) {
                gVar.f34015n = this.f34227g.f34448m;
                gVar.f34018q = this.f34227g.f34451p;
                gVar.f34017p = this.f34227g.f34450o;
                gVar.f34016o = this.f34227g.f34449n;
                gVar.f34014m = this.f34227g.f34447l;
            }
        }
        gVar.f34003f = this.f34228h;
        return gVar;
    }

    private C13100e(Context context, C13073a aVar, String str, C13004e eVar) {
        super(context, aVar, eVar);
        this.f34226f = str;
        this.f34227g = new C13193a();
    }

    /* renamed from: a */
    public static C13100e m26378a(Context context, String str, String str2, C13004e eVar) {
        C13074a a = new C13074a().mo24752a(C12998a.m26122e());
        HashMap hashMap = new HashMap();
        hashMap.put("password", C9431p.m18668d(str));
        hashMap.put("ticket", C9431p.m18668d(str2));
        hashMap.put("mix_mode", "1");
        return new C13100e(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), "mobile", eVar);
    }

    /* renamed from: a */
    public static C13100e m26379a(Context context, String str, String str2, Map map, String str3, C13004e eVar) {
        C13074a a = new C13074a().mo24752a(C13217i.m26602a(C12998a.m26123f(), str3));
        HashMap hashMap = new HashMap();
        hashMap.put("password", C9431p.m18668d(str));
        hashMap.put("ticket", str2);
        hashMap.put("mix_mode", "1");
        return new C13100e(context, a.mo24755a((Map<String, String>) hashMap, map).mo24757c(), "email", eVar);
    }
}
