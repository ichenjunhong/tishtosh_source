package com.appsflyer;

import android.content.Context;
import com.android.p116a.p117a.C2486a;
import com.android.p116a.p117a.C2486a.C2488a;
import com.android.p116a.p117a.C2489b;
import com.android.p116a.p117a.C2492c;

/* renamed from: com.appsflyer.d */
final class C2509d implements C2492c {

    /* renamed from: ˎ */
    private C2502a f7795;

    /* renamed from: ˏ */
    private C2486a f7796;

    C2509d() {
    }

    public final void onInstallReferrerServiceDisconnected() {
        AFLogger.afDebugLog("Install Referrer service disconnected");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071 A[SYNTHETIC, Splitter:B:21:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInstallReferrerSetupFinished(int r6) {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "code"
            java.lang.String r2 = java.lang.String.valueOf(r6)
            r0.put(r1, r2)
            r1 = 0
            switch(r6) {
                case 0: goto L_0x0024;
                case 1: goto L_0x001e;
                case 2: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            java.lang.String r6 = "responseCode not found."
            com.appsflyer.AFLogger.afWarnLog(r6)
            goto L_0x006f
        L_0x0018:
            java.lang.String r6 = "InstallReferrer not supported"
            com.appsflyer.AFLogger.afWarnLog(r6)
            goto L_0x006f
        L_0x001e:
            java.lang.String r6 = "InstallReferrer not supported"
            com.appsflyer.AFLogger.afWarnLog(r6)
            goto L_0x006f
        L_0x0024:
            java.lang.String r6 = "InstallReferrer connected"
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ Throwable -> 0x0050 }
            com.android.a.a.a r6 = r5.f7796     // Catch:{ Throwable -> 0x0050 }
            boolean r6 = r6.mo6893a()     // Catch:{ Throwable -> 0x0050 }
            if (r6 == 0) goto L_0x0043
            com.android.a.a.a r6 = r5.f7796     // Catch:{ Throwable -> 0x0050 }
            com.android.a.a.d r6 = r6.mo6895c()     // Catch:{ Throwable -> 0x0050 }
            com.android.a.a.a r1 = r5.f7796     // Catch:{ Throwable -> 0x003e }
            r1.mo6894b()     // Catch:{ Throwable -> 0x003e }
            r1 = r6
            goto L_0x006f
        L_0x003e:
            r1 = move-exception
            r4 = r1
            r1 = r6
            r6 = r4
            goto L_0x0051
        L_0x0043:
            java.lang.String r6 = "ReferrerClient: InstallReferrer is not ready"
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ Throwable -> 0x0050 }
            java.lang.String r6 = "err"
            java.lang.String r2 = "ReferrerClient: InstallReferrer is not ready"
            r0.put(r6, r2)     // Catch:{ Throwable -> 0x0050 }
            goto L_0x006f
        L_0x0050:
            r6 = move-exception
        L_0x0051:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get install referrer: "
            r2.<init>(r3)
            java.lang.String r3 = r6.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afWarnLog(r2)
            java.lang.String r2 = "err"
            java.lang.String r6 = r6.getMessage()
            r0.put(r2, r6)
        L_0x006f:
            if (r1 == 0) goto L_0x00bc
            java.lang.String r6 = r1.mo6900a()     // Catch:{ Exception -> 0x00a3 }
            if (r6 == 0) goto L_0x0080
            java.lang.String r6 = "val"
            java.lang.String r2 = r1.mo6900a()     // Catch:{ Exception -> 0x00a3 }
            r0.put(r6, r2)     // Catch:{ Exception -> 0x00a3 }
        L_0x0080:
            java.lang.String r6 = "clk"
            android.os.Bundle r2 = r1.f7686a     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r3 = "referrer_click_timestamp_seconds"
            long r2 = r2.getLong(r3)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ Exception -> 0x00a3 }
            r0.put(r6, r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r6 = "install"
            android.os.Bundle r1 = r1.f7686a     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r2 = "install_begin_timestamp_seconds"
            long r1 = r1.getLong(r2)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r1 = java.lang.Long.toString(r1)     // Catch:{ Exception -> 0x00a3 }
            r0.put(r6, r1)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x00bc
        L_0x00a3:
            r6 = move-exception
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43754b(r6)
            java.lang.String r6 = "val"
            java.lang.String r1 = "-1"
            r0.put(r6, r1)
            java.lang.String r6 = "clk"
            java.lang.String r1 = "-1"
            r0.put(r6, r1)
            java.lang.String r6 = "install"
            java.lang.String r1 = "-1"
            r0.put(r6, r1)
        L_0x00bc:
            com.appsflyer.a r6 = r5.f7795
            if (r6 == 0) goto L_0x00c5
            com.appsflyer.a r6 = r5.f7795
            r6.onHandleReferrer(r0)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C2509d.onInstallReferrerSetupFinished(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˋ */
    public final void mo6999(Context context, C2502a aVar) {
        this.f7795 = aVar;
        try {
            C2488a aVar2 = new C2488a(context);
            if (aVar2.f7679a != null) {
                this.f7796 = new C2489b(aVar2.f7679a);
                this.f7796.mo6892a(this);
                return;
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        } catch (Throwable th) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th);
        }
    }
}
