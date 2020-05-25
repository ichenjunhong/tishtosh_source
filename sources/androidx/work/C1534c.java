package androidx.work;

import android.os.Build.VERSION;

/* renamed from: androidx.work.c */
public final class C1534c {

    /* renamed from: a */
    public static final C1534c f5518a = new C1534c(new C1535a());

    /* renamed from: b */
    public C1542h f5519b;

    /* renamed from: c */
    public boolean f5520c;

    /* renamed from: d */
    public boolean f5521d;

    /* renamed from: e */
    public boolean f5522e;

    /* renamed from: f */
    public boolean f5523f;

    /* renamed from: g */
    public C1536d f5524g;

    /* renamed from: androidx.work.c$a */
    public static final class C1535a {

        /* renamed from: a */
        boolean f5525a;

        /* renamed from: b */
        boolean f5526b;

        /* renamed from: c */
        C1542h f5527c = C1542h.NOT_REQUIRED;

        /* renamed from: d */
        boolean f5528d;

        /* renamed from: e */
        boolean f5529e;

        /* renamed from: f */
        C1536d f5530f = new C1536d();
    }

    public C1534c() {
    }

    /* renamed from: a */
    public final boolean mo5912a() {
        if (this.f5524g == null || this.f5524g.mo5915a() <= 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.f5519b.hashCode() * 31) + (this.f5520c ? 1 : 0)) * 31) + (this.f5521d ? 1 : 0)) * 31) + (this.f5522e ? 1 : 0)) * 31) + (this.f5523f ? 1 : 0)) * 31;
        if (this.f5524g != null) {
            i = this.f5524g.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    C1534c(C1535a aVar) {
        boolean z;
        C1536d dVar;
        this.f5520c = aVar.f5525a;
        if (VERSION.SDK_INT < 23 || !aVar.f5526b) {
            z = false;
        } else {
            z = true;
        }
        this.f5521d = z;
        this.f5519b = aVar.f5527c;
        this.f5522e = aVar.f5528d;
        this.f5523f = aVar.f5529e;
        if (VERSION.SDK_INT >= 24) {
            dVar = aVar.f5530f;
        } else {
            dVar = new C1536d();
        }
        this.f5524g = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1534c cVar = (C1534c) obj;
        if (this.f5519b == cVar.f5519b && this.f5520c == cVar.f5520c && this.f5521d == cVar.f5521d && this.f5522e == cVar.f5522e && this.f5523f == cVar.f5523f && (this.f5524g == null ? cVar.f5524g == null : this.f5524g.equals(cVar.f5524g))) {
            return true;
        }
        return false;
    }
}
