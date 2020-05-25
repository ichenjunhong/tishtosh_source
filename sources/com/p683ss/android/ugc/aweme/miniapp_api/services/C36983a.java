package com.p683ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.p2615tt.miniapphost.AppbrandSupport;
import com.p683ss.android.ugc.aweme.miniapp_api.C36931b;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36920b;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36923e;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36945g;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.p1960b.C36940a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService.C36982a;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.a */
public class C36983a implements IMiniAppService {

    /* renamed from: a */
    public static final String f94460a = "a";

    /* renamed from: b */
    public static Application f94461b;

    /* renamed from: c */
    public static C36982a f94462c;

    /* renamed from: d */
    public C36940a f94463d;

    /* renamed from: e */
    private IMiniAppService f94464e;

    /* renamed from: f */
    private boolean f94465f;

    /* renamed from: g */
    private Locale f94466g;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.a$a */
    static class C36985a {

        /* renamed from: a */
        public static final C36983a f94467a = new C36983a();
    }

    /* renamed from: b */
    public static C36983a m83185b() {
        return C36985a.f94467a;
    }

    /* renamed from: d */
    private static C36982a m83187d() {
        return f94462c;
    }

    public String addScene(String str, String str2) {
        return null;
    }

    public boolean checkMiniAppEnable(Context context) {
        return false;
    }

    public String getJsSdkVersion(Application application) {
        return null;
    }

    public void getShareInfo(String str, C36945g gVar) {
    }

    public void handleActivityImageResult(int i, int i2, Intent intent) {
    }

    public void initMiniApp() {
    }

    public void initialize(Application application, C36982a aVar) {
    }

    public boolean isMinAppAvailable(Context context, String str) {
        return false;
    }

    public void logExcitingVideoAd(Context context, String str, long j, String str2) {
    }

    public void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr) {
    }

    public boolean openShortcut(Context context, Intent intent) {
        return false;
    }

    public void preloadMiniApp(String str) {
    }

    public void preloadMiniApp(String str, int i) {
    }

    public void remoteMobV3(String str, JSONObject jSONObject) {
    }

    public String setLaunchModeHostTask(String str) {
        return null;
    }

    private C36983a() {
        this.f94465f = true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0036 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService m83186c() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x003a }
            r1 = 21
            r2 = 0
            if (r0 >= r1) goto L_0x000a
            monitor-exit(r5)
            return r2
        L_0x000a:
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = r5.f94464e     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "com.ss.android.ugc.aweme.miniapp.MiniAppService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Throwable -> 0x0036 }
            java.lang.String r1 = "inst"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException -> 0x0032, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0028 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch:{ IllegalAccessException -> 0x0032, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0028 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0032, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0028 }
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ IllegalAccessException -> 0x0032, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0028 }
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = (com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService) r0     // Catch:{ IllegalAccessException -> 0x0032, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0028 }
            r5.f94464e = r0     // Catch:{ IllegalAccessException -> 0x0032, NoSuchMethodException -> 0x002d, InvocationTargetException -> 0x0028 }
            goto L_0x0036
        L_0x0028:
            r0 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r0)     // Catch:{ Throwable -> 0x0036 }
            goto L_0x0036
        L_0x002d:
            r0 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r0)     // Catch:{ Throwable -> 0x0036 }
            goto L_0x0036
        L_0x0032:
            r0 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r0)     // Catch:{ Throwable -> 0x0036 }
        L_0x0036:
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r0 = r5.f94464e     // Catch:{ all -> 0x003a }
            monitor-exit(r5)
            return r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83186c():com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService");
    }

    /* renamed from: a */
    public final IMiniAppService mo76294a() {
        String str;
        C36920b bVar = m83187d().f94453l;
        if (bVar == null) {
            try {
                if (this.f94465f) {
                    C36923e eVar = m83187d().f94451j;
                    if (eVar != null) {
                        HashMap hashMap = new HashMap();
                        String str2 = "plugin_version";
                        if (bVar != null) {
                            str = bVar.mo76110j();
                        } else {
                            str = "";
                        }
                        hashMap.put(str2, str);
                        eVar.mo76122a("miniapp_launch_crash", 0, new JSONObject(hashMap));
                        this.f94465f = false;
                    }
                }
                return this;
            } catch (Throwable unused) {
            }
        }
        IMiniAppService c = m83186c();
        if (c == null) {
            return this;
        }
        if (!AppbrandSupport.inst().isInit()) {
            c.notifyLocaleChange(this.f94466g);
            c.initialize(f94461b, f94462c);
        }
        return c;
    }

    public void notifyLocaleChange(Locale locale) {
        this.f94466g = locale;
    }

    public boolean openMiniApp(Context context, C36966e eVar, C36960b bVar) {
        return C36931b.m83142a(context, C36949e.m83169e(C36949e.m83163a(eVar)));
    }

    public boolean openMiniApp(Context context, String str, C36960b bVar) {
        return C36931b.m83142a(context, C36949e.m83169e(str));
    }

    public void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
        C36931b.m83142a(context, z);
    }
}
