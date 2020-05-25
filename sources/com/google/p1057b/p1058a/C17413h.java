package com.google.p1057b.p1058a;

import java.util.Arrays;

/* renamed from: com.google.b.a.h */
public final class C17413h {

    /* renamed from: com.google.b.a.h$a */
    public static final class C17415a {

        /* renamed from: a */
        private final String f48950a;

        /* renamed from: b */
        private final C17416a f48951b;

        /* renamed from: c */
        private C17416a f48952c;

        /* renamed from: d */
        private boolean f48953d;

        /* renamed from: com.google.b.a.h$a$a */
        static final class C17416a {

            /* renamed from: a */
            String f48954a;

            /* renamed from: b */
            Object f48955b;

            /* renamed from: c */
            C17416a f48956c;

            private C17416a() {
            }
        }

        /* renamed from: a */
        private C17416a m42639a() {
            C17416a aVar = new C17416a();
            this.f48952c.f48956c = aVar;
            this.f48952c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f48953d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f48950a);
            sb.append('{');
            for (C17416a aVar = this.f48951b.f48956c; aVar != null; aVar = aVar.f48956c) {
                Object obj = aVar.f48955b;
                if (!z || obj != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f48954a != null) {
                        sb.append(aVar.f48954a);
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
        public final C17415a mo33740a(Object obj) {
            m42639a().f48955b = obj;
            return this;
        }

        private C17415a(String str) {
            this.f48951b = new C17416a();
            this.f48952c = this.f48951b;
            this.f48953d = false;
            this.f48950a = (String) C17421k.m42653a(str);
        }

        /* renamed from: b */
        private C17415a m42640b(String str, Object obj) {
            C17416a a = m42639a();
            a.f48955b = obj;
            a.f48954a = (String) C17421k.m42653a(str);
            return this;
        }

        /* renamed from: a */
        public final C17415a mo33741a(String str, int i) {
            return m42640b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C17415a mo33742a(String str, long j) {
            return m42640b(str, String.valueOf(j));
        }

        /* renamed from: a */
        public final C17415a mo33743a(String str, Object obj) {
            return m42640b(str, obj);
        }
    }

    /* renamed from: a */
    public static C17415a m42637a(Object obj) {
        return new C17415a(obj.getClass().getSimpleName());
    }

    /* renamed from: a */
    public static <T> T m42638a(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
