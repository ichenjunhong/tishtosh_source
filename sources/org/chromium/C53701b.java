package org.chromium;

import com.ttnet.org.chromium.base.Reflect;
import com.ttnet.org.chromium.net.TTMonitorProvider;

/* renamed from: org.chromium.b */
public class C53701b extends TTMonitorProvider {

    /* renamed from: a */
    private static C53701b f133249a;

    private C53701b() {
    }

    /* renamed from: a */
    public static C53701b m114288a() {
        if (f133249a == null) {
            synchronized (C53701b.class) {
                if (f133249a == null) {
                    f133249a = new C53701b();
                }
            }
        }
        return f133249a;
    }

    public void sendAppMonitorEvent(String str, String str2) {
        C53702c a = C53702c.m114289a();
        if (C53703d.m114300a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("Send monitor json = ");
            sb.append(str);
            sb.append(", log type =");
            sb.append(str2);
            C53703d.m114300a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (a.f133251a != null) {
                Reflect.m111362on(a.f133251a).call("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        C53702c.m114289a().mo112168a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4, str5, str6, i, i2, str7);
    }
}
