package com.toutiao.proxyserver.net;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.net.d */
public final class C51874d {

    /* renamed from: a */
    public final String f129407a;

    /* renamed from: b */
    public final String f129408b;

    /* renamed from: c */
    public final List<C51873c> f129409c;

    /* renamed from: d */
    public final long f129410d;

    /* renamed from: e */
    public final long f129411e;

    /* renamed from: f */
    public final long f129412f;

    /* renamed from: com.toutiao.proxyserver.net.d$a */
    public static final class C51876a {

        /* renamed from: a */
        public String f129413a;

        /* renamed from: b */
        public String f129414b;

        /* renamed from: c */
        public final List<C51873c> f129415c = new ArrayList();

        /* renamed from: d */
        public long f129416d;

        /* renamed from: e */
        public long f129417e;

        /* renamed from: f */
        public long f129418f;

        /* renamed from: a */
        public final C51876a mo107376a(long j) {
            this.f129416d = j;
            return this;
        }

        /* renamed from: b */
        public final C51876a mo107378b(long j) {
            this.f129417e = j;
            return this;
        }

        /* renamed from: c */
        public final C51876a mo107379c(long j) {
            this.f129418f = j;
            return this;
        }

        /* renamed from: a */
        public final C51876a mo107377a(String str, String str2) {
            if (str == null || str2 == null) {
                return this;
            }
            this.f129415c.add(new C51873c(str, str2));
            return this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest{url='");
        sb.append(this.f129407a);
        sb.append('\'');
        sb.append(", method='");
        sb.append(this.f129408b);
        sb.append('\'');
        sb.append(", headers=");
        sb.append(this.f129409c);
        sb.append(", connectTimeout=");
        sb.append(this.f129410d);
        sb.append(", readTimeout=");
        sb.append(this.f129411e);
        sb.append(", writeTimeout=");
        sb.append(this.f129412f);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo107374a(String str) {
        return m111238a(str, null);
    }

    private C51874d(C51876a aVar) {
        this.f129407a = aVar.f129413a;
        this.f129408b = aVar.f129414b;
        this.f129409c = aVar.f129415c;
        this.f129410d = aVar.f129416d;
        this.f129411e = aVar.f129417e;
        this.f129412f = aVar.f129418f;
    }

    /* renamed from: a */
    private String m111238a(String str, String str2) {
        for (C51873c cVar : this.f129409c) {
            if (cVar.f129405a.equalsIgnoreCase(str)) {
                return cVar.f129406b;
            }
        }
        return null;
    }
}
