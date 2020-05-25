package com.p683ss.android.common.p1141a;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p683ss.android.deviceregister.C19044i.C19046a;
import com.p683ss.android.deviceregister.C19047j;
import com.p683ss.android.deviceregister.C19059m;

/* renamed from: com.ss.android.common.a.a */
public final class C18847a {

    /* renamed from: com.ss.android.common.a.a$a */
    public static class C18848a extends Thread {

        /* renamed from: a */
        private Context f52041a;

        /* renamed from: b */
        private String f52042b;

        /* renamed from: c */
        private final Integer f52043c;

        public final void run() {
            C19047j a = C19047j.m46366a();
            Integer num = this.f52043c;
            new StringBuilder("id=").append(num);
            C19046a aVar = (C19046a) a.f52479g.get(num);
            aVar.mo38921c(Long.valueOf(SystemClock.uptimeMillis()));
            C19059m.m46390a().mo38939a(aVar.mo38919a());
            C18847a.m45953a(this.f52041a, this.f52042b, this.f52043c);
        }

        public C18848a(Context context, String str, Integer num) {
            this.f52041a = context;
            this.f52042b = str;
            this.f52043c = num;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Throwable, java.util.Map, com.bytedance.common.utility.k$a] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v24, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0130, code lost:
        com.p683ss.android.deviceregister.C19047j.m46366a().mo38927a(r8, android.util.Log.getStackTraceString(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013b, code lost:
        throw r6;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00b4 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [java.lang.Throwable, java.util.Map, com.bytedance.common.utility.k$a]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.Throwable, java.util.Map, com.bytedance.common.utility.k$a, ?[OBJECT, ARRAY]]
      mth insns count: 108
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0104 A[Catch:{ Exception -> 0x013c, all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x012f A[ExcHandler:  FINALLY, Splitter:B:1:0x0002] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45953a(android.content.Context r6, java.lang.String r7, java.lang.Integer r8) {
        /*
            r0 = 0
            r1 = 0
            com.ss.android.deviceregister.j r2 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.String r4 = "id="
            r3.<init>(r4)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r3.append(r8)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.util.Map<java.lang.Integer, com.ss.android.deviceregister.i$a> r2 = r2.f52479g     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.Object r2 = r2.get(r8)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            com.ss.android.deviceregister.i$a r2 = (com.p683ss.android.deviceregister.C19044i.C19046a) r2     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r2.mo38922d(r3)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            com.ss.android.deviceregister.o r3 = com.p683ss.android.deviceregister.C19059m.m46390a()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            com.ss.android.deviceregister.i r2 = r2.mo38919a()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r3.mo38939a(r2)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r2.<init>(r7)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r7 = 1
            boolean r3 = com.p683ss.android.deviceregister.C19034d.m46327f()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            if (r3 == 0) goto L_0x003f
            java.lang.String r3 = com.p683ss.android.deviceregister.p1158c.C19031b.m46309c(r6)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            goto L_0x0040
        L_0x003f:
            r3 = r1
        L_0x0040:
            boolean r4 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            if (r4 == 0) goto L_0x004a
            java.lang.String r3 = com.p683ss.android.C18841b.m45928a()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
        L_0x004a:
            java.lang.String r4 = "google_aid"
            m45952a(r2, r4, r3, r7)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            int r3 = r3.getRawOffset()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            int r3 = r3 / r4
            r4 = -12
            if (r3 >= r4) goto L_0x0061
            r3 = -12
        L_0x0061:
            r4 = 12
            if (r3 <= r4) goto L_0x0067
            r3 = 12
        L_0x0067:
            java.lang.String r4 = "timezone"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            r5.<init>()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            r5.append(r3)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            m45952a(r2, r4, r3, r0)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            java.lang.String r3 = com.p683ss.android.deviceregister.p1154a.C19005d.f52320j     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            if (r4 != 0) goto L_0x008e
            java.lang.String r4 = "package"
            m45952a(r2, r4, r3, r7)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            java.lang.String r3 = "real_package_name"
            java.lang.String r4 = r6.getPackageName()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            m45952a(r2, r3, r4, r7)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
        L_0x008e:
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r6.getSystemService(r3)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            java.lang.String r4 = "carrier"
            java.lang.String r5 = r3.getNetworkOperatorName()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            m45952a(r2, r4, r5, r7)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            java.lang.String r4 = "mcc_mnc"
            java.lang.String r5 = r3.getNetworkOperator()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            m45952a(r2, r4, r5, r7)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            java.lang.String r4 = "sim_region"
            java.lang.String r3 = r3.getSimCountryIso()     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            m45952a(r2, r4, r3, r7)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
            com.p683ss.android.p1167g.C19165d.m46730a(r6, r2)     // Catch:{ Exception -> 0x00b4, all -> 0x012f }
        L_0x00b4:
            com.p683ss.android.common.applog.NetUtil.appendCommonParams(r2, r7)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            com.ss.android.deviceregister.j r6 = com.p683ss.android.deviceregister.C19047j.m46366a()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.String r3 = r2.toString()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.String r5 = "id="
            r4.<init>(r5)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r4.append(r8)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.String r5 = " netUrl="
            r4.append(r5)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r4.append(r3)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.util.Map<java.lang.Integer, com.ss.android.deviceregister.i$a> r6 = r6.f52479g     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.Object r6 = r6.get(r8)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            com.ss.android.deviceregister.i$a r6 = (com.p683ss.android.deviceregister.C19044i.C19046a) r6     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r6.mo38923e(r4)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r6.mo38917a(r3)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            com.ss.android.deviceregister.o r3 = com.p683ss.android.deviceregister.C19059m.m46390a()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            com.ss.android.deviceregister.i r6 = r6.mo38919a()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r3.mo38939a(r6)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            com.bytedance.common.utility.k r6 = com.bytedance.common.utility.C9423k.m18637a()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.String r6 = r6.mo17022a(r2, r1, r1)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            if (r2 != 0) goto L_0x0123
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            r2.<init>(r6)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            java.lang.String r6 = "success"
            java.lang.String r3 = "message"
            java.lang.String r2 = r2.optString(r3)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            boolean r6 = r6.equals(r2)     // Catch:{ Exception -> 0x013c, all -> 0x012f }
            if (r6 == 0) goto L_0x0123
            com.ss.android.deviceregister.j r6 = com.p683ss.android.deviceregister.C19047j.m46366a()
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            r6.mo38927a(r8, r0)
            return r7
        L_0x0123:
            com.ss.android.deviceregister.j r6 = com.p683ss.android.deviceregister.C19047j.m46366a()
            java.lang.String r7 = android.util.Log.getStackTraceString(r1)
            r6.mo38927a(r8, r7)
            goto L_0x0148
        L_0x012f:
            r6 = move-exception
            com.ss.android.deviceregister.j r7 = com.p683ss.android.deviceregister.C19047j.m46366a()
            java.lang.String r0 = android.util.Log.getStackTraceString(r1)
            r7.mo38927a(r8, r0)
            throw r6
        L_0x013c:
            r6 = move-exception
            com.ss.android.deviceregister.j r7 = com.p683ss.android.deviceregister.C19047j.m46366a()
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)
            r7.mo38927a(r8, r6)
        L_0x0148:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.common.p1141a.C18847a.m45953a(android.content.Context, java.lang.String, java.lang.Integer):boolean");
    }

    /* renamed from: a */
    private static void m45952a(StringBuilder sb, String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            if (z) {
                str2 = Uri.encode(str2);
            }
            sb.append(str2);
        }
    }
}
