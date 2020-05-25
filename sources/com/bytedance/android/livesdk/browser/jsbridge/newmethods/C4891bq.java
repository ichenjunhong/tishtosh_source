package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.webkit.WebView;
import com.bytedance.ies.p675g.p677b.C10782e;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bq */
public final class C4891bq extends C10782e<JSONObject, JSONObject> {

    /* renamed from: b */
    public static final C4892a f13171b = new C4892a(null);

    /* renamed from: a */
    public final WebView f13172a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bq$a */
    public static final class C4892a {
        private C4892a() {
        }

        public /* synthetic */ C4892a(C52707g gVar) {
            this();
        }
    }

    public C4891bq(WebView webView) {
        C52711k.m112240b(webView, "webView");
        this.f13172a = webView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r3.equals("status") != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3, com.bytedance.ies.p675g.p677b.C10783f r4) {
        /*
            r2 = this;
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r4 = "type"
            java.lang.String r3 = r3.optString(r4)
            r4 = 1
            if (r3 != 0) goto L_0x0016
            goto L_0x004f
        L_0x0016:
            int r0 = r3.hashCode()
            r1 = -892481550(0xffffffffcacdcff2, float:-6744057.0)
            if (r0 == r1) goto L_0x0046
            r1 = -677145915(0xffffffffd7a392c5, float:-3.59701531E14)
            if (r0 == r1) goto L_0x0038
            r1 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r0 == r1) goto L_0x002a
            goto L_0x004f
        L_0x002a:
            java.lang.String r0 = "back"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x004f
            android.webkit.WebView r3 = r2.f13172a
            r3.goBack()
            goto L_0x0050
        L_0x0038:
            java.lang.String r0 = "forward"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x004f
            android.webkit.WebView r3 = r2.f13172a
            r3.goForward()
            goto L_0x0050
        L_0x0046:
            java.lang.String r0 = "status"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "code"
            r3.put(r0, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r0 = "canGoBack"
            android.webkit.WebView r1 = r2.f13172a
            boolean r1 = r1.canGoBack()
            r4.put(r0, r1)
            java.lang.String r0 = "canGoForward"
            android.webkit.WebView r1 = r2.f13172a
            boolean r1 = r1.canGoForward()
            r4.put(r0, r1)
            java.lang.String r0 = "data"
            r3.put(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4891bq.invoke(java.lang.Object, com.bytedance.ies.g.b.f):java.lang.Object");
    }
}
