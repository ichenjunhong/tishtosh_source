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
import com.bytedance.sdk.account.p861f.p862a.C13109h;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13131h;
import com.bytedance.sdk.account.p865g.C13168a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.i */
public final class C13151i extends C13090h<C12993e<C13109h>> {

    /* renamed from: e */
    private C13109h f34349e;

    /* renamed from: a */
    public static C13074a m26448a(C13109h hVar) {
        return new C13074a().mo24755a(m26449b(hVar), hVar.f34268e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_email_send_code", "email", this.f34210b.mo24750a("type"), (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: b */
    private static Map<String, String> m26449b(C13109h hVar) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(hVar.f34264a)) {
            hashMap.put("email", C9431p.m18668d(hVar.f34264a));
        }
        if (!TextUtils.isEmpty(hVar.f34265b)) {
            hashMap.put("captcha", hVar.f34265b);
        }
        hashMap.put("type", C9431p.m18668d(String.valueOf(hVar.f34266c)));
        if (!TextUtils.isEmpty(hVar.f34270g)) {
            hashMap.put("password", C9431p.m18668d(hVar.f34270g));
        }
        if (!TextUtils.isEmpty(hVar.f34267d)) {
            hashMap.put("next", hVar.f34267d);
        }
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34349e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, PreloadTask.BYTE_UNIT_NUMBER, this.f34349e);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34349e, jSONObject);
        this.f34349e.f34279l = jSONObject2;
    }

    public C13151i(Context context, C13073a aVar, C13109h hVar, C13131h hVar2) {
        super(context, aVar, hVar2);
        this.f34349e = hVar;
    }
}
