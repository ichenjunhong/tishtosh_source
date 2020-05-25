package com.bytedance.jedi.p725a.p743m;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.bytedance.jedi.a.m.g */
public final class C11752g {

    /* renamed from: e */
    static Class<?> f31212e;

    /* renamed from: f */
    static Class<?> f31213f;

    /* renamed from: g */
    static Class<?> f31214g;

    /* renamed from: h */
    static Method f31215h;

    /* renamed from: i */
    static Method f31216i;

    /* renamed from: j */
    static Method f31217j;

    /* renamed from: a */
    public final int f31218a;

    /* renamed from: b */
    public final int f31219b;

    /* renamed from: c */
    public final int f31220c;

    /* renamed from: d */
    public final int f31221d;

    /* renamed from: k */
    private final int f31222k;

    /* renamed from: l */
    private final Map<Class<?>, C11756b> f31223l = new IdentityHashMap();

    /* renamed from: m */
    private final Map<Object, Object> f31224m = new IdentityHashMap();

    /* renamed from: n */
    private final Map<Class<?>, C11739a> f31225n = new IdentityHashMap();

    /* renamed from: o */
    private final Deque<Object> f31226o = new ArrayDeque(16384);

    /* renamed from: p */
    private long f31227p;

    /* renamed from: q */
    private long f31228q;

    /* renamed from: com.bytedance.jedi.a.m.g$a */
    static class C11755a {

        /* renamed from: a */
        private final Object[] f31229a;

        C11755a(Object[] objArr) {
            this.f31229a = objArr;
        }

