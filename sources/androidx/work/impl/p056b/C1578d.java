package androidx.work.impl.p056b;

/* renamed from: androidx.work.impl.b.d */
public final class C1578d {

    /* renamed from: a */
    public final String f5594a;

    /* renamed from: b */
    public final int f5595b;

    public final int hashCode() {
        return (this.f5594a.hashCode() * 31) + this.f5595b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1578d dVar = (C1578d) obj;
        if (this.f5595b != dVar.f5595b) {
            return false;
        }
        return this.f5594a.equals(dVar.f5594a);
    }

    public C1578d(String str, int i) {
        this.f5594a = str;
        this.f5595b = i;
    }
}
