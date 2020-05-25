package androidx.work.impl.p056b;

import android.arch.p006a.p009c.C0054a;
import androidx.work.C1531a;
import androidx.work.C1534c;
import androidx.work.C1538e;
import androidx.work.C1543i;
import androidx.work.C1543i.C1544a;
import java.util.List;

/* renamed from: androidx.work.impl.b.g */
public final class C1583g {

    /* renamed from: q */
    public static final C0054a<List<Object>, List<C1543i>> f5601q = new C0054a<List<Object>, List<C1543i>>() {
    };

    /* renamed from: a */
    public String f5602a;

    /* renamed from: b */
    public C1544a f5603b = C1544a.ENQUEUED;

    /* renamed from: c */
    public String f5604c;

    /* renamed from: d */
    public String f5605d;

    /* renamed from: e */
    public C1538e f5606e = C1538e.f5534a;

    /* renamed from: f */
    public C1538e f5607f = C1538e.f5534a;

    /* renamed from: g */
    public long f5608g;

    /* renamed from: h */
    public long f5609h;

    /* renamed from: i */
    public long f5610i;

    /* renamed from: j */
    public C1534c f5611j = C1534c.f5518a;

    /* renamed from: k */
    public int f5612k;

    /* renamed from: l */
    public C1531a f5613l = C1531a.EXPONENTIAL;

    /* renamed from: m */
    public long f5614m = 30000;

    /* renamed from: n */
    public long f5615n;

    /* renamed from: o */
    public long f5616o;

    /* renamed from: p */
    public long f5617p = -1;

    /* renamed from: a */
    public final boolean mo5982a() {
        if (this.f5609h != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo5983b() {
        if (this.f5603b != C1544a.ENQUEUED || this.f5612k <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo5985d() {
        if (!C1534c.f5518a.equals(this.f5611j)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{WorkSpec: ");
        sb.append(this.f5602a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: c */
    public final long mo5984c() {
        boolean z;
        long j;
        if (mo5983b()) {
            if (this.f5613l == C1531a.LINEAR) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j = this.f5614m * ((long) this.f5612k);
            } else {
                j = (long) Math.scalb((float) this.f5614m, this.f5612k - 1);
            }
            return this.f5615n + Math.min(18000000, j);
        } else if (mo5982a()) {
            return (this.f5615n + this.f5609h) - this.f5610i;
        } else {
            return this.f5615n + this.f5608g;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.f5602a.hashCode() * 31) + this.f5603b.hashCode()) * 31) + this.f5604c.hashCode()) * 31;
        if (this.f5605d != null) {
            i = this.f5605d.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((((((((((((((hashCode + i) * 31) + this.f5606e.hashCode()) * 31) + this.f5607f.hashCode()) * 31) + ((int) (this.f5608g ^ (this.f5608g >>> 32)))) * 31) + ((int) (this.f5609h ^ (this.f5609h >>> 32)))) * 31) + ((int) (this.f5610i ^ (this.f5610i >>> 32)))) * 31) + this.f5611j.hashCode()) * 31) + this.f5612k) * 31) + this.f5613l.hashCode()) * 31) + ((int) (this.f5614m ^ (this.f5614m >>> 32)))) * 31) + ((int) (this.f5615n ^ (this.f5615n >>> 32)))) * 31) + ((int) (this.f5616o ^ (this.f5616o >>> 32)))) * 31) + ((int) (this.f5617p ^ (this.f5617p >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1583g gVar = (C1583g) obj;
        if (this.f5608g != gVar.f5608g || this.f5609h != gVar.f5609h || this.f5610i != gVar.f5610i || this.f5612k != gVar.f5612k || this.f5614m != gVar.f5614m || this.f5615n != gVar.f5615n || this.f5616o != gVar.f5616o || this.f5617p != gVar.f5617p || !this.f5602a.equals(gVar.f5602a) || this.f5603b != gVar.f5603b || !this.f5604c.equals(gVar.f5604c)) {
            return false;
        }
        if (this.f5605d == null ? gVar.f5605d != null : !this.f5605d.equals(gVar.f5605d)) {
            return false;
        }
        if (this.f5606e.equals(gVar.f5606e) && this.f5607f.equals(gVar.f5607f) && this.f5611j.equals(gVar.f5611j) && this.f5613l == gVar.f5613l) {
            return true;
        }
        return false;
    }

    public C1583g(String str, String str2) {
        this.f5602a = str;
        this.f5604c = str2;
    }
}
