package com.p683ss.android.ugc.aweme.p1328af.p1329a;

import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.af.a.c */
public final class C22505c extends Exception implements C22527q {

    /* renamed from: a */
    private final String f60632a;

    public final String getType() {
        return this.f60632a;
    }

    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", this.f60632a);
        String str = "error_message";
        StringBuilder sb = new StringBuilder();
        Throwable cause = getCause();
        if (cause == null) {
            C52711k.m112234a();
        }
        sb.append(cause.getClass().getSimpleName());
        sb.append(": ");
        Throwable cause2 = getCause();
        if (cause2 == null) {
            C52711k.m112234a();
        }
        sb.append(cause2.getMessage());
        jSONObject.put(str, sb.toString());
        return jSONObject;
    }

    public C22505c(String str, Throwable th) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(th, "cause");
        super(str, th);
        this.f60632a = str;
    }
}
