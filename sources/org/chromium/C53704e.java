package org.chromium;

import com.ttnet.org.chromium.base.Reflect;
import com.ttnet.org.chromium.net.TTEventListener;
import java.util.Map;

/* renamed from: org.chromium.e */
public class C53704e extends TTEventListener {

    /* renamed from: b */
    private static volatile C53704e f133254b;

    /* renamed from: a */
    public boolean f133255a;

    private C53704e() {
    }

    /* renamed from: a */
    public static C53704e m114301a() {
        if (f133254b == null) {
            synchronized (C53704e.class) {
                if (f133254b == null) {
                    f133254b = new C53704e();
                }
            }
        }
        return f133254b;
    }

    public void onColdStartFinish() {
        if (this.f133255a) {
            C53702c a = C53702c.m114289a();
            if (C53703d.m114300a().loggerDebug()) {
                C53703d.m114300a().loggerD("CronetAppProviderManager", "onColdStartFinish ");
            }
            try {
                if (a.f133251a != null) {
                    Reflect.m111362on(a.f133251a).call("onColdStartFinish");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onTNCUpdateFailed() {
        if (this.f133255a) {
            C53702c a = C53702c.m114289a();
            if (C53703d.m114300a().loggerDebug()) {
                C53703d.m114300a().loggerD("CronetAppProviderManager", "onTNCUpdateFailed ");
            }
            try {
                if (a.f133251a != null) {
                    Reflect.m111362on(a.f133251a).call("onTNCUpdateFailed");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onClientIPChanged(String str) {
        if (this.f133255a) {
            C53702c a = C53702c.m114289a();
            if (C53703d.m114300a().loggerDebug()) {
                C53703d.m114300a().loggerD("CronetAppProviderManager", "onClientIPChanged ");
            }
            try {
                if (a.f133251a != null) {
                    Reflect.m111362on(a.f133251a).call("onClientIPChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onEffectiveConnectionTypeChanged(int i) {
        if (this.f133255a) {
            C53702c a = C53702c.m114289a();
            if (C53703d.m114300a().loggerDebug()) {
                StringBuilder sb = new StringBuilder("onEffectiveConnectionTypeChanged type = ");
                sb.append(i);
                C53703d.m114300a().loggerD("CronetAppProviderManager", sb.toString());
            }
            try {
                if (a.f133251a != null) {
                    Reflect.m111362on(a.f133251a).call("onEffectiveConnectionTypeChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onServerConfigUpdated(String str) {
        if (this.f133255a) {
            C53702c a = C53702c.m114289a();
            if (C53703d.m114300a().loggerDebug()) {
                StringBuilder sb = new StringBuilder("onServerConfigUpdated json = ");
                sb.append(str);
                C53703d.m114300a().loggerD("CronetAppProviderManager", sb.toString());
            }
            try {
                if (a.f133251a != null) {
                    Reflect.m111362on(a.f133251a).call("onServerConfigUpdated", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onTTNetDetectInfoChanged(String str) {
        if (this.f133255a) {
            C53702c a = C53702c.m114289a();
            if (C53703d.m114300a().loggerDebug()) {
                StringBuilder sb = new StringBuilder("onTTNetDetectInfoChanged info str = ");
                sb.append(str);
                C53703d.m114300a().loggerD("CronetAppProviderManager", sb.toString());
            }
            try {
                if (a.f133251a != null) {
                    Reflect.m111362on(a.f133251a).call("onTTNetDetectInfoChanged", new Class[]{String.class}, str);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void onTTNetStateChanged(int i) {
        if (this.f133255a) {
            C53702c a = C53702c.m114289a();
            if (C53703d.m114300a().loggerDebug()) {
                StringBuilder sb = new StringBuilder("onTTNetStateChanged info int = ");
                sb.append(i);
                C53703d.m114300a().loggerD("CronetAppProviderManager", sb.toString());
            }
            try {
                if (a.f133251a != null) {
                    Reflect.m111362on(a.f133251a).call("onTTNetStateChanged", new Class[]{Integer.TYPE}, Integer.valueOf(i));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        return C53702c.m114289a().mo112165a(str, map);
    }

    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        if (this.f133255a) {
            C53702c.m114289a().mo112168a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4, str5, str6, i, i2, str7);
        }
    }
}
