package com.bytedance.p702im.core.internal.p722d;

import com.bytedance.p702im.core.p703a.C11165c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.im.core.internal.d.a */
public final class C11452a {

    /* renamed from: a */
    public static ExecutorService f30749a;

    /* renamed from: b */
    public static ExecutorService f30750b;

    /* renamed from: c */
    public static ExecutorService f30751c;

    /* renamed from: d */
    public static ExecutorService f30752d;

    /* renamed from: e */
    private static ExecutorService f30753e;

    /* renamed from: f */
    private static ThreadFactory f30754f = new ThreadFactory() {
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            return thread;
        }
    };

    /* renamed from: c */
    public static Executor m23426c() {
        return m23425b();
    }

    /* renamed from: b */
    public static Executor m23425b() {
        if (f30749a == null) {
            f30749a = C11454b.m23430a(f30754f);
        }
        return f30749a;
    }

    /* renamed from: d */
    public static Executor m23427d() {
        if (f30751c == null) {
            f30751c = C11454b.m23430a(f30754f);
        }
        return f30751c;
    }

    /* renamed from: e */
    public static Executor m23428e() {
        if (f30752d == null) {
            f30752d = C11454b.m23430a(f30754f);
        }
        return f30752d;
    }

    /* renamed from: a */
    public static Executor m23424a() {
        if (f30753e == null) {
            ExecutorService executorService = C11165c.m22588a().mo20513b().f30133H;
            if (executorService != null) {
                f30753e = executorService;
            } else {
                f30753e = C11454b.m23429a(Runtime.getRuntime().availableProcessors(), f30754f);
            }
        }
        return f30753e;
    }
}
