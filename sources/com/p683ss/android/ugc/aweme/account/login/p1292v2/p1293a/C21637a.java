package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13103b;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13125b;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a */
public final class C21637a extends C13090h<C12993e<C13103b>> {

    /* renamed from: e */
    public static final C21638a f58652e = new C21638a(null);

    /* renamed from: f */
    private final C13103b f58653f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a$a */
    public static final class C21638a {
        private C21638a() {
        }

        public /* synthetic */ C21638a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C21637a mo45903a(Context context, String str, String str2, String str3, String str4, int i, C13125b bVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "mobile");
            C52711k.m112240b(str2, "code");
            C52711k.m112240b(str3, "password");
            C52711k.m112240b(str4, "captcha");
            C52711k.m112240b(bVar, "call");
            C13103b bVar2 = new C13103b(str, str2, str3, str4, 0);
            C13074a a = new C13074a().mo24752a("/passport/mobile/bind_with_change_password/");
            C52711k.m112240b(bVar2, "queryObj");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(bVar2.f34236c)) {
                String str5 = bVar2.f34236c;
                C52711k.m112236a((Object) str5, "queryObj.mCaptcha");
                hashMap.put("captcha", str5);
            }
            Map map = hashMap;
            String d = C9431p.m18668d(bVar2.f34235b);
            C52711k.m112236a((Object) d, "StringUtils.encryptWithXor(queryObj.mCode)");
            map.put("code", d);
            String d2 = C9431p.m18668d(bVar2.f34234a);
            C52711k.m112236a((Object) d2, "StringUtils.encryptWithXor(queryObj.mMobile)");
            map.put("mobile", d2);
            if (!TextUtils.isEmpty(bVar2.f34237d)) {
                String d3 = C9431p.m18668d(bVar2.f34237d);
                C52711k.m112236a((Object) d3, "StringUtils.encryptWithXor(queryObj.mPassword)");
                map.put("password", d3);
            }
            String d4 = C9431p.m18668d(String.valueOf(bVar2.f34238e));
            C52711k.m112236a((Object) d4, "StringUtils.encryptWithX….mUnbindExist.toString())");
            map.put("unbind_exist", d4);
            map.put("mix_mode", "1");
            C13073a c = a.mo24754a(map).mo24757c();
            C52711k.m112236a((Object) c, "request");
            return new C21637a(context, c, bVar2, bVar);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        C12993e eVar = (C12993e) bVar;
        C52711k.m112240b(eVar, "response");
        C13168a.m26527a("passport_mobile_bind", "mobile", (String) null, (C12990b) eVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        return new C12993e(z, 1012, this.f58653f);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        this.f58653f.f34239f = C13079a.m26266a(jSONObject, jSONObject2);
        this.f58653f.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C52711k.m112240b(jSONObject, "data");
        C52711k.m112240b(jSONObject2, "result");
        C13078b.m26263a(this.f58653f, jSONObject);
        this.f58653f.f34279l = jSONObject2;
    }

    public C21637a(Context context, C13073a aVar, C13103b bVar, C13125b bVar2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(bVar, "queryObj");
        C52711k.m112240b(bVar2, "call");
        super(context, aVar, bVar2);
        this.f58653f = bVar;
    }
}
