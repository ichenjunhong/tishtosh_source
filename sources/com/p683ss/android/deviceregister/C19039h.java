package com.p683ss.android.deviceregister;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.deviceregister.h */
final class C19039h {

    /* renamed from: a */
    final Long f52416a;

    /* renamed from: b */
    final Long f52417b;

    /* renamed from: c */
    final Long f52418c;

    /* renamed from: d */
    final Long f52419d;

    /* renamed from: e */
    final Long f52420e;

    /* renamed from: f */
    final Long f52421f;

    /* renamed from: g */
    final Integer f52422g;

    /* renamed from: h */
    final List<C19041a> f52423h;

    /* renamed from: i */
    final String f52424i;

    /* renamed from: j */
    final Long f52425j;

    /* renamed from: k */
    final Integer f52426k;

    /* renamed from: com.ss.android.deviceregister.h$a */
    static final class C19041a {

        /* renamed from: a */
        final Long f52427a;

        /* renamed from: b */
        final Long f52428b;

        /* renamed from: c */
        final String f52429c;

        /* renamed from: d */
        final String f52430d;

        /* renamed from: e */
        final String f52431e;

        /* renamed from: f */
        final String f52432f;

        /* renamed from: g */
        final Integer f52433g;

        /* renamed from: com.ss.android.deviceregister.h$a$a */
        static class C19042a {

            /* renamed from: a */
            private Long f52434a;

            /* renamed from: b */
            private Long f52435b;

            /* renamed from: c */
            private String f52436c;

            /* renamed from: d */
            private String f52437d;

            /* renamed from: e */
            private String f52438e;

            /* renamed from: f */
            private String f52439f;

            /* renamed from: g */
            private Integer f52440g;

            C19042a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C19041a mo38898a() {
                C19041a aVar = new C19041a(this.f52434a, this.f52435b, this.f52436c, this.f52437d, this.f52438e, this.f52439f, this.f52440g);
                return aVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C19042a mo38895a(Integer num) {
                this.f52440g = num;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final C19042a mo38899b(Long l) {
                this.f52435b = l;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final C19042a mo38901c(String str) {
                this.f52438e = str;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public final C19042a mo38902d(String str) {
                this.f52439f = str;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C19042a mo38896a(Long l) {
                this.f52434a = l;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final C19042a mo38900b(String str) {
                this.f52437d = str;
                return this;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final C19042a mo38897a(String str) {
                this.f52436c = str;
                return this;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Call{netRequestStart=");
            sb.append(this.f52427a);
            sb.append(", netRequestEnd=");
            sb.append(this.f52428b);
            sb.append(", url='");
            sb.append(this.f52429c);
            sb.append('\'');
            sb.append(", data='");
            sb.append(this.f52430d);
            sb.append('\'');
            sb.append(", exception='");
            sb.append(this.f52431e);
            sb.append('\'');
            sb.append(", errorMessage='");
            sb.append(this.f52432f);
            sb.append('\'');
            sb.append(", nTry=");
            sb.append(this.f52433g);
            sb.append('}');
            return sb.toString();
        }

        C19041a(Long l, Long l2, String str, String str2, String str3, String str4, Integer num) {
            this.f52427a = l;
            this.f52428b = l2;
            this.f52429c = str;
            this.f52430d = str2;
            this.f52431e = str3;
            this.f52432f = str4;
            this.f52433g = num;
        }
    }

    /* renamed from: com.ss.android.deviceregister.h$b */
    public static class C19043b {

        /* renamed from: a */
        public String f52441a;

        /* renamed from: b */
        Long f52442b;

        /* renamed from: c */
        private Long f52443c;

        /* renamed from: d */
        private Long f52444d;

        /* renamed from: e */
        private Long f52445e;

        /* renamed from: f */
        private Long f52446f;

        /* renamed from: g */
        private Long f52447g;

        /* renamed from: h */
        private Long f52448h;

        /* renamed from: i */
        private Integer f52449i;

        /* renamed from: j */
        private List<C19041a> f52450j = new ArrayList();

        /* renamed from: k */
        private Integer f52451k;

        C19043b() {
        }

        /* renamed from: a */
        public final C19039h mo38907a() {
            C19039h hVar = new C19039h(this.f52443c, this.f52444d, this.f52445e, this.f52446f, this.f52447g, this.f52448h, this.f52449i, this.f52450j, this.f52441a, this.f52442b, this.f52451k);
            return hVar;
        }

        /* renamed from: a */
        public final C19043b mo38904a(Integer num) {
            this.f52449i = num;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C19043b mo38908b(Integer num) {
            this.f52451k = num;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C19043b mo38910c(Long l) {
            this.f52445e = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final C19043b mo38911d(Long l) {
            this.f52446f = l;
            return this;
        }

        /* renamed from: e */
        public final C19043b mo38912e(Long l) {
            this.f52447g = l;
            return this;
        }

        /* renamed from: f */
        public final C19043b mo38913f(Long l) {
            this.f52448h = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C19043b mo38903a(C19041a aVar) {
            this.f52450j.add(aVar);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C19043b mo38909b(Long l) {
            this.f52444d = l;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C19043b mo38905a(Long l) {
            this.f52443c = l;
            return this;
        }

        /* renamed from: a */
        public final C19043b mo38906a(String str) {
            this.f52441a = str;
            return this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp{timestampPrimaryId=");
        sb.append(this.f52426k);
        sb.append('}');
        return sb.toString();
    }

    private C19039h(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Integer num, List<C19041a> list, String str, Long l7, Integer num2) {
        this.f52416a = l;
        this.f52417b = l2;
        this.f52418c = l3;
        this.f52419d = l4;
        this.f52420e = l5;
        this.f52421f = l6;
        this.f52422g = num;
        this.f52423h = list;
        this.f52424i = str;
        this.f52425j = l7;
        this.f52426k = num2;
    }
}
