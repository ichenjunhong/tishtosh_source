package com.bytedance.crash.p548h;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.bytedance.crash.h.d */
public final class C9603d {

    /* renamed from: a */
    public static volatile boolean f26198a;

    /* renamed from: b */
    public static volatile boolean f26199b;

    /* renamed from: com.bytedance.crash.h.d$a */
    public static class C9605a implements Runnable, UncaughtExceptionHandler {

        /* renamed from: a */
        private volatile UncaughtExceptionHandler f26200a;

        private C9605a() {
        }

        public final void run() {
            UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != this && defaultUncaughtExceptionHandler != C9599a.m19103a()) {
                this.f26200a = defaultUncaughtExceptionHandler;
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
            if (r2.f26200a != r2) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0009, code lost:
            if (r2.f26200a != r2) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
            r2.f26200a.uncaughtException(r3, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void uncaughtException(java.lang.Thread r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                r0 = 1
                com.bytedance.crash.p548h.C9603d.f26199b = r0     // Catch:{ Throwable -> 0x0020, all -> 0x0011 }
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f26200a
                if (r0 == 0) goto L_0x0029
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f26200a
                if (r0 == r2) goto L_0x0029
            L_0x000b:
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f26200a
                r0.uncaughtException(r3, r4)
                return
            L_0x0011:
                r0 = move-exception
                java.lang.Thread$UncaughtExceptionHandler r1 = r2.f26200a
                if (r1 == 0) goto L_0x001f
                java.lang.Thread$UncaughtExceptionHandler r1 = r2.f26200a
                if (r1 == r2) goto L_0x001f
                java.lang.Thread$UncaughtExceptionHandler r1 = r2.f26200a
                r1.uncaughtException(r3, r4)
            L_0x001f:
                throw r0
            L_0x0020:
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f26200a
                if (r0 == 0) goto L_0x0029
                java.lang.Thread$UncaughtExceptionHandler r0 = r2.f26200a
                if (r0 == r2) goto L_0x0029
                goto L_0x000b
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p548h.C9603d.C9605a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
        }
    }
}
