package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10762d;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.z */
public final class C48370z implements C10762d {

    /* renamed from: a */
    public static final C48371a f121665a = new C48371a(null);

    /* renamed from: c */
    private static final boolean f121666c = false;

    /* renamed from: b */
    private final WeakReference<Context> f121667b;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.z$a */
    public static final class C48371a {
        private C48371a() {
        }

        public /* synthetic */ C48371a(C52707g gVar) {
            this();
        }
    }

    public C48370z(WeakReference<Context> weakReference) {
        C52711k.m112240b(weakReference, "contextRef");
        this.f121667b = weakReference;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.p675g.p676a.C10766h r4, org.json.JSONObject r5) {
        /*
            r3 = this;
            r5 = 0
            if (r4 == 0) goto L_0x000e
            org.json.JSONObject r0 = r4.f28947d
            if (r0 == 0) goto L_0x000e
            java.lang.String r1 = "phone_number"
            java.lang.String r0 = r0.getString(r1)
            goto L_0x000f
        L_0x000e:
            r0 = r5
        L_0x000f:
            if (r4 == 0) goto L_0x001b
            org.json.JSONObject r4 = r4.f28947d
            if (r4 == 0) goto L_0x001b
            java.lang.String r5 = "sms_content"
            java.lang.String r5 = r4.getString(r5)
        L_0x001b:
            java.lang.ref.WeakReference<android.content.Context> r4 = r3.f121667b
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L_0x0026
            return
        L_0x0026:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0042
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "smsto:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0048
        L_0x0042:
            java.lang.String r0 = "smsto:"
            android.net.Uri r0 = android.net.Uri.parse(r0)
        L_0x0048:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SENDTO"
            r1.<init>(r2, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r0 < r2) goto L_0x006b
            java.lang.String r0 = android.provider.Telephony.Sms.getDefaultSmsPackage(r4)
            java.lang.String r2 = "sms_body"
            r1.putExtra(r2, r5)
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0070
            r1.setPackage(r0)
            goto L_0x0070
        L_0x006b:
            java.lang.String r0 = "sms_body"
            r1.putExtra(r0, r5)
        L_0x0070:
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 != 0) goto L_0x0079
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r5)
        L_0x0079:
            r4.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x007d }
            return
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.C48370z.call(com.bytedance.ies.g.a.h, org.json.JSONObject):void");
    }
}
