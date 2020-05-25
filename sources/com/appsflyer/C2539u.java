package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.lang.ref.WeakReference;

/* renamed from: com.appsflyer.u */
final class C2539u {

    /* renamed from: com.appsflyer.u$a */
    static class C2540a extends AsyncTask<Void, Void, String> {

        /* renamed from: ˎ */
        private final WeakReference<Context> f7900;

        /* renamed from: ˏ */
        private String f7901;

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            super.onPreExecute();
            this.f7901 = AppsFlyerProperties.getInstance().getString("gcmProjectNumber");
        }

        /* renamed from: ˊ */
        private String m7450() {
            String str = null;
            try {
                if (this.f7901 != null) {
                    str = C2539u.m7445(this.f7900, this.f7901);
                }
                return str;
            } catch (Throwable th) {
                AFLogger.afErrorLog("Error registering for uninstall feature", th);
                return null;
            }
        }

        C2540a(WeakReference<Context> weakReference) {
            this.f7900 = weakReference;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m7450();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                String string = AppsFlyerProperties.getInstance().getString("afUninstallToken");
                C2508c cVar = new C2508c(str);
                if (string == null) {
                    C2539u.m7449((Context) this.f7900.get(), cVar);
                    return;
                }
                C2508c r3 = C2508c.m7358(string);
                if (r3.mo6994(cVar)) {
                    C2539u.m7449((Context) this.f7900.get(), r3);
                }
            }
        }
    }

    /* renamed from: ˋ */
    static boolean m7446(Context context) {
        return m7444(context) | m7447(context);
    }

    /* renamed from: ˊ */
    private static boolean m7444(Context context) {
        boolean z;
        boolean z2;
        if (AppsFlyerLib.getInstance().f7728) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdService");
            Intent intent = new Intent("com.google.firebase.INSTANCE_ID_EVENT", null, context, FirebaseInstanceIdListener.class);
            Intent intent2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT", null, context, FirebaseInstanceIdService.class);
            if (context.getPackageManager().queryIntentServices(intent, 0).size() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (context.getPackageManager().queryIntentServices(intent2, 0).size() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
                    return false;
                }
            }
            return true;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r0 != false) goto L_0x0049;
     */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m7447(android.content.Context r6) {
        /*
            com.appsflyer.AppsFlyerLib r0 = com.appsflyer.AppsFlyerLib.getInstance()
            boolean r0 = r0.f7728
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = "com.google.android.gms.iid.InstanceIDListenerService"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.lang.String r2 = "com.google.android.gms.iid.InstanceID"
            java.lang.Class<com.appsflyer.GcmInstanceIdListener> r3 = com.appsflyer.GcmInstanceIdListener.class
            r4 = 0
            r0.<init>(r2, r4, r6, r3)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.lang.String r3 = "com.google.android.gms.iid.InstanceID"
            java.lang.Class<com.google.android.gms.iid.InstanceIDListenerService> r5 = com.google.android.gms.iid.InstanceIDListenerService.class
            r2.<init>(r3, r4, r6, r5)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.util.List r0 = r3.queryIntentServices(r0, r1)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            int r0 = r0.size()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            r3 = 1
            if (r0 <= 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x0049
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.util.List r0 = r0.queryIntentServices(r2, r1)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            int r0 = r0.size()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            if (r0 <= 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x00a0
        L_0x0049:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.lang.String r2 = "com.google.android.c2dm.intent.RECEIVE"
            java.lang.String r5 = "com.google.android.gms.gcm.GcmReceiver"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            r0.<init>(r2, r4, r6, r5)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.util.List r0 = r2.queryBroadcastReceivers(r0, r1)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            int r0 = r0.size()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            if (r0 <= 0) goto L_0x0066
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = r6.getPackageName()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            r2.<init>()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            r2.append(r0)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.lang.String r0 = ".permission.C2D_MESSAGE"
            r2.append(r0)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            java.lang.String r0 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            boolean r6 = com.appsflyer.C2511f.C25121.m7369(r6, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            if (r6 == 0) goto L_0x0085
            return r3
        L_0x0085:
            java.lang.String r6 = "Cannot verify existence of the app's \"permission.C2D_MESSAGE\" permission in the manifest. Please refer to documentation."
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            goto L_0x00a0
        L_0x008b:
            java.lang.String r6 = "Cannot verify existence of GcmReceiver receiver in the manifest. Please refer to documentation."
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ ClassNotFoundException -> 0x0098, Throwable -> 0x0091 }
            goto L_0x00a0
        L_0x0091:
            r6 = move-exception
            java.lang.String r0 = "An error occurred while trying to verify manifest declarations: "
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
            goto L_0x00a0
        L_0x0098:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.appsflyer.AFLogger.afRDLog(r6)
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.C2539u.m7447(android.content.Context):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: ˋ */
    public static String m7445(WeakReference<Context> weakReference, String str) {
        try {
            Class cls = Class.forName("com.google.android.gms.iid.InstanceID");
            Class.forName("com.google.android.gms.gcm.GcmReceiver");
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{weakReference.get()});
            String str2 = (String) cls.getDeclaredMethod("getToken", new Class[]{String.class, String.class}).invoke(invoke, new Object[]{str, "GCM"});
            if (str2 != null) {
                return str2;
            }
            AFLogger.afWarnLog("Couldn't get token using reflection.");
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't get token using GoogleCloudMessaging. ", th);
            return null;
        }
    }

    /* renamed from: ˏ */
    static void m7449(Context context, C2508c cVar) {
        StringBuilder sb = new StringBuilder("updateServerUninstallToken called with: ");
        sb.append(cVar.toString());
        AFLogger.afInfoLog(sb.toString());
        C2508c r0 = C2508c.m7358(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
        if (!C35807d.m80935a(context, "appsflyer-data", 0).getBoolean("sentRegisterRequestToAF", false) || r0.f7789 == null || !r0.f7789.equals(cVar.f7789)) {
            AppsFlyerProperties.getInstance().set("afUninstallToken", cVar.toString());
            AppsFlyerLib.getInstance().mo6953(context, cVar.f7789);
        }
    }
}
