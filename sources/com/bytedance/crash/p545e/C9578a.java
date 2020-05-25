package com.bytedance.crash.p545e;

import android.text.TextUtils;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9585b;
import com.bytedance.crash.p551k.C9649f;
import com.bytedance.crash.p551k.C9656j;
import com.bytedance.crash.p551k.p552a.C9628f;
import com.bytedance.crash.p554m.C9667a;
import com.bytedance.crash.p554m.C9672d;
import com.bytedance.crash.p555n.C9713t;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.e.a */
public final class C9578a {
    /* renamed from: a */
    static String m19000a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < stackTraceElementArr.length) {
            C9713t.m19437a(stackTraceElementArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m19001a(Map<String, String> map, C9585b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                bVar.mo17395a("custom", (Object) jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m19003a(StackTraceElement[] stackTraceElementArr, int i, Throwable th, String str, boolean z) {
        m19004a(stackTraceElementArr, i, th, str, z, null);
    }

    /* renamed from: a */
    public static void m19002a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, Map<String, String> map) {
        try {
            C9656j b = C9649f.m19247b();
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final String str3 = str;
            final String str4 = str2;
            final Map<String, String> map2 = map;
            C95802 r0 = new Runnable(5) {
                public final void run() {
                    StackTraceElement[] stackTraceElementArr = stackTraceElementArr2;
                    int i = 5;
                    String str = str3;
                    String str2 = str4;
                    Map map = map2;
                    if (stackTraceElementArr != null) {
                        try {
                            if (stackTraceElementArr.length > i + 1) {
                                StackTraceElement stackTraceElement = stackTraceElementArr[i];
                                if (stackTraceElement != null) {
                                    String a = C9578a.m19000a(stackTraceElementArr, i);
                                    if (!TextUtils.isEmpty(a)) {
                                        C9585b a2 = C9585b.m19044a(stackTraceElement, a, str, Thread.currentThread().getName(), true, str2);
                                        C9578a.m19001a(map, a2);
                                        C9628f.m19195a().mo17472a(C9571d.ENSURE, a2);
                                        C9672d.m19295a(a2);
                                        new StringBuilder("[report] ").append(str);
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            b.mo17509a(r0);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m19005a(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, int i) {
        try {
            C9656j b = C9649f.m19247b();
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final Throwable th2 = th;
            final String str3 = str;
            final String str4 = str2;
            final int i2 = i;
            C95813 r1 = new Runnable() {
                public final void run() {
                    String str;
                    StackTraceElement[] stackTraceElementArr = stackTraceElementArr2;
                    Throwable th = th2;
                    String str2 = str3;
                    String str3 = str4;
                    int i = i2;
                    if (th != null || stackTraceElementArr != null) {
                        try {
                            StackTraceElement stackTraceElement = stackTraceElementArr[0];
                            if (stackTraceElement != null) {
                                if (th == null) {
                                    str = C9578a.m19000a(stackTraceElementArr, i);
                                } else {
                                    str = C9713t.m19435a(th);
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    C9585b a = C9585b.m19044a(stackTraceElement, str, str2, Thread.currentThread().getName(), true, str3);
                                    C9628f.m19195a().mo17472a(C9571d.ENSURE, a);
                                    a.mo17390a("err_type", str2);
                                    C9672d.m19294a();
                                    C9584a a2 = C9628f.m19195a().mo17474a(Arrays.asList(new C9584a[]{a}));
                                    if (a2 != null) {
                                        C9667a.m19271a().mo17517a(a2.f26141a);
                                    }
                                    new StringBuilder("[report] ").append(str2);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            b.mo17509a(r1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m19004a(StackTraceElement[] stackTraceElementArr, int i, Throwable th, String str, boolean z, Map<String, String> map) {
        try {
            C9656j b = C9649f.m19247b();
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final int i2 = i;
            final Throwable th2 = th;
            final String str2 = str;
            final boolean z2 = z;
            final Map<String, String> map2 = map;
            C95791 r1 = new Runnable() {
                public final void run() {
                    StackTraceElement[] stackTraceElementArr = stackTraceElementArr2;
                    int i = i2;
                    Throwable th = th2;
                    String str = str2;
                    boolean z = z2;
                    Map map = map2;
                    if (stackTraceElementArr != null) {
                        try {
                            if (stackTraceElementArr.length > i + 1) {
                                if (th != null) {
                                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                                    if (stackTraceElement != null) {
                                        String a = C9713t.m19435a(th);
                                        if (!TextUtils.isEmpty(a)) {
                                            C9585b a2 = C9585b.m19044a(stackTraceElement, a, str, Thread.currentThread().getName(), z, "EnsureNotReachHere");
                                            C9578a.m19001a(map, a2);
                                            C9628f.m19195a().mo17472a(C9571d.ENSURE, a2);
                                            C9672d.m19295a(a2);
                                            new StringBuilder("[reportException] ").append(str);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            b.mo17509a(r1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m19006a(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, String str3, int i) {
        try {
            C9656j b = C9649f.m19247b();
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final Throwable th2 = th;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final int i2 = i;
            C95824 r1 = new Runnable() {
                public final void run() {
                    String str;
                    StackTraceElement[] stackTraceElementArr = stackTraceElementArr2;
                    Throwable th = th2;
                    String str2 = str4;
                    String str3 = str5;
                    String str4 = str6;
                    int i = i2;
                    if (th != null || stackTraceElementArr != null) {
                        try {
                            StackTraceElement stackTraceElement = stackTraceElementArr[0];
                            if (stackTraceElement != null) {
                                if (th == null) {
                                    str = C9578a.m19000a(stackTraceElementArr, i);
                                } else {
                                    str = C9713t.m19435a(th);
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    C9585b a = C9585b.m19045a(stackTraceElement, str, str2, Thread.currentThread().getName(), true, str3, str4);
                                    C9628f.m19195a().mo17472a(C9571d.ENSURE, a);
                                    a.mo17390a("err_type", str2);
                                    C9672d.m19295a(a);
                                    new StringBuilder("[report] ").append(str2);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            b.mo17509a(r1);
        } catch (Throwable unused) {
        }
    }
}
