package com.p683ss.android.http.p1169a;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.http.p1169a.p1174d.C19188b;
import com.p683ss.android.http.p1169a.p1174d.C19190d;
import java.util.Locale;

/* renamed from: com.ss.android.http.a.c */
public final class C19184c implements Cloneable {

    /* renamed from: a */
    public final String f52882a;

    /* renamed from: b */
    protected final String f52883b;

    /* renamed from: c */
    public final int f52884c;

    /* renamed from: d */
    public final String f52885d;

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int hashCode() {
        return C19190d.m46779a(C19190d.m46778a(C19190d.m46779a(17, (Object) this.f52883b), this.f52884c), (Object) this.f52885d);
    }

    public final String toString() {
        C19188b bVar = new C19188b(32);
        bVar.mo39151a(this.f52885d);
        bVar.mo39151a("://");
        bVar.mo39151a(this.f52882a);
        if (this.f52884c != -1) {
            bVar.mo39149a(':');
            bVar.mo39151a(Integer.toString(this.f52884c));
        }
        return bVar.toString();
    }

    public C19184c(String str) {
        this(str, -1, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19184c)) {
            return false;
        }
        C19184c cVar = (C19184c) obj;
        if (!this.f52883b.equals(cVar.f52883b) || this.f52884c != cVar.f52884c || !this.f52885d.equals(cVar.f52885d)) {
            return false;
        }
        return true;
    }

    public C19184c(String str, int i, String str2) {
        if (str != null) {
            this.f52882a = str;
            this.f52883b = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.f52885d = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.f52885d = WebKitApi.SCHEME_HTTP;
            }
            this.f52884c = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }
}
