package com.p683ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.e */
public final class C35914e {
    /* renamed from: a */
    private static void m81076a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C9951d.m19997a(str, jSONObject);
    }

    /* renamed from: a */
    public static View m81075a(String str, View view, Context context, int i) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("type=");
        sb2.append(view.getClass().getName());
        sb2.append("\n");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("id=");
        sb3.append(view.getId());
        sb3.append("\n");
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("childCount=");
        sb4.append(((ViewGroup) view).getChildCount());
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append("isX2COpen=");
        sb5.append(C35916g.m81077a());
        sb.append(sb5.toString());
        C32458a.m75144a(sb.toString());
        m81076a("x2c_error", "", C23088c.m56631a().mo47824a("x2c_error", sb.toString()).mo47825b());
        if (i != 0) {
            return LayoutInflater.from(context).inflate(i, null);
        }
        return null;
    }
}
