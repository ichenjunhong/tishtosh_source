package com.p683ss.android.ugc.aweme.account.login.p1280a;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13121t;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13141r;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.e */
public abstract class C21049e extends C13141r {
    /* renamed from: a */
    public abstract void mo45087a();

    /* renamed from: a */
    public void mo45088a(String str) {
    }

    /* renamed from: a */
    public abstract void mo45089a(String str, String str2);

    /* renamed from: a */
    public abstract void mo45090a(JSONObject jSONObject);

    /* renamed from: a */
    public void mo45091a(JSONObject jSONObject, int i, String str) {
    }

    /* renamed from: a */
    public abstract void mo45092a(JSONObject jSONObject, String str, String str2);

    public void onSuccess(C12993e<C13121t> eVar) {
        mo45090a(((C13121t) eVar.f34007h).f34279l);
    }

    public void onError(C12993e<C13121t> eVar, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (i > 0) {
            if (eVar.f34007h != null) {
                jSONObject = ((C13121t) eVar.f34007h).f34279l;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("data");
            }
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("captcha");
                if (!TextUtils.isEmpty(optString)) {
                    mo45089a(optString, eVar.f34001d);
                    return;
                } else if (i == 1009 || i == 1033) {
                    mo45092a(((C13121t) eVar.f34007h).f34279l, String.valueOf(i), eVar.f34001d);
                    return;
                } else if (i == 1039) {
                    mo45087a();
                    return;
                }
            }
            mo45088a("-998");
            mo45091a(jSONObject2, i, eVar.f34001d);
            return;
        }
        mo45088a("-1000");
        mo45091a((JSONObject) null, -998, C23826bi.m58460b().getString(R.string.az7));
    }
}
