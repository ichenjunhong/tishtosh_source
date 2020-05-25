package com.p683ss.android.ugc.aweme.global.config.settings;

import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.h */
public final class C32816h {

    /* renamed from: a */
    public static final Object f85429a = new Object();

    /* renamed from: d */
    private static final C32816h f85430d = new C32816h();

    /* renamed from: e */
    private static C32817a f85431e;

    /* renamed from: f */
    private static IESSettingsProxy f85432f;

    /* renamed from: g */
    private static Method f85433g;

    /* renamed from: b */
    public C32817a f85434b;

    /* renamed from: c */
    public boolean f85435c;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.h$a */
    public interface C32817a {
        IESSettingsProxy get();
    }

    private C32816h() {
    }

    /* renamed from: a */
    public static C32816h m75714a() {
        return f85430d;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy m75716b() {
        /*
            com.ss.android.ugc.aweme.global.config.settings.h r0 = m75714a()
            com.ss.android.ugc.aweme.global.config.settings.h$a r0 = r0.f85434b
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.global.config.settings.h r0 = m75714a()
            com.ss.android.ugc.aweme.global.config.settings.h$a r0 = r0.f85434b
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.get()
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.global.config.settings.h r0 = m75714a()
            com.ss.android.ugc.aweme.global.config.settings.h$a r0 = r0.f85434b
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.get()
            return r0
        L_0x001f:
            java.lang.Object r0 = f85429a
            monitor-enter(r0)
        L_0x0022:
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m75714a()     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f85434b     // Catch:{ all -> 0x013a }
            if (r1 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m75714a()     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f85434b     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r1.get()     // Catch:{ all -> 0x013a }
            if (r1 != 0) goto L_0x0037
            goto L_0x0043
        L_0x0037:
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m75714a()     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f85434b     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r1.get()     // Catch:{ all -> 0x013a }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            return r1
        L_0x0043:
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m75714a()     // Catch:{ all -> 0x013a }
            boolean r1 = r1.f85435c     // Catch:{ all -> 0x013a }
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = f85429a     // Catch:{ InterruptedException -> 0x0052 }
            r2 = 2000(0x7d0, double:9.88E-321)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0052 }
        L_0x0052:
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m75714a()     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f85434b     // Catch:{ all -> 0x013a }
            if (r1 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m75714a()     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f85434b     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r1.get()     // Catch:{ all -> 0x013a }
            if (r1 == 0) goto L_0x0067
            goto L_0x0022
        L_0x0067:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013a }
            java.lang.String r2 = "must call init() before get()!"
            r1.<init>(r2)     // Catch:{ all -> 0x013a }
            throw r1     // Catch:{ all -> 0x013a }
        L_0x006f:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x013a }
            r3 = 0
            java.lang.Object r4 = f85429a     // Catch:{ InterruptedException -> 0x0091 }
            r4.wait()     // Catch:{ InterruptedException -> 0x0091 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0091 }
            java.lang.String r5 = "Wait "
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x0091 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x0091 }
            r7 = 0
            long r5 = r5 - r1
            r4.append(r5)     // Catch:{ InterruptedException -> 0x0091 }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x0091 }
            m75715a(r3, r4)     // Catch:{ InterruptedException -> 0x0091 }
            goto L_0x0022
        L_0x0091:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x013a }
            java.lang.String r6 = "InterruptedException "
            r5.<init>(r6)     // Catch:{ all -> 0x013a }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x013a }
            r8 = 0
            long r6 = r6 - r1
            r5.append(r6)     // Catch:{ all -> 0x013a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x013a }
            m75715a(r4, r5)     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = f85431e     // Catch:{ Throwable -> 0x00e6 }
            if (r4 != 0) goto L_0x00ca
            java.lang.String r4 = "com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Throwable -> 0x00e6 }
            java.lang.String r5 = "inst"
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x00e6 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ Throwable -> 0x00e6 }
            r5 = 1
            r4.setAccessible(r5)     // Catch:{ Throwable -> 0x00e6 }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x00e6 }
            java.lang.Object r4 = r4.invoke(r3, r5)     // Catch:{ Throwable -> 0x00e6 }
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = (com.p683ss.android.ugc.aweme.global.config.settings.C32816h.C32817a) r4     // Catch:{ Throwable -> 0x00e6 }
            f85431e = r4     // Catch:{ Throwable -> 0x00e6 }
        L_0x00ca:
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = f85431e     // Catch:{ Throwable -> 0x00e6 }
            if (r4 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = f85431e     // Catch:{ Throwable -> 0x00e6 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4 = r4.get()     // Catch:{ Throwable -> 0x00e6 }
            if (r4 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = f85431e     // Catch:{ Throwable -> 0x00e6 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4 = r4.get()     // Catch:{ Throwable -> 0x00e6 }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            return r4
        L_0x00de:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x00e6 }
            java.lang.String r5 = "sIesSettingsProxyWrapReflect or sIesSettingsProxyWrapReflect.get() can not be null"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x00e6 }
            throw r4     // Catch:{ Throwable -> 0x00e6 }
        L_0x00e6:
            r4 = move-exception
            r4.getMessage()     // Catch:{ all -> 0x013a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x013a }
            java.lang.String r6 = "Throwable "
            r5.<init>(r6)     // Catch:{ all -> 0x013a }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x013a }
            r8 = 0
            long r6 = r6 - r1
            r5.append(r6)     // Catch:{ all -> 0x013a }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x013a }
            m75715a(r4, r1)     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = f85432f     // Catch:{ all -> 0x013a }
            if (r1 != 0) goto L_0x0136
            com.squareup.wire.DefaultValueBuilder r1 = new com.squareup.wire.DefaultValueBuilder     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings$Builder r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings$Builder     // Catch:{ all -> 0x013a }
            r2.<init>()     // Catch:{ all -> 0x013a }
            r1.<init>(r2)     // Catch:{ all -> 0x013a }
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ all -> 0x013a }
            com.bytedance.ies.abmock.q r2 = r2.f27515d     // Catch:{ all -> 0x013a }
            boolean r2 = r2.mo18216a()     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x0129
            com.ss.android.ugc.aweme.ac r2 = new com.ss.android.ugc.aweme.ac     // Catch:{ all -> 0x013a }
            com.squareup.wire.Message r1 = r1.build()     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r1 = (com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings) r1     // Catch:{ all -> 0x013a }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x013a }
            f85432f = r2     // Catch:{ all -> 0x013a }
            goto L_0x0136
        L_0x0129:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy     // Catch:{ all -> 0x013a }
            com.squareup.wire.Message r1 = r1.build()     // Catch:{ all -> 0x013a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r1 = (com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettings) r1     // Catch:{ all -> 0x013a }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x013a }
            f85432f = r2     // Catch:{ all -> 0x013a }
        L_0x0136:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = f85432f     // Catch:{ all -> 0x013a }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            return r1
        L_0x013a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b():com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy");
    }

    /* renamed from: a */
    private static void m75715a(Throwable th, String str) {
        String str2;
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("classDesc", "SettingsReader");
            jSONObject.put("errorField", "SettingsReader");
            String str3 = "errorDesc";
            if (th == null || th.getMessage() == null) {
                str2 = "";
            } else {
                str2 = th.getMessage();
            }
            jSONObject.put(str3, str2);
            jSONObject.put("jsonDesc", str);
            String str4 = "status";
            if (th != null) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put(str4, i);
            if (f85433g == null) {
                Method method = Class.forName("com.ss.android.ugc.aweme.global.config.settings.SettingsReaderUtil").getMethod("monitorError", new Class[]{JSONObject.class});
                f85433g = method;
                method.setAccessible(true);
            }
            f85433g.invoke(null, new Object[]{jSONObject});
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
