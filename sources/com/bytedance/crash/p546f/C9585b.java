package com.bytedance.crash.p546f;

import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9685a;

/* renamed from: com.bytedance.crash.f.b */
public final class C9585b extends C9584a {

    /* renamed from: d */
    private String f26144d;

    private C9585b(String str) {
        this.f26144d = str;
    }

    /* renamed from: b */
    public static C9585b m19046b(String str) {
        C9585b bVar = new C9585b("caton_monitor");
        bVar.mo17395a("event_type", (Object) "lag");
        bVar.mo17395a("log_type", (Object) "caton_monitor");
        bVar.mo17395a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo17395a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo17395a("process_name", (Object) C9685a.m19318c(C9616k.m19154f()));
        bVar.mo17395a("crash_thread_name", (Object) "main");
        bVar.mo17395a("stack", (Object) str);
        return bVar;
    }

    /* renamed from: a */
    public static C9585b m19044a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4) {
        C9585b bVar = new C9585b("core_exception_monitor");
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        bVar.mo17395a("event_type", (Object) "exception");
        bVar.mo17395a("log_type", (Object) "core_exception_monitor");
        bVar.mo17395a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo17395a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo17395a("class_ref", (Object) className);
        bVar.mo17395a("method", (Object) methodName);
        bVar.mo17395a("line_num", (Object) Integer.valueOf(lineNumber));
        bVar.mo17395a("stack", (Object) str);
        bVar.mo17395a("exception_type", (Object) Integer.valueOf(1));
        bVar.mo17395a("ensure_type", (Object) str4);
        bVar.mo17395a("is_core", (Object) Integer.valueOf(z ? 1 : 0));
        bVar.mo17395a("message", (Object) str2);
        bVar.mo17395a("process_name", (Object) C9685a.m19318c(C9616k.m19154f()));
        bVar.mo17395a("crash_thread_name", (Object) str3);
        return bVar;
    }

    /* renamed from: a */
    public static C9585b m19045a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C9585b bVar = new C9585b(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        bVar.mo17395a("event_type", (Object) "exception");
        bVar.mo17395a("log_type", (Object) str5);
        bVar.mo17395a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo17395a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        bVar.mo17395a("class_ref", (Object) className);
        bVar.mo17395a("method", (Object) methodName);
        bVar.mo17395a("line_num", (Object) Integer.valueOf(lineNumber));
        bVar.mo17395a("stack", (Object) str);
        bVar.mo17395a("exception_type", (Object) Integer.valueOf(1));
        bVar.mo17395a("ensure_type", (Object) str4);
        bVar.mo17395a("is_core", (Object) Integer.valueOf(z ? 1 : 0));
        bVar.mo17395a("message", (Object) str2);
        bVar.mo17395a("process_name", (Object) C9685a.m19318c(C9616k.m19154f()));
        bVar.mo17395a("crash_thread_name", (Object) str3);
        return bVar;
    }
}
