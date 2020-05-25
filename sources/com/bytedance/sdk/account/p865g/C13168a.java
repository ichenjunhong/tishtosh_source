package com.bytedance.sdk.account.p865g;

import android.text.TextUtils;
import com.bytedance.sdk.account.p844a.p845a.C12989a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.p683ss.android.common.p1146d.C18894a;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.g.a */
public final class C13168a {
    /* renamed from: a */
    public static void m26527a(String str, String str2, String str3, C12990b bVar, WeakReference<? extends C12989a> weakReference) {
        JSONObject jSONObject;
        C12989a aVar = (C12989a) weakReference.get();
        if (aVar != null) {
            jSONObject = aVar.onSendEvent(str);
        } else {
            jSONObject = null;
        }
        m26528a(str, str2, str3, bVar, jSONObject);
    }

    /* renamed from: a */
    private static void m26528a(String str, String str2, String str3, C12990b bVar, JSONObject jSONObject) {
        C12990b bVar2 = bVar;
        if (bVar2 != null) {
            String str4 = bVar2.f34001d;
            if (TextUtils.isEmpty(str4)) {
                str4 = bVar2.f34002e;
            }
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            m26529a(str5, str6, str7, bVar2.f33998a, bVar2.f34000c, str4, jSONObject);
            return;
        }
        m26529a(str, str2, str3, false, -1, null, jSONObject);
    }

    /* renamed from: a */
    private static void m26529a(String str, String str2, String str3, boolean z, int i, String str4, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("platform", str2);
            jSONObject2.put("scene", str3);
            if (z) {
                jSONObject2.put("result", "success");
            } else {
                jSONObject2.put("result", "fail");
                jSONObject2.put("error", i);
                if (str4 != null) {
                    jSONObject2.put("errDesc", str4);
                }
            }
            jSONObject2.put("account_sdk_version", 386);
            jSONObject2.put("raw", jSONObject);
            C18894a.m46006a(str, jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
