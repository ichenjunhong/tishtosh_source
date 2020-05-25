package com.p683ss.p2568f.p2569a;

import org.json.JSONObject;

/* renamed from: com.ss.f.a.c */
public interface C51311c {

    /* renamed from: com.ss.f.a.c$a */
    public static class C51313a {

        /* renamed from: a */
        public final JSONObject f128229a;

        /* renamed from: b */
        public final String f128230b;

        /* renamed from: c */
        public final String f128231c;

        /* renamed from: d */
        public final Exception f128232d;

        /* renamed from: com.ss.f.a.c$a$a */
        public static class C51314a {

            /* renamed from: a */
            public JSONObject f128233a;

            /* renamed from: b */
            String f128234b;

            /* renamed from: c */
            public String f128235c;

            /* renamed from: d */
            Exception f128236d;

            private C51314a() {
            }

            /* renamed from: a */
            public final C51313a mo101858a() {
                return new C51313a(this);
            }

            /* renamed from: a */
            public final C51314a mo101856a(Exception exc) {
                this.f128236d = exc;
                return this;
            }

            /* renamed from: a */
            public final C51314a mo101857a(String str) {
                this.f128234b = str;
                return this;
            }
        }

        /* renamed from: a */
        public static C51314a m110357a() {
            return new C51314a();
        }

        private C51313a(C51314a aVar) {
            this.f128229a = aVar.f128233a;
            this.f128230b = aVar.f128234b;
            this.f128231c = aVar.f128235c;
            this.f128232d = aVar.f128236d;
        }
    }

    /* renamed from: a */
    C51313a mo14312a(String str, String str2);
}
