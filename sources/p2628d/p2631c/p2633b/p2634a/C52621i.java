package p2628d.p2631c.p2633b.p2634a;

import java.lang.reflect.Method;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: d.c.b.a.i */
final class C52621i {

    /* renamed from: a */
    static final C52622a f130912a = new C52622a(null, null, null);

    /* renamed from: b */
    public static C52622a f130913b;

    /* renamed from: c */
    public static final C52621i f130914c = new C52621i();

    /* renamed from: d.c.b.a.i$a */
    static final class C52622a {

        /* renamed from: a */
        public final Method f130915a;

        /* renamed from: b */
        public final Method f130916b;

        /* renamed from: c */
        public final Method f130917c;

        public C52622a(Method method, Method method2, Method method3) {
            this.f130915a = method;
            this.f130916b = method2;
            this.f130917c = method3;
        }
    }

    private C52621i() {
    }

    /* renamed from: a */
    static C52622a m112172a(C52613a aVar) {
        try {
            C52622a aVar2 = new C52622a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(LeakCanaryFileProvider.f132049i, new Class[0]));
            f130913b = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C52622a aVar3 = f130912a;
            f130913b = aVar3;
            return aVar3;
        }
    }
}
