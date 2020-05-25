package com.bytedance.jedi.p725a.p734g.p735a;

import java.util.Arrays;

/* renamed from: com.bytedance.jedi.a.g.a.b */
public final class C11601b {

    /* renamed from: com.bytedance.jedi.a.g.a.b$a */
    public static final class C11603a {

        /* renamed from: a */
        private final String f30982a;

        /* renamed from: b */
        private final C11604a f30983b;

        /* renamed from: c */
        private C11604a f30984c;

        /* renamed from: d */
        private boolean f30985d;

        /* renamed from: com.bytedance.jedi.a.g.a.b$a$a */
        static final class C11604a {

            /* renamed from: a */
            String f30986a;

            /* renamed from: b */
            Object f30987b;

            /* renamed from: c */
            C11604a f30988c;

            private C11604a() {
            }
        }

        /* renamed from: a */
        private C11604a m23726a() {
            C11604a aVar = new C11604a();
            this.f30984c.f30988c = aVar;
            this.f30984c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f30985d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f30982a);
            sb.append('{');
            for (C11604a aVar = this.f30983b.f30988c; aVar != null; aVar = aVar.f30988c) {
                Object obj = aVar.f30987b;
                if (!z || obj != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f30986a != null) {
                        sb.append(aVar.f30986a);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                }
            }
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        public final C11603a mo22323a(Object obj) {
            m23726a().f30987b = obj;
            return this;
        }

        private C11603a(String str) {
            this.f30983b = new C11604a();
            this.f30984c = this.f30983b;
            this.f30985d = false;
            this.f30982a = (String) C11605c.m23732a(str);
        }

        /* renamed from: b */
        private C11603a m23727b(String str, Object obj) {
            C11604a a = m23726a();
            a.f30987b = obj;
            a.f30986a = (String) C11605c.m23732a(str);
            return this;
        }

        /* renamed from: a */
        public final C11603a mo22324a(String str, int i) {
            return m23727b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C11603a mo22325a(String str, long j) {
            return m23727b(str, String.valueOf(j));
        }

        /* renamed from: a */
        public final C11603a mo22326a(String str, Object obj) {
            return m23727b(str, obj);
        }
    }

    /* renamed from: a */
    public static <T> T m23725a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
