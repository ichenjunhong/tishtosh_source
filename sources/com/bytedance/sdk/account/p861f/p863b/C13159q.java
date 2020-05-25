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
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13119r;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13138o;
import com.bytedance.sdk.account.p865g.C13168a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.q */
public final class C13159q extends C13090h<C12993e<C13119r>> {

    /* renamed from: e */
    private C13119r f34357e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_mobile_reset_password", "mobile", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, BaseNotice.COMMENT_REPLY_WITH_VIDEO, this.f34357e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34357e.f34313e = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34357e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34357e, jSONObject);
        this.f34357e.f34279l = jSONObject2;
    }

    private C13159q(Context context, C13073a aVar, C13119r rVar, C13138o oVar) {
        super(context, aVar, oVar);
        this.f34357e = rVar;
    }

    /* renamed from: a */
    public static C13159q m26488a(Context context, String str, String str2, String str3, String str4, C13138o oVar) {
        C13119r rVar = new C13119r(str, str2, str3, str4);
        C13074a a = new C13074a().mo24752a(C12998a.m26120c());
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(rVar.f34309a));
        if (!TextUtils.isEmpty(rVar.f34312d)) {
            hashMap.put("captcha", rVar.f34312d);
        }
        hashMap.put("code", C9431p.m18668d(rVar.f34310b));
        hashMap.put("password", C9431p.m18668d(rVar.f34311c));
        hashMap.put("mix_mode", "1");
        return new C13159q(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), rVar, oVar);
    }
}
