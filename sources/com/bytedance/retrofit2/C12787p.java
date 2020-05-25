package com.bytedance.retrofit2;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.retrofit2.C12725c.C12726a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p2666g.C53134n.C53136a;

/* renamed from: com.bytedance.retrofit2.p */
class C12787p {

    /* renamed from: a */
    private static final C12787p f33439a = m25634d();

    /* renamed from: b */
    private static final boolean f33440b = m25635e();

    /* renamed from: com.bytedance.retrofit2.p$a */
    static class C12788a extends C12787p {

        /* renamed from: com.bytedance.retrofit2.p$a$a */
        static class C12789a implements Executor {

            /* renamed from: a */
            private final Handler f33441a = new Handler(Looper.getMainLooper());

            C12789a() {
            }

            public final void execute(Runnable runnable) {
                this.f33441a.post(runnable);
            }
        }

        C12788a() {
        }

        /* renamed from: c */
        public final Executor mo23930c() {
            return new C12789a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C12726a mo23929a(Executor executor) {
            return new C12751j(executor);
        }
    }

    /* renamed from: com.bytedance.retrofit2.p$b */
    static class C12790b extends C12787p {

        /* renamed from: com.bytedance.retrofit2.p$b$a */
        static class C12791a implements Executor {

            /* renamed from: a */
            private static Object f33442a;

            /* renamed from: b */
            private static Method f33443b;

            C12791a() {
            }

            static {
                try {
                    Class cls = Class.forName("org.robovm.apple.foundation.NSOperationQueue");
                    f33442a = cls.getDeclaredMethod("getMainQueue", new Class[0]).invoke(null, new Object[0]);
                    f33443b = cls.getDeclaredMethod("addOperation", new Class[]{Runnable.class});
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            }

            public final void execute(Runnable runnable) {
                try {
                    f33443b.invoke(f33442a, new Object[]{runnable});
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(cause);
                    }
                }
            }
        }

        C12790b() {
        }

        /* renamed from: c */
        public final Executor mo23930c() {
            return new C12791a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C12726a mo23929a(Executor executor) {
            return new C12751j(executor);
        }
    }

    C12787p() {
    }

    /* renamed from: a */
    static C12787p m25632a() {
        return f33439a;
    }

    /* renamed from: b */
    static boolean m25633b() {
        return f33440b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Executor mo23930c() {
        return null;
    }

    /* renamed from: e */
    private static boolean m25635e() {
        try {
            new C53136a();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static C12787p m25634d() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new C12788a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("org.robovm.apple.foundation.NSObject");
            return new C12790b();
        } catch (ClassNotFoundException unused2) {
            return new C12787p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C12726a mo23929a(Executor executor) {
        if (executor != null) {
            return new C12751j(executor);
        }
        return C12746g.f33384a;
    }
}
