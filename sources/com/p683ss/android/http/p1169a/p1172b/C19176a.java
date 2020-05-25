package com.p683ss.android.http.p1169a.p1172b;

import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.C19175b;
import com.p683ss.android.http.p1169a.C19191e;
import com.p683ss.android.http.p1169a.p1174d.C19188b;

/* renamed from: com.ss.android.http.a.b.a */
public final class C19176a implements C19170a, Cloneable {

    /* renamed from: a */
    private final String f52868a;

    /* renamed from: b */
    private final String f52869b;

    /* renamed from: a */
    public final String mo39116a() {
        return this.f52868a;
    }

    /* renamed from: b */
    public final String mo39117b() {
        return this.f52869b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        return C19179d.f52875a.mo39130a(null, this).toString();
    }

    /* renamed from: c */
    public final C19175b[] mo39118c() throws C19191e {
        if (this.f52869b == null) {
            return new C19175b[0];
        }
        String str = this.f52869b;
        if (str != null) {
            C19178c cVar = C19178c.f52873a;
            C19188b bVar = new C19188b(str.length());
            bVar.mo39151a(str);
            return cVar.mo39129a(bVar, new C19183h(0, str.length()));
        }
        throw new IllegalArgumentException("Value to parse may not be null");
    }

    public C19176a(String str, String str2) {
        if (str != null) {
            this.f52868a = str;
            this.f52869b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
