package p2666g;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import p2666g.C53068c.C53069a;

/* renamed from: g.k */
class C53127k {

    /* renamed from: a */
    private static final C53127k f131620a = m112913c();

    /* renamed from: g.k$a */
    static class C53128a extends C53127k {

        /* renamed from: g.k$a$a */
        static class C53129a implements Executor {

            /* renamed from: a */
            private final Handler f131621a = new Handler(Looper.getMainLooper());

            C53129a() {
            }

            public final void execute(Runnable runnable) {
                this.f131621a.post(runnable);
            }
        }

        C53128a() {
        }

        /* renamed from: b */
        public final Executor mo110637b() {
            return new C53129a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C53069a mo110634a(Executor executor) {
            if (executor != null) {
                return new C53099g(executor);
            }
            throw new AssertionError();
        }
    }

    /* renamed from: g.k$b */
    static class C53130b extends C53127k {
        C53130b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo110636a(Method method) {
            return method.isDefault();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Object mo110635a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            declaredConstructor.setAccessible(true);
            return ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
        }
    }

    C53127k() {
    }

    /* renamed from: a */
    static C53127k m112912a() {
        return f131620a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo110636a(Method method) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Executor mo110637b() {
        return null;
    }

    /* renamed from: c */
    private static C53127k m112913c() {
        try {
            Class.forName("android.os.Build");
            if (VERSION.SDK_INT != 0) {
                return new C53128a();
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            Class.forName("java.util.Optional");
            return new C53130b();
        } catch (ClassNotFoundException unused2) {
            return new C53127k();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C53069a mo110634a(Executor executor) {
        if (executor != null) {
            return new C53099g(executor);
        }
        return C53097f.f131564a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo110635a(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        throw new UnsupportedOperationException();
    }
}
