package com.snapchat.kit.sdk;

import android.app.Activity;

public class SnapKitActivity extends Activity {

    /* renamed from: a */
    OAuth2Manager f50373a;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r7 = r6.getIntent()
            if (r7 != 0) goto L_0x000d
            r6.finish()
            return
        L_0x000d:
            com.snapchat.kit.sdk.SnapKitComponent r0 = com.snapchat.kit.sdk.SnapKit.getComponent(r6)
            if (r0 != 0) goto L_0x0017
            r6.finish()
            return
        L_0x0017:
            r0.inject(r6)
            com.snapchat.kit.sdk.OAuth2Manager r0 = r6.f50373a
            r1 = 0
            if (r7 != 0) goto L_0x0021
        L_0x001f:
            r0 = 0
            goto L_0x0032
        L_0x0021:
            android.net.Uri r2 = r7.getData()
            if (r2 != 0) goto L_0x0028
            goto L_0x001f
        L_0x0028:
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = r0.f50344c
            boolean r0 = r2.startsWith(r0)
        L_0x0032:
            if (r0 == 0) goto L_0x010a
            com.snapchat.kit.sdk.OAuth2Manager r0 = r6.f50373a
            android.net.Uri r7 = r7.getData()
            com.snapchat.kit.sdk.core.models.AuthorizationRequest r2 = r0.f50351j
            if (r7 == 0) goto L_0x00f4
            java.lang.String r3 = "code"
            java.lang.String r3 = r7.getQueryParameter(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r3 = "state"
            java.lang.String r3 = r7.getQueryParameter(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00f4
            if (r2 == 0) goto L_0x00f4
            java.lang.String r3 = "state"
            java.lang.String r3 = r7.getQueryParameter(r3)
            java.lang.String r4 = r2.getState()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r2.getRedirectUri()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r3 = r2.getCodeVerifier()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x007d
            goto L_0x00f4
        L_0x007d:
            r0.f50352k = r1
            okhttp3.q$a r3 = new okhttp3.q$a
            r3.<init>()
            java.lang.String r4 = "grant_type"
            java.lang.String r5 = "authorization_code"
            r3.mo111586a(r4, r5)
            java.lang.String r4 = "code"
            java.lang.String r5 = "code"
            java.lang.String r7 = r7.getQueryParameter(r5)
            r3.mo111586a(r4, r7)
            java.lang.String r7 = "redirect_uri"
            java.lang.String r4 = r2.getRedirectUri()
            r3.mo111586a(r7, r4)
            java.lang.String r7 = "client_id"
            java.lang.String r4 = r0.f50343b
            r3.mo111586a(r7, r4)
            java.lang.String r7 = "code_verifier"
            java.lang.String r2 = r2.getCodeVerifier()
            r3.mo111586a(r7, r2)
            okhttp3.q r7 = r3.mo111587a()
            java.lang.String r2 = "/accounts/oauth2/token"
            okhttp3.ab r7 = com.snapchat.kit.sdk.OAuth2Manager.m44436a(r7, r2)
            if (r7 != 0) goto L_0x00d2
            dagger.a<com.snapchat.kit.sdk.core.metrics.MetricQueue<com.snapchat.kit.sdk.core.metrics.model.ServerEvent>> r7 = r0.f50348g
            java.lang.Object r7 = r7.get()
            com.snapchat.kit.sdk.core.metrics.MetricQueue r7 = (com.snapchat.kit.sdk.core.metrics.MetricQueue) r7
            com.snapchat.kit.sdk.core.metrics.business.e r2 = r0.f50349h
            com.snapchat.kit.sdk.core.metrics.model.ServerEvent r1 = r2.mo36435a(r1)
            r7.push(r1)
            com.snapchat.kit.sdk.core.controller.a r7 = r0.f50345d
            r7.mo36406b()
            goto L_0x010a
        L_0x00d2:
            com.snapchat.kit.sdk.core.controller.a r1 = r0.f50345d
            android.os.Handler r2 = r1.f50415b
            com.snapchat.kit.sdk.core.controller.a$4 r3 = new com.snapchat.kit.sdk.core.controller.a$4
            r3.<init>()
            r2.post(r3)
            com.snapchat.kit.sdk.a.a r1 = r0.f50350i
            com.snapchat.kit.sdk.a.a$a r2 = com.snapchat.kit.sdk.p1089a.C18244a.C18245a.GRANT
            r1.mo36393a(r2)
            okhttp3.y r1 = r0.f50346e
            okhttp3.e r7 = r1.mo111325a(r7)
            com.snapchat.kit.sdk.OAuth2Manager$3 r1 = new com.snapchat.kit.sdk.OAuth2Manager$3
            r1.<init>()
            r7.mo111246a(r1)
            goto L_0x010a
        L_0x00f4:
            dagger.a<com.snapchat.kit.sdk.core.metrics.MetricQueue<com.snapchat.kit.sdk.core.metrics.model.ServerEvent>> r7 = r0.f50348g
            java.lang.Object r7 = r7.get()
            com.snapchat.kit.sdk.core.metrics.MetricQueue r7 = (com.snapchat.kit.sdk.core.metrics.MetricQueue) r7
            com.snapchat.kit.sdk.core.metrics.business.e r2 = r0.f50349h
            com.snapchat.kit.sdk.core.metrics.model.ServerEvent r1 = r2.mo36435a(r1)
            r7.push(r1)
            com.snapchat.kit.sdk.core.controller.a r7 = r0.f50345d
            r7.mo36406b()
        L_0x010a:
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.SnapKitActivity.onCreate(android.os.Bundle):void");
    }
}
