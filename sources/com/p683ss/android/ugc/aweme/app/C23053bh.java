package com.p683ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.app.bh */
public final class C23053bh extends C23138r {
    public C23053bh(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Uri mo47771a(Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(C24095a.m58944a());
        sb.append("://shortlink");
        String sb2 = sb.toString();
        if (uri != null) {
            C0013i.m16a((Callable<TResult>) new C23054bi<TResult>(this, uri)).mo29c(new C23055bj(this, uri));
        }
        return Uri.parse(sb2);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo47784a(android.net.Uri r8, p001a.C0013i r9) throws java.lang.Exception {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            if (r9 == 0) goto L_0x0076
            boolean r2 = r9.mo33d()
            if (r2 == 0) goto L_0x0012
            java.lang.Exception r9 = r9.mo35f()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r9)
            goto L_0x0076
        L_0x0012:
            java.lang.Object r2 = r9.mo34e()     // Catch:{ Exception -> 0x0073 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0073 }
            java.lang.String r3 = "backurl"
            java.lang.String r3 = r8.getQueryParameter(r3)     // Catch:{ Exception -> 0x0073 }
            android.net.Uri r4 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r5 = "user_id"
            java.lang.String r5 = r4.getQueryParameter(r5)     // Catch:{ Exception -> 0x0073 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0074 }
            if (r6 != 0) goto L_0x0043
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0074 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0074 }
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r6 = "backurl"
            r4.appendQueryParameter(r6, r3)     // Catch:{ Exception -> 0x0074 }
            android.net.Uri r4 = r4.build()     // Catch:{ Exception -> 0x0074 }
        L_0x0043:
            java.lang.String r3 = r8.getHost()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r6 = "z.douyin.com"
            boolean r3 = android.text.TextUtils.equals(r3, r6)     // Catch:{ Exception -> 0x0074 }
            if (r3 == 0) goto L_0x0067
            if (r2 == 0) goto L_0x0067
            java.lang.Object r9 = r9.mo34e()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0074 }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = "scheme"
            java.lang.String r9 = r9.getQueryParameter(r2)     // Catch:{ Exception -> 0x0074 }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0074 }
            r2 = 1
            goto L_0x0079
        L_0x0067:
            com.ss.android.ugc.aweme.app.be r9 = new com.ss.android.ugc.aweme.app.be     // Catch:{ Exception -> 0x0074 }
            android.content.Context r2 = r7.f61569a     // Catch:{ Exception -> 0x0074 }
            r9.<init>(r2)     // Catch:{ Exception -> 0x0074 }
            android.net.Uri r9 = r9.mo47771a(r4)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0078
        L_0x0073:
            r5 = r1
        L_0x0074:
            r9 = r1
            goto L_0x0078
        L_0x0076:
            r9 = r1
            r5 = r9
        L_0x0078:
            r2 = 0
        L_0x0079:
            if (r9 != 0) goto L_0x0094
            android.content.Context r9 = r7.f61569a
            android.net.Uri$Builder r2 = r8.buildUpon()
            java.lang.String r3 = "url"
            java.lang.String r8 = r8.toString()
            android.net.Uri$Builder r8 = r2.appendQueryParameter(r3, r8)
            android.net.Uri r8 = r8.build()
            android.content.Intent r8 = com.p683ss.android.ugc.aweme.app.C23060d.m56596a(r9, r8, r0)
            goto L_0x00e0
        L_0x0094:
            java.lang.String r8 = r9.getScheme()
            java.lang.String r3 = "http"
            boolean r8 = android.text.TextUtils.equals(r8, r3)
            if (r8 != 0) goto L_0x00c8
            java.lang.String r8 = r9.getScheme()
            java.lang.String r3 = "https"
            boolean r8 = android.text.TextUtils.equals(r8, r3)
            if (r8 == 0) goto L_0x00ad
            goto L_0x00c8
        L_0x00ad:
            android.content.Intent r8 = new android.content.Intent
            android.content.Context r0 = r7.f61569a
            java.lang.Class<com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity> r3 = com.p683ss.android.ugc.aweme.app.DeepLinkHandlerActivity.class
            r8.<init>(r0, r3)
            r8.setData(r9)
            java.lang.String r9 = "is_zlink"
            r8.putExtra(r9, r2)
            java.lang.String r9 = "user_id"
            if (r5 != 0) goto L_0x00c4
            java.lang.String r5 = ""
        L_0x00c4:
            r8.putExtra(r9, r5)
            goto L_0x00e0
        L_0x00c8:
            android.content.Context r8 = r7.f61569a
            android.net.Uri$Builder r2 = r9.buildUpon()
            java.lang.String r3 = "url"
            java.lang.String r9 = r9.toString()
            android.net.Uri$Builder r9 = r2.appendQueryParameter(r3, r9)
            android.net.Uri r9 = r9.build()
            android.content.Intent r8 = com.p683ss.android.ugc.aweme.app.C23060d.m56596a(r8, r9, r0)
        L_0x00e0:
            if (r8 == 0) goto L_0x00f6
            android.app.Activity r9 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            if (r9 == 0) goto L_0x00ec
            r9.startActivity(r8)
            return r1
        L_0x00ec:
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r8.addFlags(r9)
            android.content.Context r9 = r7.f61569a
            r9.startActivity(r8)
        L_0x00f6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.app.C23053bh.mo47784a(android.net.Uri, a.i):java.lang.Object");
    }
}