        /* renamed from: a */
        public final void mo22511a(C11752g gVar) {
            Object[] objArr;
            for (Object obj : this.f31229a) {
                if (obj != null) {
                    gVar.mo22504b(obj);
                }
            }
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.g$b */
    class C11756b {

        /* renamed from: b */
        private final long f31231b;

        /* renamed from: c */
        private final long f31232c;

        /* renamed from: d */
        private final Field[] f31233d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo22512a(Object obj, C11752g gVar) {
            gVar.mo22503a(obj.getClass(), this.f31231b);
            m24100b(obj, gVar);
        }

        /* renamed from: b */
        private void m24100b(Object obj, C11752g gVar) {
            Field[] fieldArr = this.f31233d;
            int length = fieldArr.length;
            int i = 0;
            while (i < length) {
                Field field = fieldArr[i];
                try {
                    gVar.mo22505c(field.get(obj));
                    i++;
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder("Unexpected denial of access to ");
                    sb.append(field);
                    AssertionError assertionError = new AssertionError(sb.toString());
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
        }

        public C11756b(Class<?> cls) {
            Field[] declaredFields;
            LinkedList linkedList = new LinkedList();
            long j = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    Class type = field.getType();
                    if (type.isPrimitive()) {
                        j += C11752g.m24082b(type);
                    } else {
                        field.setAccessible(true);
                        linkedList.add(field);
                        j += (long) C11752g.this.f31220c;
                    }
                }
            }
            Class<Object> superclass = cls.getSuperclass();
            if (!(superclass == null || superclass == Object.class)) {
                C11756b a = C11752g.this.mo22502a(superclass);
                j += C11752g.m24079a(a.f31232c, C11752g.this.f31221d);
                linkedList.addAll(Arrays.asList(a.f31233d));
            }
            this.f31232c = j;
            this.f31231b = C11752g.m24079a(((long) C11752g.this.f31218a) + j, C11752g.this.f31219b);
            this.f31233d = (Field[]) linkedList.toArray(new Field[linkedList.size()]);
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.g$c */
    static class C11757c {

        /* renamed from: a */
        public static final C11758d f31234a;

        static {
            C11758d dVar;
            if ("32".equals("64")) {
                dVar = new C11758d() {
                    /* renamed from: a */
                    public final int mo22506a() {
                        return 20;
                    }

                    /* renamed from: b */
                    public final int mo22507b() {
                        return 12;
                    }

                    /* renamed from: c */
                    public final int mo22508c() {
                        return 4;
                    }

                    /* renamed from: d */
                    public final int mo22509d() {
                        return 4;
                    }

                    /* renamed from: e */
                    public final int mo22510e() {
                        return 4;
                    }
                };
            } else {
                dVar = new C11758d() {
                    /* renamed from: a */
                    public final int mo22506a() {
                        return 40;
                    }

                    /* renamed from: b */
                    public final int mo22507b() {
                        return 24;
                    }

                    /* renamed from: c */
                    public final int mo22508c() {
                        return 8;
                    }

                    /* renamed from: d */
                    public final int mo22509d() {
                        return 8;
                    }

                    /* renamed from: e */
                    public final int mo22510e() {
                        return 8;
                    }
                };
            }
            f31234a = dVar;
        }
    }

    /* renamed from: com.bytedance.jedi.a.m.g$d */
    public interface C11758d {
        /* renamed from: a */
        int mo22506a();

        /* renamed from: b */
        int mo22507b();

        /* renamed from: c */
        int mo22508c();

        /* renamed from: d */
        int mo22509d();

        /* renamed from: e */
        int mo22510e();
    }

    static {
        try {
            f31212e = Class.forName("java.lang.management.ManagementFactory");
            f31213f = Class.forName("java.lang.management.MemoryPoolMXBean");
            f31214g = Class.forName("java.lang.management.MemoryUsage");
            f31215h = f31212e.getMethod("getMemoryPoolMXBeans", new Class[0]);
            f31216i = f31213f.getMethod("getUsage", new Class[0]);
            f31217j = f31214g.getMethod("getMax", new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo22505c(Object obj) {
        if (obj != null) {
            this.f31226o.addLast(obj);
        }
    }

    /* renamed from: a */
    public static long[] m24081a(Object obj) throws UnsupportedOperationException {
        if (obj == null) {
            return new long[]{0, 0};
        }
        return new C11752g(C11757c.f31234a).m24083d(obj);
    }

    /* renamed from: e */
    private void m24084e(Object obj) {
        Class cls = obj.getClass();
        Class componentType = cls.getComponentType();
        int length = Array.getLength(obj);
        if (componentType.isPrimitive()) {
            m24080a(cls, length, m24082b(componentType));
            return;
        }
        m24080a(cls, length, (long) this.f31220c);
        switch (length) {
            case 0:
                return;
            case 1:
                mo22505c(Array.get(obj, 0));
                return;
            default:
                mo22505c(new C11755a((Object[]) obj));
                return;
        }
    }

    /* renamed from: b */
    public final void mo22504b(Object obj) {
        if (!this.f31224m.containsKey(obj)) {
            Class<C11755a> cls = obj.getClass();
            if (cls == C11755a.class) {
                ((C11755a) obj).mo22511a(this);
                return;
            }
            this.f31224m.put(obj, obj);
            if (cls.isArray()) {
                m24084e(obj);
                return;
            }
            mo22502a(cls).mo22512a(obj, this);
        }
    }

    private C11752g(C11758d dVar) {
        dVar.getClass();
        this.f31222k = dVar.mo22506a();
        this.f31218a = dVar.mo22507b();
        this.f31219b = dVar.mo22508c();
        this.f31220c = dVar.mo22509d();
        this.f31221d = dVar.mo22510e();
    }

    /* renamed from: b */
    public static long m24082b(Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Byte.TYPE) {
            return 1;
        }
        if (cls == Character.TYPE || cls == Short.TYPE) {
            return 2;
        }
        if (cls == Integer.TYPE || cls == Float.TYPE) {
            return 4;
        }
        if (cls == Long.TYPE || cls == Double.TYPE) {
            return 8;
        }
        StringBuilder sb = new StringBuilder("Encountered unexpected primitive type ");
        sb.append(cls.getName());
        throw new AssertionError(sb.toString());
    }

    /* renamed from: d */
    private synchronized long[] m24083d(Object obj) {
        this.f31225n.clear();
        while (true) {
            try {
                mo22504b(obj);
                if (this.f31226o.isEmpty()) {
                } else {
                    if (this.f31228q == 0) {
                        this.f31228q = this.f31227p;
                    }
                    obj = this.f31226o.removeFirst();
                }
            } finally {
                this.f31224m.clear();
                this.f31226o.clear();
                this.f31227p = 0;
                this.f31228q = 0;
            }
        }
        return new long[]{this.f31227p, this.f31228q};
    }

    /* renamed from: a */
    public final C11756b mo22502a(Class<?> cls) {
        C11756b bVar = (C11756b) this.f31223l.get(cls);
        if (bVar != null) {
            return bVar;
        }
        C11756b bVar2 = new C11756b(cls);
        this.f31223l.put(cls, bVar2);
        return bVar2;
    }

    /* renamed from: a */
    static long m24079a(long j, int i) {
        long j2 = (long) i;
        return (((j + j2) - 1) / j2) * j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo22503a(Class<?> cls, long j) {
        C11739a aVar = (C11739a) this.f31225n.get(cls);
        if (aVar == null) {
            aVar = new C11739a(cls);
            this.f31225n.put(cls, aVar);
        }
        aVar.mo22491a(j);
        this.f31227p += j;
    }

    /* renamed from: a */
    private void m24080a(Class<?> cls, int i, long j) {
        mo22503a(cls, m24079a(((long) this.f31222k) + (((long) i) * j), this.f31219b));
    }
}
