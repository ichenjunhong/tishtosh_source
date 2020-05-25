package com.p683ss.android.anrmonitor;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.anrmonitor.ANRError */
public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    private final Map<Thread, StackTraceElement[]> stackTraces;

    /* renamed from: com.ss.android.anrmonitor.ANRError$a */
    static class C18834a {

        /* renamed from: a */
        public final String f52010a;

        /* renamed from: b */
        public final StackTraceElement[] f52011b;

        /* renamed from: com.ss.android.anrmonitor.ANRError$a$a */
        class C18835a extends Throwable {
            public final Throwable fillInStackTrace() {
                setStackTrace(C18834a.this.f52011b);
                return this;
            }

            private C18835a(C18835a aVar) {
                super(C18834a.this.f52010a, aVar);
            }
        }

        private C18834a(String str, StackTraceElement[] stackTraceElementArr) {
            this.f52010a = str;
            this.f52011b = stackTraceElementArr;
        }
    }

    public Map<Thread, StackTraceElement[]> getStackTraces() {
        return this.stackTraces;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public static ANRError NewMainOnly() {
        Thread thread = Looper.getMainLooper().getThread();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        HashMap hashMap = new HashMap(1);
        hashMap.put(thread, stackTrace);
        C18834a aVar = new C18834a(thread.getName(), stackTrace);
        aVar.getClass();
        return new ANRError(new C18835a(), hashMap);
    }

    public ANRError(C18835a aVar, Map<Thread, StackTraceElement[]> map) {
        super("Application Not Responding", aVar);
        this.stackTraces = map;
    }
}
