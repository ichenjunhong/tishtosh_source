package p064c.p065a.p072e.p074b;

import p064c.p065a.p071d.C1708c;

/* renamed from: c.a.e.b.b */
public final class C1745b {

    /* renamed from: a */
    static final C1708c<Object, Object> f5864a = new C1746a();

    /* renamed from: c.a.e.b.b$a */
    static final class C1746a implements C1708c<Object, Object> {
        C1746a() {
        }

        /* renamed from: a */
        public final boolean mo6201a(Object obj, Object obj2) {
            return C1745b.m6051a(obj, obj2);
        }
    }

    /* renamed from: a */
    public static <T> C1708c<T, T> m6049a() {
        return f5864a;
    }

    /* renamed from: a */
    public static <T> T m6050a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static int m6048a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static boolean m6051a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
