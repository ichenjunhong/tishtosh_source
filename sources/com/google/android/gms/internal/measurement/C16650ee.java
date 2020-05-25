package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16626dm.C16629b;
import com.google.android.gms.internal.measurement.C16626dm.C16629b.C16630a;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.measurement.ee */
public final class C16650ee extends C16843ku<C16650ee> {

    /* renamed from: N */
    private static volatile C16650ee[] f46799N;

    /* renamed from: A */
    public C16644dz[] f46800A;

    /* renamed from: B */
    public String f46801B;

    /* renamed from: C */
    public Integer f46802C;

    /* renamed from: D */
    public String f46803D;

    /* renamed from: E */
    public Long f46804E;

    /* renamed from: F */
    public Long f46805F;

    /* renamed from: G */
    public String f46806G;

    /* renamed from: H */
    public Integer f46807H;

    /* renamed from: I */
    public String f46808I;

    /* renamed from: J */
    public C16629b f46809J;

    /* renamed from: K */
    public int[] f46810K;

    /* renamed from: O */
    private Integer f46811O;

    /* renamed from: P */
    private Integer f46812P;

    /* renamed from: Q */
    private String f46813Q;

    /* renamed from: R */
    private Long f46814R;

    /* renamed from: a */
    public Integer f46815a;

    /* renamed from: b */
    public C16647eb[] f46816b;

    /* renamed from: c */
    public C16653eh[] f46817c;

    /* renamed from: d */
    public Long f46818d;

    /* renamed from: e */
    public Long f46819e;

    /* renamed from: f */
    public Long f46820f;

    /* renamed from: g */
    public Long f46821g;

    /* renamed from: h */
    public Long f46822h;

    /* renamed from: i */
    public String f46823i;

    /* renamed from: j */
    public String f46824j;

    /* renamed from: k */
    public String f46825k;

    /* renamed from: l */
    public String f46826l;

    /* renamed from: m */
    public Integer f46827m;

    /* renamed from: n */
    public String f46828n;

    /* renamed from: o */
    public String f46829o;

    /* renamed from: p */
    public String f46830p;

    /* renamed from: q */
    public Long f46831q;

    /* renamed from: r */
    public Long f46832r;

    /* renamed from: s */
    public String f46833s;

    /* renamed from: t */
    public Boolean f46834t;

    /* renamed from: u */
    public String f46835u;

    /* renamed from: v */
    public Long f46836v;

    /* renamed from: w */
    public Integer f46837w;

    /* renamed from: x */
    public String f46838x;

    /* renamed from: y */
    public String f46839y;

    /* renamed from: z */
    public Boolean f46840z;

    /* renamed from: a */
    public static C16650ee[] m39778a() {
        if (f46799N == null) {
            synchronized (C16847ky.f47301b) {
                if (f46799N == null) {
                    f46799N = new C16650ee[0];
                }
            }
        }
        return f46799N;
    }

