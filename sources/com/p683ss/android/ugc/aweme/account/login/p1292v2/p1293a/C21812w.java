package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

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
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.w */
public final class C21812w extends C13090h<C12993e<C13105d>> {

    /* renamed from: e */
    public static final C21813a f59075e = new C21813a(null);

    /* renamed from: f */
    private final C13105d f59076f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.w$a */
    public static final class C21813a {
        private C21813a() {
        }

        public /* synthetic */ C21813a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final C21812w mo45946a(Context context, String str, String str2, String str3, C13127d dVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "ticket");
            C52711k.m112240b(str2, "pwd");
            C52711k.m112240b(str3, "captcha");
            C52711k.m112240b(dVar, "call");
            C13105d dVar2 = new C13105d(str, str2, str3);
            C13074a a = new C13074a().mo24752a(C12998a.m26124g());
            C52711k.m112240b(dVar2, "queryObj");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(dVar2.f34248c)) {
                String str4 = dVar2.f34248c;
                C52711k.m112236a((Object) str4, "queryObj.mCaptcha");
                hashMap.put("captcha", str4);
            }
            Map map = hashMap;
            String d = C9431p.m18668d(dVar2.f34246a);
            C52711k.m112236a((Object) d, "StringUtils.encryptWithXor(queryObj.mCode)");
            map.put("ticket", d);
            String d2 = C9431p.m18668d(dVar2.f34247b);
            C52711k.m112236a((Object) d2, "StringUtils.encryptWithXor(queryObj.mPassword)");
            map.put("password", d2);
            map.put("mix_mode", "1");
            C13073a c = a.mo24754a(map).mo24757c();
            C52711k.m112236a((Object) c, "request");
            C21812w wVar = new C21812w(context, c, dVar2, dVar, null);
            return wVar;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo24585a(C12990b bVar) {
        C12993e eVar = (C12993e) bVar;
        C52711k.m112240b(eVar, "response");
        C13168a.m26527a("passport_mobile_change_password", "mobile", (String) null, (C12990b) eVar, this.f34211c);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        C52711k.m112240b(jSONObject, "result");
        C52711k.m112240b(jSONObject2, "data");
        this.f59076f.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        C52711k.m112240b(bVar, "response");
        return new C12993e(z, 1010, this.f59076f);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C52711k.m112240b(jSONObject, "data");
        C52711k.m112240b(jSONObject2, "result");
        C13078b.m26263a(this.f59076f, jSONObject);
        this.f59076f.f34279l = jSONObject2;
    }

    private C21812w(Context context, C13073a aVar, C13105d dVar, C13127d dVar2) {
        super(context, aVar, dVar2);
        this.f59076f = dVar;
    }

    public /* synthetic */ C21812w(Context context, C13073a aVar, C13105d dVar, C13127d dVar2, C52707g gVar) {
        this(context, aVar, dVar, dVar2);
    }
}
