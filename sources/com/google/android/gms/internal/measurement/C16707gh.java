package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.gh */
final class C16707gh implements C16792ja {

    /* renamed from: a */
    private final C16704ge f46965a;

    /* renamed from: b */
    private int f46966b;

    /* renamed from: c */
    private int f46967c;

    /* renamed from: d */
    private int f46968d;

    C16707gh(C16704ge geVar) {
        this.f46965a = (C16704ge) C16743hf.m40316a(geVar, "input");
    }

    /* renamed from: a */
    public final int mo32065a() throws IOException {
        if (this.f46968d != 0) {
            this.f46966b = this.f46968d;
            this.f46968d = 0;
        } else {
            this.f46966b = this.f46965a.mo32038a();
        }
        if (this.f46966b == 0 || this.f46966b == this.f46967c) {
            return Integer.MAX_VALUE;
        }
        return this.f46966b >>> 3;
    }

    /* renamed from: b */
    public final int mo32070b() {
        return this.f46966b;
    }

    /* renamed from: c */
    public final boolean mo32075c() throws IOException {
        if (this.f46965a.mo32063t() || this.f46966b == this.f46967c) {
            return false;
        }
        return this.f46965a.mo32042b(this.f46966b);
    }

    /* renamed from: a */
    private final void m39951a(int i) throws IOException {
        if ((this.f46966b & 7) != i) {
            throw C16748hk.m40326e();
        }
    }

    /* renamed from: d */
    public final double mo32076d() throws IOException {
        m39951a(1);
        return this.f46965a.mo32041b();
    }

    /* renamed from: e */
    public final float mo32078e() throws IOException {
        m39951a(5);
        return this.f46965a.mo32043c();
    }

    /* renamed from: f */
    public final long mo32080f() throws IOException {
        m39951a(0);
        return this.f46965a.mo32045d();
    }

    /* renamed from: g */
    public final long mo32082g() throws IOException {
        m39951a(0);
        return this.f46965a.mo32047e();
    }

    /* renamed from: h */
    public final int mo32084h() throws IOException {
        m39951a(0);
        return this.f46965a.mo32049f();
    }

    /* renamed from: i */
    public final long mo32086i() throws IOException {
        m39951a(1);
        return this.f46965a.mo32050g();
    }

    /* renamed from: j */
    public final int mo32088j() throws IOException {
        m39951a(5);
        return this.f46965a.mo32051h();
    }

    /* renamed from: k */
    public final boolean mo32091k() throws IOException {
        m39951a(0);
        return this.f46965a.mo32052i();
    }

    /* renamed from: l */
    public final String mo32092l() throws IOException {
        m39951a(2);
        return this.f46965a.mo32053j();
    }

    /* renamed from: m */
    public final String mo32094m() throws IOException {
        m39951a(2);
        return this.f46965a.mo32054k();
    }

    /* renamed from: a */
    public final <T> T mo32066a(C16793jb<T> jbVar, C16721gq gqVar) throws IOException {
        m39951a(2);
        return m39954c(jbVar, gqVar);
    }

    /* renamed from: b */
    public final <T> T mo32071b(C16793jb<T> jbVar, C16721gq gqVar) throws IOException {
        m39951a(3);
        return m39956d(jbVar, gqVar);
    }

    /* renamed from: c */
    private final <T> T m39954c(C16793jb<T> jbVar, C16721gq gqVar) throws IOException {
        int m = this.f46965a.mo32056m();
        if (this.f46965a.f46953a < this.f46965a.f46954b) {
            int c = this.f46965a.mo32044c(m);
            T a = jbVar.mo32298a();
            this.f46965a.f46953a++;
            jbVar.mo32299a(a, this, gqVar);
            jbVar.mo32304c(a);
            this.f46965a.mo32040a(0);
            this.f46965a.f46953a--;
            this.f46965a.mo32046d(c);
            return a;
        }
        throw C16748hk.m40327f();
    }

