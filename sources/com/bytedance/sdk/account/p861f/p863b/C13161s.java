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
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.s */
public final class C13161s extends C13090h<C12993e<C13120s>> {

    /* renamed from: e */
    private C13120s f34359e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
    }

    /* renamed from: a */
    private static Map<String, String> m26500a(C13120s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C9431p.m18668d(sVar.f34314a));
        if (!TextUtils.isEmpty(sVar.f34320g)) {
            hashMap.put("old_mobile", C9431p.m18668d(sVar.f34320g));
        }
        hashMap.put("captcha", sVar.f34315b);
        hashMap.put("type", C9431p.m18668d(String.valueOf(sVar.f34318e)));
        hashMap.put("unbind_exist", C9431p.m18668d(String.valueOf(sVar.f34319f)));
        hashMap.put("mix_mode", "1");
        return hashMap;
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, BaseNotice.CHECK_PROFILE, this.f34359e);
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34359e, jSONObject);
        this.f34359e.f34279l = jSONObject2;
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34359e.f34321s = jSONObject2.optInt("retry_time", 30);
        this.f34359e.f34279l = jSONObject;
    }

    private C13161s(Context context, C13073a aVar, C13120s sVar, C13139p pVar) {
        super(context, aVar, pVar);
        this.f34359e = sVar;
    }

    /* renamed from: a */
    public static C13161s m26499a(Context context, String str, String str2, int i, int i2, C13139p pVar) {
        C13120s sVar = new C13120s(str, str2, i, 0, -1);
        return new C13161s(context, new C13074a().mo24752a(C12998a.m26131n()).mo24754a(m26500a(sVar)).mo24757c(), sVar, pVar);
    }
}
