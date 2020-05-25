package com.p683ss.android.ugc.aweme.account.login.recover.p1288a;

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
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.f */
public final class C21426f extends C13090h<C12993e<C13121t>> {

    /* renamed from: f */
    public static final C21427a f58115f = new C21427a(null);

    /* renamed from: e */
    public final C13121t f58116e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.f$a */
    public static final class C21427a {
        private C21427a() {
        }

        public /* synthetic */ C21427a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C21426f mo45602a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, C13141r rVar) {
            Context context2 = context;
            String str9 = str;
            C13141r rVar2 = rVar;
            C52711k.m112240b(context, "context");
            String str10 = str5;
            C52711k.m112240b(str10, "account");
            String str11 = str6;
            C52711k.m112240b(str11, "pwd");
            String str12 = str7;
            C52711k.m112240b(str12, "token");
            String str13 = str8;
            C52711k.m112240b(str13, "captcha");
            C52711k.m112240b(rVar2, "call");
            C13121t tVar = new C13121t(str3, str4, str2, str10, str11, str12, str13, i);
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
            if (str9 != null) {
                hashMap.put("not_login_ticket", str);
            }
            Map map = hashMap;
            map.put("account_type", String.valueOf(i2));
            C13073a c = a.mo24754a(map).mo24757c();
            C52711k.m112236a((Object) c, "request");
            return new C21426f(context, c, tVar, rVar2);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        C12993e eVar = (C12993e) bVar;
        C52711k.m112240b(eVar, "response");
        C13168a.m26527a("passport_account_login", (String) null, (String) null, (C12990b) eVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        return new C12993e(z, 1016, this.f58116e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        C13121t tVar = this.f58116e;
        if (tVar != null) {
            tVar.f34337t = C13079a.m26266a(jSONObject, jSONObject2);
        }
        C13121t tVar2 = this.f58116e;
        if (tVar2 != null) {
            tVar2.f34279l = jSONObject;
        }
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C52711k.m112240b(jSONObject, "data");
        C52711k.m112240b(jSONObject2, "result");
        C13078b.m26263a(this.f58116e, jSONObject);
        C13121t tVar = this.f58116e;
        if (tVar != null) {
            tVar.f34279l = jSONObject2;
        }
    }

    public C21426f(Context context, C13073a aVar, C13121t tVar, C13141r rVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(tVar, "queryObj");
        C52711k.m112240b(rVar, "call");
        super(context, aVar, rVar);
        this.f58116e = tVar;
    }
}
