package com.p683ss.android.agilelogger.p1136f;

import android.content.Intent;
import android.os.Bundle;
import com.p683ss.android.agilelogger.p1125b.C18789b;
import com.p683ss.android.agilelogger.p1125b.p1126a.C18788b;
import com.p683ss.android.agilelogger.p1125b.p1127b.C18790a;
import com.p683ss.android.agilelogger.p1125b.p1127b.p1128a.C18791a;
import com.p683ss.android.agilelogger.p1125b.p1127b.p1129b.C18793a;
import com.p683ss.android.agilelogger.p1125b.p1127b.p1129b.C18794b;
import com.p683ss.android.agilelogger.p1125b.p1127b.p1130c.C18796a;
import com.p683ss.android.agilelogger.p1125b.p1131c.C18798a;
import com.p683ss.android.agilelogger.p1125b.p1132d.C18800a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.agilelogger.f.a */
public final class C18817a {

    /* renamed from: a */
    private static ConcurrentHashMap<C18818a, C18789b> f51999a;

    /* renamed from: com.ss.android.agilelogger.f.a$a */
    public enum C18818a {
        MSG,
        JSON,
        BUNDLE,
        INTENT,
        THROWABLE,
        BORDER,
        STACKTRACE,
        THREAD,
        STACKTRACE_STR
    }

    static {
        ConcurrentHashMap<C18818a, C18789b> concurrentHashMap = new ConcurrentHashMap<>();
        f51999a = concurrentHashMap;
        concurrentHashMap.put(C18818a.MSG, new C18790a());
        f51999a.put(C18818a.JSON, new C18791a());
        f51999a.put(C18818a.BUNDLE, new C18793a());
        f51999a.put(C18818a.INTENT, new C18794b());
        f51999a.put(C18818a.BORDER, new C18788b());
        f51999a.put(C18818a.STACKTRACE, new C18798a());
        f51999a.put(C18818a.THREAD, new C18800a());
        f51999a.put(C18818a.THROWABLE, new C18796a());
    }

    /* renamed from: a */
    public static String m45898a(C18818a aVar, Intent intent) {
        f51999a.get(aVar);
        return C18794b.m45867a(intent);
    }

    /* renamed from: a */
    public static String m45899a(C18818a aVar, Bundle bundle) {
        f51999a.get(aVar);
        return C18793a.m45865a(bundle);
    }

    /* renamed from: a */
    public static String m45900a(C18818a aVar, String str) {
        C18789b bVar = (C18789b) f51999a.get(aVar);
        if (bVar == null) {
            return str;
        }
        if (aVar != C18818a.BORDER) {
            return bVar.mo38395a(str);
        }
        return bVar.mo38395a(new String[]{str});
    }

    /* renamed from: a */
    public static String m45901a(C18818a aVar, Thread thread) {
        return ((C18789b) f51999a.get(aVar)).mo38395a(thread);
    }

    /* renamed from: a */
    public static String m45902a(C18818a aVar, Throwable th) {
        return ((C18789b) f51999a.get(aVar)).mo38395a(th);
    }

    /* renamed from: a */
    public static String m45903a(C18818a aVar, StackTraceElement[] stackTraceElementArr) {
        return ((C18789b) f51999a.get(aVar)).mo38395a(stackTraceElementArr);
    }
}