    public C16650ee() {
        this.f46815a = null;
        this.f46816b = C16647eb.m39767a();
        this.f46817c = C16653eh.m39789a();
        this.f46818d = null;
        this.f46819e = null;
        this.f46820f = null;
        this.f46821g = null;
        this.f46822h = null;
        this.f46823i = null;
        this.f46824j = null;
        this.f46825k = null;
        this.f46826l = null;
        this.f46827m = null;
        this.f46828n = null;
        this.f46829o = null;
        this.f46830p = null;
        this.f46831q = null;
        this.f46832r = null;
        this.f46833s = null;
        this.f46834t = null;
        this.f46835u = null;
        this.f46836v = null;
        this.f46837w = null;
        this.f46838x = null;
        this.f46839y = null;
        this.f46840z = null;
        this.f46800A = C16644dz.m39758a();
        this.f46801B = null;
        this.f46802C = null;
        this.f46811O = null;
        this.f46812P = null;
        this.f46803D = null;
        this.f46804E = null;
        this.f46805F = null;
        this.f46806G = null;
        this.f46813Q = null;
        this.f46807H = null;
        this.f46808I = null;
        this.f46809J = null;
        this.f46810K = C16853ld.f47307a;
        this.f46814R = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16650ee)) {
            return false;
        }
        C16650ee eeVar = (C16650ee) obj;
        if (this.f46815a == null) {
            if (eeVar.f46815a != null) {
                return false;
            }
        } else if (!this.f46815a.equals(eeVar.f46815a)) {
            return false;
        }
        if (!C16847ky.m40903a((Object[]) this.f46816b, (Object[]) eeVar.f46816b) || !C16847ky.m40903a((Object[]) this.f46817c, (Object[]) eeVar.f46817c)) {
            return false;
        }
        if (this.f46818d == null) {
            if (eeVar.f46818d != null) {
                return false;
            }
        } else if (!this.f46818d.equals(eeVar.f46818d)) {
            return false;
        }
        if (this.f46819e == null) {
            if (eeVar.f46819e != null) {
                return false;
            }
        } else if (!this.f46819e.equals(eeVar.f46819e)) {
            return false;
        }
        if (this.f46820f == null) {
            if (eeVar.f46820f != null) {
                return false;
            }
        } else if (!this.f46820f.equals(eeVar.f46820f)) {
            return false;
        }
        if (this.f46821g == null) {
            if (eeVar.f46821g != null) {
                return false;
            }
        } else if (!this.f46821g.equals(eeVar.f46821g)) {
            return false;
        }
        if (this.f46822h == null) {
            if (eeVar.f46822h != null) {
                return false;
            }
        } else if (!this.f46822h.equals(eeVar.f46822h)) {
            return false;
        }
        if (this.f46823i == null) {
            if (eeVar.f46823i != null) {
                return false;
            }
        } else if (!this.f46823i.equals(eeVar.f46823i)) {
            return false;
        }
        if (this.f46824j == null) {
            if (eeVar.f46824j != null) {
                return false;
            }
        } else if (!this.f46824j.equals(eeVar.f46824j)) {
            return false;
        }
        if (this.f46825k == null) {
            if (eeVar.f46825k != null) {
                return false;
            }
        } else if (!this.f46825k.equals(eeVar.f46825k)) {
            return false;
        }
        if (this.f46826l == null) {
            if (eeVar.f46826l != null) {
                return false;
            }
        } else if (!this.f46826l.equals(eeVar.f46826l)) {
            return false;
        }
        if (this.f46827m == null) {
            if (eeVar.f46827m != null) {
                return false;
            }
        } else if (!this.f46827m.equals(eeVar.f46827m)) {
            return false;
        }
        if (this.f46828n == null) {
            if (eeVar.f46828n != null) {
                return false;
            }
        } else if (!this.f46828n.equals(eeVar.f46828n)) {
            return false;
        }
        if (this.f46829o == null) {
            if (eeVar.f46829o != null) {
                return false;
            }
        } else if (!this.f46829o.equals(eeVar.f46829o)) {
            return false;
        }
        if (this.f46830p == null) {
            if (eeVar.f46830p != null) {
                return false;
            }
        } else if (!this.f46830p.equals(eeVar.f46830p)) {
            return false;
        }
        if (this.f46831q == null) {
            if (eeVar.f46831q != null) {
                return false;
            }
        } else if (!this.f46831q.equals(eeVar.f46831q)) {
            return false;
        }
        if (this.f46832r == null) {
            if (eeVar.f46832r != null) {
                return false;
            }
        } else if (!this.f46832r.equals(eeVar.f46832r)) {
            return false;
        }
        if (this.f46833s == null) {
            if (eeVar.f46833s != null) {
                return false;
            }
        } else if (!this.f46833s.equals(eeVar.f46833s)) {
            return false;
        }
        if (this.f46834t == null) {
            if (eeVar.f46834t != null) {
                return false;
            }
        } else if (!this.f46834t.equals(eeVar.f46834t)) {
            return false;
        }
        if (this.f46835u == null) {
            if (eeVar.f46835u != null) {
                return false;
            }
        } else if (!this.f46835u.equals(eeVar.f46835u)) {
            return false;
        }
        if (this.f46836v == null) {
            if (eeVar.f46836v != null) {
                return false;
            }
        } else if (!this.f46836v.equals(eeVar.f46836v)) {
            return false;
        }
        if (this.f46837w == null) {
            if (eeVar.f46837w != null) {
                return false;
            }
        } else if (!this.f46837w.equals(eeVar.f46837w)) {
            return false;
        }
        if (this.f46838x == null) {
            if (eeVar.f46838x != null) {
                return false;
            }
        } else if (!this.f46838x.equals(eeVar.f46838x)) {
            return false;
        }
        if (this.f46839y == null) {
            if (eeVar.f46839y != null) {
                return false;
            }
        } else if (!this.f46839y.equals(eeVar.f46839y)) {
            return false;
        }
        if (this.f46840z == null) {
            if (eeVar.f46840z != null) {
                return false;
            }
        } else if (!this.f46840z.equals(eeVar.f46840z)) {
            return false;
        }
        if (!C16847ky.m40903a((Object[]) this.f46800A, (Object[]) eeVar.f46800A)) {
            return false;
        }
        if (this.f46801B == null) {
            if (eeVar.f46801B != null) {
                return false;
            }
        } else if (!this.f46801B.equals(eeVar.f46801B)) {
            return false;
        }
        if (this.f46802C == null) {
            if (eeVar.f46802C != null) {
                return false;
            }
        } else if (!this.f46802C.equals(eeVar.f46802C)) {
            return false;
        }
        if (this.f46811O == null) {
            if (eeVar.f46811O != null) {
                return false;
            }
        } else if (!this.f46811O.equals(eeVar.f46811O)) {
            return false;
        }
        if (this.f46812P == null) {
            if (eeVar.f46812P != null) {
                return false;
            }
        } else if (!this.f46812P.equals(eeVar.f46812P)) {
            return false;
        }
        if (this.f46803D == null) {
            if (eeVar.f46803D != null) {
                return false;
            }
        } else if (!this.f46803D.equals(eeVar.f46803D)) {
            return false;
        }
        if (this.f46804E == null) {
            if (eeVar.f46804E != null) {
                return false;
            }
        } else if (!this.f46804E.equals(eeVar.f46804E)) {
            return false;
        }
        if (this.f46805F == null) {
            if (eeVar.f46805F != null) {
                return false;
            }
        } else if (!this.f46805F.equals(eeVar.f46805F)) {
            return false;
        }
        if (this.f46806G == null) {
            if (eeVar.f46806G != null) {
                return false;
            }
        } else if (!this.f46806G.equals(eeVar.f46806G)) {
            return false;
        }
        if (this.f46813Q == null) {
            if (eeVar.f46813Q != null) {
                return false;
            }
        } else if (!this.f46813Q.equals(eeVar.f46813Q)) {
            return false;
        }
        if (this.f46807H == null) {
            if (eeVar.f46807H != null) {
                return false;
            }
        } else if (!this.f46807H.equals(eeVar.f46807H)) {
            return false;
        }
        if (this.f46808I == null) {
            if (eeVar.f46808I != null) {
                return false;
            }
        } else if (!this.f46808I.equals(eeVar.f46808I)) {
            return false;
        }
        if (this.f46809J == null) {
            if (eeVar.f46809J != null) {
                return false;
            }
        } else if (!this.f46809J.equals(eeVar.f46809J)) {
            return false;
        }
        if (!C16847ky.m40901a(this.f46810K, eeVar.f46810K)) {
            return false;
        }
        if (this.f46814R == null) {
            if (eeVar.f46814R != null) {
                return false;
            }
        } else if (!this.f46814R.equals(eeVar.f46814R)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return eeVar.f47288L == null || eeVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(eeVar.f47288L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46815a == null ? 0 : this.f46815a.hashCode())) * 31) + C16847ky.m40899a((Object[]) this.f46816b)) * 31) + C16847ky.m40899a((Object[]) this.f46817c)) * 31) + (this.f46818d == null ? 0 : this.f46818d.hashCode())) * 31) + (this.f46819e == null ? 0 : this.f46819e.hashCode())) * 31) + (this.f46820f == null ? 0 : this.f46820f.hashCode())) * 31) + (this.f46821g == null ? 0 : this.f46821g.hashCode())) * 31) + (this.f46822h == null ? 0 : this.f46822h.hashCode())) * 31) + (this.f46823i == null ? 0 : this.f46823i.hashCode())) * 31) + (this.f46824j == null ? 0 : this.f46824j.hashCode())) * 31) + (this.f46825k == null ? 0 : this.f46825k.hashCode())) * 31) + (this.f46826l == null ? 0 : this.f46826l.hashCode())) * 31) + (this.f46827m == null ? 0 : this.f46827m.hashCode())) * 31) + (this.f46828n == null ? 0 : this.f46828n.hashCode())) * 31) + (this.f46829o == null ? 0 : this.f46829o.hashCode())) * 31) + (this.f46830p == null ? 0 : this.f46830p.hashCode())) * 31) + (this.f46831q == null ? 0 : this.f46831q.hashCode())) * 31) + (this.f46832r == null ? 0 : this.f46832r.hashCode())) * 31) + (this.f46833s == null ? 0 : this.f46833s.hashCode())) * 31) + (this.f46834t == null ? 0 : this.f46834t.hashCode())) * 31) + (this.f46835u == null ? 0 : this.f46835u.hashCode())) * 31) + (this.f46836v == null ? 0 : this.f46836v.hashCode())) * 31) + (this.f46837w == null ? 0 : this.f46837w.hashCode())) * 31) + (this.f46838x == null ? 0 : this.f46838x.hashCode())) * 31) + (this.f46839y == null ? 0 : this.f46839y.hashCode())) * 31) + (this.f46840z == null ? 0 : this.f46840z.hashCode())) * 31) + C16847ky.m40899a((Object[]) this.f46800A)) * 31) + (this.f46801B == null ? 0 : this.f46801B.hashCode())) * 31) + (this.f46802C == null ? 0 : this.f46802C.hashCode())) * 31) + (this.f46811O == null ? 0 : this.f46811O.hashCode())) * 31) + (this.f46812P == null ? 0 : this.f46812P.hashCode())) * 31) + (this.f46803D == null ? 0 : this.f46803D.hashCode())) * 31) + (this.f46804E == null ? 0 : this.f46804E.hashCode())) * 31) + (this.f46805F == null ? 0 : this.f46805F.hashCode())) * 31) + (this.f46806G == null ? 0 : this.f46806G.hashCode())) * 31) + (this.f46813Q == null ? 0 : this.f46813Q.hashCode())) * 31) + (this.f46807H == null ? 0 : this.f46807H.hashCode())) * 31) + (this.f46808I == null ? 0 : this.f46808I.hashCode());
        C16629b bVar = this.f46809J;
        int i3 = hashCode * 31;
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.hashCode();
        }
        int a = (((((i3 + i) * 31) + C16847ky.m40897a(this.f46810K)) * 31) + (this.f46814R == null ? 0 : this.f46814R.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i2 = this.f47288L.hashCode();
        }
        return a + i2;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        C16709gj gjVar;
        if (this.f46815a != null) {
            ksVar.mo32442a(1, this.f46815a.intValue());
        }
        if (this.f46816b != null && this.f46816b.length > 0) {
            for (C16647eb ebVar : this.f46816b) {
                if (ebVar != null) {
                    ksVar.mo32444a(2, (C16850la) ebVar);
                }
            }
        }
        if (this.f46817c != null && this.f46817c.length > 0) {
            for (C16653eh ehVar : this.f46817c) {
                if (ehVar != null) {
                    ksVar.mo32444a(3, (C16850la) ehVar);
                }
            }
        }
        if (this.f46818d != null) {
            ksVar.mo32448b(4, this.f46818d.longValue());
        }
        if (this.f46819e != null) {
            ksVar.mo32448b(5, this.f46819e.longValue());
        }
        if (this.f46820f != null) {
            ksVar.mo32448b(6, this.f46820f.longValue());
        }
        if (this.f46822h != null) {
            ksVar.mo32448b(7, this.f46822h.longValue());
        }
        if (this.f46823i != null) {
            ksVar.mo32445a(8, this.f46823i);
        }
        if (this.f46824j != null) {
            ksVar.mo32445a(9, this.f46824j);
        }
        if (this.f46825k != null) {
            ksVar.mo32445a(10, this.f46825k);
        }
        if (this.f46826l != null) {
            ksVar.mo32445a(11, this.f46826l);
        }
        if (this.f46827m != null) {
            ksVar.mo32442a(12, this.f46827m.intValue());
        }
        if (this.f46828n != null) {
            ksVar.mo32445a(13, this.f46828n);
        }
        if (this.f46829o != null) {
            ksVar.mo32445a(14, this.f46829o);
        }
        if (this.f46830p != null) {
            ksVar.mo32445a(16, this.f46830p);
        }
        if (this.f46831q != null) {
            ksVar.mo32448b(17, this.f46831q.longValue());
        }
        if (this.f46832r != null) {
            ksVar.mo32448b(18, this.f46832r.longValue());
        }
        if (this.f46833s != null) {
            ksVar.mo32445a(19, this.f46833s);
        }
        if (this.f46834t != null) {
            ksVar.mo32446a(20, this.f46834t.booleanValue());
        }
        if (this.f46835u != null) {
            ksVar.mo32445a(21, this.f46835u);
        }
        if (this.f46836v != null) {
            ksVar.mo32448b(22, this.f46836v.longValue());
        }
        if (this.f46837w != null) {
            ksVar.mo32442a(23, this.f46837w.intValue());
        }
        if (this.f46838x != null) {
            ksVar.mo32445a(24, this.f46838x);
        }
        if (this.f46839y != null) {
            ksVar.mo32445a(25, this.f46839y);
        }
        if (this.f46821g != null) {
            ksVar.mo32448b(26, this.f46821g.longValue());
        }
        if (this.f46840z != null) {
            ksVar.mo32446a(28, this.f46840z.booleanValue());
        }
        if (this.f46800A != null && this.f46800A.length > 0) {
            for (C16644dz dzVar : this.f46800A) {
                if (dzVar != null) {
                    ksVar.mo32444a(29, (C16850la) dzVar);
                }
            }
        }
        if (this.f46801B != null) {
            ksVar.mo32445a(30, this.f46801B);
        }
        if (this.f46802C != null) {
            ksVar.mo32442a(31, this.f46802C.intValue());
        }
        if (this.f46811O != null) {
            ksVar.mo32442a(32, this.f46811O.intValue());
        }
        if (this.f46812P != null) {
            ksVar.mo32442a(33, this.f46812P.intValue());
        }
        if (this.f46803D != null) {
            ksVar.mo32445a(34, this.f46803D);
        }
        if (this.f46804E != null) {
            ksVar.mo32448b(35, this.f46804E.longValue());
        }
        if (this.f46805F != null) {
            ksVar.mo32448b(36, this.f46805F.longValue());
        }
        if (this.f46806G != null) {
            ksVar.mo32445a(37, this.f46806G);
        }
        if (this.f46813Q != null) {
            ksVar.mo32445a(38, this.f46813Q);
        }
        if (this.f46807H != null) {
            ksVar.mo32442a(39, this.f46807H.intValue());
        }
        if (this.f46808I != null) {
            ksVar.mo32445a(41, this.f46808I);
        }
        if (this.f46809J != null) {
            C16629b bVar = this.f46809J;
            if (ksVar.f47286b == null) {
                ByteBuffer byteBuffer = ksVar.f47285a;
                if (byteBuffer.hasArray()) {
                    gjVar = new C16711b(byteBuffer);
                } else if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
                    throw new IllegalArgumentException("ByteBuffer is read-only");
                } else if (C16819ka.m40692b()) {
                    gjVar = new C16714e(byteBuffer);
                } else {
                    gjVar = new C16713d(byteBuffer);
                }
                ksVar.f47286b = gjVar;
                ksVar.f47287c = ksVar.f47285a.position();
            } else if (ksVar.f47287c != ksVar.f47285a.position()) {
                ksVar.f47286b.mo32135b(ksVar.f47285a.array(), ksVar.f47287c, ksVar.f47285a.position() - ksVar.f47287c);
                ksVar.f47287c = ksVar.f47285a.position();
            }
            C16709gj gjVar2 = ksVar.f47286b;
            gjVar2.mo32117a(44, (C16775ik) bVar);
            gjVar2.mo32107a();
            ksVar.f47287c = ksVar.f47285a.position();
        }
        if (this.f46810K != null && this.f46810K.length > 0) {
            for (int i : this.f46810K) {
                ksVar.mo32450c(45, 0);
                ksVar.mo32449c(i);
            }
        }
        if (this.f46814R != null) {
            ksVar.mo32448b(46, this.f46814R.longValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46815a != null) {
            b += C16841ks.m40862b(1, this.f46815a.intValue());
        }
        if (this.f46816b != null && this.f46816b.length > 0) {
            int i = b;
            for (C16647eb ebVar : this.f46816b) {
                if (ebVar != null) {
                    i += C16841ks.m40863b(2, (C16850la) ebVar);
                }
            }
            b = i;
        }
        if (this.f46817c != null && this.f46817c.length > 0) {
            int i2 = b;
            for (C16653eh ehVar : this.f46817c) {
                if (ehVar != null) {
                    i2 += C16841ks.m40863b(3, (C16850la) ehVar);
                }
            }
            b = i2;
        }
        if (this.f46818d != null) {
            b += C16841ks.m40866c(4, this.f46818d.longValue());
        }
        if (this.f46819e != null) {
            b += C16841ks.m40866c(5, this.f46819e.longValue());
        }
        if (this.f46820f != null) {
            b += C16841ks.m40866c(6, this.f46820f.longValue());
        }
        if (this.f46822h != null) {
            b += C16841ks.m40866c(7, this.f46822h.longValue());
        }
        if (this.f46823i != null) {
            b += C16841ks.m40864b(8, this.f46823i);
        }
        if (this.f46824j != null) {
            b += C16841ks.m40864b(9, this.f46824j);
        }
        if (this.f46825k != null) {
            b += C16841ks.m40864b(10, this.f46825k);
        }
        if (this.f46826l != null) {
            b += C16841ks.m40864b(11, this.f46826l);
        }
        if (this.f46827m != null) {
            b += C16841ks.m40862b(12, this.f46827m.intValue());
        }
        if (this.f46828n != null) {
            b += C16841ks.m40864b(13, this.f46828n);
        }
        if (this.f46829o != null) {
            b += C16841ks.m40864b(14, this.f46829o);
        }
        if (this.f46830p != null) {
            b += C16841ks.m40864b(16, this.f46830p);
        }
        if (this.f46831q != null) {
            b += C16841ks.m40866c(17, this.f46831q.longValue());
        }
        if (this.f46832r != null) {
            b += C16841ks.m40866c(18, this.f46832r.longValue());
        }
        if (this.f46833s != null) {
            b += C16841ks.m40864b(19, this.f46833s);
        }
        if (this.f46834t != null) {
            this.f46834t.booleanValue();
            b += C16841ks.m40861b(20) + 1;
        }
        if (this.f46835u != null) {
            b += C16841ks.m40864b(21, this.f46835u);
        }
        if (this.f46836v != null) {
            b += C16841ks.m40866c(22, this.f46836v.longValue());
        }
        if (this.f46837w != null) {
            b += C16841ks.m40862b(23, this.f46837w.intValue());
        }
        if (this.f46838x != null) {
            b += C16841ks.m40864b(24, this.f46838x);
        }
        if (this.f46839y != null) {
            b += C16841ks.m40864b(25, this.f46839y);
        }
        if (this.f46821g != null) {
            b += C16841ks.m40866c(26, this.f46821g.longValue());
        }
        if (this.f46840z != null) {
            this.f46840z.booleanValue();
            b += C16841ks.m40861b(28) + 1;
        }
        if (this.f46800A != null && this.f46800A.length > 0) {
            int i3 = b;
            for (C16644dz dzVar : this.f46800A) {
                if (dzVar != null) {
                    i3 += C16841ks.m40863b(29, (C16850la) dzVar);
                }
            }
            b = i3;
        }
        if (this.f46801B != null) {
            b += C16841ks.m40864b(30, this.f46801B);
        }
        if (this.f46802C != null) {
            b += C16841ks.m40862b(31, this.f46802C.intValue());
        }
        if (this.f46811O != null) {
            b += C16841ks.m40862b(32, this.f46811O.intValue());
        }
        if (this.f46812P != null) {
            b += C16841ks.m40862b(33, this.f46812P.intValue());
        }
        if (this.f46803D != null) {
            b += C16841ks.m40864b(34, this.f46803D);
        }
        if (this.f46804E != null) {
            b += C16841ks.m40866c(35, this.f46804E.longValue());
        }
        if (this.f46805F != null) {
            b += C16841ks.m40866c(36, this.f46805F.longValue());
        }
        if (this.f46806G != null) {
            b += C16841ks.m40864b(37, this.f46806G);
        }
        if (this.f46813Q != null) {
            b += C16841ks.m40864b(38, this.f46813Q);
        }
        if (this.f46807H != null) {
            b += C16841ks.m40862b(39, this.f46807H.intValue());
        }
        if (this.f46808I != null) {
            b += C16841ks.m40864b(41, this.f46808I);
        }
        if (this.f46809J != null) {
            b += C16709gj.m40014c(44, (C16775ik) this.f46809J);
        }
        if (this.f46810K != null && this.f46810K.length > 0) {
            int i4 = 0;
            for (int d : this.f46810K) {
                i4 += C16841ks.m40867d(d);
            }
            b = b + i4 + (this.f46810K.length * 2);
        }
        return this.f46814R != null ? b + C16841ks.m40866c(46, this.f46814R.longValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    this.f46815a = Integer.valueOf(kqVar.mo32430d());
                    break;
                case 18:
                    int a2 = C16853ld.m40927a(kqVar, 18);
                    int length = this.f46816b == null ? 0 : this.f46816b.length;
                    C16647eb[] ebVarArr = new C16647eb[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f46816b, 0, ebVarArr, 0, length);
                    }
                    while (length < ebVarArr.length - 1) {
                        ebVarArr[length] = new C16647eb();
                        kqVar.mo32425a((C16850la) ebVarArr[length]);
                        kqVar.mo32421a();
                        length++;
                    }
                    ebVarArr[length] = new C16647eb();
                    kqVar.mo32425a((C16850la) ebVarArr[length]);
                    this.f46816b = ebVarArr;
                    break;
                case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                    int a3 = C16853ld.m40927a(kqVar, 26);
                    int length2 = this.f46817c == null ? 0 : this.f46817c.length;
                    C16653eh[] ehVarArr = new C16653eh[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f46817c, 0, ehVarArr, 0, length2);
                    }
                    while (length2 < ehVarArr.length - 1) {
                        ehVarArr[length2] = new C16653eh();
                        kqVar.mo32425a((C16850la) ehVarArr[length2]);
                        kqVar.mo32421a();
                        length2++;
                    }
                    ehVarArr[length2] = new C16653eh();
                    kqVar.mo32425a((C16850la) ehVarArr[length2]);
                    this.f46817c = ehVarArr;
                    break;
                case 32:
                    this.f46818d = Long.valueOf(kqVar.mo32432e());
                    break;
                case 40:
                    this.f46819e = Long.valueOf(kqVar.mo32432e());
                    break;
                case 48:
                    this.f46820f = Long.valueOf(kqVar.mo32432e());
                    break;
                case 56:
                    this.f46822h = Long.valueOf(kqVar.mo32432e());
                    break;
                case 66:
                    this.f46823i = kqVar.mo32429c();
                    break;
                case 74:
                    this.f46824j = kqVar.mo32429c();
                    break;
                case 82:
                    this.f46825k = kqVar.mo32429c();
                    break;
                case 90:
                    this.f46826l = kqVar.mo32429c();
                    break;
                case 96:
                    this.f46827m = Integer.valueOf(kqVar.mo32430d());
                    break;
                case 106:
                    this.f46828n = kqVar.mo32429c();
                    break;
                case 114:
                    this.f46829o = kqVar.mo32429c();
                    break;
                case 130:
                    this.f46830p = kqVar.mo32429c();
                    break;
                case 136:
                    this.f46831q = Long.valueOf(kqVar.mo32432e());
                    break;
                case 144:
                    this.f46832r = Long.valueOf(kqVar.mo32432e());
                    break;
                case 154:
                    this.f46833s = kqVar.mo32429c();
                    break;
                case 160:
                    this.f46834t = Boolean.valueOf(kqVar.mo32426b());
                    break;
                case 170:
                    this.f46835u = kqVar.mo32429c();
                    break;
                case 176:
                    this.f46836v = Long.valueOf(kqVar.mo32432e());
                    break;
                case 184:
                    this.f46837w = Integer.valueOf(kqVar.mo32430d());
                    break;
                case 194:
                    this.f46838x = kqVar.mo32429c();
                    break;
                case 202:
                    this.f46839y = kqVar.mo32429c();
                    break;
                case 208:
                    this.f46821g = Long.valueOf(kqVar.mo32432e());
                    break;
                case 224:
                    this.f46840z = Boolean.valueOf(kqVar.mo32426b());
                    break;
                case 234:
                    int a4 = C16853ld.m40927a(kqVar, 234);
                    int length3 = this.f46800A == null ? 0 : this.f46800A.length;
                    C16644dz[] dzVarArr = new C16644dz[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f46800A, 0, dzVarArr, 0, length3);
                    }
                    while (length3 < dzVarArr.length - 1) {
                        dzVarArr[length3] = new C16644dz();
                        kqVar.mo32425a((C16850la) dzVarArr[length3]);
                        kqVar.mo32421a();
                        length3++;
                    }
                    dzVarArr[length3] = new C16644dz();
                    kqVar.mo32425a((C16850la) dzVarArr[length3]);
                    this.f46800A = dzVarArr;
                    break;
                case 242:
                    this.f46801B = kqVar.mo32429c();
                    break;
                case 248:
                    this.f46802C = Integer.valueOf(kqVar.mo32430d());
                    break;
                case UnReadVideoExperiment.BROWSE_RECORD_LIST /*256*/:
                    this.f46811O = Integer.valueOf(kqVar.mo32430d());
                    break;
                case 264:
                    this.f46812P = Integer.valueOf(kqVar.mo32430d());
                    break;
                case 274:
                    this.f46803D = kqVar.mo32429c();
                    break;
                case 280:
                    this.f46804E = Long.valueOf(kqVar.mo32432e());
                    break;
                case 288:
                    this.f46805F = Long.valueOf(kqVar.mo32432e());
                    break;
                case 298:
                    this.f46806G = kqVar.mo32429c();
                    break;
                case 306:
                    this.f46813Q = kqVar.mo32429c();
                    break;
                case 312:
                    this.f46807H = Integer.valueOf(kqVar.mo32430d());
                    break;
                case 330:
                    this.f46808I = kqVar.mo32429c();
                    break;
                case 354:
                    C16629b bVar = (C16629b) kqVar.mo32422a(C16629b.m39719b());
                    if (this.f46809J != null) {
                        bVar = (C16629b) ((C16736hd) ((C16630a) ((C16630a) this.f46809J.mo32229f()).mo31990a(bVar)).mo32239d());
                    }
                    this.f46809J = bVar;
                    break;
                case 360:
                    int a5 = C16853ld.m40927a(kqVar, 360);
                    int length4 = this.f46810K == null ? 0 : this.f46810K.length;
                    int[] iArr = new int[(a5 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.f46810K, 0, iArr, 0, length4);
                    }
                    while (length4 < iArr.length - 1) {
                        iArr[length4] = kqVar.mo32430d();
                        kqVar.mo32421a();
                        length4++;
                    }
                    iArr[length4] = kqVar.mo32430d();
                    this.f46810K = iArr;
                    break;
                case 362:
                    int c = kqVar.mo32428c(kqVar.mo32430d());
                    int i = kqVar.mo32437i();
                    int i2 = 0;
                    while (kqVar.mo32436h() > 0) {
                        kqVar.mo32430d();
                        i2++;
                    }
                    kqVar.mo32433e(i);
                    int length5 = this.f46810K == null ? 0 : this.f46810K.length;
                    int[] iArr2 = new int[(i2 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.f46810K, 0, iArr2, 0, length5);
                    }
                    while (length5 < iArr2.length) {
                        iArr2[length5] = kqVar.mo32430d();
                        length5++;
                    }
                    this.f46810K = iArr2;
                    kqVar.mo32431d(c);
                    break;
                case 368:
                    this.f46814R = Long.valueOf(kqVar.mo32432e());
                    break;
                default:
                    if (super.mo32451a(kqVar, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }
}
