package com.p683ss.android.http.p1169a.p1172b;

import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1174d.C19188b;

/* renamed from: com.ss.android.http.a.b.d */
public final class C19179d {

    /* renamed from: a */
    public static final C19179d f52875a = new C19179d();

    /* renamed from: a */
    public final C19188b mo39130a(C19188b bVar, C19170a aVar) {
        C19188b bVar2 = new C19188b(64);
        String a = aVar.mo39116a();
        String b = aVar.mo39117b();
        int length = a.length() + 2;
        if (b != null) {
            length += b.length();
        }
        if (length > bVar2.f52888a.length - bVar2.f52889b) {
            bVar2.mo39150a(bVar2.f52889b + length);
        }
        bVar2.mo39151a(a);
        bVar2.mo39151a(": ");
        if (b != null) {
            bVar2.mo39151a(b);
        }
        return bVar2;
    }
}
