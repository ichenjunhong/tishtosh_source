package com.bytedance.polaris.browser.p823a.p824a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.polaris.browser.p823a.C12608b;
import com.bytedance.polaris.browser.p823a.C12610d;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.f */
public final class C12601f implements C12608b {

    /* renamed from: a */
    private final WeakReference<Activity> f33085a;

    /* renamed from: a */
    public final void mo23674a() {
    }

    /* renamed from: b */
    public final void mo23676b() {
    }

    public C12601f(WeakReference<Activity> weakReference) {
        this.f33085a = weakReference;
    }

    /* renamed from: a */
    private boolean m25305a(JSONObject jSONObject) {
        if (jSONObject == null || this.f33085a == null) {
            return false;
        }
        Context context = (Context) this.f33085a.get();
        if (context == null) {
            return false;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("smsto");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        String optString = jSONObject.optString("sms_body");
        if (C9431p.m18664a(optString)) {
            return false;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                strArr[i] = optJSONArray.getString(i);
            } catch (Exception unused) {
            }
        }
        try {
            String join = TextUtils.join(";", strArr);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            StringBuilder sb = new StringBuilder("smsto:");
            sb.append(join);
            intent.setData(Uri.parse(sb.toString()));
            intent.putExtra("sms_body", optString);
            context.startActivity(intent);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo23675a(C12610d dVar, JSONObject jSONObject) {
        try {
            jSONObject.put("code", m25305a(dVar.f33102d) ? 1 : 0);
        } catch (JSONException unused) {
        }
        return true;
    }
}
