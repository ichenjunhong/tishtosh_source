package com.p683ss.android.agilelogger;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.agilelogger.p1134d.C18807a;
import com.p683ss.android.agilelogger.p1134d.C18810c;
import com.p683ss.android.agilelogger.p1135e.C18814b;
import com.p683ss.android.agilelogger.p1136f.C18817a.C18818a;
import com.p683ss.android.agilelogger.p1136f.C18827h;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: com.ss.android.agilelogger.a */
public class C18778a {

    /* renamed from: a */
    static Context f51914a;

    /* renamed from: b */
    public static C18783b f51915b;

    /* renamed from: c */
    public static volatile boolean f51916c = true;

    /* renamed from: d */
    public static volatile boolean f51917d = false;

    /* renamed from: e */
    static volatile C18802c f51918e;

    /* renamed from: f */
    public static String f51919f = C18778a.class.getCanonicalName();

    /* renamed from: g */
    public static volatile List<C18811e> f51920g = new ArrayList();

    /* renamed from: h */
    private static C18814b f51921h = new C18814b();

    /* renamed from: i */
    private static volatile boolean f51922i = false;

    /* renamed from: j */
    private static C18779a f51923j;

    /* renamed from: k */
    private static volatile C18806d f51924k = null;

    /* renamed from: com.ss.android.agilelogger.a$a */
    public interface C18779a {
    }

    /* renamed from: com.ss.android.agilelogger.a$b */
    public enum C18780b {
        NOT_INIT,
        LOAD_LIBRARY_ERROR,
        USING_MMAP,
        USING_CACHE,
        FATAL_ERROR
    }

    /* renamed from: com.ss.android.agilelogger.a$c */
    public interface C18781c {
    }

    /* renamed from: a */
    public static Context m45838a() {
        return f51914a;
    }

    /* renamed from: b */
    public static List<C18811e> m45847b() {
        return f51920g;
    }

    /* renamed from: c */
    public static void m45849c() {
        C18816f a = C18816f.m45895a();
        a.f51985a = 2;
        if (f51918e != null) {
            f51918e.f51951c.add(a);
            f51918e.mo38396a();
        }
    }

    /* renamed from: d */
    public static void m45851d() {
        C18816f a = C18816f.m45895a();
        a.f51997m = null;
        a.f51985a = 4;
        if (f51918e != null) {
            f51918e.f51951c.add(a);
            f51918e.mo38396a();
        }
    }

    /* renamed from: e */
    public static long m45853e() {
        if (f51918e == null || f51918e.f51950b == null) {
            return 0;
        }
        for (C18810c cVar : f51918e.f51950b.f51976a) {
            if (cVar instanceof C18807a) {
                return ((C18807a) cVar).f51959a.getFlushV2FuncAddr();
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static long m45855f() {
        if (f51918e == null || f51918e.f51950b == null) {
            return 0;
        }
        for (C18810c cVar : f51918e.f51950b.f51976a) {
            if (cVar instanceof C18807a) {
                return ((C18807a) cVar).f51959a.getLogStoreDirFuncAddr();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m45842a(String str) {
        f51919f = str;
    }

    /* renamed from: a */
    private static void m45841a(C18816f fVar) {
        fVar.f51985a = 1;
        if (f51916c) {
            C18814b.m45894a(fVar);
        }
        if (f51918e != null && f51918e.f51949a != null && f51918e.f51949a.f51935g <= fVar.f51986b) {
            f51918e.f51951c.add(fVar);
            f51918e.mo38396a();
        }
    }

    /* renamed from: a */
    public static boolean m45846a(C18783b bVar) {
        if (bVar == null) {
            throw new RuntimeException("alogConfig must not be null");
        } else if (!C18827h.m45922a(m45838a(), "alog-lib")) {
            return false;
        } else {
            if (f51918e == null || f51918e.isInterrupted()) {
                synchronized (C18778a.class) {
                    if (f51918e == null || f51918e.isInterrupted()) {
                        f51915b = bVar;
                        C18802c cVar = new C18802c("_ALOG_OPT_", bVar, f51923j);
                        f51918e = cVar;
                        cVar.setPriority(1);
                        f51918e.start();
                    }
                }
            }
            if (f51924k != null) {
                C18802c cVar2 = f51918e;
                Queue a = f51924k.mo38399a();
                if (!(a == null || a.size() == 0)) {
                    cVar2.f51951c.addAll(a);
                }
            }
            f51917d = true;
            f51916c = false;
            return true;
        }
    }

    /* renamed from: b */
    public static void m45848b(String str, String str2) {
        m45839a(3, str, str2, C18818a.MSG);
    }

    /* renamed from: c */
    public static void m45850c(String str, String str2) {
        m45839a(4, str, str2, C18818a.MSG);
    }

    /* renamed from: d */
    public static void m45852d(String str, String str2) {
        m45839a(5, str, str2, C18818a.MSG);
    }

    /* renamed from: e */
    public static void m45854e(String str, String str2) {
        m45839a(6, str, str2, C18818a.MSG);
    }

    /* renamed from: a */
    public static void m45843a(String str, String str2) {
        m45839a(2, str, str2, C18818a.MSG);
    }

    /* renamed from: a */
    public static void m45845a(String str, Throwable th) {
        m45839a(6, str, th, C18818a.STACKTRACE_STR);
    }

    /* renamed from: a */
    public static void m45844a(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("\n");
        m45840a(6, str, th, sb.toString(), C18818a.STACKTRACE_STR);
    }

    /* renamed from: a */
    public static void m45839a(int i, String str, Object obj, C18818a aVar) {
        m45840a(i, str, obj, null, aVar);
    }

    /* renamed from: a */
    public static void m45840a(int i, String str, Object obj, Object obj2, C18818a aVar) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5 = "";
        long id = Thread.currentThread().getId();
        boolean z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C18816f a = C18816f.m45896a(i, str, str5, id, z);
        a.f51991g = aVar;
        a.f51992h = obj;
        a.f51993i = obj2;
        StackTraceElement stackTraceElement = null;
        if (!TextUtils.isEmpty(f51919f) && f51922i) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (f51919f.equals(stackTrace[i2].getClassName())) {
                    int i3 = i2 + 1;
                    if (i3 < length && !f51919f.equals(stackTrace[i3].getClassName())) {
                        stackTraceElement = stackTrace[i3];
                        break;
                    }
                }
                i2++;
            }
        }
        if (stackTraceElement == null) {
            z2 = true;
        }
        if (z2) {
            str2 = "";
        } else {
            str2 = stackTraceElement.getClassName();
        }
        a.f51994j = str2;
        if (z2) {
            str3 = "";
        } else {
            str3 = stackTraceElement.getMethodName();
        }
        a.f51995k = str3;
        if (z2) {
            str4 = "";
        } else {
            str4 = String.valueOf(stackTraceElement.getLineNumber());
        }
        a.f51996l = str4;
        m45841a(a);
    }
}
