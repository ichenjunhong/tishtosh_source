package com.p683ss.android.ugc.aweme.account.login.p1280a;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13121t;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.f */
public abstract class C21050f extends C21049e {
    /* renamed from: b */
    public abstract void mo45093b(String str);

    /* renamed from: b */
    public abstract void mo45094b(String str, String str2);

    /* renamed from: c */
    public abstract void mo45095c(String str);

    public void onSuccess(C12993e<C13121t> eVar) {
        mo45090a(((C13121t) eVar.f34007h).f34279l);
    }

    public void onError(C12993e<C13121t> eVar, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        if (i > 0) {
            try {
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
                    }
                    if (i != 1009) {
                        if (i != 1033) {
                            if (i == 1039) {
                                mo45087a();
                                return;
                            } else if (i == 2002) {
                                mo45094b(jSONObject2.optString("mobile"), jSONObject2.optString("shark_ticket"));
                                return;
                            } else if (i == 2005) {
                                mo45093b(jSONObject2.getString("platform"));
                                return;
                            } else if (i == 1056) {
                                mo45095c(eVar.f34001d);
                                return;
                            }
                        }
                    }
                    mo45092a(((C13121t) eVar.f34007h).f34279l, String.valueOf(i), eVar.f34001d);
                    return;
                }
                mo45088a("-998");
                mo45091a(jSONObject2, i, eVar.f34001d);
            } catch (Exception unused) {
                mo45088a("-999");
            }
        } else {
            mo45088a("-1000");
            mo45091a((JSONObject) null, -998, C23826bi.m58460b().getString(R.string.az7));
        }
    }
}