    /* renamed from: d */
    private final <T> T m39956d(C16793jb<T> jbVar, C16721gq gqVar) throws IOException {
        int i = this.f46967c;
        this.f46967c = ((this.f46966b >>> 3) << 3) | 4;
        try {
            T a = jbVar.mo32298a();
            jbVar.mo32299a(a, this, gqVar);
            jbVar.mo32304c(a);
            if (this.f46966b == this.f46967c) {
                return a;
            }
            throw C16748hk.m40328g();
        } finally {
            this.f46967c = i;
        }
    }

    /* renamed from: n */
    public final C16691fs mo32096n() throws IOException {
        m39951a(2);
        return this.f46965a.mo32055l();
    }

    /* renamed from: o */
    public final int mo32098o() throws IOException {
        m39951a(0);
        return this.f46965a.mo32056m();
    }

    /* renamed from: p */
    public final int mo32100p() throws IOException {
        m39951a(0);
        return this.f46965a.mo32057n();
    }

    /* renamed from: q */
    public final int mo32102q() throws IOException {
        m39951a(5);
        return this.f46965a.mo32058o();
    }

    /* renamed from: r */
    public final long mo32104r() throws IOException {
        m39951a(1);
        return this.f46965a.mo32059p();
    }

    /* renamed from: s */
    public final int mo32105s() throws IOException {
        m39951a(0);
        return this.f46965a.mo32060q();
    }

    /* renamed from: t */
    public final long mo32106t() throws IOException {
        m39951a(0);
        return this.f46965a.mo32061r();
    }

