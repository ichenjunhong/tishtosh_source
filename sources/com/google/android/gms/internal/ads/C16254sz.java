package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.sz */
public final class C16254sz implements C16265tj<C15825dc> {
    /* renamed from: a */
    public final /* synthetic */ C15843dt mo31391a(C16256ta taVar, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException {
        JSONObject jSONObject2;
        aga aga;
        String[] strArr = {"html_containers", "instream"};
        JSONObject jSONObject3 = jSONObject;
        int i = 0;
        while (true) {
            if (i > 0) {
                break;
            } else if (jSONObject3 == null) {
                jSONObject3 = null;
                break;
            } else {
                jSONObject3 = jSONObject3.optJSONObject(strArr[0]);
                i++;
            }
        }
        if (jSONObject3 == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = jSONObject3.optJSONObject(strArr[1]);
        }
        if (jSONObject2 == null) {
            aga = taVar.mo31393a(jSONObject, "video");
        } else {
            String optString = jSONObject2.optString("base_url");
            String optString2 = jSONObject2.optString("html");
            if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                aga = afp.m32820a(null);
            } else {
                C16266tk a = C16256ta.m38812a(taVar.f45568a, taVar.f45570c, taVar.f45571d, taVar.f45572e, taVar.f45569b);
                agl agl = new agl();
                Executor executor = agf.f40430a;
                C16268tm tmVar = new C16268tm(a, true, agl, optString, optString2);
                executor.execute(tmVar);
                aga = agl;
            }
        }
        ama a2 = C16256ta.m38811a(aga);
        if (a2 != null) {
            return new C15825dc(a2);
        }
        abv.m32798e("Can not get video view for instream ad.");
        return null;
    }
}
