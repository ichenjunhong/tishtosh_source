package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.CheckSmsAppMethod */
public final class CheckSmsAppMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C48286a f121504b = new C48286a(null);

    /* renamed from: a */
    public final WeakReference<Context> f121505a;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.CheckSmsAppMethod$a */
    public static final class C48286a {
        private C48286a() {
        }

        public /* synthetic */ C48286a(C52707g gVar) {
            this();
        }
    }

    public CheckSmsAppMethod(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "bridge");
        super(aVar);
        this.f121505a = weakReference;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r2, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r3) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r2 = r1.f121505a
            java.lang.Object r2 = r2.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r2 == 0) goto L_0x0017
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "android.hardware.telephony"
            boolean r2 = r2.hasSystemFeature(r0)
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            if (r2 == 0) goto L_0x0023
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r3.mo60039a(r2)
            return
        L_0x0023:
            r2 = -1
            java.lang.String r0 = "Phone does not have available SMS app"
            r3.mo60038a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.CheckSmsAppMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