    /* renamed from: a */
    public final void mo32067a(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16717gm) {
            C16717gm gmVar = (C16717gm) list;
            switch (this.f46966b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f46965a.mo32056m();
                    m39953b(m);
                    int u = this.f46965a.mo32064u() + m;
                    do {
                        gmVar.mo32185a(this.f46965a.mo32041b());
                    } while (this.f46965a.mo32064u() < u);
                    return;
                default:
                    throw C16748hk.m40326e();
            }
            do {
                gmVar.mo32185a(this.f46965a.mo32041b());
                if (!this.f46965a.mo32063t()) {
                    a2 = this.f46965a.mo32038a();
                } else {
                    return;
                }
            } while (a2 == this.f46966b);
            this.f46968d = a2;
            return;
        }
        switch (this.f46966b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f46965a.mo32056m();
                m39953b(m2);
                int u2 = this.f46965a.mo32064u() + m2;
                do {
                    list.add(Double.valueOf(this.f46965a.mo32041b()));
                } while (this.f46965a.mo32064u() < u2);
                return;
            default:
                throw C16748hk.m40326e();
        }
        do {
            list.add(Double.valueOf(this.f46965a.mo32041b()));
            if (!this.f46965a.mo32063t()) {
                a = this.f46965a.mo32038a();
            } else {
                return;
            }
        } while (a == this.f46966b);
        this.f46968d = a;
    }

    /* renamed from: b */
    public final void mo32072b(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16733ha) {
            C16733ha haVar = (C16733ha) list;
            int i = this.f46966b & 7;
            if (i == 2) {
                int m = this.f46965a.mo32056m();
                m39955c(m);
                int u = this.f46965a.mo32064u() + m;
                do {
                    haVar.mo32219a(this.f46965a.mo32043c());
                } while (this.f46965a.mo32064u() < u);
            } else if (i == 5) {
                do {
                    haVar.mo32219a(this.f46965a.mo32043c());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 2) {
                int m2 = this.f46965a.mo32056m();
                m39955c(m2);
                int u2 = this.f46965a.mo32064u() + m2;
                do {
                    list.add(Float.valueOf(this.f46965a.mo32043c()));
                } while (this.f46965a.mo32064u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f46965a.mo32043c()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: c */
    public final void mo32074c(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16762hy) {
            C16762hy hyVar = (C16762hy) list;
            int i = this.f46966b & 7;
            if (i == 0) {
                do {
                    hyVar.mo32268a(this.f46965a.mo32045d());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else if (i == 2) {
                int u = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    hyVar.mo32268a(this.f46965a.mo32045d());
                } while (this.f46965a.mo32064u() < u);
                m39957d(u);
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f46965a.mo32045d()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else if (i2 == 2) {
                int u2 = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    list.add(Long.valueOf(this.f46965a.mo32045d()));
                } while (this.f46965a.mo32064u() < u2);
                m39957d(u2);
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: d */
    public final void mo32077d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16762hy) {
            C16762hy hyVar = (C16762hy) list;
            int i = this.f46966b & 7;
            if (i == 0) {
                do {
                    hyVar.mo32268a(this.f46965a.mo32047e());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else if (i == 2) {
                int u = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    hyVar.mo32268a(this.f46965a.mo32047e());
                } while (this.f46965a.mo32064u() < u);
                m39957d(u);
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f46965a.mo32047e()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else if (i2 == 2) {
                int u2 = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    list.add(Long.valueOf(this.f46965a.mo32047e()));
                } while (this.f46965a.mo32064u() < u2);
                m39957d(u2);
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: e */
    public final void mo32079e(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            int i = this.f46966b & 7;
            if (i == 0) {
                do {
                    heVar.mo32242c(this.f46965a.mo32049f());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else if (i == 2) {
                int u = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    heVar.mo32242c(this.f46965a.mo32049f());
                } while (this.f46965a.mo32064u() < u);
                m39957d(u);
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32049f()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else if (i2 == 2) {
                int u2 = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32049f()));
                } while (this.f46965a.mo32064u() < u2);
                m39957d(u2);
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: f */
    public final void mo32081f(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16762hy) {
            C16762hy hyVar = (C16762hy) list;
            switch (this.f46966b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f46965a.mo32056m();
                    m39953b(m);
                    int u = this.f46965a.mo32064u() + m;
                    do {
                        hyVar.mo32268a(this.f46965a.mo32050g());
                    } while (this.f46965a.mo32064u() < u);
                    return;
                default:
                    throw C16748hk.m40326e();
            }
            do {
                hyVar.mo32268a(this.f46965a.mo32050g());
                if (!this.f46965a.mo32063t()) {
                    a2 = this.f46965a.mo32038a();
                } else {
                    return;
                }
            } while (a2 == this.f46966b);
            this.f46968d = a2;
            return;
        }
        switch (this.f46966b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f46965a.mo32056m();
                m39953b(m2);
                int u2 = this.f46965a.mo32064u() + m2;
                do {
                    list.add(Long.valueOf(this.f46965a.mo32050g()));
                } while (this.f46965a.mo32064u() < u2);
                return;
            default:
                throw C16748hk.m40326e();
        }
        do {
            list.add(Long.valueOf(this.f46965a.mo32050g()));
            if (!this.f46965a.mo32063t()) {
                a = this.f46965a.mo32038a();
            } else {
                return;
            }
        } while (a == this.f46966b);
        this.f46968d = a;
    }

    /* renamed from: g */
    public final void mo32083g(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            int i = this.f46966b & 7;
            if (i == 2) {
                int m = this.f46965a.mo32056m();
                m39955c(m);
                int u = this.f46965a.mo32064u() + m;
                do {
                    heVar.mo32242c(this.f46965a.mo32051h());
                } while (this.f46965a.mo32064u() < u);
            } else if (i == 5) {
                do {
                    heVar.mo32242c(this.f46965a.mo32051h());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 2) {
                int m2 = this.f46965a.mo32056m();
                m39955c(m2);
                int u2 = this.f46965a.mo32064u() + m2;
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32051h()));
                } while (this.f46965a.mo32064u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32051h()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: h */
    public final void mo32085h(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16689fq) {
            C16689fq fqVar = (C16689fq) list;
            int i = this.f46966b & 7;
            if (i == 0) {
                do {
                    fqVar.mo32009a(this.f46965a.mo32052i());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else if (i == 2) {
                int u = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    fqVar.mo32009a(this.f46965a.mo32052i());
                } while (this.f46965a.mo32064u() < u);
                m39957d(u);
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f46965a.mo32052i()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else if (i2 == 2) {
                int u2 = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    list.add(Boolean.valueOf(this.f46965a.mo32052i()));
                } while (this.f46965a.mo32064u() < u2);
                m39957d(u2);
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: i */
    public final void mo32087i(List<String> list) throws IOException {
        m39952a(list, false);
    }

    /* renamed from: j */
    public final void mo32089j(List<String> list) throws IOException {
        m39952a(list, true);
    }

    /* renamed from: a */
    private final void m39952a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if ((this.f46966b & 7) != 2) {
            throw C16748hk.m40326e();
        } else if (!(list instanceof C16757ht) || z) {
            do {
                list.add(z ? mo32094m() : mo32092l());
                if (!this.f46965a.mo32063t()) {
                    a = this.f46965a.mo32038a();
                } else {
                    return;
                }
            } while (a == this.f46966b);
            this.f46968d = a;
        } else {
            C16757ht htVar = (C16757ht) list;
            do {
                htVar.mo32259a(mo32096n());
                if (!this.f46965a.mo32063t()) {
                    a2 = this.f46965a.mo32038a();
                } else {
                    return;
                }
            } while (a2 == this.f46966b);
            this.f46968d = a2;
        }
    }

    /* renamed from: a */
    public final <T> void mo32068a(List<T> list, C16793jb<T> jbVar, C16721gq gqVar) throws IOException {
        int a;
        if ((this.f46966b & 7) == 2) {
            int i = this.f46966b;
            do {
                list.add(m39954c(jbVar, gqVar));
                if (!this.f46965a.mo32063t() && this.f46968d == 0) {
                    a = this.f46965a.mo32038a();
                } else {
                    return;
                }
            } while (a == i);
            this.f46968d = a;
            return;
        }
        throw C16748hk.m40326e();
    }

    /* renamed from: b */
    public final <T> void mo32073b(List<T> list, C16793jb<T> jbVar, C16721gq gqVar) throws IOException {
        int a;
        if ((this.f46966b & 7) == 3) {
            int i = this.f46966b;
            do {
                list.add(m39956d(jbVar, gqVar));
                if (!this.f46965a.mo32063t() && this.f46968d == 0) {
                    a = this.f46965a.mo32038a();
                } else {
                    return;
                }
            } while (a == i);
            this.f46968d = a;
            return;
        }
        throw C16748hk.m40326e();
    }

    /* renamed from: k */
    public final void mo32090k(List<C16691fs> list) throws IOException {
        int a;
        if ((this.f46966b & 7) == 2) {
            do {
                list.add(mo32096n());
                if (!this.f46965a.mo32063t()) {
                    a = this.f46965a.mo32038a();
                } else {
                    return;
                }
            } while (a == this.f46966b);
            this.f46968d = a;
            return;
        }
        throw C16748hk.m40326e();
    }

    /* renamed from: l */
    public final void mo32093l(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            int i = this.f46966b & 7;
            if (i == 0) {
                do {
                    heVar.mo32242c(this.f46965a.mo32056m());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else if (i == 2) {
                int u = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    heVar.mo32242c(this.f46965a.mo32056m());
                } while (this.f46965a.mo32064u() < u);
                m39957d(u);
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32056m()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else if (i2 == 2) {
                int u2 = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32056m()));
                } while (this.f46965a.mo32064u() < u2);
                m39957d(u2);
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: m */
    public final void mo32095m(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            int i = this.f46966b & 7;
            if (i == 0) {
                do {
                    heVar.mo32242c(this.f46965a.mo32057n());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else if (i == 2) {
                int u = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    heVar.mo32242c(this.f46965a.mo32057n());
                } while (this.f46965a.mo32064u() < u);
                m39957d(u);
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32057n()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else if (i2 == 2) {
                int u2 = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32057n()));
                } while (this.f46965a.mo32064u() < u2);
                m39957d(u2);
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: n */
    public final void mo32097n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            int i = this.f46966b & 7;
            if (i == 2) {
                int m = this.f46965a.mo32056m();
                m39955c(m);
                int u = this.f46965a.mo32064u() + m;
                do {
                    heVar.mo32242c(this.f46965a.mo32058o());
                } while (this.f46965a.mo32064u() < u);
            } else if (i == 5) {
                do {
                    heVar.mo32242c(this.f46965a.mo32058o());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 2) {
                int m2 = this.f46965a.mo32056m();
                m39955c(m2);
                int u2 = this.f46965a.mo32064u() + m2;
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32058o()));
                } while (this.f46965a.mo32064u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32058o()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: o */
    public final void mo32099o(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16762hy) {
            C16762hy hyVar = (C16762hy) list;
            switch (this.f46966b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f46965a.mo32056m();
                    m39953b(m);
                    int u = this.f46965a.mo32064u() + m;
                    do {
                        hyVar.mo32268a(this.f46965a.mo32059p());
                    } while (this.f46965a.mo32064u() < u);
                    return;
                default:
                    throw C16748hk.m40326e();
            }
            do {
                hyVar.mo32268a(this.f46965a.mo32059p());
                if (!this.f46965a.mo32063t()) {
                    a2 = this.f46965a.mo32038a();
                } else {
                    return;
                }
            } while (a2 == this.f46966b);
            this.f46968d = a2;
            return;
        }
        switch (this.f46966b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f46965a.mo32056m();
                m39953b(m2);
                int u2 = this.f46965a.mo32064u() + m2;
                do {
                    list.add(Long.valueOf(this.f46965a.mo32059p()));
                } while (this.f46965a.mo32064u() < u2);
                return;
            default:
                throw C16748hk.m40326e();
        }
        do {
            list.add(Long.valueOf(this.f46965a.mo32059p()));
            if (!this.f46965a.mo32063t()) {
                a = this.f46965a.mo32038a();
            } else {
                return;
            }
        } while (a == this.f46966b);
        this.f46968d = a;
    }

    /* renamed from: p */
    public final void mo32101p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16742he) {
            C16742he heVar = (C16742he) list;
            int i = this.f46966b & 7;
            if (i == 0) {
                do {
                    heVar.mo32242c(this.f46965a.mo32060q());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else if (i == 2) {
                int u = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    heVar.mo32242c(this.f46965a.mo32060q());
                } while (this.f46965a.mo32064u() < u);
                m39957d(u);
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32060q()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else if (i2 == 2) {
                int u2 = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    list.add(Integer.valueOf(this.f46965a.mo32060q()));
                } while (this.f46965a.mo32064u() < u2);
                m39957d(u2);
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: q */
    public final void mo32103q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof C16762hy) {
            C16762hy hyVar = (C16762hy) list;
            int i = this.f46966b & 7;
            if (i == 0) {
                do {
                    hyVar.mo32268a(this.f46965a.mo32061r());
                    if (!this.f46965a.mo32063t()) {
                        a2 = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a2 == this.f46966b);
                this.f46968d = a2;
            } else if (i == 2) {
                int u = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    hyVar.mo32268a(this.f46965a.mo32061r());
                } while (this.f46965a.mo32064u() < u);
                m39957d(u);
            } else {
                throw C16748hk.m40326e();
            }
        } else {
            int i2 = this.f46966b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f46965a.mo32061r()));
                    if (!this.f46965a.mo32063t()) {
                        a = this.f46965a.mo32038a();
                    } else {
                        return;
                    }
                } while (a == this.f46966b);
                this.f46968d = a;
            } else if (i2 == 2) {
                int u2 = this.f46965a.mo32064u() + this.f46965a.mo32056m();
                do {
                    list.add(Long.valueOf(this.f46965a.mo32061r()));
                } while (this.f46965a.mo32064u() < u2);
                m39957d(u2);
            } else {
                throw C16748hk.m40326e();
            }
        }
    }

    /* renamed from: b */
    private static void m39953b(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C16748hk.m40328g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (mo32075c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.measurement.C16748hk("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo32069a(java.util.Map<K, V> r6, com.google.android.gms.internal.measurement.C16768id<K, V> r7, com.google.android.gms.internal.measurement.C16721gq r8) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.m39951a(r0)
            com.google.android.gms.internal.measurement.ge r0 = r5.f46965a
            int r0 = r0.mo32056m()
            com.google.android.gms.internal.measurement.ge r1 = r5.f46965a
            int r0 = r1.mo32044c(r0)
            K r1 = r7.f47139b
            V r2 = r7.f47141d
        L_0x0014:
            int r3 = r5.mo32065a()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.measurement.ge r4 = r5.f46965a     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.mo32063t()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo32075c()     // Catch:{ hl -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.measurement.kj r3 = r7.f47140c     // Catch:{ hl -> 0x004f }
            V r4 = r7.f47141d     // Catch:{ hl -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ hl -> 0x004f }
            java.lang.Object r3 = r5.m39950a(r3, r4, r8)     // Catch:{ hl -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.measurement.kj r3 = r7.f47138a     // Catch:{ hl -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.m39950a(r3, r4, r4)     // Catch:{ hl -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.measurement.hk r3 = new com.google.android.gms.internal.measurement.hk     // Catch:{ hl -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ hl -> 0x004f }
            throw r3     // Catch:{ hl -> 0x004f }
        L_0x004f:
            boolean r3 = r5.mo32075c()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.measurement.hk r6 = new com.google.android.gms.internal.measurement.hk     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.measurement.ge r6 = r5.f46965a
            r6.mo32046d(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.measurement.ge r7 = r5.f46965a
            r7.mo32046d(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16707gh.mo32069a(java.util.Map, com.google.android.gms.internal.measurement.id, com.google.android.gms.internal.measurement.gq):void");
    }

    /* renamed from: a */
    private final Object m39950a(C16832kj kjVar, Class<?> cls, C16721gq gqVar) throws IOException {
        switch (C16708gi.f46969a[kjVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo32091k());
            case 2:
                return mo32096n();
            case 3:
                return Double.valueOf(mo32076d());
            case 4:
                return Integer.valueOf(mo32100p());
            case 5:
                return Integer.valueOf(mo32088j());
            case 6:
                return Long.valueOf(mo32086i());
            case 7:
                return Float.valueOf(mo32078e());
            case 8:
                return Integer.valueOf(mo32084h());
            case 9:
                return Long.valueOf(mo32082g());
            case 10:
                m39951a(2);
                return m39954c(C16788ix.m40472a().mo32308a(cls), gqVar);
            case 11:
                return Integer.valueOf(mo32102q());
            case 12:
                return Long.valueOf(mo32104r());
            case 13:
                return Integer.valueOf(mo32105s());
            case 14:
                return Long.valueOf(mo32106t());
            case 15:
                return mo32094m();
            case 16:
                return Integer.valueOf(mo32098o());
            case 17:
                return Long.valueOf(mo32080f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: c */
    private static void m39955c(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C16748hk.m40328g();
        }
    }

    /* renamed from: d */
    private final void m39957d(int i) throws IOException {
        if (this.f46965a.mo32064u() != i) {
            throw C16748hk.m40322a();
        }
    }
}
