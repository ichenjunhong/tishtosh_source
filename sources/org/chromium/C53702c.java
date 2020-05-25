package org.chromium;

import com.ttnet.org.chromium.base.Reflect;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: org.chromium.c */
public class C53702c {

    /* renamed from: b */
    private static volatile C53702c f133250b;

    /* renamed from: a */
    Object f133251a;

    private C53702c() {
    }

    /* renamed from: a */
    public static C53702c m114289a() {
        if (f133250b == null) {
            synchronized (C53702c.class) {
                if (f133250b == null) {
                    f133250b = new C53702c();
                }
            }
        }
        return f133250b;
    }

    /* renamed from: c */
    public final String mo112170c() {
        try {
            if (this.f133251a == null) {
                return null;
            }
            return (String) Reflect.m111362on(this.f133251a).call("getGetDomainDefaultJSON").get();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final String mo112171d() {
        try {
            if (this.f133251a == null) {
                return null;
            }
            return (String) Reflect.m111362on(this.f133251a).call("getBypassBOEJSON").get();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final String mo112172e() {
        try {
            if (this.f133251a == null) {
                return null;
            }
            return (String) Reflect.m111362on(this.f133251a).call("getStoreIdcRuleJSON").get();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public final boolean mo112173f() {
        try {
            if (this.f133251a == null) {
                return false;
            }
            return ((Boolean) Reflect.m111362on(this.f133251a).call("needCustomLoadLibrary").get()).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final Map<String, String> mo112169b() {
        try {
            if (this.f133251a == null) {
                return Collections.emptyMap();
            }
            return (Map) Reflect.m111362on(this.f133251a).call("getGetDomainDependHostMap").get();
        } catch (Throwable unused) {
            return Collections.emptyMap();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo112164a(String str) {
        try {
            if (this.f133251a == null) {
                return "";
            }
            return (String) Reflect.m111362on(this.f133251a).call(str).get();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void mo112166a(Object obj) {
        if (obj != null) {
            try {
                Class cls = obj.getClass();
                if (cls != null) {
                    List<Class> a = C53705f.m114306a(cls);
                    if (a != null) {
                        if (!a.isEmpty()) {
                            for (Class name : a) {
                                if ("com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider".equals(name.getName())) {
                                    if (C53703d.m114300a().loggerDebug()) {
                                        C53703d.m114300a().loggerD("CronetAppProviderManager", "inject CronetAppProviderManager success");
                                    }
                                    this.f133251a = obj;
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo112165a(String str, Map<String, String> map) {
        if (C53703d.m114300a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("onCallToAddSecurityFactor info url = ");
            sb.append(str);
            C53703d.m114300a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (this.f133251a == null) {
                return null;
            }
            return (Map) Reflect.m111362on(this.f133251a).call("onCallToAddSecurityFactor", new Class[]{String.class, Map.class}, str, map).get();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo112167a(String str, int i) {
        if (C53703d.m114300a().loggerDebug()) {
            StringBuilder sb = new StringBuilder("onMappingRequestStatus key = ");
            sb.append(str);
            sb.append(" status = ");
            sb.append(i);
            C53703d.m114300a().loggerD("CronetAppProviderManager", sb.toString());
        }
        try {
            if (this.f133251a != null) {
                Reflect.m111362on(this.f133251a).call("onMappingRequestStatus", new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo112168a(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, int i, int i2, String str7) {
        if (C53703d.m114300a().loggerDebug()) {
            C53703d.m114300a().loggerD("CronetAppProviderManager", "handleApiResult ");
        }
        try {
            if (this.f133251a != null) {
                IOException iOException = null;
                if (!z) {
                    iOException = C53705f.m114304a(C53705f.m114303a(i, i2, str7));
                }
                Reflect.m111362on(this.f133251a).call("handleApiResult", new Class[]{Boolean.TYPE, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class, Exception.class}, Boolean.valueOf(z), str, str2, str3, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(j10), Boolean.valueOf(z2), Long.valueOf(j11), Long.valueOf(j12), str4, str5, str6, iOException);
            }
        } catch (Throwable unused) {
        }
    }
}
