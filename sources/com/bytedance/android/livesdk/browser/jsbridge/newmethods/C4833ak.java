package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.ProgressDialog;
import com.bytedance.ies.p675g.p677b.C10779d;
import org.json.JSONObject;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ak */
public final class C4833ak extends C10779d<JSONObject, Object> {

    /* renamed from: a */
    ProgressDialog f13047a;

    /* renamed from: b */
    private C1690c f13048b;

    public final void onTerminate() {
        if (this.f13048b != null) {
            this.f13048b.dispose();
        }
        if (this.f13047a != null) {
            this.f13047a.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void invoke(java.lang.Object r5, com.bytedance.ies.p675g.p677b.C10783f r6) throws java.lang.Exception {
        /*
            r4 = this;
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            java.lang.String r0 = "type"
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "args"
            org.json.JSONObject r5 = r5.getJSONObject(r1)
            int r1 = r0.hashCode()
            r2 = 3529469(0x35dafd, float:4.94584E-39)
            r3 = 0
            if (r1 == r2) goto L_0x0028
            r2 = 1671672458(0x63a3b28a, float:6.039369E21)
            if (r1 == r2) goto L_0x001e
            goto L_0x0032
        L_0x001e:
            java.lang.String r1 = "dismiss"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0028:
            java.lang.String r1 = "show"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            goto L_0x0033
        L_0x0032:
            r0 = -1
        L_0x0033:
            switch(r0) {
                case 0: goto L_0x004f;
                case 1: goto L_0x0037;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x008d
        L_0x0037:
            c.a.b.c r5 = r4.f13048b
            if (r5 == 0) goto L_0x0040
            c.a.b.c r5 = r4.f13048b
            r5.dispose()
        L_0x0040:
            android.app.ProgressDialog r5 = r4.f13047a
            if (r5 == 0) goto L_0x0049
            android.app.ProgressDialog r5 = r4.f13047a
            r5.dismiss()
        L_0x0049:
            r5 = 0
            r4.f13048b = r5
            r4.f13047a = r5
            goto L_0x008d
        L_0x004f:
            android.app.ProgressDialog r0 = r4.f13047a
            if (r0 == 0) goto L_0x0058
            android.app.ProgressDialog r0 = r4.f13047a
            r0.dismiss()
        L_0x0058:
            android.content.Context r6 = r6.f28972a
            java.lang.String r0 = "message"
            java.lang.String r5 = r5.getString(r0)
            android.app.ProgressDialog r5 = com.bytedance.android.livesdk.p279af.C4571ak.m10973b(r6, r5)
            r4.f13047a = r5
            android.app.ProgressDialog r5 = r4.f13047a
            r5.setCancelable(r3)
            android.app.ProgressDialog r5 = r4.f13047a
            r5.show()
            r5 = 8
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            c.a.ad r5 = p064c.p065a.C1680ad.m5956a(r5, r0)
            c.a.ac r6 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            c.a.ad r5 = r5.mo6148a(r6)
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.al r6 = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.al
            r6.<init>(r4)
            c.a.d.e r0 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4835am.f13050a
            c.a.b.c r5 = r5.mo6152a(r6, r0)
            r4.f13048b = r5
        L_0x008d:
            r4.finishWithSuccess()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4833ak.invoke(java.lang.Object, com.bytedance.ies.g.b.f):void");
    }
}
