package com.bytedance.frameworks.baselib.network.http.p574e;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.Locale;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.c */
public final class C9908c implements Cloneable {

    /* renamed from: a */
    public final String f26977a;

    /* renamed from: b */
    protected final String f26978b;

    /* renamed from: c */
    public final int f26979c;

    /* renamed from: d */
    public final String f26980d;

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return C9911f.m19862a(C9911f.m19861a(C9911f.m19862a(17, (Object) this.f26978b), this.f26979c), (Object) this.f26980d);
    }

    public final String toString() {
        C9906a aVar = new C9906a(32);
        aVar.mo17840a(this.f26980d);
        aVar.mo17840a("://");
        aVar.mo17840a(this.f26977a);
        if (this.f26979c != -1) {
            int i = aVar.f26974b + 1;
            if (i > aVar.f26973a.length) {
                aVar.mo17839a(i);
            }
            aVar.f26973a[aVar.f26974b] = ':';
            aVar.f26974b = i;
            aVar.mo17840a(Integer.toString(this.f26979c));
        }
        return aVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9908c)) {
            return false;
        }
        C9908c cVar = (C9908c) obj;
        if (!this.f26978b.equals(cVar.f26978b) || this.f26979c != cVar.f26979c || !this.f26980d.equals(cVar.f26980d)) {
            return false;
        }
        return true;
    }

    public C9908c(String str, int i, String str2) {
        if (str != null) {
            this.f26977a = str;
            this.f26978b = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.f26980d = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.f26980d = WebKitApi.SCHEME_HTTP;
            }
            this.f26979c = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }
}
