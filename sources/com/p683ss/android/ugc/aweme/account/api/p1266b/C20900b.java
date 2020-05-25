package com.p683ss.android.ugc.aweme.account.api.p1266b;

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
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.bytedance.sdk.account.p865g.C13168a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.api.b.b */
public final class C20900b extends C13090h<C12993e<C13120s>> {

    /* renamed from: f */
    public static final C20901a f56878f = new C20901a(null);

    /* renamed from: e */
    public final C13120s f56879e;

    /* renamed from: com.ss.android.ugc.aweme.account.api.b.b$a */
    public static final class C20901a {
        private C20901a() {
        }

        public /* synthetic */ C20901a(C52707g gVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C13074a mo44857a(C13120s sVar) {
            C13074a a = new C13074a().mo24754a(m53239b(sVar));
            C52711k.m112236a((Object) a, "ApiRequest.Builder()\n   …ters(getParams(queryObj))");
            return a;
        }

        /* renamed from: b */
        private static Map<String, String> m53239b(C13120s sVar) {
            Map<String, String> hashMap = new HashMap<>();
            String d = C9431p.m18668d(sVar.f34314a);
            C52711k.m112236a((Object) d, "StringUtils.encryptWithXor(queryObj.mMobile)");
            hashMap.put("mobile", d);
            if (!TextUtils.isEmpty(sVar.f34320g)) {
                String d2 = C9431p.m18668d(sVar.f34320g);
                C52711k.m112236a((Object) d2, "StringUtils.encryptWithXor(queryObj.mOldMobile)");
                hashMap.put("old_mobile", d2);
            }
            String str = sVar.f34315b;
            C52711k.m112236a((Object) str, "queryObj.mCaptcha");
            hashMap.put("captcha", str);
            String d3 = C9431p.m18668d(String.valueOf(sVar.f34318e));
            C52711k.m112236a((Object) d3, "StringUtils.encryptWithX…ueryObj.mType.toString())");
            hashMap.put("type", d3);
            String d4 = C9431p.m18668d(String.valueOf(sVar.f34319f));
            C52711k.m112236a((Object) d4, "StringUtils.encryptWithX….mUnbindExist.toString())");
            hashMap.put("unbind_exist", d4);
            hashMap.put("mix_mode", "1");
            if (sVar.f34328z == 1) {
                hashMap.put("check_register", "1");
            } else if (sVar.f34328z == 0) {
                hashMap.put("check_register", "0");
            }
            if (!TextUtils.isEmpty(sVar.f34322t)) {
                String str2 = sVar.f34322t;
                C52711k.m112236a((Object) str2, "queryObj.mTicket");
                hashMap.put("ticket", str2);
            }
            hashMap.put("auto_read", String.valueOf(sVar.f34323u));
            if (!TextUtils.isEmpty(sVar.f34324v)) {
                String str3 = sVar.f34324v;
                C52711k.m112236a((Object) str3, "queryObj.mSharkTicket");
                hashMap.put("shark_ticket", str3);
            }
            if (!TextUtils.isEmpty(sVar.f34325w)) {
                String str4 = sVar.f34325w;
                C52711k.m112236a((Object) str4, "queryObj.mUnusableMobileTicket");
                hashMap.put("unusable_mobile_ticket", str4);
            }
            return hashMap;
        }

        /* renamed from: a */
        public final C20900b mo44858a(Context context, String str, String str2, int i, int i2, String str3, int i3, int i4, C13139p pVar) {
            Context context2 = context;
            C13139p pVar2 = pVar;
            C52711k.m112240b(context, "context");
            String str4 = str;
            C52711k.m112240b(str, "mobile");
            String str5 = str2;
            C52711k.m112240b(str2, "captcha");
            String str6 = str3;
            C52711k.m112240b(str6, "ticket");
            C52711k.m112240b(pVar2, "call");
            C13120s sVar = new C13120s(str4, str5, i, i2, str6, i3, i4);
            C13073a c = mo44857a(sVar).mo24752a(C12998a.m26118a("/passport/mobile/send_whatsapp_code/")).mo24757c();
            C52711k.m112236a((Object) c, "request");
            return new C20900b(context, c, sVar, pVar2);
        }
    }

    /* renamed from: a */
    public static final C20900b m53233a(Context context, String str, String str2, int i, int i2, String str3, int i3, int i4, C13139p pVar) {
        return f56878f.mo44858a(context, str, str2, i, 0, str3, i3, i4, pVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_sendcode", "mobile", this.f34210b.mo24750a("type"), (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, BaseNotice.CHECK_PROFILE, this.f56879e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        C13120s sVar = this.f56879e;
        if (jSONObject2 != null) {
            i = jSONObject2.optInt("retry_time", 30);
        } else {
            i = 0;
        }
        sVar.f34321s = i;
        this.f56879e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f56879e, jSONObject);
        this.f56879e.f34279l = jSONObject2;
    }

    public C20900b(Context context, C13073a aVar, C13120s sVar, C13139p pVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "request");
        C52711k.m112240b(sVar, "queryObj");
        C52711k.m112240b(pVar, "call");
        super(context, aVar, pVar);
        this.f56879e = sVar;
    }

    /* renamed from: a */
    public static final C20900b m53234a(Context context, String str, String str2, int i, C13139p pVar) {
        C20901a aVar = f56878f;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "mobile");
        C52711k.m112240b(str2, "captcha");
        C52711k.m112240b(pVar, "call");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "mobile");
        C52711k.m112240b(str2, "captcha");
        C52711k.m112240b(pVar, "call");
        C13120s sVar = new C13120s(str, str2, i, 0, -1);
        C13073a c = aVar.mo44857a(sVar).mo24752a(C12998a.m26118a("/passport/mobile/send_whatsapp_code/")).mo24757c();
        C52711k.m112236a((Object) c, "request");
        return new C20900b(context, c, sVar, pVar);
    }
}
