package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.if */
public final class C15964if implements C15948hq<Object> {

    /* renamed from: a */
    private final Object f45067a = new Object();

    /* renamed from: b */
    private final Map<String, C15965ig> f45068b = new HashMap();

    /* renamed from: a */
    public final void mo31091a(String str, C15965ig igVar) {
        synchronized (this.f45067a) {
            this.f45068b.put(str, igVar);
        }
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String str7 = "\n";
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? str7.concat(valueOf) : new String(str7);
        }
        synchronized (this.f45067a) {
            C15965ig igVar = (C15965ig) this.f45068b.remove(str2);
            if (igVar == null) {
                String str8 = "Received result for unexpected method invocation: ";
                String valueOf2 = String.valueOf(str2);
                abv.m32798e(valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                igVar.mo31092a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                igVar.mo31093a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (abv.m32495a()) {
                        String str9 = "Result GMSG: ";
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        abv.m32494a(valueOf5.length() != 0 ? str9.concat(valueOf5) : new String(str9));
                    }
                    igVar.mo31093a(jSONObject);
                } catch (JSONException e) {
                    igVar.mo31092a(e.getMessage());
                }
            }
        }
    }
}
