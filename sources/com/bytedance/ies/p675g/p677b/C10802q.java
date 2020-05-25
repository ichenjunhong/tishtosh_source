package com.bytedance.ies.p675g.p677b;

import android.text.TextUtils;

/* renamed from: com.bytedance.ies.g.b.q */
public final class C10802q {

    /* renamed from: a */
    public final int f29014a;

    /* renamed from: b */
    public final String f29015b;

    /* renamed from: c */
    public final String f29016c;

    /* renamed from: d */
    public final String f29017d;

    /* renamed from: e */
    public final String f29018e;

    /* renamed from: f */
    public final String f29019f;

    /* renamed from: g */
    public final String f29020g;

    /* renamed from: h */
    public final String f29021h;

    /* renamed from: com.bytedance.ies.g.b.q$a */
    public static final class C10804a {

        /* renamed from: a */
        public String f29022a;

        /* renamed from: b */
        public String f29023b;

        /* renamed from: c */
        public String f29024c;

        /* renamed from: d */
        public String f29025d;

        /* renamed from: e */
        public String f29026e;

        /* renamed from: f */
        public String f29027f;

        /* renamed from: g */
        public String f29028g;

        private C10804a() {
        }

        /* renamed from: a */
        public final C10802q mo19571a() {
            return new C10802q(this);
        }

        /* renamed from: a */
        public final C10804a mo19570a(String str) {
            this.f29022a = str;
            return this;
        }

        /* renamed from: b */
        public final C10804a mo19572b(String str) {
            this.f29023b = str;
            return this;
        }

        /* renamed from: c */
        public final C10804a mo19573c(String str) {
            this.f29024c = str;
            return this;
        }

        /* renamed from: d */
        public final C10804a mo19574d(String str) {
            this.f29025d = str;
            return this;
        }

        /* renamed from: e */
        public final C10804a mo19575e(String str) {
            this.f29026e = str;
            return this;
        }

        /* renamed from: f */
        public final C10804a mo19576f(String str) {
            this.f29027f = str;
            return this;
        }

        /* renamed from: g */
        public final C10804a mo19577g(String str) {
            this.f29028g = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C10804a m21911a() {
        return new C10804a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("methodName: ");
        sb.append(this.f29017d);
        sb.append(", params: ");
        sb.append(this.f29018e);
        sb.append(", callbackId: ");
        sb.append(this.f29019f);
        sb.append(", type: ");
        sb.append(this.f29016c);
        sb.append(", version: ");
        sb.append(this.f29015b);
        sb.append(", ");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m21912a(C10802q qVar) {
        if (qVar == null || qVar.f29014a != 1 || TextUtils.isEmpty(qVar.f29017d) || TextUtils.isEmpty(qVar.f29018e)) {
            return true;
        }
        return false;
    }

    private C10802q(C10804a aVar) {
        this.f29015b = aVar.f29022a;
        this.f29016c = aVar.f29023b;
        this.f29017d = aVar.f29024c;
        this.f29018e = aVar.f29025d;
        this.f29019f = aVar.f29026e;
        this.f29020g = aVar.f29027f;
        this.f29014a = 1;
        this.f29021h = aVar.f29028g;
    }

    C10802q(String str, int i) {
        this.f29019f = str;
        this.f29014a = i;
    }
}
