package android.arch.lifecycle;

import android.arch.lifecycle.C0176h.C0177a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
final class C0156a {

    /* renamed from: a */
    static C0156a f403a = new C0156a();

    /* renamed from: b */
    private final Map<Class, C0157a> f404b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f405c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0157a {

        /* renamed from: a */
        final Map<C0177a, List<C0158b>> f406a = new HashMap();

        /* renamed from: b */
        final Map<C0158b, C0177a> f407b;

        C0157a(Map<C0158b, C0177a> map) {
            this.f407b = map;
            for (Entry entry : map.entrySet()) {
                C0177a aVar = (C0177a) entry.getValue();
                List list = (List) this.f406a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f406a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        static void m367a(List<C0158b> list, C0184k kVar, C0177a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0158b) list.get(size)).mo297a(kVar, aVar, obj);
                }
            }
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0158b {

        /* renamed from: a */
        final int f408a;

        /* renamed from: b */
        final Method f409b;

        public final int hashCode() {
            return (this.f408a * 31) + this.f409b.getName().hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0158b bVar = (C0158b) obj;
            if (this.f408a != bVar.f408a || !this.f409b.getName().equals(bVar.f409b.getName())) {
                return false;
            }
            return true;
        }

        C0158b(int i, Method method) {
            this.f408a = i;
            this.f409b = method;
            this.f409b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo297a(android.arch.lifecycle.C0184k r5, android.arch.lifecycle.C0176h.C0177a r6, java.lang.Object r7) {
            /*
                r4 = this;
                int r0 = r4.f408a     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r1 = 1
                r2 = 0
                switch(r0) {
                    case 0: goto L_0x001f;
                    case 1: goto L_0x0015;
                    case 2: goto L_0x0008;
                    default: goto L_0x0007;
                }     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
            L_0x0007:
                goto L_0x0027
            L_0x0008:
                java.lang.reflect.Method r0 = r4.f409b     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3[r2] = r5     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r3[r1] = r6     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r0.invoke(r7, r3)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                goto L_0x0027
            L_0x0015:
                java.lang.reflect.Method r6 = r4.f409b     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r0[r2] = r5     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r6.invoke(r7, r0)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                goto L_0x0026
            L_0x001f:
                java.lang.reflect.Method r5 = r4.f409b     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
                r5.invoke(r7, r6)     // Catch:{ InvocationTargetException -> 0x002f, IllegalAccessException -> 0x0028 }
            L_0x0026:
                return
            L_0x0027:
                return
            L_0x0028:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                r6.<init>(r5)
                throw r6
            L_0x002f:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.Throwable r5 = r5.getCause()
                java.lang.String r7 = "Failed to call observer method"
                r6.<init>(r7, r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: android.arch.lifecycle.C0156a.C0158b.mo297a(android.arch.lifecycle.k, android.arch.lifecycle.h$a, java.lang.Object):void");
        }
    }

    C0156a() {
    }

    /* renamed from: c */
    private static Method[] m364c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0157a mo296b(Class cls) {
        C0157a aVar = (C0157a) this.f404b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m362a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo295a(Class cls) {
        if (this.f405c.containsKey(cls)) {
            return ((Boolean) this.f405c.get(cls)).booleanValue();
        }
        Method[] c = m364c(cls);
        for (Method annotation : c) {
            if (((C0200t) annotation.getAnnotation(C0200t.class)) != null) {
                m362a(cls, c);
                return true;
            }
        }
        this.f405c.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: a */
    private C0157a m362a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0157a b = mo296b(superclass);
            if (b != null) {
                hashMap.putAll(b.f407b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : mo296b(b2).f407b.entrySet()) {
                m363a(hashMap, (C0158b) entry.getKey(), (C0177a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m364c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0200t tVar = (C0200t) method.getAnnotation(C0200t.class);
            if (tVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0184k.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0177a a = tVar.mo345a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0177a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == C0177a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m363a(hashMap, new C0158b(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0157a aVar = new C0157a(hashMap);
        this.f404b.put(cls, aVar);
        this.f405c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: a */
    private static void m363a(Map<C0158b, C0177a> map, C0158b bVar, C0177a aVar, Class cls) {
        C0177a aVar2 = (C0177a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f409b;
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }
}
