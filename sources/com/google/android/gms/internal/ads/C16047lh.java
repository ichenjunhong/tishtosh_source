package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lh */
public final /* synthetic */ class C16047lh {
    /* renamed from: a */
    public static void m38007a(C16046lg lgVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        lgVar.mo29386a(str, jSONObject.toString());
    }

    /* renamed from: a */
    public static void m38005a(C16046lg lgVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        lgVar.mo29248d(sb.toString());
    }

    /* renamed from: b */
    public static void m38008b(C16046lg lgVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String str2 = "Dispatching AFMA event: ";
        String valueOf = String.valueOf(sb.toString());
        abv.m32792b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        lgVar.mo29248d(sb.toString());
    }

    /* renamed from: a */
    public static void m38006a(C16046lg lgVar, String str, Map map) {
        try {
            lgVar.mo29243a(str, C14963ax.m30831a().mo28664a(map));
        } catch (JSONException unused) {
            abv.m32798e("Could not convert parameters to JSON.");
        }
    }
}
