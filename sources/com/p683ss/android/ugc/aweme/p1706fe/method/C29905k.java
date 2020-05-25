package com.p683ss.android.ugc.aweme.p1706fe.method;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.k */
final /* synthetic */ class C29905k implements Runnable {

    /* renamed from: a */
    private final C298832 f78041a;

    /* renamed from: b */
    private final String f78042b;

    /* renamed from: c */
    private final String f78043c;

    C29905k(C298832 r1, String str, String str2) {
        this.f78041a = r1;
        this.f78042b = str;
        this.f78043c = str2;
    }

    public final void run() {
        C298832 r0 = this.f78041a;
        String str = this.f78042b;
        String str2 = this.f78043c;
        JSONObject a = C29881e.this.mo60093a(1, "", "");
        try {
            a.put("file_id", str);
            a.put("url", str2);
        } catch (JSONException unused) {
        }
        C29881e.this.mo60096a("image", a);
    }
}
