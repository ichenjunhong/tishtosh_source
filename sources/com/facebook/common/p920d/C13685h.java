package com.facebook.common.p920d;

/* renamed from: com.facebook.common.d.h */
public final class C13685h {

    /* renamed from: com.facebook.common.d.h$a */
    public static final class C13687a {

        /* renamed from: a */
        private final String f35659a;

        /* renamed from: b */
        private C13688a f35660b;

        /* renamed from: c */
        private C13688a f35661c;

        /* renamed from: d */
        private boolean f35662d;

        /* renamed from: com.facebook.common.d.h$a$a */
        static final class C13688a {

            /* renamed from: a */
            String f35663a;

            /* renamed from: b */
            Object f35664b;

            /* renamed from: c */
            C13688a f35665c;

            private C13688a() {
            }
        }

        /* renamed from: a */
        private C13688a m27646a() {
            C13688a aVar = new C13688a();
            this.f35661c.f35665c = aVar;
            this.f35661c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f35662d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f35659a);
            sb.append('{');
            for (C13688a aVar = this.f35660b.f35665c; aVar != null; aVar = aVar.f35665c) {
                if (!z || aVar.f35664b != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f35663a != null) {
                        sb.append(aVar.f35663a);
                        sb.append('=');
                    }
                    sb.append(aVar.f35664b);
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private C13687a(String str) {
            this.f35660b = new C13688a();
            this.f35661c = this.f35660b;
            this.f35662d = false;
            this.f35659a = (String) C13689i.m27652a(str);
        }

        /* renamed from: a */
        public final C13687a mo25581a(String str, Object obj) {
            return m27647b(str, obj);
        }

        /* renamed from: b */
        private C13687a m27647b(String str, Object obj) {
            C13688a a = m27646a();
            a.f35664b = obj;
            a.f35663a = (String) C13689i.m27652a(str);
            return this;
        }

        /* renamed from: a */
        public final C13687a mo25580a(String str, int i) {
            return m27647b(str, String.valueOf(i));
        }

        /* renamed from: a */
        public final C13687a mo25582a(String str, boolean z) {
            return m27647b(str, String.valueOf(z));
        }
    }

    /* renamed from: a */
    public static C13687a m27644a(Object obj) {
        String replaceAll = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return new C13687a(replaceAll.substring(lastIndexOf + 1));
    }

    /* renamed from: a */
    public static boolean m27645a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
